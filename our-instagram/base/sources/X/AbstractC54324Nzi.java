package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Nzi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54324Nzi {
    public static QuickPerformanceLogger A00;

    public static final void A00(int i, int i2, String str) {
        C14360o3.A0B(str, 2);
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(i, i2, str, (String) null);
            return;
        }
        throw new C53400Njp();
    }
}
