package com.facebook.messaging.analytics.search.universal.qpllatency;

import X.C09170dP;
import X.C33638Eto;
import com.facebook.jni.HybridData;

/* loaded from: classes6.dex */
public final class QPLSearchLatencyLoggingJni {
    public static final C33638Eto Companion = new Object();
    public HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public final native void cacheQueryEnd(int i, String str, int i2);

    public final native void cacheQueryRender(int i, int i2);

    public final native void cacheQueryStart(int i, String str);

    public final native void endCurrentFlow(String str);

    public final native void endFlow(int i, String str);

    public final native void networkQueryEnd(int i, String str, int i2);

    public final native void networkQueryRender(int i, int i2);

    public final native void networkQueryStart(int i, String str);

    public final native int startFlow(int i, String str, int i2, String str2, String str3);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Eto, java.lang.Object] */
    static {
        C09170dP.A0C("search-qpllogger");
    }
}
