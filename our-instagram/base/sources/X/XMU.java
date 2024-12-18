package X;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public abstract class XMU {
    public static void A00(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }
}
