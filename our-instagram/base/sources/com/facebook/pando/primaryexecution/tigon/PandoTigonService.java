package com.facebook.pando.primaryexecution.tigon;

import X.C09170dP;
import X.C4IL;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class PandoTigonService extends PandoPrimaryExecution {
    public static final C4IL Companion = new Object();

    public static final native HybridData initHybridData(String str, TigonServiceHolder tigonServiceHolder, Executor executor, PandoTigonConfig pandoTigonConfig);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4IL] */
    static {
        C09170dP.A0C("pando-client-tigon-jni");
    }
}
