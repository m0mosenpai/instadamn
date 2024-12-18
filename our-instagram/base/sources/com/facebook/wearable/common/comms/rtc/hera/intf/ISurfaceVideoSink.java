package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.InterfaceC16660sJ;
import android.view.Surface;

/* loaded from: classes5.dex */
public interface ISurfaceVideoSink extends IRawVideoSink {
    void addSurfaceListener(InterfaceC16660sJ interfaceC16660sJ);

    Surface getSurface();

    void removeSurfaceListener(InterfaceC16660sJ interfaceC16660sJ);
}
