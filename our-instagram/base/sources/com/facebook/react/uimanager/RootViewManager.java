package com.facebook.react.uimanager;

import X.C14360o3;
import X.C62168S0p;
import X.R3N;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public final class RootViewManager extends ViewGroupManager {
    public static final C62168S0p Companion = new Object();
    public static final String REACT_CLASS = "RootView";

    public RootViewManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new FrameLayout(r3n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new FrameLayout(r3n);
    }
}
