package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.L9f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47797L9f {
    public final int A00;
    public final int A01;
    public final LightweightQuickPerformanceLogger A02;

    public final void A00() {
        this.A02.markerStartWithCancelPolicy(this.A00, false, this.A01, -1L, TimeUnit.NANOSECONDS);
    }

    public final void A01(AbstractC46542Kih abstractC46542Kih) {
        String str;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        short s;
        C44827Jt1 c44827Jt1;
        Exception exc;
        if (abstractC46542Kih instanceof C44826Jt0) {
            lightweightQuickPerformanceLogger = this.A02;
            i = this.A00;
            i2 = this.A01;
            s = 2;
        } else {
            if (!(abstractC46542Kih instanceof C44827Jt1) || (c44827Jt1 = (C44827Jt1) abstractC46542Kih) == null || (exc = c44827Jt1.A00) == null || (str = exc.toString()) == null) {
                str = "Empty response from api";
            }
            lightweightQuickPerformanceLogger = this.A02;
            i = this.A00;
            i2 = this.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.ErrorCode, str);
            s = 3;
        }
        lightweightQuickPerformanceLogger.markerEnd(i, i2, s);
    }

    public final void A02(String str) {
        this.A02.markerAnnotate(this.A00, this.A01, TraceFieldType.TransportType, str);
    }

    public AbstractC47797L9f(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i, int i2) {
        this.A02 = lightweightQuickPerformanceLogger;
        this.A00 = i;
        this.A01 = i2;
    }
}
