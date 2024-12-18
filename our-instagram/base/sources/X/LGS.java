package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class LGS {
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public LGS(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int andIncrement = A02.getAndIncrement();
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = andIncrement;
    }

    public final void A00(int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021652080, "vesta_service_error_code", i);
        int i2 = this.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021652080, i2, "vesta_service_error");
        lightweightQuickPerformanceLogger.markerAnnotate(1021652080, i2, TraceFieldType.FailureReason, String.valueOf(i));
    }

    public final void A01(String str, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021652080, "vesta_client_error_code", i);
        JQ0.A1E(lightweightQuickPerformanceLogger, "vesta_client_error", str, 1021652080, this.A00);
    }
}
