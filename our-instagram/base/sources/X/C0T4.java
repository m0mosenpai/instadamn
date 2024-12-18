package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.0T4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0T4 implements C0f2 {
    public static QuickPerformanceLogger A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.0f2] */
    static {
        ?? obj = new Object();
        String[][] strArr = Systrace.A03;
        C0ev.A01(obj);
    }

    @Override // X.C0f2
    public final void DuR() {
        if (A00 != null && Systrace.A0E(4L)) {
            QuickPerformanceLogger quickPerformanceLogger = A00;
            C14360o3.A0A(quickPerformanceLogger);
            quickPerformanceLogger.updateListenerMarkers();
        }
    }

    @Override // X.C0f2
    public final void DuT() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }
}
