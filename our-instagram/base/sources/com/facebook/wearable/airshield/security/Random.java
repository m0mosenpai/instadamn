package com.facebook.wearable.airshield.security;

import X.AbstractC09440dt;
import X.C09170dP;
import X.InterfaceC09390do;
import X.Xh5;
import X.YL2;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class Random {
    public static final Xh5 Companion = new Object();
    public static final InterfaceC09390do instance = AbstractC09440dt.A01(YL2.A00);
    public final HybridData mHybridData;

    public /* synthetic */ Random(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void bytesNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xh5, java.lang.Object] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    public Random() {
        this.mHybridData = initHybrid();
    }
}
