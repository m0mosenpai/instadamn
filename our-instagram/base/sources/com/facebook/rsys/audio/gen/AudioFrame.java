package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.AudioFrameData;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class AudioFrame {
    public static C2N9 CONVERTER = C55648OnZ.A00(1);

    /* loaded from: classes9.dex */
    public final class CProxy extends AudioFrame {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioFrame createFrame(AudioFrameData audioFrameData, AudioFrameMetadata audioFrameMetadata);

        public static native AudioFrame createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioFrame
        public native AudioFrameData getAudioData();

        @Override // com.facebook.rsys.audio.gen.AudioFrame
        public native AudioFrameMetadata getMetadata();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioFrame)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioFrameData getAudioData();

    public abstract AudioFrameMetadata getMetadata();
}
