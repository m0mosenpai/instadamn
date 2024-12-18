package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SQ7 {
    public final LightweightQuickPerformanceLogger A00;

    public SQ7(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 1);
        this.A00 = lightweightQuickPerformanceLogger;
    }

    public final void A00(C1QW c1qw, String str) {
        C14360o3.A0B(c1qw, 0);
        if (C63188Sen.A0k) {
            this.A00.markerPoint(677319650, c1qw.hashCode(), str);
        }
        this.A00.markerPoint(926483817, c1qw.hashCode(), str);
    }

    public final void A01(C1QW c1qw, String str, int i) {
        C14360o3.A0B(c1qw, 0);
        if (C63188Sen.A0k) {
            this.A00.markerAnnotate(677319650, c1qw.hashCode(), str, i);
        }
        this.A00.markerAnnotate(926483817, c1qw.hashCode(), str, i);
    }

    public final void A02(C1QW c1qw, String str, long j) {
        C14360o3.A0B(c1qw, 0);
        if (C63188Sen.A0k) {
            this.A00.markerAnnotate(677319650, c1qw.hashCode(), str, j);
        }
        this.A00.markerAnnotate(926483817, c1qw.hashCode(), str, j);
    }

    public final void A03(C1QW c1qw, String str, long j, TimeUnit timeUnit) {
        C14360o3.A0B(c1qw, 0);
        if (j != -1 && j != 0) {
            if (C63188Sen.A0k) {
                this.A00.markerPoint(677319650, c1qw.hashCode(), str, j, timeUnit);
            }
            this.A00.markerPoint(926483817, c1qw.hashCode(), str, j, timeUnit);
        }
    }

    public final void A04(C1QW c1qw, String str, String str2) {
        C14360o3.A0B(c1qw, 0);
        if (C63188Sen.A0k) {
            this.A00.markerAnnotate(677319650, c1qw.hashCode(), str, str2);
        }
        this.A00.markerAnnotate(926483817, c1qw.hashCode(), str, str2);
    }

    public final void A05(C1QW c1qw, String str, boolean z) {
        C14360o3.A0B(c1qw, 0);
        if (C63188Sen.A0k) {
            this.A00.markerAnnotate(677319650, c1qw.hashCode(), str, z);
        }
        this.A00.markerAnnotate(926483817, c1qw.hashCode(), str, z);
    }

    public final void A06(C1QW c1qw, short s) {
        if (C63188Sen.A0k) {
            this.A00.markerEnd(677319650, c1qw.hashCode(), s);
        }
        this.A00.markerEnd(926483817, c1qw.hashCode(), s);
    }
}
