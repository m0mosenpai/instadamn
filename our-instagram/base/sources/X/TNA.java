package X;

import com.facebook.browser.lite.webview.SystemWebView;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class TNA implements Runnable {
    public final /* synthetic */ C63950SwP A00;
    public final /* synthetic */ QF6 A01;

    public TNA(C63950SwP c63950SwP, QF6 qf6) {
        this.A00 = c63950SwP;
        this.A01 = qf6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((SystemWebView) this.A01).A04.reload();
        C63950SwP c63950SwP = this.A00;
        int i = c63950SwP.A01;
        int i2 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        if (i == 0) {
            i2 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        }
        c63950SwP.A00 += i2;
        c63950SwP.A01 = i + 1;
    }
}
