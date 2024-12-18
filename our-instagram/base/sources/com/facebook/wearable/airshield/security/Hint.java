package com.facebook.wearable.airshield.security;

import X.C09170dP;
import X.VN8;
import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public final class Hint {
    public static final VN8 Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void createHintNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native byte[] serializeNative();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VN8, java.lang.Object] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    public final byte[] serialize() {
        return serializeNative();
    }
}
