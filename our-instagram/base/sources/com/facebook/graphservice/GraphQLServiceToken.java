package com.facebook.graphservice;

import X.C09270dc;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class GraphQLServiceToken implements GraphQLService.Token {
    public final HybridData mHybridData;

    @Override // com.facebook.graphservice.interfaces.GraphQLService.Token, X.C1Df
    public native void cancel();

    static {
        C09270dc.A01("graphservice-jni");
    }

    public GraphQLServiceToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
