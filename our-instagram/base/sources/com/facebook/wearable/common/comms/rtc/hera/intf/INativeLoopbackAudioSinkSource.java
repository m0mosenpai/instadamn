package com.facebook.wearable.common.comms.rtc.hera.intf;

/* loaded from: classes12.dex */
public interface INativeLoopbackAudioSinkSource extends IRawAudioSink, IRawAudioSource {
    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink, com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    void release();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    void start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    void stop();
}
