package com.facebook.tigon.tigonmns;

import X.C09170dP;
import X.C72566Xgs;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class TigonMNSTokenBindingCallbacks {
    public static final C72566Xgs Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public abstract String getAllowedHosts();

    public abstract String getHeaderValue(String str, byte[] bArr);

    public abstract ScheduledExecutorService getScheduledExecutorService();

    public final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xgs, java.lang.Object] */
    static {
        C09170dP.A0C("tigonmns-jni");
    }
}
