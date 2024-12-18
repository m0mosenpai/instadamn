package com.facebook.mediastreaming.opt.transport;

import X.C09170dP;
import X.C53707Now;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public class SSLFactoryHolder {
    public static final C53707Now Companion = new Object();
    public HybridData mHybridData;

    private final native HybridData initHybrid(String str, boolean z, Object obj);

    public final HybridData initHybridData(String str, boolean z, Object obj) {
        return initHybrid(str, false, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Now] */
    static {
        C09170dP.A0C("mediastreaming-transport");
    }
}
