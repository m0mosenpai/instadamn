package com.facebook.react.devsupport;

import X.C14360o3;
import X.C62157S0e;
import X.C63255SgD;
import X.InterfaceC65218Tg9;
import X.InterfaceC65655TqV;
import X.R3M;
import X.RunnableC64568TKf;
import X.RunnableC64569TKg;
import X.RunnableC64570TKh;
import X.T0K;
import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "LogBox")
/* loaded from: classes10.dex */
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final C62157S0e Companion = new Object();
    public static final String NAME = "LogBox";
    public final InterfaceC65655TqV devSupportManager;
    public final InterfaceC65218Tg9 surfaceDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxModule(R3M r3m, InterfaceC65655TqV interfaceC65655TqV) {
        super(r3m);
        C14360o3.A0B(interfaceC65655TqV, 2);
        this.devSupportManager = interfaceC65655TqV;
        this.surfaceDelegate = new T0K(interfaceC65655TqV);
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        C63255SgD.A01(new RunnableC64568TKf(this));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        C63255SgD.A01(new RunnableC64569TKg(this));
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        C63255SgD.A01(new RunnableC64570TKh(this));
    }
}
