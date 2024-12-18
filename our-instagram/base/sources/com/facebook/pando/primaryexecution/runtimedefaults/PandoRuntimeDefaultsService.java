package com.facebook.pando.primaryexecution.runtimedefaults;

import X.C09170dP;
import X.C225309wt;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes4.dex */
public abstract class PandoRuntimeDefaultsService extends PandoPrimaryExecution {
    public static final C225309wt Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9wt] */
    static {
        C09170dP.A0C("pando-client-runtimedefaults-jni");
    }
}
