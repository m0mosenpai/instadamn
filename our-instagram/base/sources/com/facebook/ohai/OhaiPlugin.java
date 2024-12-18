package com.facebook.ohai;

import X.C09170dP;
import X.C1344665u;
import X.C14360o3;
import com.facebook.jni.HybridData;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;

/* loaded from: classes3.dex */
public final class OhaiPlugin {
    public static final C1344665u Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void registerSessionHybrid(Object obj, String str, double d, double d2, boolean z, double d3, boolean z2, String str2, boolean z3, String str3, double d4, boolean z4);

    private final native void unregisterSessionHybrid(Object obj, Object obj2);

    public final void register(Mailbox mailbox, String str, double d, double d2, boolean z, double d3, boolean z2, String str2, boolean z3, String str3, double d4, boolean z4) {
        C14360o3.A0B(mailbox, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 7);
        C14360o3.A0B(str3, 9);
        registerSessionHybrid(mailbox, str, d, d2, z, d3, z2, str2, z3, str3, d4, z4);
    }

    public final void unregister(NetworkSession networkSession, AuthData authData) {
        C14360o3.A0B(networkSession, 0);
        C14360o3.A0B(authData, 1);
        unregisterSessionHybrid(networkSession, authData);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.65u] */
    static {
        C09170dP.A0C("msysohai-jni");
    }
}
