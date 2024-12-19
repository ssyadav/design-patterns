package com.satya.pattern.abstractfactory.second.windows;


import com.satya.pattern.abstractfactory.second.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox Checked");
    }
}
