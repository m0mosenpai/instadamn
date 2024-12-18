package com.facebook.tigon.appnetsessionid;

import X.C09170dP;
import X.C14360o3;
import X.C84253pI;
import X.C84263pJ;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class SessionIdGenerator {
    public static final C84253pI Companion = new Object();
    public volatile C84263pJ latestSessionId;
    public final HybridData mHybridData = initHybrid();
    public final ArrayList sessionIdListeners = new ArrayList();

    private final native HybridData initHybrid();

    private final native void initializeSessionIdGenerator();

    public final native void clearLocationId();

    public final native void onBackground();

    public final native void onForeground();

    public final native void onNetworkChange();

    public final native void onSessionChange();

    public final native String updateAndGetLocationId();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3pI] */
    static {
        C09170dP.A0C("appnetsessionid");
    }

    private final void publishNewSessionId(String str, String str2, String str3, long j, long j2, long j3) {
        this.latestSessionId = new C84263pJ(str, str2, str3, j, j2, j3);
        Iterator it = this.sessionIdListeners.iterator();
        C14360o3.A07(it);
        if (it.hasNext()) {
            C14360o3.A07(it.next());
            throw new NullPointerException("onNewSessionId");
        }
    }

    public SessionIdGenerator() {
        initializeSessionIdGenerator();
    }
}
