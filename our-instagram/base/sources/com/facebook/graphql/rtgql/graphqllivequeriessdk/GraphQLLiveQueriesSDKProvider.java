package com.facebook.graphql.rtgql.graphqllivequeriessdk;

import X.AbstractC167027dH;
import X.C09170dP;
import X.C225089wX;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;

/* loaded from: classes4.dex */
public final class GraphQLLiveQueriesSDKProvider extends GraphQLLiveQueriesSDKProviderBase {
    public static final C225089wX Companion = new Object();

    public static final native HybridData initHybrid(RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wX, java.lang.Object] */
    static {
        C09170dP.A0C("graphqllivequeriessdk");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLiveQueriesSDKProvider(RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy) {
        super(initHybrid(realtimeGraphQLSDKProvider, baseRequestStreamClient, realtimeConfigSourceProxy));
        AbstractC167027dH.A13(realtimeGraphQLSDKProvider, baseRequestStreamClient, realtimeConfigSourceProxy);
    }
}
