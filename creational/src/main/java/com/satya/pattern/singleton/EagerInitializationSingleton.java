package com.satya.pattern.singleton;

/**
 * This is eager initialization concept where as soon as JVM start the object will be created
 * irrespective whether it got accessed by any code in application or not. When to use : One
 * possible usage can be let say your application has some static cache which is required to be
 * loaded. Drawback : As mention consumes resource even if application does not use it.
 */
public class EagerInitializationSingleton {

  private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

  private EagerInitializationSingleton() {}

  public static EagerInitializationSingleton getInstance() {
    return instance;
  }
}
