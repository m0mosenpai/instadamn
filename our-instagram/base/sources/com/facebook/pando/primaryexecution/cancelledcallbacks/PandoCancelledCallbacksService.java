package com.facebook.pando.primaryexecution.cancelledcallbacks;

import X.C09170dP;
import X.C93634Im;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes2.dex */
public final class PandoCancelledCallbacksService extends PandoPrimaryExecution {
    public static final C93634Im Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4Im] */
    static {
        C09170dP.A0C("pando-client-cancelledcallbacks-jni");
    }
}
