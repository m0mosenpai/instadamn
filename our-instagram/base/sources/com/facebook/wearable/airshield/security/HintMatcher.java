package com.facebook.wearable.airshield.security;

import X.C09170dP;
import X.VN9;
import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public final class HintMatcher {
    public static final VN9 Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean hintMatchesNative(byte[] bArr, byte[] bArr2);

    private final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VN9, java.lang.Object] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }
}
