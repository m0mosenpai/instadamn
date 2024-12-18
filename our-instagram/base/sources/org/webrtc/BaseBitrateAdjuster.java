package org.webrtc;

/* loaded from: classes10.dex */
public class BaseBitrateAdjuster implements BitrateAdjuster {
    public int targetBitrateBps;
    public double targetFps;

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i) {
    }

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getCodecConfigFramerate() {
        return this.targetFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        this.targetBitrateBps = i;
        this.targetFps = d;
    }
}
