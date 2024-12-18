package com.facebook.memory.javamemtracker;

import X.AbstractC51822Zf;
import X.C09170dP;
import X.C0TC;
import X.C0TE;
import X.C18120uw;
import android.os.Build;
import com.facebook.memory.common.MapStats;
import com.facebook.memory.common.SurfaceVisitStats;
import com.facebook.memory.javamemtracker.JavaMemoryTrackerForMetrics;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public class JavaMemoryTrackerForMetrics {
    public static JavaMemoryTrackerForMetrics sInstance;
    public final C0TC mDeallocationListener;
    public final C18120uw mDeallocationMonitor;
    public final long[] mGcStats;
    public boolean mInitialized;
    public final boolean mLogGcStats;
    public final int mNumberOfAllocationMaps;
    public final C0TE mPhantomReferenceProcessor;
    public final int mThresholdBytes;

    public JavaMemoryTrackerForMetrics(int i, int i2, boolean z, boolean z2) {
        C0TC c0tc = new C0TC() { // from class: X.4pN
            @Override // X.C0TC
            public final void onDeallocation(long[] jArr, String[] strArr, int i3) {
                JavaMemoryTrackerForMetrics.this.nativeRegisterDeallocation(jArr, strArr, i3);
            }
        };
        this.mDeallocationListener = c0tc;
        C0TE c0te = new C0TE() { // from class: X.4pO
            @Override // X.C0TE
            public final void finishProcessor() {
                JavaMemoryTrackerForMetrics.nativeStopPhantomReferenceLoop();
            }

            @Override // X.C0TE
            public final void startProcessor() {
                JavaMemoryTrackerForMetrics.nativeStartPhantomReferenceLoop();
            }
        };
        this.mPhantomReferenceProcessor = c0te;
        this.mGcStats = new long[4];
        this.mDeallocationMonitor = new C18120uw(c0tc, c0te, false);
        this.mThresholdBytes = i;
        this.mNumberOfAllocationMaps = 1;
        this.mLogGcStats = true;
        if (Build.VERSION.SDK_INT > 29) {
            nativePrepare();
            new Thread() { // from class: X.4pP
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                }
            }.start();
        }
    }

    private native void nativeActivateHooks();

    private native boolean nativeGetAllocatedAndMaxSizeAndDiscardTag(int i, Object obj);

    private native void nativeGetMapStats(Object obj);

    private native int nativeGetObjectCountAnnotation(ByteBuffer byteBuffer, Object obj);

    public static native void nativeInitialize(boolean z, Object obj, int i, int i2, List list, List list2, int i3, int i4, int i5, int i6, boolean z2, int i7, boolean z3, boolean z4, int i8, int i9, Class cls);

    private native void nativePauseTrackingOnThisThread();

    public static native void nativePrepare();

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRegisterDeallocation(long[] jArr, String[] strArr, int i);

    private native void nativeResumeTrackingOnThisThread();

    private native void nativeSetCurrentTag(int i);

    public static native void nativeStartPhantomReferenceLoop();

    private native long nativeStopCurrentTag();

    public static native void nativeStopPhantomReferenceLoop();

    public void startTrackingAccumulationForSurface(int i, boolean z, int i2) {
        synchronized (this) {
            if (!this.mInitialized) {
                nativeInitialize(false, this.mDeallocationMonitor, this.mThresholdBytes, this.mNumberOfAllocationMaps, null, null, 0, 0, 0, 0, false, 0, false, false, 0, 0, null);
                this.mDeallocationMonitor.A00();
                this.mInitialized = true;
            }
        }
        if (this.mLogGcStats) {
            AbstractC51822Zf.A00(this.mGcStats);
        }
        nativeSetCurrentTag(i);
    }

    static {
        C09170dP.A0C("javamemmetrics");
    }

    public void getAccumulatedSizeAndStopTrackingSurface(int i, SurfaceVisitStats surfaceVisitStats, long[] jArr) {
        boolean nativeGetAllocatedAndMaxSizeAndDiscardTag = nativeGetAllocatedAndMaxSizeAndDiscardTag(i, surfaceVisitStats);
        if (this.mLogGcStats) {
            long[] jArr2 = this.mGcStats;
            int length = jArr2.length;
            long[] jArr3 = new long[length];
            System.arraycopy(jArr2, 0, jArr3, 0, length);
            AbstractC51822Zf.A00(this.mGcStats);
            int i2 = 0;
            while (true) {
                long[] jArr4 = this.mGcStats;
                if (i2 >= jArr4.length) {
                    break;
                }
                jArr[i2] = jArr4[i2] - jArr3[i2];
                i2++;
            }
        }
        if (nativeGetAllocatedAndMaxSizeAndDiscardTag) {
            synchronized (this) {
                this.mInitialized = false;
            }
        }
    }

    public long stopTrackingAllocationsForSurface(int i) {
        return nativeStopCurrentTag();
    }

    public void getMapStats(MapStats mapStats) {
        nativeGetMapStats(mapStats);
    }
}
