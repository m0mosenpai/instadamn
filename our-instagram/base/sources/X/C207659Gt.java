package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.9Gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207659Gt extends AtomicReferenceArray implements InterfaceC137386Kj {
    public static final Integer A05 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public long A00;
    public final int A01;
    public final int A02;
    public final AtomicLong A03;
    public final AtomicLong A04;

    public C207659Gt(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.A02 = length() - 1;
        this.A04 = new AtomicLong();
        this.A03 = new AtomicLong();
        this.A01 = Math.min(i / 4, A05.intValue());
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N((this.A04.get() > this.A03.get() ? 1 : (this.A04.get() == this.A03.get() ? 0 : -1)));
    }

    @Override // X.InterfaceC136016Dg
    public final boolean offer(Object obj) {
        if (obj != null) {
            int i = this.A02;
            AtomicLong atomicLong = this.A04;
            long j = atomicLong.get();
            int i2 = ((int) j) & i;
            if (j >= this.A00) {
                long j2 = this.A01 + j;
                if (get(((int) j2) & i) == null) {
                    this.A00 = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        throw AbstractC166987dD.A15(AbstractC111324zv.A00(3694));
    }

    @Override // X.InterfaceC137386Kj, X.InterfaceC136016Dg
    public final Object poll() {
        AtomicLong atomicLong = this.A03;
        long j = atomicLong.get();
        int i = this.A02 & ((int) j);
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
