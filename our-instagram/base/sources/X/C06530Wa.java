package X;

import android.os.Debug;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06530Wa {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final MultiBufferLogger A0A;

    private void A00(long j, long j2, int i) {
        if (j > j2) {
            this.A0A.writeStandardEntry(6, 44, 0L, 0, i, 0, j);
        }
    }

    private void A01(long j, long j2, int i) {
        if (j != j2) {
            this.A0A.writeStandardEntry(6, 44, 0L, 0, i, 0, j);
        }
    }

    public C06530Wa(MultiBufferLogger multiBufferLogger) {
        this.A0A = multiBufferLogger;
    }

    public final void A02() {
        long globalAllocCount = Debug.getGlobalAllocCount();
        A00(globalAllocCount, this.A00, 9240593);
        this.A00 = globalAllocCount;
        long globalAllocSize = Debug.getGlobalAllocSize();
        A00(globalAllocSize, this.A01, 9240594);
        this.A01 = globalAllocSize;
        String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
        if (runtimeStat != null) {
            long parseLong = Long.parseLong(runtimeStat);
            A00(parseLong, this.A04, 9240595);
            this.A04 = parseLong;
        }
        String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
        if (runtimeStat2 != null) {
            long parseLong2 = Long.parseLong(runtimeStat2);
            A00(parseLong2, this.A05, 9240665);
            this.A05 = parseLong2;
        }
        String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
        if (runtimeStat3 != null) {
            long parseLong3 = Long.parseLong(runtimeStat3);
            A00(parseLong3, this.A02, 9240664);
            this.A02 = parseLong3;
        }
        String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
        if (runtimeStat4 != null) {
            long parseLong4 = Long.parseLong(runtimeStat4);
            A00(parseLong4, this.A03, 9240666);
            this.A03 = parseLong4;
        }
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j = runtime.totalMemory();
        long freeMemory = j - runtime.freeMemory();
        long j2 = maxMemory - freeMemory;
        A01(freeMemory, this.A09, 9240636);
        A01(j2, this.A06, 9240634);
        A01(maxMemory, this.A07, 9240635);
        A01(j, this.A08, 9240637);
        this.A07 = maxMemory;
        this.A08 = j;
        this.A09 = freeMemory;
        this.A06 = j2;
    }
}
