package com.facebook.hybridlogsink;

import X.C09170dP;
import X.C72883XqH;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public final class HybridLogSink {
    public static final C72883XqH Companion = new Object();
    public final HybridData mHybridData = initHybrid(1000);

    public static final native HybridData initHybrid(int i);

    public final native String[] getLogMessages();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XqH, java.lang.Object] */
    static {
        C09170dP.A0C("hybridlogsinkjni");
    }
}
