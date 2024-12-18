package com.facebook.mediastreaming.opt.source.audio;

import X.C09170dP;
import X.C53702Nor;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class AndroidExternalAudioSource extends AndroidAudioInputHost {
    public static final C53702Nor Companion = new Object();
    public static final Class TAG = AndroidExternalAudioSource.class;
    public AndroidAudioInput audioInput;

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInputHost
    public native ByteBuffer acquireAudioSampleBuffer();

    @Override // com.facebook.mediastreaming.opt.source.audio.AndroidAudioInputHost
    public native void audioSampleBufferFilled(int i, boolean z, long j);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nor, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public final void prepare() {
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.setHost(this);
        }
    }

    public final void start() {
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.startAudioStreaming();
        }
    }

    public final void stop() {
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.stopAudioStreaming();
        }
    }

    public final void release() {
        stop();
        AndroidAudioInput androidAudioInput = this.audioInput;
        if (androidAudioInput != null) {
            androidAudioInput.setHost(null);
        }
    }

    public AndroidExternalAudioSource(HybridData hybridData) {
        super(hybridData);
    }

    public final void setAudioInput(AndroidAudioInput androidAudioInput) {
        this.audioInput = androidAudioInput;
    }
}
