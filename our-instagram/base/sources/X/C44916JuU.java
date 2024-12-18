package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.JuU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44916JuU extends AbstractC46357Kff {
    public static C44916JuU A01;
    public final QuickPerformanceLogger A00;

    public C44916JuU() {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A00 = qPLInstance == null ? QuickPerformanceLoggerProvider.A01 : qPLInstance;
    }
}
