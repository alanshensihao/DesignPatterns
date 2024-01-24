# the Gang of Four
# one class has only one object
# based on all objects share states (Monostate)

# Python use __dict__ to store all object state

# shared state, but diferent objects
class Borg:
    __shared_state = {"1": "2"}
    def __init__(self):
        print("init")
        self.x = 1
        self.__dict__ = self.__shared_state
        pass

    def __new__(cls, *args, **kwargs):
        print("new")
        obj = super(Borg, cls).__new__(cls, *args, **kwargs)
        obj._dict__ = cls.__shared_state
        return obj

b = Borg()
b1 = Borg()
b.x = 4

# b and b1 are distinct objects
print(b)
print(b1)

# b.__dict__ and v1.__dict__ are the same
b1.__dict__["c"] = "d"
print(b.__dict__)
print(b1.__dict__)

# META CLASS #
# a metaclass is a class that allows for other classes to be instantiated as objects of the metaclass

a = True
print(a.__class__)
print(a.__class__.__class__)

# when use class to make another class, through type(name, bases, dict)

class MyInt(type):
    def __call__(cls, *args, **kwds):
        print(" my int ", args)
        print("do whatever you want with these objects")
        return type.__call__(cls, *args, **kwds)

class int(metaclass=MyInt):
    def __init__(self, x, y):
        self.x = x
        self.y = y

i = int(4,5)


# __call__
# make class instance behave like a function
class MetaSingleton(type):
    _instances = {}
    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(MetaSingleton, \
                                         cls).__call__(*args, **kwargs)
            return cls._instances[cls]

class Logger(metaclass=MetaSingleton):
    pass

logger1 = Logger()
logger2 = Logger()
print(logger1, logger2)
