package X;

import android.content.Intent;
import android.graphics.Point;

/* loaded from: classes9.dex */
public final class PFR implements InterfaceC58299Psr {
    public final Intent A00;
    public final Point A01;

    public PFR(Intent intent, Point point) {
        this.A00 = intent;
        this.A01 = point;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcScreenShareCaptureResultAction(captureIntent=");
        A1C.append(this.A00);
        A1C.append(", displaySize=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
