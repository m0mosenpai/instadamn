package X;

import java.io.IOException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4X8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4X8 {
    public final /* synthetic */ C4SS A00;
    public final /* synthetic */ C95794Sn A01;

    public C4X8(C4SS c4ss, C95794Sn c95794Sn) {
        this.A01 = c95794Sn;
        this.A00 = c4ss;
    }

    public final void A00(Exception exc) {
        C4Y4 c4y4;
        C95794Sn c95794Sn = this.A01;
        C95794Sn.A0E(c95794Sn, "prepareMediaSource onError: %s", exc.getMessage());
        if (exc instanceof C4Y3) {
            c4y4 = (C4Y4) exc;
        } else if (exc instanceof IOException) {
            c4y4 = C4Y3.A00((IOException) exc, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        } else if (exc instanceof RuntimeException) {
            c4y4 = C4Y3.A01((RuntimeException) exc, 1000);
        } else {
            c4y4 = null;
        }
        c95794Sn.A0Q(EnumC117265Sl.A0X, c4y4);
    }
}
