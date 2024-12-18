package com.facebook.react.views.scroll;

import X.C62174S0v;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.views.view.ReactViewManager;

@ReactModule(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes10.dex */
public final class ReactHorizontalScrollContainerViewManager extends ReactViewManager {
    public static final C62174S0v Companion = new Object();
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
