package com.facebook.wearable.airshield.security;

import X.AbstractC43593JPy;
import X.C09170dP;
import X.C14360o3;
import X.Xh1;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class Hash {
    public static final Xh1 Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    public static final Hash from(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        Hash hash = new Hash(null);
        hash.setRaw(bArr);
        return hash;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void hashBytes(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void hashString(String str);

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native byte[] toByteArray();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xh1, java.lang.Object] */
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
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Hash");
        return equalsNative(((Hash) obj).getHandleNative());
    }

    public Hash(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public /* synthetic */ Hash(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }
}
