package com.satya.pattern.abstractfactory.first;

public class AbstractFactoryClient {
  public static void main(String[] args) {

    AbstractCarFactory hyundaiCarFactory = AbstractFactoryProducer.getFactory("Hyundai");
    Car hyundaiEconomicCar = hyundaiCarFactory.getInstance(500000);
    System.out.println("Hyundai Economic Car Top Speed: " + hyundaiEconomicCar.getTopSpeed());
  }
}
