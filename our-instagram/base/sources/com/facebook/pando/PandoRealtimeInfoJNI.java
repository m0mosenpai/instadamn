package com.facebook.pando;

import X.C09170dP;
import X.C14360o3;
import X.C48922Ml;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class PandoRealtimeInfoJNI {
    public static final C48922Ml Companion = new Object();
    public final HybridData mHybridData;

    public static final PandoRealtimeInfoJNI forLiveQuery(String str) {
        return Companion.forLiveQuery(str);
    }

    public static final PandoRealtimeInfoJNI forLiveQuery(String str, String str2, String str3) {
        return Companion.forLiveQuery(str, str2, str3);
    }

    public static final PandoRealtimeInfoJNI forSubscription(String str) {
        C14360o3.A0B(str, 0);
        return new PandoRealtimeInfoJNI(str);
    }

    private final native HybridData initLiveQueryHybridData(String str, String str2, String str3);

    private final native HybridData initSubscriptionHybridData(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Ml, java.lang.Object] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }

    public PandoRealtimeInfoJNI(String str) {
        this.mHybridData = initSubscriptionHybridData(str);
    }

    public PandoRealtimeInfoJNI(String str, String str2, String str3) {
        this.mHybridData = initLiveQueryHybridData(str, str2, str3);
    }
}
