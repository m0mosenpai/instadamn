package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.U6j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC66265U6j implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C138746Qe A01;

    public RunnableC66265U6j(C138746Qe c138746Qe, long j) {
        this.A01 = c138746Qe;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C138746Qe c138746Qe = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = c138746Qe.A04;
        int hashCode = c138746Qe.A05.hashCode();
        long j = this.A00;
        C139446Sz.A04(quickPerformanceLogger, AbstractC06930Yk.A0E(), TimeUnit.NANOSECONDS, 906037831, hashCode, j, (short) 2);
    }
}
