package com.instagram.debug.devoptions.apiperf;

import X.InterfaceC62962tZ;
import X.YNa;
import android.content.Context;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import java.util.List;

/* loaded from: classes.dex */
public abstract class DebugHeadPlugin {
    public static DebugHeadPlugin sInstance;

    public abstract InterfaceC62962tZ getDebugHeadDropFrameListener();

    public abstract ImagePerformanceProvider getDebugHeadImagePerformanceListener();

    public abstract LoomTraceProvider getDebugHeadLoomTraceHelper(Context context);

    public abstract List getDebugHeadMemoryLeakExcludedRefs();

    public abstract MemoryLeakBridge getDebugHeadMemoryLeakHelper();

    public abstract YNa getDebugHeadMemoryMetricsListener();

    public abstract NavEventProvider getDebugHeadNavEventListener();

    public abstract TouchEventProvider getDebugHeadTouchEventListener();

    public abstract void onAttachToWindow(Context context);

    public abstract void onCreate(Context context);

    public abstract void onDestroy();

    public abstract void showDebugHead();

    public static DebugHeadPlugin getInstance() {
        return sInstance;
    }

    public static boolean isAvailable() {
        if (DebugHeadConfigurations.isDebugHeadEnabled && sInstance != null) {
            return true;
        }
        return false;
    }

    public static void maybeAttachToWindow(Context context) {
        DebugHeadPlugin debugHeadPlugin = sInstance;
        if (DebugHeadConfigurations.isDebugHeadEnabled && debugHeadPlugin != null) {
            debugHeadPlugin.onAttachToWindow(context);
        }
    }

    public static void maybeDestroy() {
        DebugHeadPlugin debugHeadPlugin = sInstance;
        if (DebugHeadConfigurations.isDebugHeadEnabled && debugHeadPlugin != null) {
            debugHeadPlugin.onDestroy();
        }
    }

    public static DebugHeadPlugin setInstance(DebugHeadPlugin debugHeadPlugin) {
        sInstance = debugHeadPlugin;
        return debugHeadPlugin;
    }
}
