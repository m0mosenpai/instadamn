package com.facebook.realtime.common.appstate;

import X.InterfaceC53672ct;
import X.InterfaceC53692cv;

/* loaded from: classes.dex */
public class AppStateGetter implements InterfaceC53672ct, InterfaceC53692cv {
    public final InterfaceC53672ct mAppForegroundStateGetter;
    public final InterfaceC53692cv mAppNetworkStateGetter;

    @Override // X.InterfaceC53672ct
    public boolean isAppForegrounded() {
        return this.mAppForegroundStateGetter.isAppForegrounded();
    }

    @Override // X.InterfaceC53672ct
    public boolean isAppSuspended() {
        return this.mAppForegroundStateGetter.isAppSuspended();
    }

    @Override // X.InterfaceC53692cv
    public boolean isNetworkConnected() {
        return this.mAppNetworkStateGetter.isNetworkConnected();
    }

    public AppStateGetter(InterfaceC53672ct interfaceC53672ct, InterfaceC53692cv interfaceC53692cv) {
        this.mAppForegroundStateGetter = interfaceC53672ct;
        this.mAppNetworkStateGetter = interfaceC53692cv;
    }
}
