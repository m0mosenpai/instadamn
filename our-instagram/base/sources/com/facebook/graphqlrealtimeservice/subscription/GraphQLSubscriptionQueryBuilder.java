package com.facebook.graphqlrealtimeservice.subscription;

import X.C09270dc;
import com.facebook.graphservice.GraphQLQueryBuilder;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class GraphQLSubscriptionQueryBuilder {
    public final HybridData mHybridData;

    public static native HybridData initHybridData(GraphQLQueryBuilder graphQLQueryBuilder, String str, String str2, int i);

    public native GraphQLQuery getResult();

    static {
        C09270dc.A01("graphqlrt-subscription-jni");
    }

    public GraphQLSubscriptionQueryBuilder(GraphQLQueryBuilder graphQLQueryBuilder, String str, String str2, int i) {
        this.mHybridData = initHybridData(graphQLQueryBuilder, str, str2, i);
    }
}
