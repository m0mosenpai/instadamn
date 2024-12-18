package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.954, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass954 {
    public final QuickPerformanceLogger A00;

    public final void A00(String str, Throwable th) {
        String message;
        if (str != null) {
            this.A00.markerAnnotate(966997352, TraceFieldType.FailureReason, str);
        } else if (th != null) {
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            Throwable cause = th.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = th.getMessage();
            }
            quickPerformanceLogger.markerAnnotate(966997352, TraceFieldType.FailureReason, message);
        }
        this.A00.markerEnd(966997352, (short) 3);
    }

    public AnonymousClass954(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
