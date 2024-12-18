package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.2z9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2z9 {
    public final QuickPerformanceLogger A00;
    public final C54902fo A01;

    public C2z9() {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A00 = qPLInstance == null ? QuickPerformanceLoggerProvider.A01 : qPLInstance;
        this.A01 = new C54902fo();
    }
}
