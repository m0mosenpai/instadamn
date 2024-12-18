package com.facebook.wearable.airshield.security;

import X.AbstractC167017dG;
import X.AbstractC43593JPy;
import X.C09170dP;
import X.C14360o3;
import X.Xh4;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class PublicKey {
    public static final Xh4 Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    public static final PublicKey from(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        PublicKey publicKey = new PublicKey(null);
        publicKey.setRaw(bArr);
        return publicKey;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native boolean verifySignatureNative(long j, long j2);

    public native int hashCode();

    public final native byte[] serialize();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xh4, java.lang.Object] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PublicKey");
        return equalsNative(((PublicKey) obj).getHandleNative());
    }

    public PublicKey(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public final long getNative() {
        return getHandleNative();
    }

    public final boolean verifySignature(Hash hash, Signature signature) {
        AbstractC167017dG.A1N(hash, signature);
        return verifySignatureNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed(), signature.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public /* synthetic */ PublicKey(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }
}
