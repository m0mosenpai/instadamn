package com.instagram.debug.devoptions.debughead.data.provider;

import X.EnumC72364Xc0;
import com.instagram.debug.devoptions.apiperf.MemoryLeakBridge;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import com.instagram.debug.devoptions.debughead.data.delegates.MemoryLeakDelegate;
import java.util.Collection;

/* loaded from: classes12.dex */
public class MemoryLeakHelper implements MemoryLeakBridge {
    public static MemoryLeakHelper sInstance;
    public MemoryLeakDelegate mDelegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.instagram.debug.devoptions.debughead.data.provider.MemoryLeakHelper] */
    public static synchronized MemoryLeakHelper getInstance() {
        MemoryLeakHelper memoryLeakHelper;
        synchronized (MemoryLeakHelper.class) {
            MemoryLeakHelper memoryLeakHelper2 = sInstance;
            memoryLeakHelper = memoryLeakHelper2;
            if (memoryLeakHelper2 == null) {
                ?? obj = new Object();
                sInstance = obj;
                memoryLeakHelper = obj;
            }
        }
        return memoryLeakHelper;
    }

    @Override // X.C3Tt
    public boolean isEnabled() {
        if (this.mDelegate != null && DebugHeadConfigurations.isMemoryLeakDetectionEnabled) {
            return true;
        }
        return false;
    }

    public void onHeapAnalysisProgress(EnumC72364Xc0 enumC72364Xc0) {
        this.mDelegate.onHeapAnalysisProgress(enumC72364Xc0);
    }

    @Override // X.C3Tt
    public void onLeaksDetected(Collection collection) {
        this.mDelegate.onLeaksDetected(collection);
    }

    public void onHeapAnalyzed(Object obj) {
    }

    public void setDelegate(MemoryLeakDelegate memoryLeakDelegate) {
        this.mDelegate = memoryLeakDelegate;
    }
}
