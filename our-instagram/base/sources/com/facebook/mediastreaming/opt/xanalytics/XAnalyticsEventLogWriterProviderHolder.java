package com.facebook.mediastreaming.opt.xanalytics;

import X.C09170dP;
import X.C14360o3;
import X.C53711Np0;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes9.dex */
public final class XAnalyticsEventLogWriterProviderHolder extends ServiceProviderHolder {
    public static final C53711Np0 Companion = new Object();

    public XAnalyticsEventLogWriterProviderHolder(XAnalyticsHolder xAnalyticsHolder, boolean z) {
        C14360o3.A0B(xAnalyticsHolder, 1);
        initHybrid(xAnalyticsHolder, z);
    }

    private final native void initHybrid(XAnalyticsHolder xAnalyticsHolder, boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Np0, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-xanalytics");
    }
}
