package X;

import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
public final class OZQ {
    public static float A00 = 1.0f;
    public static float A01 = 1.0f;
    public static int A02;
    public static int A03;
    public static int A04;
    public static boolean A05;
    public static boolean A06;
    public static final OZQ A07 = new Object();

    public static final int A00(float f, boolean z) {
        float f2;
        int i = A04;
        if (i < 15000) {
            f2 = 1000.0f;
        } else {
            f2 = 10000.0f;
            if (i < 30000) {
                f2 = 5000.0f;
            }
        }
        int i2 = (int) f2;
        double d = f;
        if (d < 0.2d) {
            i2 = 10000;
        } else if (d < 0.5d) {
            i2 = 5000;
        } else if (f < 1.0f) {
            i2 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        } else if (f < 2.0f) {
            i2 = 1000;
        } else if (f < 5.0f) {
            i2 = 500;
        } else if (f < 10.0f) {
            i2 = 200;
        } else if (f == 10.0f) {
            i2 = 100;
        }
        if (z) {
            A03 = i2;
        }
        return i2;
    }
}
