package X;

import android.content.Context;
import android.view.Choreographer;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class YAI implements C5GP {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public final double A04;
    public final C72754XmV A05;
    public boolean A03 = false;
    public final C0KF A06 = new WV2(Choreographer.getInstance(), new YAH(this));

    @Override // X.C5GP
    public final void APM() {
        if (this.A03) {
            this.A03 = false;
            this.A06.APM();
            C72754XmV c72754XmV = this.A05;
            double min = Math.min(this.A01, 3600.0d);
            double min2 = Math.min(this.A00, 1000.0d);
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07));
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c72754XmV.A00;
            MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(15990796);
            withMarker.annotate("1_frame_drop", min);
            withMarker.annotate("4_frame_drop", min2);
            withMarker.annotate("total_time_spent", millis);
            withMarker.annotate("tracker_version", "frame_based");
            double[] dArr = c72754XmV.A02;
            if (dArr != null) {
                withMarker.annotate("supported_refresh_rates", dArr);
            }
            withMarker.annotate(AbstractC111324zv.A00(1319), (String) null);
            withMarker.markerEditingCompleted();
            lightweightQuickPerformanceLogger.markerEnd(15990796, (short) 2);
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0L;
        }
    }

    @Override // X.C5GP
    public final void ARQ() {
        if (!this.A03) {
            this.A03 = true;
            this.A06.ARQ();
            C72754XmV c72754XmV = this.A05;
            c72754XmV.A00.markerStart(15990796, "module", c72754XmV.A01);
        }
    }

    public YAI(Context context, C72754XmV c72754XmV) {
        this.A05 = c72754XmV;
        C0KH c0kh = C0KH.A01;
        if (c0kh == null) {
            c0kh = new C0KH();
            C0KH.A01 = c0kh;
        }
        this.A04 = c0kh.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0L;
    }
}
