package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class AudioFrameDetails {
    public static C2N9 CONVERTER = YAN.A00(4);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioFrameDetails createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, long j, long j2, short s, short s2, byte b, long j3, Long l, long j4, long j5, long j6);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native Long getAbsoluteCaptureTimestampMs();

    public native long getArrivalTimeUs();

    public native short getChannelLayout();

    public native long getElapsedTimeMs();

    public native long getEndDecodingTimeUs();

    public native long getNtpTimeMs();

    public native long getProfileTimestampMs();

    public native short getSpeechType();

    public native long getSyncBufferSizeUs();

    public native int getTimestamp();

    public native byte getVadActivity();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AudioFrameDetails)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public AudioFrameDetails(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioFrameDetails(int i, long j, long j2, short s, short s2, byte b, long j3, Long l, long j4, long j5, long j6) {
        Short.valueOf(s).getClass();
        Short.valueOf(s2).getClass();
        this.mNativeHolder = initNativeHolder(i, j, j2, s, s2, b, j3, l, j4, j5, j6);
    }
}
