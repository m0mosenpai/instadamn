package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class AudioStreamSource {
    public static C2N9 CONVERTER = YAN.A00(10);

    /* loaded from: classes12.dex */
    public final class CProxy extends AudioStreamSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioStreamSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native AudioFrame getAudioFrame(int i, int i2);

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native int getAudioLevel();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native void setPlayoutEnabled(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native void setPlayoutVolume(float f);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioStreamSource)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioFrame getAudioFrame(int i, int i2);

    public abstract int getAudioLevel();

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);
}
