package com.facebook.mediastreaming.opt.source.audio;

/* loaded from: classes9.dex */
public interface AndroidAudioInput {
    boolean isMuted();

    void setHost(AndroidAudioInputHost androidAudioInputHost);

    void setMute(boolean z);

    void startAudioStreaming();

    void stopAudioStreaming();
}
