package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Omt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55610Omt implements BD9 {
    public final /* synthetic */ C55143Od2 A00;

    public C55610Omt(C55143Od2 c55143Od2) {
        this.A00 = c55143Od2;
    }

    @Override // X.BD9
    public final void Dkx(C1819185b c1819185b) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00.A0G;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(603995461, "effect_download_end");
            quickPerformanceLogger.markerPoint(603995461, "effect_load_start");
        }
    }

    @Override // X.BD9
    public final void DqC(String str) {
        C55143Od2 c55143Od2 = this.A00;
        C55143Od2.A02(c55143Od2, C05F.A01);
        QuickPerformanceLogger quickPerformanceLogger = c55143Od2.A0G;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(603995461, "effect_load_end");
        }
    }

    @Override // X.BD9
    public final void onFailure(Throwable th) {
        C55143Od2.A02(this.A00, C05F.A0C);
    }
}
