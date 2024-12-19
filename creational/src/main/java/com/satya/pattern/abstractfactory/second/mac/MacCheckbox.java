package com.satya.pattern.abstractfactory.second.mac;


import com.satya.pattern.abstractfactory.second.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Mac Checkbox Checked");
    }
}
