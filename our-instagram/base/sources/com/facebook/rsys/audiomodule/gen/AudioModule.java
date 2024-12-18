package com.facebook.rsys.audiomodule.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioFrame;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class AudioModule {
    public static C2N9 CONVERTER = C55648OnZ.A00(8);

    /* loaded from: classes9.dex */
    public final class CProxy extends AudioModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioModule createFromMcfType(McfReference mcfReference);

        public static native AudioModule createImp(AudioPipelineContext audioPipelineContext, OverlayConfigManagerHolder overlayConfigManagerHolder);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void deliverAppLevelAudio(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void enableNoiseSuppression(boolean z);

        public native int hashCode();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void resetNsAecAlgorithms();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void startPlayout();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void startRecording();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void stopPlayout();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void stopRecording();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioModule)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void deliverAppLevelAudio(AudioFrame audioFrame);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract void resetNsAecAlgorithms();

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
