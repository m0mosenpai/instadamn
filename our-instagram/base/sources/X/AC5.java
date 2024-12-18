package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes4.dex */
public final class AC5 {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public /* synthetic */ AC5(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int A06 = AbstractC50712Us.A01.A06(0, 9999999);
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = A06;
    }

    public final void A00(String str, double d) {
        C14360o3.A0B(str, 0);
        this.A01.markerAnnotate(873412642, this.A00, str, d);
    }

    public final void A01(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A01.markerAnnotate(873412642, this.A00, str, str2);
    }
}
