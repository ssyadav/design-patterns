package com.satya.pattern.abstractfactory.second;

public class Application {
  private Button button;
  private Checkbox checkbox;

  public Application(GUIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void paint() {
    button.click();
    checkbox.check();
  }
}
