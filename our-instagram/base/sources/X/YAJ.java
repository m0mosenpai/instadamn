package X;

import android.os.Handler;
import android.view.Window;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class YAJ implements C5GP {
    public static final long A0A;
    public static final long A0B;
    public double A00;
    public double A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public List A06 = AbstractC166987dD.A1E();
    public final Handler A07;
    public final C72754XmV A08;
    public final C0KF A09;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0A = timeUnit.toMillis(30L);
        A0B = timeUnit.toMillis(30L);
    }

    @Override // X.C5GP
    public final void ARQ() {
        this.A05 = 0L;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0L;
        this.A03 = 0L;
        this.A04 = System.nanoTime();
        this.A09.ARQ();
        C72754XmV c72754XmV = this.A08;
        c72754XmV.A00.markerStart(15990796, "module", c72754XmV.A01);
    }

    public YAJ(Window window, C72754XmV c72754XmV) {
        this.A08 = c72754XmV;
        Handler A0J = AbstractC167007dF.A0J();
        this.A07 = A0J;
        this.A09 = new YAK(A0J, new Y8M(this), window);
    }

    @Override // X.C5GP
    public final void APM() {
        this.A03 = System.nanoTime();
        this.A09.APM();
        this.A07.post(new Runnable() { // from class: X.YGH
            @Override // java.lang.Runnable
            public final void run() {
                YAJ yaj = YAJ.this;
                long min = Math.min(yaj.A05, YAJ.A0A);
                if (min < 0) {
                    min = 0;
                }
                double min2 = Math.min(yaj.A01, 10000.0d);
                double min3 = Math.min(yaj.A00, 10000.0d);
                long min4 = Math.min(TimeUnit.NANOSECONDS.toMillis(yaj.A03 - yaj.A04), YAJ.A0B);
                if (min4 < 0) {
                    min4 = 0;
                }
                C72754XmV c72754XmV = yaj.A08;
                int i = yaj.A02;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c72754XmV.A00;
                MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(15990796);
                withMarker.annotate("1_frame_drop", min2);
                withMarker.annotate("4_frame_drop", min3);
                withMarker.annotate("total_time_spent", min4);
                withMarker.annotate("tracker_version", "frame_metrics");
                double[] dArr = c72754XmV.A02;
                if (dArr != null) {
                    withMarker.annotate("supported_refresh_rates", dArr);
                }
                withMarker.annotate("total_stall_time", min);
                withMarker.annotate("drop_count", i);
                withMarker.annotate(AbstractC111324zv.A00(1319), (String) null);
                withMarker.markerEditingCompleted();
                lightweightQuickPerformanceLogger.markerEnd(15990796, (short) 2);
                yaj.A05 = 0L;
                yaj.A01 = 0.0d;
                yaj.A00 = 0.0d;
                yaj.A02 = 0;
                yaj.A04 = 0L;
                yaj.A03 = 0L;
            }
        });
    }
}
