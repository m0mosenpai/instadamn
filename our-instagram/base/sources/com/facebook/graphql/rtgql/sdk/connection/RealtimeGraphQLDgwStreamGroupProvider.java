package com.facebook.graphql.rtgql.sdk.connection;

import X.C09170dP;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class RealtimeGraphQLDgwStreamGroupProvider {
    public static final RealtimeGraphQLDgwStreamGroupProvider $redex_init_class = null;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(DGWClient dGWClient, int i, String str, String str2, String str3, String str4, ScheduledExecutorService scheduledExecutorService);

    static {
        C09170dP.A0C("rtgql-dgw-connection");
    }

    public RealtimeGraphQLDgwStreamGroupProvider(DGWClient dGWClient, int i, String str, String str2, String str3, String str4, ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(dGWClient, i, str, str2, str3, str4, scheduledExecutorService);
    }
}
