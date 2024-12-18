package com.facebook.react.modules.debug;

import X.C14360o3;
import X.InterfaceC65655TqV;
import X.R3M;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeDevMenuSpec.NAME)
/* loaded from: classes10.dex */
public final class DevMenuModule extends NativeDevMenuSpec {
    public final InterfaceC65655TqV devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevMenuModule(R3M r3m, InterfaceC65655TqV interfaceC65655TqV) {
        super(r3m);
        C14360o3.A0B(interfaceC65655TqV, 2);
        this.devSupportManager = interfaceC65655TqV;
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setProfilingEnabled(boolean z) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void reload() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void show() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void debugRemotely(boolean z) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setHotLoadingEnabled(boolean z) {
    }
}
