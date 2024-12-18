package com.facebook.traffic.monitor.api;

import java.util.UUID;

/* loaded from: classes.dex */
public interface ITrafficTransportMonitor {
    UUID getMarkerInstanceUuid(int i, int i2);

    UUID getOrGenerateQplMarker(int i, int i2);

    UUID registerQplMarkerInstance(int i, int i2);
}
