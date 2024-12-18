package com.facebook.realtime.common.streamid;

import X.C09170dP;
import X.C72884XqJ;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public final class RSStreamIdProvider {
    public static final C72884XqJ Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XqJ, java.lang.Object] */
    static {
        C09170dP.A0C("streamid_jni");
    }
}
