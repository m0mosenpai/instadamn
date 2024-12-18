package X;

import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* renamed from: X.2AF, reason: invalid class name */
/* loaded from: classes.dex */
public interface C2AF {
    void addSample(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2);

    VideoBandwidthEstimate getBandwidthEstimate(AbrContextAwareConfiguration abrContextAwareConfiguration);

    void reset(C42081wy c42081wy);
}
