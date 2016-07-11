/*
 * Copyright (c) 2016 vaadincomponent
 */
package com.company.vaadincomponent.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.HBoxLayout;
import com.vaadin.ui.Layout;
import org.vaadin.risto.stepper.DateStepper;

import javax.inject.Inject;
import java.util.Map;

public class Screen extends AbstractWindow {
    /* Getting access to our hbox component, using CUBA mechanism for UI components injection */
    @Inject
    private HBoxLayout hbox;

    /* Create stepper to be placed into the prepared hbox container */
    private DateStepper stepper = new DateStepper();

    /* Overriding init method, which will be called by the framework after creation of all components and before showing the screen */
    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        /* Unwrapping hbox to get access to the native Vaadin layout to place stepper */
        Layout box = hbox.unwrap(Layout.class);

        /* Placing stepper component into the unwrapped hbox container */
        box.addComponent(stepper);

        /* Defining stepper size to fit 100% of the parent hbox component width */
        stepper.setWidth("100%");

        /* Adding listener to show notification when stepper value is changed */
        stepper.addValueChangeListener(event ->
            showNotification("Value has been changed to " + stepper.getValue(), NotificationType.HUMANIZED)
        );
    }
}