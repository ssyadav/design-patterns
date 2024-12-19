package com.satya.pattern.abstractfactory.second;

import com.satya.pattern.abstractfactory.second.mac.MacFactory;
import com.satya.pattern.abstractfactory.second.windows.WindowsFactory;

/**
 * File: AbstractFactoryProducer.java Copyright 2024 THERMOFISHER SCIENTIFIC. All rights reserved.
 *
 * <p>This software is the confidential and proprietary information of THERMOFISHER SCIENTIFIC. You
 * shall not disclose such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with THERMOFISHER SCIENTIFIC.
 *
 * <p>Created on: 19/12/24, Created by: satyaveer.yadav, Version: 1.0, Project Name: Genexus/Ion
 * Reporter Last updated by: satyaveer.yadav
 */
public class AbstractFactoryProducer {

  public static GUIFactory getFactory(String osType) {
    if (osType.equalsIgnoreCase("Windows")) {
      return new WindowsFactory();
    } else if (osType.equalsIgnoreCase("Mac")) {
      return new MacFactory();
    }
    return null;
  }
}
