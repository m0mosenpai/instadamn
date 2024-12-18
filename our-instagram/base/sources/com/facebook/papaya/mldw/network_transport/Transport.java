package com.facebook.papaya.mldw.network_transport;

import X.C09170dP;
import X.C53722NpB;
import com.facebook.jni.HybridData;
import com.facebook.papaya.mldw.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes9.dex */
public final class Transport extends ITransport {
    public static final C53722NpB Companion = new Object();

    public static final native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NpB, java.lang.Object] */
    static {
        C09170dP.A0C("papaya-mldw-network_transport");
    }
}
