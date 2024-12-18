package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.OXd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55026OXd {
    public static final void A01(Exception exc, String str, String str2, String str3, String str4, int i) {
        C54957OSh c54957OSh = C54957OSh.A00;
        C0f5 AEp = C18950wb.A01.AEp(str, i);
        if (exc != null) {
            AEp.ERI(exc);
        }
        AEp.ABW("script_url", str2);
        AEp.ABW("script_name", str3);
        AEp.ABW("script_version", str4);
        AEp.report();
    }

    public static final void A00(QuickPerformanceLogger quickPerformanceLogger, String str, String str2, int i, int i2) {
        quickPerformanceLogger.markerAnnotate(i2, i, str, str2);
        quickPerformanceLogger.markerPoint(i2, i, str);
        quickPerformanceLogger.markerEnd(i2, i, (short) 3);
    }
}
