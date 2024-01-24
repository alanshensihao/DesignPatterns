# SOLID PRINCIPLES

# Single Responsiblity Principle

# Open Closed Principle
#   open for extension
#   closed for modification

# Liskov Substitution Principle
#    Bring up the common things to superclass
#    Must be able to substitute a superclass using a child class

# Interface Segregation
#   

# Dependency Inversion
#   details depend on abstraction

# The __new__ method is a constructor method whereas the __init__ method is an initializer method
class Singleton(object):
    def __new__(cls):
        if not hasattr(cls, 'instance'):
            cls.instance = super(Singleton, cls).__new__(cls)
        return cls.instance

s = Singleton()
print("Obeject created", s)

s1 = Singleton()
print("Object created", s1)

print(s.__class__  == s1.__class__)

# lazy initialization
class Singleton1:
    __instance = None
    def __init__(self):
        if not Singleton1.__instance:
            print("__init__method called.")
        else:
            print("Instance already created:", self.getInstance())

    @classmethod
    def getInstance(cls: object):
        if not cls.__instance:
            cls.__instance = Singleton()
        return cls.__instance

s = Singleton1() # class initalized, but object not created
Singleton1.getInstance() # object created


# class Singleton2:
#     def __new__(cls):
#         if not hasattr(cls, "instance"):
#             cls.instance = super(Singleton2, cls).__new__(cls)
#         return cls.instance

# Singleton I #
# database write/read cloud service

# database control consistency
# optimize database
import sqlite3

class MetaSingleton(type):
    _instances = {}
    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(MetaSingleton, \
                                        cls).__call__(*args, **kwargs)
        return cls._instances[cls]

class Database(metaclass=MetaSingleton):
    connection = None
    def connect(self):
        if self.connection is None:
            self.connection = sqlite3.connect("db.sqlite3")
            self.cursorobj = self.connection.cursor()
        return self.cursorobj

db1 = Database().connect()
db2 = Database().connect()

print("Database object DB1: ", db1)
print("Database object DB2: ", db2)


# Singleton II
# infra monitoring services (Nagios)
# create HealthCheck class, as singleton, maintain a service list

class HealthCheck:
    _instance = None
    def __new__(cls, *args, **kwargs):
        if not HealthCheck._instance:
            HealthCheck._instance = super(HealthCheck, cls).__new__(cls, *args, **kwargs)
        return HealthCheck._instance
    
    def __init__(self):
        self._servers = []

    def addServer(self):
        self._servers.append("Server 1")
        self._servers.append("Server 2")
        self._servers.append("Server 3")
        self._servers.append("Server 4")
        self._servers.append("Server 5")

    def changeServer(self):
        self._servers.pop()
        self._servers.append("Server 6")

hc1 = HealthCheck()
hc2 = HealthCheck()

hc1.addServer()

hc2.changeServer()

print(hc1.__getattribute__("_servers"))
print(hc2.__getattribute__("_servers"))


# __new__ method application
# lets say tuple i want to change, use __new__ to initliaze for immutable strings
# proxy -> call, not efficient

# encryption

# meta class



# Disadvantages of Singleton
# global access issue
# global variable can be changed but developer doesnt know
# too many references to one object
# too tightly coupled to global variables for different objects