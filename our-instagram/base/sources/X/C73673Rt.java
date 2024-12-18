package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.3Rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73673Rt {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        this.A01.markerPoint(this.A00, str);
    }

    public final void A02(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        this.A01.markerAnnotate(this.A00, str, str2);
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        this.A01.markerPoint(this.A00, str, str2);
    }

    public final void A00() {
        this.A01.markerStart(this.A00);
    }

    public final void A04(boolean z, String str) {
        if (str != null) {
            this.A01.markerAnnotate(this.A00, TraceFieldType.FailureReason, str);
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        int i = this.A00;
        short s = 3;
        if (z) {
            s = 2;
        }
        lightweightQuickPerformanceLogger.markerEnd(i, s);
    }

    public C73673Rt(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i) {
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = i;
    }
}
