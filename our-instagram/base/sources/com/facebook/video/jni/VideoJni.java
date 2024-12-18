package com.facebook.video.jni;

import X.C09170dP;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;

/* loaded from: classes11.dex */
public final class VideoJni {
    public final native void weightedMeanBandwidthEstimatorClose(long j);

    public final native void weightedMeanBandwidthEstimatorEnqueueSample(long j, long j2, long j3, long j4);

    public final native VideoBandwidthEstimate weightedMeanBandwidthEstimatorGetBandwidthEstimate(long j);

    public final native long weightedMeanBandwidthEstimatorInit();

    public final native void weightedMeanBandwidthEstimatorSetParams(long j, boolean z, double d, long j2, long j3, long j4, double d2, double d3, long j5);

    public VideoJni() {
        C09170dP.A0C("VideoJni");
    }
}
