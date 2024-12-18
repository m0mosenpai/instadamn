package com.instagram.debug.network;

import X.AbstractC12990ll;
import X.C14360o3;
import com.instagram.debug.network.L;
import java.util.Calendar;

/* loaded from: classes5.dex */
public final class DebugNetworkShapingServerOverrideHelper {
    public static final DebugNetworkShapingServerOverrideHelper INSTANCE = new Object();

    public static final long getSleepPerChunkOverride(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (!INSTANCE.isDayEnabled(abstractC12990ll)) {
            return 0L;
        }
        Long andExpose = L.ig_android_slow_network_debug_tool_config.sleep_time_per_chunk.getAndExpose(abstractC12990ll);
        C14360o3.A0A(andExpose);
        return andExpose.longValue();
    }

    private final boolean isDayEnabled(AbstractC12990ll abstractC12990ll) {
        int longValue = (int) L.ig_android_slow_network_debug_tool_config.days_of_week.getAndExpose(abstractC12990ll).longValue();
        int i = 1 << Calendar.getInstance().get(7);
        if ((longValue & i) == i) {
            return true;
        }
        return false;
    }
}
