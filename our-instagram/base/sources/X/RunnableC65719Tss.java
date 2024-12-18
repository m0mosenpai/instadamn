package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Tss, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65719Tss implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C99614de A01;

    public RunnableC65719Tss(C99614de c99614de, int i) {
        this.A01 = c99614de;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QuickPerformanceLogger quickPerformanceLogger = this.A01.A05;
        quickPerformanceLogger.markerEnd(566762171, this.A00, (short) 2, quickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
    }
}
