package com.facebook.mediastreaming.opt.transport;

/* loaded from: classes9.dex */
public interface TransportCallbacks {
    void onSpeedTestResult(SpeedTestStatus speedTestStatus);

    void onTransportEvent(TransportEvent transportEvent, TransportError transportError);
}
