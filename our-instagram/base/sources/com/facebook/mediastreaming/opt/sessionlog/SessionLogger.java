package com.facebook.mediastreaming.opt.sessionlog;

import X.C09170dP;
import X.C53699Noo;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

/* loaded from: classes9.dex */
public final class SessionLogger extends ServiceProviderHolder {
    public static final C53699Noo Companion = new Object();

    private final native void initHybrid(String str);

    private final native void logMetadata(int i, String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Noo, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-sessionlog");
    }

    public SessionLogger(String str) {
        initHybrid(str);
    }
}
