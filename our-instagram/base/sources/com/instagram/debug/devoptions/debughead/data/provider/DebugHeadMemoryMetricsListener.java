package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC72463XeB;
import X.C005001p;
import X.C72177XRn;
import X.C72181XRr;
import X.YNZ;
import X.YNa;
import com.instagram.debug.devoptions.debughead.data.delegates.MemoryMetricsDelegate;

/* loaded from: classes12.dex */
public class DebugHeadMemoryMetricsListener implements YNa {
    public static DebugHeadMemoryMetricsListener sInstance;
    public MemoryMetricsDelegate mDelegate;

    @Override // X.YNa
    public void reportTo(C72177XRn c72177XRn, YNZ ynz) {
        int i = 0;
        while (true) {
            C005001p c005001p = c72177XRn.A00;
            if (i < c005001p.size()) {
                if (c005001p.A05(i) == C72181XRr.class) {
                    this.mDelegate.onMemoryMetricsReported(MemoryMetricsDelegate.MetricType.MEM_INFO, (AbstractC72463XeB) C72181XRr.class.cast(c005001p.get(C72181XRr.class)));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.debug.devoptions.debughead.data.provider.DebugHeadMemoryMetricsListener, java.lang.Object] */
    public static synchronized DebugHeadMemoryMetricsListener getInstance() {
        DebugHeadMemoryMetricsListener debugHeadMemoryMetricsListener;
        synchronized (DebugHeadMemoryMetricsListener.class) {
            DebugHeadMemoryMetricsListener debugHeadMemoryMetricsListener2 = sInstance;
            debugHeadMemoryMetricsListener = debugHeadMemoryMetricsListener2;
            if (debugHeadMemoryMetricsListener2 == null) {
                ?? obj = new Object();
                sInstance = obj;
                debugHeadMemoryMetricsListener = obj;
            }
        }
        return debugHeadMemoryMetricsListener;
    }

    public void setDelegate(MemoryMetricsDelegate memoryMetricsDelegate) {
        this.mDelegate = memoryMetricsDelegate;
    }
}
