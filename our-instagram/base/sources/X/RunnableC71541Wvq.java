package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wvq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71541Wvq implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C138756Qf A01;
    public final /* synthetic */ Map A02;

    public RunnableC71541Wvq(C138756Qf c138756Qf, Map map, long j) {
        this.A01 = c138756Qf;
        this.A00 = j;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C138756Qf c138756Qf = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = c138756Qf.A01;
        int hashCode = c138756Qf.A02.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C139446Sz.A03(quickPerformanceLogger, this.A02, timeUnit, 906040838, hashCode, j);
        C139446Sz.A04(quickPerformanceLogger, AbstractC06930Yk.A0E(), timeUnit, 906040838, hashCode, j, (short) 2);
    }
}
