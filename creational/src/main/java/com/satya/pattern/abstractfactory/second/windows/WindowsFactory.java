package com.satya.pattern.abstractfactory.second.windows;

import com.satya.pattern.abstractfactory.second.Button;
import com.satya.pattern.abstractfactory.second.Checkbox;
import com.satya.pattern.abstractfactory.second.GUIFactory;

public class WindowsFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
