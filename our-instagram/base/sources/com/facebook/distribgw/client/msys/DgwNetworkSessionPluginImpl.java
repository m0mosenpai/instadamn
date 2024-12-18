package com.facebook.distribgw.client.msys;

import X.C09170dP;
import X.C1344765w;
import X.C14360o3;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.jni.HybridData;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class DgwNetworkSessionPluginImpl {
    public static final C1344765w Companion = new Object();
    public final HybridData mHybridData;

    public DgwNetworkSessionPluginImpl(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService) {
        C14360o3.A0B(dGWClient, 1);
        C14360o3.A0B(scheduledExecutorService, 2);
        this.mHybridData = initHybrid(dGWClient, scheduledExecutorService);
    }

    public static final native HybridData initHybrid(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService);

    private final native void registerSessionHybrid(Object obj, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8);

    private final native boolean registerSessionHybridWithAccountSession(Object obj, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, boolean z8);

    private final native void startConnectionForUserImpl(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, boolean z5);

    private final native void unregisterSessionHybrid(Object obj);

    private final native void unregisterSessionHybridImpl(Object obj, Object obj2);

    public final native int getConnectionState(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.65w] */
    static {
        C09170dP.A0C("msysdgw-jni");
    }

    public final void register(Mailbox mailbox, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        registerSessionHybrid(mailbox, "", "", 1L, false, false, true, false, false, z6, z7, false);
    }

    public final void unregister(NetworkSession networkSession, AuthData authData) {
        unregisterSessionHybridImpl(networkSession, authData);
    }
}
