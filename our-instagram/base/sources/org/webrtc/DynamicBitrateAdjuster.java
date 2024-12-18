package org.webrtc;

/* loaded from: classes10.dex */
public class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    public static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    public static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    public static final int BITRATE_ADJUSTMENT_STEPS = 20;
    public static final double BITS_PER_BYTE = 8.0d;
    public int bitrateAdjustmentScaleExp;
    public double deviationBytes;
    public double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(4.0d, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i) {
        double d = this.targetFps;
        if (d != 0.0d) {
            double d2 = this.targetBitrateBps / 8.0d;
            double d3 = this.deviationBytes + (i - (d2 / d));
            this.deviationBytes = d3;
            double d4 = this.timeSinceLastAdjustmentMs + (1000.0d / d);
            this.timeSinceLastAdjustmentMs = d4;
            double d5 = 3.0d * d2;
            double min = Math.min(d3, d5);
            this.deviationBytes = min;
            double max = Math.max(min, -d5);
            this.deviationBytes = max;
            if (d4 > 3000.0d) {
                if (max > d2) {
                    int i2 = this.bitrateAdjustmentScaleExp - ((int) ((max / d2) + 0.5d));
                    this.bitrateAdjustmentScaleExp = i2;
                    this.bitrateAdjustmentScaleExp = Math.max(i2, -20);
                    this.deviationBytes = d2;
                } else {
                    double d6 = -d2;
                    if (max < d6) {
                        int i3 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d2) + 0.5d));
                        this.bitrateAdjustmentScaleExp = i3;
                        this.bitrateAdjustmentScaleExp = Math.min(i3, 20);
                        this.deviationBytes = d6;
                    }
                }
                this.timeSinceLastAdjustmentMs = 0.0d;
            }
        }
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        int i2 = this.targetBitrateBps;
        if (i2 > 0 && i < i2) {
            this.deviationBytes = (this.deviationBytes * i) / i2;
        }
        super.setTargets(i, d);
    }
}
