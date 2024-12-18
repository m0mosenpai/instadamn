package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.InterfaceC16620sF;

/* loaded from: classes5.dex */
public interface IRawVideoSink {
    InterfaceC16620sF getOnSinkParamsChanged();

    IVideoSize getSinkSize();

    void notifySourceSizeChanged(int i, int i2);

    void release();

    void setOnSinkParamsChanged(InterfaceC16620sF interfaceC16620sF);
}
