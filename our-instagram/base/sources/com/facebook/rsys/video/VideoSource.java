package com.facebook.rsys.video;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public class VideoSource {
    public final NativeHolder mNativeHolder;

    public static native VideoSource createFromMcfType(McfReference mcfReference);

    public static native long getMcfTypeId();

    private native boolean nativeEquals(Object obj);

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VideoSource)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public VideoSource(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
