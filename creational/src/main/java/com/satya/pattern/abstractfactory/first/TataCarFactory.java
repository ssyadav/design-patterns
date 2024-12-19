package com.satya.pattern.abstractfactory.first;

public class TataCarFactory implements AbstractCarFactory {
  @Override
  public Car getInstance(int price) {
    if (price <= 1000000) {
      return new TataEconomicCar();
    } else if (price >= 2000000) {
      return new TataLuxuryCar();
    }
    return null;
  }
}
