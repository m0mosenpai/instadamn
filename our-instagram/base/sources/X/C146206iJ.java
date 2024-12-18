package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.6iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146206iJ {
    public boolean A00;
    public final QuickPerformanceLogger A01;
    public final C42H A02;
    public final String A03;

    public C146206iJ(QuickPerformanceLogger quickPerformanceLogger, String str) {
        C14360o3.A0B(quickPerformanceLogger, 1);
        C14360o3.A0B(str, 2);
        this.A01 = quickPerformanceLogger;
        this.A03 = str;
        this.A00 = true;
        this.A02 = new C42H() { // from class: X.6iK
            @Override // X.C42H, X.InterfaceC62892tS
            public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
                C14360o3.A0B(c3vz, 0);
                C146206iJ.this.A00 = c3vz == C3VZ.A03;
            }
        };
    }

    public static final void A00(C146206iJ c146206iJ, String str, int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger = c146206iJ.A01;
        quickPerformanceLogger.markerAnnotate(i, "view_type", str);
        quickPerformanceLogger.markerAnnotate(i, "view_type_id", i2);
        quickPerformanceLogger.markerAnnotate(i, "analytics_module", c146206iJ.A03);
        quickPerformanceLogger.markerAnnotate(i, "is_scroll_idle", c146206iJ.A00);
    }
}
