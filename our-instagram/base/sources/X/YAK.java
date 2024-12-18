package X;

import android.os.Handler;
import android.view.Window;

/* loaded from: classes12.dex */
public final class YAK implements C0KF {
    public boolean A00 = false;
    public final Handler A01;
    public final Window.OnFrameMetricsAvailableListener A02;
    public final Window A03;

    @Override // X.C0KF
    public final void APM() {
        if (this.A00) {
            this.A00 = false;
            this.A03.removeOnFrameMetricsAvailableListener(this.A02);
        }
    }

    @Override // X.C0KF
    public final void ARQ() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.addOnFrameMetricsAvailableListener(this.A02, this.A01);
        }
    }

    public YAK(Handler handler, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Window window) {
        this.A01 = handler;
        this.A03 = window;
        this.A02 = onFrameMetricsAvailableListener;
    }
}
