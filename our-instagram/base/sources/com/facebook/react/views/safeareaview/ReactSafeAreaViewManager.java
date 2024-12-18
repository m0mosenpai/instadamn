package com.facebook.react.views.safeareaview;

import X.AbstractC167017dG;
import X.AbstractC70462WWz;
import X.C14360o3;
import X.C62173S0u;
import X.InterfaceC65225TgH;
import X.InterfaceC65496TlK;
import X.Q4U;
import X.R3N;
import X.SKS;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;

@ReactModule(name = ReactSafeAreaViewManager.REACT_CLASS)
/* loaded from: classes10.dex */
public final class ReactSafeAreaViewManager extends ViewGroupManager {
    public static final C62173S0u Companion = new Object();
    public static final String REACT_CLASS = "RCTSafeAreaView";
    public final InterfaceC65496TlK delegate;

    public ReactSafeAreaViewManager() {
        super(null);
        this.delegate = new AbstractC70462WWz(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Q4U createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new Q4U(r3n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSafeAreaViewShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        Q4U q4u = (Q4U) view;
        AbstractC167017dG.A1O(q4u, interfaceC65225TgH);
        q4u.A00 = interfaceC65225TgH;
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new Q4U(r3n);
    }

    public Object updateState(Q4U q4u, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        AbstractC167017dG.A1O(q4u, interfaceC65225TgH);
        q4u.A00 = interfaceC65225TgH;
        return null;
    }
}
