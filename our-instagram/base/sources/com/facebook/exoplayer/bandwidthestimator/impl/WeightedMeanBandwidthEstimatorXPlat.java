package com.facebook.exoplayer.bandwidthestimator.impl;

import X.C2AF;
import X.C42081wy;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.jni.VideoJni;

/* loaded from: classes11.dex */
public class WeightedMeanBandwidthEstimatorXPlat implements C2AF {
    public long mJniContext;
    public VideoJni mVideoJni;

    public synchronized void addSample(long j, long j2, long j3) {
        addSample(j, j2, j3, -1L, -1L, true, true);
    }

    @Override // X.C2AF
    public synchronized VideoBandwidthEstimate getBandwidthEstimate(AbrContextAwareConfiguration abrContextAwareConfiguration) {
        return this.mVideoJni.weightedMeanBandwidthEstimatorGetBandwidthEstimate(this.mJniContext);
    }

    @Override // X.C2AF
    public void reset(C42081wy c42081wy) {
    }

    public void setParams(boolean z, double d, long j, long j2, long j3, double d2, double d3, long j4) {
        this.mVideoJni.weightedMeanBandwidthEstimatorSetParams(this.mJniContext, z, d, j, j2, j3, d2, d3, j4);
    }

    public WeightedMeanBandwidthEstimatorXPlat() {
        this.mJniContext = 0L;
        VideoJni videoJni = new VideoJni();
        this.mVideoJni = videoJni;
        this.mJniContext = videoJni.weightedMeanBandwidthEstimatorInit();
    }

    @Override // X.C2AF
    public synchronized void addSample(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.mVideoJni.weightedMeanBandwidthEstimatorEnqueueSample(this.mJniContext, j3, j, j2);
    }
}
