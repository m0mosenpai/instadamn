package com.facebook.pando;

import X.C09170dP;
import X.C4Ii;
import com.facebook.jni.HybridData;

/* loaded from: classes2.dex */
public final class PandoConnectionService extends PandoPrimaryExecution {
    public static final C4Ii Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager, boolean z, boolean z2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Ii, java.lang.Object] */
    static {
        C09170dP.A0C("pando-connection-jni");
    }
}
