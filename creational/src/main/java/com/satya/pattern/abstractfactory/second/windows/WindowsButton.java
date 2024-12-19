package com.satya.pattern.abstractfactory.second.windows;

import com.satya.pattern.abstractfactory.second.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}
