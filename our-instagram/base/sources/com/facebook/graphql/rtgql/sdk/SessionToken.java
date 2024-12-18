package com.facebook.graphql.rtgql.sdk;

import X.C09170dP;
import X.C14360o3;
import X.C72549XgJ;
import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public final class SessionToken {
    public static final C72549XgJ Companion = new Object();
    public static final String TAG = "SessionToken";
    public final HybridData mHybridData;

    public SessionToken(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final native void cancel();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XgJ] */
    static {
        C09170dP.A0C("rtgqlsdk");
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }
}
