package com.satya.pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// References  https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
//https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/

public class SingletonClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //exampleSerialization();
        exampleReflection();
    }
    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazyInitializationSingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazyInitializationSingleton deserializedLazy = (LazyInitializationSingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + lazyInitializationSingleton.hashCode());
        System.out.println("Object 2 :" + deserializedLazy.hashCode());

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("SerializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println(" SerializableSingleton Object 2 :" + deserializedInstance.hashCode());
    }
    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazyInitializationSingleton.class.getDeclaredConstructors();
        //Knowing only one constructor taking it using index
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazyInitializationSingleton lazyInitializationSingleton = (LazyInitializationSingleton) constructor.newInstance();
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
        System.out.println("Reflected hashcode singleton :"+ lazyInitializationSingleton.hashCode());
        System.out.println("Singleton instance : "+ instance.hashCode());

        //Solution to this is go by enum
        EnumSingleton.INSTANCE.doSomething();
    }
}
