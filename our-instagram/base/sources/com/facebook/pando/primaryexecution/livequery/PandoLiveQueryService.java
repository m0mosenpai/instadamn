package com.facebook.pando.primaryexecution.livequery;

import X.C09170dP;
import X.C4IW;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;

/* loaded from: classes2.dex */
public final class PandoLiveQueryService extends PandoPrimaryExecution {
    public static final C4IW Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, GraphQLLiveQueriesSDKProviderBase graphQLLiveQueriesSDKProviderBase, RealtimeConfigSourceProxy realtimeConfigSourceProxy);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4IW, java.lang.Object] */
    static {
        C09170dP.A0C("pando-client-livequery-jni");
    }
}
