package com.facebook.pando.primaryexecution.cache;

import X.C09170dP;
import X.C93594Ia;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes2.dex */
public final class PandoCacheService extends PandoPrimaryExecution {
    public static final C93594Ia Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, boolean z, boolean z2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4Ia] */
    static {
        C09170dP.A0C("pando-client-cache-jni");
    }
}
