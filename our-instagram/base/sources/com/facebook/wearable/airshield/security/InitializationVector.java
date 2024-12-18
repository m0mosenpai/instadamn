package com.facebook.wearable.airshield.security;

import X.AbstractC43593JPy;
import X.C09170dP;
import X.C14360o3;
import X.Xh2;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class InitializationVector {
    public static final Xh2 Companion = new Object();
    public final HybridData mHybridData;

    public /* synthetic */ InitializationVector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean equalsNative(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native int size();

    public final native byte[] toByteArray();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xh2, java.lang.Object] */
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
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.InitializationVector");
        return equalsNative(((InitializationVector) obj).getHandleNative());
    }

    public InitializationVector() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
