package com.facebook.react.views.modal;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC70462WWz;
import X.C14360o3;
import X.C62172S0t;
import X.C64143T0t;
import X.DialogInterfaceOnShowListenerC63431SkA;
import X.InterfaceC65225TgH;
import X.InterfaceC65496TlK;
import X.Q21;
import X.Q4V;
import X.R3N;
import X.SKS;
import X.X9J;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

@ReactModule(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes10.dex */
public final class ReactModalHostManager extends ViewGroupManager {
    public static final C62172S0t Companion = new Object();
    public static final String REACT_CLASS = "RCTModalHostView";
    public final InterfaceC65496TlK delegate;

    public ReactModalHostManager() {
        super(null);
        this.delegate = new AbstractC70462WWz(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Q4V createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new Q4V(r3n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(Q4V q4v) {
        C14360o3.A0B(q4v, 0);
        super.onAfterUpdateTransaction((View) q4v);
        q4v.A02();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(Q4V q4v) {
        C14360o3.A0B(q4v, 0);
        super.onDropViewInstance((View) q4v);
        Context context = q4v.getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((Q21) context).A0B(q4v);
        Q4V.A01(q4v);
    }

    @ReactProp(name = "animated")
    public void setAnimated(Q4V q4v, boolean z) {
    }

    public /* bridge */ /* synthetic */ void setAnimated(View view, boolean z) {
    }

    @ReactProp(name = "animationType")
    public void setAnimationType(Q4V q4v, String str) {
        C14360o3.A0B(q4v, 0);
        if (str != null) {
            q4v.setAnimationType(str);
        }
    }

    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(Q4V q4v, boolean z) {
        C14360o3.A0B(q4v, 0);
        q4v.setHardwareAccelerated(z);
    }

    @ReactProp(name = "identifier")
    public void setIdentifier(Q4V q4v, int i) {
    }

    public /* bridge */ /* synthetic */ void setIdentifier(View view, int i) {
    }

    @ReactProp(name = "presentationStyle")
    public void setPresentationStyle(Q4V q4v, String str) {
    }

    public /* bridge */ /* synthetic */ void setPresentationStyle(View view, String str) {
    }

    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(Q4V q4v, boolean z) {
        C14360o3.A0B(q4v, 0);
        q4v.setStatusBarTranslucent(z);
    }

    @ReactProp(name = "supportedOrientations")
    public void setSupportedOrientations(Q4V q4v, ReadableArray readableArray) {
    }

    public /* bridge */ /* synthetic */ void setSupportedOrientations(View view, ReadableArray readableArray) {
    }

    @ReactProp(name = "transparent")
    public void setTransparent(Q4V q4v, boolean z) {
        C14360o3.A0B(q4v, 0);
        q4v.A03 = z;
    }

    @ReactProp(name = "visible")
    public void setVisible(Q4V q4v, boolean z) {
    }

    public /* bridge */ /* synthetic */ void setVisible(View view, boolean z) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        Q4V q4v = (Q4V) view;
        AbstractC167017dG.A1O(q4v, interfaceC65225TgH);
        q4v.setStateWrapper(interfaceC65225TgH);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(R3N r3n, Q4V q4v) {
        AbstractC167017dG.A1N(r3n, q4v);
        X9J A05 = UIManagerHelper.A05(r3n, q4v.getId());
        if (A05 != null) {
            q4v.A02 = new C64143T0t(r3n, A05, q4v);
            q4v.A01 = new DialogInterfaceOnShowListenerC63431SkA(0, r3n, A05, q4v);
            q4v.setEventDispatcher(A05);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.put("topRequestClose", AbstractC167007dF.A0n("registrationName", "onRequestClose"));
        exportedCustomDirectEventTypeConstants.put("topShow", AbstractC167007dF.A0n("registrationName", "onShow"));
        exportedCustomDirectEventTypeConstants.put("topDismiss", AbstractC167007dF.A0n("registrationName", "onDismiss"));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", AbstractC167007dF.A0n("registrationName", "onOrientationChange"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        return new Q4V(r3n);
    }

    public Object updateState(Q4V q4v, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        AbstractC167017dG.A1O(q4v, interfaceC65225TgH);
        q4v.setStateWrapper(interfaceC65225TgH);
        return null;
    }
}
