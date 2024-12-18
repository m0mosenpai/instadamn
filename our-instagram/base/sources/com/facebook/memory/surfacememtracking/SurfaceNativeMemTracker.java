package com.facebook.memory.surfacememtracking;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.memory.common.SurfaceVisitStats;

/* loaded from: classes2.dex */
public class SurfaceNativeMemTracker {
    public final HybridData mHybridData;
    public boolean mInitialized;

    private native void getAccumulatedAndMaxSizeAndMaybeStopTrackingSurface(int i, boolean z, Object obj);

    public static native HybridData initHybrid(int i, int i2, int i3);

    private native int setCurrentSurface(int i);

    private native void startTracking();

    private native long stopCurrentTag();

    private native void stopTracking();

    public void getAccumulatedAndMaxSizeAndStopTrackingSurface(int i, SurfaceVisitStats surfaceVisitStats) {
        getAccumulatedAndMaxSizeAndMaybeStopTrackingSurface(i, true, surfaceVisitStats);
    }

    public native void getMapStats(Object obj);

    public void start(int i) {
        synchronized (this) {
            if (!this.mInitialized) {
                startTracking();
                this.mInitialized = true;
            }
        }
        setCurrentSurface(i);
    }

    static {
        C09170dP.A0C("surfacenativemem");
    }

    public SurfaceNativeMemTracker(int i) {
        this.mHybridData = initHybrid(7, 100, i);
    }

    public long stop(int i) {
        return stopCurrentTag();
    }
}
