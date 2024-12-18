package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class Y8M implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ YAJ A00;

    public Y8M(YAJ yaj) {
        this.A00 = yaj;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(11) - frameMetrics.getMetric(10);
        if (metric > 0) {
            YAJ yaj = this.A00;
            yaj.A05 += TimeUnit.NANOSECONDS.toMillis(metric);
            yaj.A01 += Math.min(metric / 1.6666666E7d, 1000.0d);
        }
        YAJ yaj2 = this.A00;
        if (metric >= 66666664) {
            yaj2.A00 += Math.min(metric / 6.6666664E7d, 1000.0d);
        }
        yaj2.A02 += i;
    }
}
