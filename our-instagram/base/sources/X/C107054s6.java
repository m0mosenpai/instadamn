package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;

/* renamed from: X.4s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107054s6 extends AbstractC208410g {
    public C107064s7 A00;

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        int[] iArr = this.A00.A01;
        return new C06650Xb(Arrays.copyOf(iArr, iArr.length), null);
    }

    @Override // X.C0Xc
    public final String getName() {
        return "touch_responsiveness_interesting_trace_marker";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        C107064s7 c107064s7 = this.A00;
        C14360o3.A0B(c0xx, 0);
        QuickPerformanceLogger quickPerformanceLogger = c107064s7.A05;
        if (quickPerformanceLogger != null) {
            C107064s7.A06.A09(c0xx.BIb(), Long.valueOf(quickPerformanceLogger.currentMonotonicTimestamp()));
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        C107064s7 c107064s7 = this.A00;
        C14360o3.A0B(c0xx, 0);
        QuickPerformanceLogger quickPerformanceLogger = c107064s7.A05;
        if (quickPerformanceLogger != null) {
            int BIb = c0xx.BIb();
            C003501a c003501a = C107064s7.A06;
            long j = BIb;
            Number number = (Number) c003501a.A05(j);
            if (number != null) {
                c003501a.A08(j);
                if (quickPerformanceLogger.currentMonotonicTimestamp() - number.longValue() >= c107064s7.A00) {
                    for (int i : c107064s7.A02) {
                        quickPerformanceLogger.markerAnnotate(i, "interesting_trace", true);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        C107064s7 c107064s7 = this.A00;
        C14360o3.A0B(quickPerformanceLogger, 0);
        c107064s7.A05 = quickPerformanceLogger;
    }
}
