package com.facebook.pando;

import X.C09170dP;
import X.C48Q;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;

/* loaded from: classes.dex */
public final class PandoToken implements IPandoGraphQLService.Token {
    public static final C48Q Companion = new Object();
    public final HybridData mHybridData;

    @Override // X.C1Df
    public native void cancel();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.48Q] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }

    public PandoToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
