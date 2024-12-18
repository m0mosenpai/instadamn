package com.facebook.pando;

import X.C09170dP;
import X.C14360o3;
import X.C48M;
import com.facebook.graphql.rtgql.graphqlsubscriptionssdk.base.GraphQLSubscriptionsSDKProviderBase;
import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public final class PandoSubscriptionPrimaryExecutionJNI extends PandoPrimaryExecution {
    public static final C48M Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PandoSubscriptionPrimaryExecutionJNI(GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, boolean z) {
        super(initHybridData(graphQLSubscriptionsSDKProviderBase, z));
        C14360o3.A0B(graphQLSubscriptionsSDKProviderBase, 1);
    }

    public static final native HybridData initHybridData(GraphQLSubscriptionsSDKProviderBase graphQLSubscriptionsSDKProviderBase, boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.48M] */
    static {
        C09170dP.A0C("pando-graphql-subscriptions-jni");
    }
}
