package com.facebook.wearable.airshield.security;

import X.AbstractC43593JPy;
import X.C09170dP;
import X.C14360o3;
import X.Xh6;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class Signature {
    public static final Xh6 Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native byte[] toByteArray();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xh6] */
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
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Signature");
        return equalsNative(((Signature) obj).getHandleNative());
    }

    public Signature(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public /* synthetic */ Signature(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }
}
