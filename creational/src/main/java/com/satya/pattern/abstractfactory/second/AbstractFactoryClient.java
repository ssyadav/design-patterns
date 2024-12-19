package com.satya.pattern.abstractfactory.second;


public class AbstractFactoryClient {
  public static void main(String[] args) {

    GUIFactory factory = AbstractFactoryProducer.getFactory("Windows");
    Application app = new Application(factory);
    app.paint();
  }
}
