package com.satya.pattern.abstractfactory.second.mac;

import com.satya.pattern.abstractfactory.second.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button Clicked");
    }
}
