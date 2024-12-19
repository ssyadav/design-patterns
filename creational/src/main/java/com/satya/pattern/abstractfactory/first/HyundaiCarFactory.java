package com.satya.pattern.abstractfactory.first;

public class HyundaiCarFactory implements AbstractCarFactory {
  @Override
  public Car getInstance(int price) {
    if (price < 1500000) {
      return new HyundaiEconomicCar();
    } else if (price < 2500000) {
      return new HyundaiLuxuryCar();
    }
    return null;
  }
}
