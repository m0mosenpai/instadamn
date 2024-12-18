package com.facebook.mediastreaming.client.livestreaming.tslog;

import X.C09170dP;
import X.C53686Nob;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf.BatteryMonitor;

/* loaded from: classes9.dex */
public final class LiveStreamingTsLogServiceProviderHolder extends ServiceProviderHolder {
    public static final C53686Nob Companion = new Object();

    private final native void initHybrid(BatteryMonitor batteryMonitor, int i, boolean z, boolean z2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nob, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-tslog");
    }

    public LiveStreamingTsLogServiceProviderHolder(BatteryMonitor batteryMonitor, int i, boolean z, boolean z2) {
        initHybrid(batteryMonitor, i, z, z2);
    }
}
