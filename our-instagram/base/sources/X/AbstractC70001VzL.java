package X;

import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.VzL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70001VzL {
    public static final int[] A00 = {2002, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, C3OO.FLAG_MOVED};

    public static void A00(WFa wFa, int i) {
        wFa.A0M(7);
        byte[] bArr = wFa.A02;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }
}
