package org.webrtc;

/* loaded from: classes10.dex */
public class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    public static final int INITIAL_FPS = 30;

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public double getCodecConfigFramerate() {
        return 30.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        if (this.targetFps == 0.0d) {
            d = 30.0d;
        }
        super.setTargets(i, d);
        this.targetBitrateBps = (int) ((this.targetBitrateBps * 30) / this.targetFps);
    }
}
