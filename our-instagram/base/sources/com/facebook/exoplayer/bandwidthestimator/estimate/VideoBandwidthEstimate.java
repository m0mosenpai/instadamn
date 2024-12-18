package com.facebook.exoplayer.bandwidthestimator.estimate;

import X.AnonymousClass001;
import X.C2AJ;
import X.C2B5;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class VideoBandwidthEstimate implements C2AJ {
    public static final Map PERCENTILE_ZSCORE_MAP = new HashMap<Integer, Float>() { // from class: X.2AK
        {
            put(50, Float.valueOf(0.0f));
            put(51, Float.valueOf(0.03f));
            put(52, Float.valueOf(0.06f));
            put(53, Float.valueOf(0.08f));
            put(54, Float.valueOf(0.1f));
            put(55, Float.valueOf(0.13f));
            put(56, Float.valueOf(0.16f));
            put(57, Float.valueOf(0.18f));
            put(58, Float.valueOf(0.2f));
            put(59, Float.valueOf(0.23f));
            put(60, Float.valueOf(0.26f));
            put(61, Float.valueOf(0.28f));
            put(62, Float.valueOf(0.31f));
            put(63, Float.valueOf(0.33f));
            put(64, Float.valueOf(0.36f));
            put(65, Float.valueOf(0.39f));
            put(66, Float.valueOf(0.42f));
            put(67, Float.valueOf(0.44f));
            put(68, Float.valueOf(0.47f));
            put(69, Float.valueOf(0.5f));
            put(70, Float.valueOf(0.53f));
            put(71, Float.valueOf(0.56f));
            put(72, Float.valueOf(0.59f));
            put(73, Float.valueOf(0.62f));
            put(74, Float.valueOf(0.65f));
            put(75, Float.valueOf(0.68f));
            put(76, Float.valueOf(0.71f));
            put(77, Float.valueOf(0.74f));
            put(78, Float.valueOf(0.78f));
            put(79, Float.valueOf(0.81f));
            put(80, Float.valueOf(0.85f));
            put(81, Float.valueOf(0.88f));
            put(82, Float.valueOf(0.92f));
            put(83, Float.valueOf(0.96f));
            put(84, Float.valueOf(1.0f));
            put(85, Float.valueOf(1.04f));
            put(86, Float.valueOf(1.08f));
            put(87, Float.valueOf(1.13f));
            put(88, Float.valueOf(1.18f));
            put(89, Float.valueOf(1.23f));
            put(90, Float.valueOf(1.28f));
            put(91, Float.valueOf(1.34f));
            put(92, Float.valueOf(1.41f));
            put(93, Float.valueOf(1.48f));
            put(94, Float.valueOf(1.56f));
            put(95, Float.valueOf(1.65f));
            put(96, Float.valueOf(1.76f));
            put(97, Float.valueOf(1.89f));
            put(98, Float.valueOf(2.06f));
            put(99, Float.valueOf(2.33f));
        }
    };
    public AbrContextAwareConfiguration abrConfig;
    public long bandwidthBps;
    public C2B5 bandwidthMeter;
    public final long bandwidthStdDev;
    public final long bandwidthWeight;
    public String bweModel;
    public final int numSamples;
    public final long ttfbMs;
    public final long ttfbStdDev;
    public final long ttfbWeight;

    public long getEstimatedRequestTTFBMs(int i, String str) {
        long j = this.ttfbMs;
        int i2 = 1;
        if (i > 0 && i < 100 && j > 0) {
            if (i < 50) {
                i2 = -1;
                i = 100 - i;
            }
            float floatValue = (((i2 * ((Number) PERCENTILE_ZSCORE_MAP.get(Integer.valueOf(i))).floatValue()) * ((float) this.ttfbStdDev)) / ((float) j)) + 1.0f;
            return r4 * Math.max(Math.min(floatValue + (this.ttfbWeight > 0 ? Math.max(1.0f - (((float) r1) / 300.0f), 0.0f) : 0.0f), 3.0f), 0.5f);
        }
        return j;
    }

    public long getEstimatedThroughput(int i, String str) {
        long j = this.bandwidthBps;
        int i2 = 1;
        if (i > 0 && i < 100 && j > 0) {
            if (i < 50) {
                i2 = -1;
                i = 100 - i;
            }
            float floatValue = 1.0f - (((i2 * ((Number) PERCENTILE_ZSCORE_MAP.get(Integer.valueOf(i))).floatValue()) * ((float) this.bandwidthStdDev)) / ((float) j));
            return r5 * Math.min(Math.max(floatValue - (this.bandwidthWeight > 0 ? Math.max(1.0f - (((float) r1) / 800.0f), 0.0f) : 0.0f), 0.3f), 2.0f);
        }
        return j;
    }

    @Override // X.C2AJ
    public long getEstimatedBitrate(long j, int i, String str) {
        if (j >= 0) {
            long estimatedThroughput = getEstimatedThroughput(i, str);
            long estimatedRequestTTFBMs = getEstimatedRequestTTFBMs(i, str);
            if (estimatedThroughput > 0 && estimatedRequestTTFBMs >= 0) {
                long j2 = (long) (((j * 8000.0d) / estimatedThroughput) + estimatedRequestTTFBMs);
                if (j2 > 0 && j > 0) {
                    return (j * 8000) / j2;
                }
                return -1L;
            }
            return -1L;
        }
        return -1L;
    }

    public VideoBandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6, int i, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        this.bweModel = "ewma";
        this.ttfbMs = j;
        this.ttfbWeight = j2;
        this.ttfbStdDev = j3;
        this.bandwidthBps = j4;
        this.bandwidthWeight = j5;
        this.bandwidthStdDev = j6;
        this.numSamples = i;
        this.abrConfig = abrContextAwareConfiguration;
        this.bandwidthMeter = null;
    }

    public String toString() {
        return AnonymousClass001.A11(AnonymousClass001.A0Q("ttfb=", this.ttfbMs), AnonymousClass001.A0Q(", bw=", this.bandwidthBps / 1000), AnonymousClass001.A0Q(", ttfb_s=", this.ttfbStdDev), AnonymousClass001.A0Q(", bw_s=", this.bandwidthStdDev / 1000), AnonymousClass001.A0O(", s=", this.numSamples));
    }

    public VideoBandwidthEstimate() {
        this.bweModel = "ewma";
        this.ttfbMs = -1L;
        this.ttfbWeight = -1L;
        this.ttfbStdDev = -1L;
        this.bandwidthBps = -1L;
        this.bandwidthWeight = -1L;
        this.bandwidthStdDev = -1L;
        this.numSamples = -1;
        this.abrConfig = null;
        this.bandwidthMeter = null;
    }
}
