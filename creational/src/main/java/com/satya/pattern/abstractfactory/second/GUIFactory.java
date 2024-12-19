package com.satya.pattern.abstractfactory.second;

/**
 * File: GUIFactory.java Copyright 2024 THERMOFISHER SCIENTIFIC. All rights reserved.
 *
 * <p>This software is the confidential and proprietary information of THERMOFISHER SCIENTIFIC. You
 * shall not disclose such Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with THERMOFISHER SCIENTIFIC.
 *
 * <p>Created on: 19/12/24, Created by: satyaveer.yadav, Version: 1.0, Project Name: Genexus/Ion
 * Reporter Last updated by: satyaveer.yadav
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
