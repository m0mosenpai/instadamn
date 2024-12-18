package com.facebook.tigon.tigonligerlite;

import X.C09170dP;
import X.SS2;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPClient;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes10.dex */
public final class TigonLigerServiceHolder extends TigonServiceHolder {
    public static final SS2 Companion = new Object();

    public static final native HybridData initHybrid(EventBase eventBase, HTTPClient hTTPClient, String str, boolean z, boolean z2, String[] strArr);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SS2, java.lang.Object] */
    static {
        C09170dP.A0C("tigonligerlite-jni");
    }
}
