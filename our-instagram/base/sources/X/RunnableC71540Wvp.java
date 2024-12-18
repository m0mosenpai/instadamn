package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wvp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71540Wvp implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C138746Qe A01;
    public final /* synthetic */ String A02;

    public RunnableC71540Wvp(C138746Qe c138746Qe, String str, long j) {
        this.A01 = c138746Qe;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C138746Qe c138746Qe = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = c138746Qe.A04;
        int hashCode = c138746Qe.A05.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap hashMap = new HashMap();
        hashMap.put("error", this.A02);
        C139446Sz.A04(quickPerformanceLogger, hashMap, timeUnit, 906037831, hashCode, j, (short) 3);
    }
}
