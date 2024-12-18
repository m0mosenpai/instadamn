package com.facebook.rsys.callintent.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class CallMetadata {
    public final NativeHolder mNativeHolder;

    public static native CallMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, boolean z, String str3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getBackingIdentifier();

    public native String getCallerName();

    public native String getCallerProfile();

    public native boolean getIsVideo();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof CallMetadata)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public CallMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public CallMetadata(String str, String str2, boolean z, String str3) {
        str.getClass();
        this.mNativeHolder = initNativeHolder(str, str2, z, str3);
    }
}
