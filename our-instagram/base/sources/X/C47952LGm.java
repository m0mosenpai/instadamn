package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.LGm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47952LGm {
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public C47952LGm(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int andIncrement = A02.getAndIncrement();
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = andIncrement;
    }

    public final void A00(int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021649468, "vesta_service_error_code", i);
        lightweightQuickPerformanceLogger.markerPoint(1021649468, this.A00, "vesta_service_error");
    }

    public final void A01(String str) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        int i = this.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(1021649468, i, TraceFieldType.ErrorCode, str);
        lightweightQuickPerformanceLogger.markerEnd(1021649468, i, (short) 3);
    }

    public final void A02(String str, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021649468, "vesta_client_error_code", i);
        JQ0.A1E(lightweightQuickPerformanceLogger, "vesta_client_error", str, 1021649468, this.A00);
    }
}
