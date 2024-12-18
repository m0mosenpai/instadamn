package X;

import java.io.IOException;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class RFe extends C93214Fx {
    public final int A00;

    public RFe(C4C7 c4c7, IOException iOException, int i) {
        super(c4c7, iOException, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 1);
        this.A00 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AnonymousClass001.A0b(super.getMessage(), ", address hash: ", this.A00);
    }
}
