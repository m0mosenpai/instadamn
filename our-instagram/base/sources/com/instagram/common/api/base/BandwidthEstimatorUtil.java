package com.instagram.common.api.base;

import X.C09170dP;
import X.C1BT;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class BandwidthEstimatorUtil {
    public static final C1BT Companion = new Object();
    public final HybridData mHybridData = initHybrid(13964, 13965);

    public static final native HybridData initHybrid(int i, int i2);

    public final native void addDownloadSample(long j, long j2);

    public final native void addUploadSample(long j, long j2);

    public final native long getDownloadBandwidthEstimate();

    public final native long getUploadBandwidthEstimate();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BT, java.lang.Object] */
    static {
        C09170dP.A0C("bandwidth_estimator_jni");
    }

    public BandwidthEstimatorUtil(int i, int i2) {
    }
}
