package com.facebook.react.modules.debug;

import X.C14360o3;
import X.InterfaceC65655TqV;
import X.R3M;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeDevSettingsSpec.NAME)
/* loaded from: classes10.dex */
public final class DevSettingsModule extends NativeDevSettingsSpec {
    public final InterfaceC65655TqV devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(R3M r3m, InterfaceC65655TqV interfaceC65655TqV) {
        super(r3m);
        C14360o3.A0B(interfaceC65655TqV, 2);
        this.devSupportManager = interfaceC65655TqV;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean z) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void openDebugger() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean z) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean z) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean z) {
    }
}
