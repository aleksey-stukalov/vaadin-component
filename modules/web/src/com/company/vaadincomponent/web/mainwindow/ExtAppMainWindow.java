/*
 * Copyright (c) 2016 vaadincomponent
 */
package com.company.vaadincomponent.web.mainwindow;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

/**
 * @author stukalov
 */
public class ExtAppMainWindow extends AppMainWindow {

    @Override
    public void ready() {
        super.ready();

        openWindow("screen", WindowManager.OpenType.NEW_TAB);
    }
}
