package com.facebook.graphqlrealtimeservice;

import X.C09270dc;
import X.C61776RtW;
import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public final class GraphQLRealtimeServiceToken implements GraphQLRealtimeService.Token {
    public static final C61776RtW Companion = new Object();
    public final HybridData mHybridData;

    @Override // com.facebook.graphservice.interfaces.GraphQLService.Token, X.C1Df
    public native void cancel();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RtW, java.lang.Object] */
    static {
        C09270dc.A01("graphqlrealtimeservice-jni");
    }

    public GraphQLRealtimeServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
