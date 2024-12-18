package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class AudioApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(0);

    /* loaded from: classes9.dex */
    public final class CProxy extends AudioApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void addSink(String str, int i, AudioSourceSink audioSourceSink);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void enableAudio(ArrayList arrayList);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void enableNoiseSuppression(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native AudioFrame getAudioFrame(String str, int i, int i2, int i3);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native int getAudioLevel(String str, int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleFrame(AudioFrame audioFrame);

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void removeSink(String str, int i, AudioSourceSink audioSourceSink);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void resetNsAecAlgorithms();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setAudioActivationState(int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setAudioOutputRoute(AudioOutputRoute audioOutputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setPlaybackVolumeDeprecated(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void enableAudio(ArrayList arrayList);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract AudioFrame getAudioFrame(String str, int i, int i2, int i3);

    public abstract int getAudioLevel(String str, int i);

    public abstract void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void handleFrame(AudioFrame audioFrame);

    public abstract void removeSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void resetNsAecAlgorithms();

    public abstract void setAudioActivationState(int i);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOutputRoute(AudioOutputRoute audioOutputRoute);

    public abstract void setPlaybackVolumeDeprecated(ArrayList arrayList);
}
