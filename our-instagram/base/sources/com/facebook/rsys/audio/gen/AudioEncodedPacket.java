package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class AudioEncodedPacket {
    public static C2N9 CONVERTER = YAN.A00(3);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioEncodedPacket createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(byte[] bArr, short s, int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native byte[] getEncodedData();

    public native short getSeqNum();

    public native int getTimestamp();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AudioEncodedPacket)) {
            return nativeEquals(obj);
        }
        return false;
    }

    public AudioEncodedPacket(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioEncodedPacket(byte[] bArr, short s, int i) {
        bArr.getClass();
        Short.valueOf(s).getClass();
        this.mNativeHolder = initNativeHolder(bArr, s, i);
    }
}
