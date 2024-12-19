package com.satya.pattern.abstractfactory.second.mac;

import com.satya.pattern.abstractfactory.second.GUIFactory;

public class MacFactory implements GUIFactory {

    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public MacCheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
