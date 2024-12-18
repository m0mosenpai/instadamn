package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57032je {
    public final QuickPerformanceLogger A00;

    public static final void A00(C57032je c57032je, Long l, String str, long j, long j2) {
        QuickPerformanceLogger quickPerformanceLogger = c57032je.A00;
        String A0R = AnonymousClass001.A0R(str, "_START");
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        quickPerformanceLogger.markerPoint(725680129, A0R, j, timeUnit);
        quickPerformanceLogger.markerPoint(725680129, AnonymousClass001.A0R(str, "_END"), j2, timeUnit);
        quickPerformanceLogger.markerAnnotate(725680129, str, j2 - j);
        if (l != null) {
            quickPerformanceLogger.markerAnnotate(725680129, AnonymousClass001.A0R(str, "_LFD"), l.longValue());
        }
    }

    public C57032je(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
