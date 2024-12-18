package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class AudioFrameMetadata {
    public static C2N9 CONVERTER = YAN.A00(5);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioFrameMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2, int i3, boolean z, AudioFrameDetails audioFrameDetails);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native AudioFrameDetails getDetails();

    public native boolean getIsMuted();

    public native int getNumberOfChannels();

    public native int getNumberOfSamples();

    public native int getSampleRate();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AudioFrameMetadata)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public AudioFrameMetadata(int i, int i2, int i3, boolean z, AudioFrameDetails audioFrameDetails) {
        this.mNativeHolder = initNativeHolder(i, i2, i3, z, audioFrameDetails);
    }

    public AudioFrameMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
