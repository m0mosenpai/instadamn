package com.instagram.pando.consistency.impl;

import X.C09170dP;
import X.C1DP;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPublishPostProcessorProvider;

/* loaded from: classes.dex */
public final class IgPandoPublishPostProcessorProvider extends PandoPublishPostProcessorProvider {
    public static final C1DP Companion = new Object();

    public static final native HybridData initHybridData(IgPandoPublishPostProcessor igPandoPublishPostProcessor);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1DP] */
    static {
        C09170dP.A0C("pando-consistency-instagram-jni");
    }
}
