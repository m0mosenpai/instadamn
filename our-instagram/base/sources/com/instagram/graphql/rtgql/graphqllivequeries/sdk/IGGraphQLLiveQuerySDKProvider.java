package com.instagram.graphql.rtgql.graphqllivequeries.sdk;

import X.C09270dc;
import X.C14360o3;
import X.C48F;
import X.C4IU;
import com.facebook.graphql.rtgql.graphqllivequeriessdk.base.GraphQLLiveQueriesSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.base.RealtimeGraphQLSDKProviderBase;
import com.facebook.graphql.rtgql.sdk.connection.RealtimeGraphQLDgwStreamGroupProvider;
import com.facebook.jni.HybridData;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;

/* loaded from: classes2.dex */
public final class IGGraphQLLiveQuerySDKProvider extends GraphQLLiveQueriesSDKProviderBase {
    public static final C4IU Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGGraphQLLiveQuerySDKProvider(RealtimeGraphQLSDKProviderBase realtimeGraphQLSDKProviderBase, BaseRequestStreamClient baseRequestStreamClient, C48F c48f, RealtimeGraphQLDgwStreamGroupProvider realtimeGraphQLDgwStreamGroupProvider) {
        super(initHybrid(realtimeGraphQLSDKProviderBase, baseRequestStreamClient, new RealtimeConfigSourceProxy(c48f), realtimeGraphQLDgwStreamGroupProvider));
        C14360o3.A0B(realtimeGraphQLSDKProviderBase, 1);
        C14360o3.A0B(baseRequestStreamClient, 2);
        C14360o3.A0B(c48f, 3);
        C14360o3.A0B(realtimeGraphQLDgwStreamGroupProvider, 4);
    }

    public static final native HybridData initHybrid(RealtimeGraphQLSDKProviderBase realtimeGraphQLSDKProviderBase, BaseRequestStreamClient baseRequestStreamClient, RealtimeConfigSourceProxy realtimeConfigSourceProxy, RealtimeGraphQLDgwStreamGroupProvider realtimeGraphQLDgwStreamGroupProvider);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4IU, java.lang.Object] */
    static {
        C09270dc.A01("graphqllivequeries-sdk-provider-jni-instagram");
    }
}
