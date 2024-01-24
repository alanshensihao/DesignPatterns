package Singleton;

// what is the singleton pattern?

// somtimes we just want one of a specific object
// ex: dialog box, loggine devices, one calcualtor
// singleton pattern ensures that one and only one can be instantiated
// object instantiated only when needed
// provide a global point of access

// build a singleton pattern

// static method - getInstance()
// static variable to hold the instance of class Singleton
// private constructor

// multithreading
// getInstance() will generate a different instance per thread
// add Synchronized keyword?

// why not synchronize?

// but this raises the computation time by a factor of 100
// the whole point of multithreading is to allow the program to run in parallel
// synchronizing is only relevent the first time anyways

// three possibilities
// 1. synchronized - althought it is slow (time penalty), best choice to avoid unnecessary overhead
// 2. use JVM method to create one eagerly - guaranteed that it will be created before the thread access
// 3. use the "double-checked locking"

class Singleton {

    public static Singleton singleton1;
    // 2 eager method
    public static Singleton singleton2 = new Singleton();

    public volatile static Singleton singleton3;

    private Singleton() {}

    // 1 synchronized method
    public static synchronized Singleton getInstance1() {
        if (singleton1 == null) {
            singleton1 = new Singleton();
        }
        return singleton1;
    }

    // 3 double locking method
    public static Singleton getInstance3() {
        if (singleton3 == null) {
            synchronized (Singleton.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton();
                }
            }
        }
        return singleton3;
    }
}