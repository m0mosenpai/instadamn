package com.instagram.util.regiontracking;

import X.C09170dP;
import X.IAJ;
import com.facebook.jni.HybridData;

/* loaded from: classes7.dex */
public abstract class RegionTracker {
    public static final IAJ Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid();

    private final native void nativeAddRegion(long j, float f, float f2, float f3, float f4);

    private final native long nativeCreateRegionTracker(int i, float f, float f2, boolean z);

    private final native void nativeDispose(long j);

    private final native Object nativeUpdate(long j, Object obj, int i, int i2, float[] fArr, boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.IAJ, java.lang.Object] */
    static {
        C09170dP.A0C("regiontracking");
    }
}
