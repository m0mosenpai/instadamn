package com.facebook.rsys.audio;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public class AudioFrameData {
    public final NativeHolder mNativeHolder;

    public static native AudioFrameData createFromMcfType(McfReference mcfReference);

    public static native long getMcfTypeId();

    public static native NativeHolder initNativeHolder(short[] sArr);

    private native boolean nativeEquals(Object obj);

    public native short[] getAudioData(int i);

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AudioFrameData)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public AudioFrameData(short[] sArr) {
        this.mNativeHolder = initNativeHolder(sArr);
    }

    public AudioFrameData(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
