package X;

import android.os.Handler;
import android.os.Looper;
import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: X.3Ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72613Ni {
    public C106994s0 A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final Window.OnFrameMetricsAvailableListener A02 = new Window.OnFrameMetricsAvailableListener() { // from class: X.3Nj
        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            C106994s0 c106994s0 = C72613Ni.this.A00;
            if (c106994s0 != null) {
                C14360o3.A0A(frameMetrics);
                C14360o3.A0B(frameMetrics, 0);
                C123465iL c123465iL = new C123465iL(frameMetrics.getMetric(0), frameMetrics.getMetric(1), frameMetrics.getMetric(2), frameMetrics.getMetric(3), frameMetrics.getMetric(4), frameMetrics.getMetric(5), frameMetrics.getMetric(6), frameMetrics.getMetric(7), frameMetrics.getMetric(8));
                c106994s0.A00++;
                c106994s0.A03.A01(c123465iL);
                float f = (float) c123465iL.A0B;
                float f2 = c106994s0.A04;
                if (f > f2) {
                    int min = Math.min((int) ((f / f2) - 1.0f), 100);
                    c106994s0.A02 += min;
                    if (min >= 4) {
                        c106994s0.A05.A01(c123465iL);
                        c106994s0.A01 += min / 4;
                    }
                }
            }
        }
    };
    public final Window A03;

    public final C206179Ba A00() {
        C106994s0 c106994s0 = this.A00;
        if (c106994s0 != null) {
            this.A03.removeOnFrameMetricsAvailableListener(this.A02);
            C206179Ba c206179Ba = new C206179Ba(c106994s0.A03.A00(), c106994s0.A05.A00(), c106994s0.A00, c106994s0.A02, c106994s0.A01, 1);
            this.A00 = null;
            return c206179Ba;
        }
        this.A00 = null;
        return null;
    }

    public C72613Ni(Window window) {
        this.A03 = window;
    }
}
