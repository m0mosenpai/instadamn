package X;

import java.util.Arrays;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class SLp {
    public int A00;
    public C54t[] A01;
    public int A02;

    public final void A00(C54t c54t) {
        C54t[] c54tArr;
        int i = this.A00;
        int i2 = this.A02;
        if (i < i2) {
            C54t[] c54tArr2 = this.A01;
            this.A00 = i + 1;
            c54tArr2[i] = c54t;
            return;
        }
        C54t[] c54tArr3 = this.A01;
        if (c54tArr3 == null) {
            this.A02 = 10;
            c54tArr = new C54t[10];
        } else {
            int min = i2 + Math.min(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, Math.max(20, i2 >> 1));
            this.A02 = min;
            c54tArr = (C54t[]) Arrays.copyOf(c54tArr3, min);
        }
        this.A01 = c54tArr;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        c54tArr[i3] = c54t;
    }
}
