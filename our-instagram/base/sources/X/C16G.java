package X;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.16G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16G {
    public static final int[] A02 = {CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS};
    public static final int[] A03 = {CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, 200, 200};
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(4);
    public final AtomicReferenceArray A01 = new AtomicReferenceArray(4);

    public final byte[] A00(int i) {
        int i2 = A02[i];
        int i3 = 0 < i2 ? i2 : 0;
        byte[] bArr = (byte[]) this.A00.getAndSet(i, null);
        if (bArr == null || bArr.length < i3) {
            return new byte[i3];
        }
        return bArr;
    }

    public final char[] A01(int i, int i2) {
        int i3 = A03[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] cArr = (char[]) this.A01.getAndSet(i, null);
        if (cArr == null || cArr.length < i2) {
            return new char[i2];
        }
        return cArr;
    }
}
