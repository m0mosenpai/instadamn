package com.facebook.realtime.common.appstate;

import X.C09170dP;
import X.EnumC71673Jq;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class AppStateSyncer {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(AppStateGetter appStateGetter);

    private native void notifyForegroundStateChange(int i);

    public native void notifyNetworkStateChange(boolean z);

    public native void notifyNewInterface(long j, int i);

    static {
        C09170dP.A0C("appstatesyncer_jni");
    }

    public void notifyForegroundStateChange(EnumC71673Jq enumC71673Jq) {
        notifyForegroundStateChange(enumC71673Jq.A00);
    }

    public AppStateSyncer(AppStateGetter appStateGetter) {
        this.mHybridData = initHybrid(appStateGetter);
    }
}
