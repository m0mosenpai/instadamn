package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class YKP extends PhantomReference {
    public static final ReferenceQueue A03 = new ReferenceQueue();
    public static final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final AtomicBoolean A00;
    public final AtomicLong A01;
    public final InterfaceC16660sJ A02;

    public YKP(Object obj, InterfaceC16660sJ interfaceC16660sJ, long j) {
        super(obj, A03);
        this.A02 = interfaceC16660sJ;
        this.A00 = new AtomicBoolean(false);
        this.A01 = new AtomicLong(0L);
        A04.put(this, true);
        if (this.A00.compareAndSet(false, true)) {
            this.A01.set(j);
        } else {
            if (this.A01.get() == 0) {
                throw AbstractC166987dD.A14("Native instance has been released and must not be used anymore");
            }
            throw AbstractC166987dD.A14("Native instance is already initialized");
        }
    }

    public final long A00() {
        long j = this.A01.get();
        if (this.A00.get()) {
            if (j != 0) {
                return j;
            }
            throw AbstractC166987dD.A14("Native instance has been released and must not be used anymore");
        }
        throw AbstractC166987dD.A14("Native instance has not been initialized");
    }
}
