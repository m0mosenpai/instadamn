package com.facebook.pando.primaryexecution.networksequencing;

import X.C09170dP;
import X.C4IP;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes2.dex */
public final class PandoNetworkSequencingService extends PandoPrimaryExecution {
    public static final C4IP Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4IP, java.lang.Object] */
    static {
        C09170dP.A0C("pando-client-networksequencing-jni");
    }
}
