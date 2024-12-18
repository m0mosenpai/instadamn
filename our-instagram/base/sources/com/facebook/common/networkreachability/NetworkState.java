package com.facebook.common.networkreachability;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes10.dex */
public enum NetworkState {
    NONE(-1),
    UNKNOWN(1),
    CELL_UNKNOWN(100),
    CELL_2G(200),
    CELL_3G(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD),
    CELL_3G_HSPAP(350),
    CELL_4G(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI),
    CELL_5G(500),
    WIFI(1000);

    public final int A00;

    NetworkState(int i) {
        this.A00 = i;
    }
}
