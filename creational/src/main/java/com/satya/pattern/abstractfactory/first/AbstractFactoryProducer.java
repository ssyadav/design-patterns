package com.satya.pattern.abstractfactory.first;

public class AbstractFactoryProducer {
  public static AbstractCarFactory getFactory(String type) {
    if (type.equalsIgnoreCase("hyundai")) {
      return new HyundaiCarFactory();
    } else if (type.equalsIgnoreCase("tata")) {
      return new TataCarFactory();
    }
    return null;
  }
}
