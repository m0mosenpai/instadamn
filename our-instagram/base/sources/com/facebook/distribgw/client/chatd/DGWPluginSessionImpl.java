package com.facebook.distribgw.client.chatd;

import X.C09170dP;
import X.C225049wT;
import com.facebook.distribgw.client.DGWClient;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class DGWPluginSessionImpl {
    public static final C225049wT Companion = new Object();

    public static final native void registerSessionNative(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService, boolean z, long j, boolean z2, boolean z3);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9wT] */
    static {
        C09170dP.A0C("chatddgw-jni");
    }
}
