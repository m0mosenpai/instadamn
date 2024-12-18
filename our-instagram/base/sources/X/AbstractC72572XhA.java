package X;

import java.lang.ref.Reference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.XhA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72572XhA {
    public static final void A00() {
        while (true) {
            Reference poll = YKP.A03.poll();
            if (poll == null) {
                return;
            }
            YKP ykp = (YKP) poll;
            while (true) {
                AtomicLong atomicLong = ykp.A01;
                long j = atomicLong.get();
                if (j != 0) {
                    if (atomicLong.compareAndSet(j, 0L)) {
                        ykp.A02.invoke(Long.valueOf(j));
                    }
                }
            }
            YKP.A04.remove(poll);
        }
    }
}
