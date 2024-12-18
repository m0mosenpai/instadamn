package com.facebook.pando;

import X.C09170dP;
import X.C4Ik;
import com.facebook.jni.HybridClassBase;

/* loaded from: classes2.dex */
public final class ConnectionManager extends HybridClassBase {
    public static final C4Ik Companion = new Object();

    private final native void initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4Ik] */
    static {
        C09170dP.A0C("pando-connection-jni");
    }

    public ConnectionManager() {
        initHybrid();
    }
}
