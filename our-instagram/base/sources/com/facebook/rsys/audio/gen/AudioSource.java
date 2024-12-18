package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class AudioSource {
    public static C2N9 CONVERTER = YAN.A00(8);

    /* loaded from: classes12.dex */
    public final class CProxy extends AudioSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native int getAudioLevel();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native ArrayList getSinks();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewAudioFrame(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewAudioPosition(float f, float f2, float f3);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setPlayoutEnabled(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setPlayoutVolume(float f);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setSinks(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioSource)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract int getAudioLevel();

    public abstract ArrayList getSinks();

    public abstract void notifyNewAudioFrame(AudioFrame audioFrame);

    public abstract void notifyNewAudioPosition(float f, float f2, float f3);

    public abstract void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);

    public abstract void setSinks(ArrayList arrayList);
}
