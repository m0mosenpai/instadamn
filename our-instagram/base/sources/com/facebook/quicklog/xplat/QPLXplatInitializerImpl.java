package com.facebook.quicklog.xplat;

import X.C07620ab;
import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes.dex */
public final class QPLXplatInitializerImpl {
    public static final C07620ab Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public static final native void setupNativeQPLWithXAnalyticsHolder(XAnalyticsHolder xAnalyticsHolder);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ab, java.lang.Object] */
    static {
        C09170dP.A0C("perfloggerxplat_init");
    }
}
