package com.facebook.wearable.airshield.security;

import X.AbstractC43593JPy;
import X.C09170dP;
import X.C14360o3;
import X.Xh3;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class PrivateKey {
    public static final Xh3 Companion = new Object();
    public final HybridData mHybridData;

    public /* synthetic */ PrivateKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Hash deriveNative(long j);

    private final native boolean equalsNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native Signature signNative(long j);

    public final Hash derive(PublicKey publicKey) {
        C14360o3.A0B(publicKey, 0);
        return deriveNative(publicKey.getNative());
    }

    public native int hashCode();

    public final native PublicKey recoverPublicKey();

    public final native byte[] serialize();

    public final Signature sign(Hash hash) {
        C14360o3.A0B(hash, 0);
        return signNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xh3, java.lang.Object] */
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
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PrivateKey");
        return equalsNative(((PrivateKey) obj).getHandleNative());
    }

    public PrivateKey() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
