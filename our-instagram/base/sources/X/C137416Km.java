package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.6Km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137416Km implements InterfaceC137386Kj {
    public static final int A08 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object A09 = new Object();
    public int A00;
    public long A01;
    public AtomicReferenceArray A02;
    public AtomicReferenceArray A03;
    public final int A04;
    public final int A05;
    public final AtomicLong A07 = new AtomicLong();
    public final AtomicLong A06 = new AtomicLong();

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        if (this.A07.get() != this.A06.get()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC136016Dg
    public final boolean offer(Object obj) {
        long j;
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.A03;
            AtomicLong atomicLong = this.A07;
            long j2 = atomicLong.get();
            int i = this.A05;
            int i2 = ((int) j2) & i;
            if (j2 >= this.A01) {
                long j3 = this.A00 + j2;
                if (atomicReferenceArray.get(((int) j3) & i) == null) {
                    this.A01 = j3 - 1;
                } else {
                    j = 1 + j2;
                    if (atomicReferenceArray.get(((int) j) & i) != null) {
                        long j4 = i;
                        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
                        this.A03 = atomicReferenceArray2;
                        this.A01 = (j4 + j2) - 1;
                        atomicReferenceArray2.lazySet(i2, obj);
                        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
                        atomicReferenceArray.lazySet(i2, A09);
                        atomicLong.lazySet(j);
                        return true;
                    }
                }
            }
            atomicReferenceArray.lazySet(i2, obj);
            j = j2 + 1;
            atomicLong.lazySet(j);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // X.InterfaceC137386Kj, X.InterfaceC136016Dg
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.A02;
        AtomicLong atomicLong = this.A06;
        long j = atomicLong.get();
        int i = this.A04;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = false;
        if (obj == A09) {
            z = true;
        }
        if (obj != null) {
            if (!z) {
                atomicReferenceArray.lazySet(i2, null);
                atomicLong.lazySet(j + 1);
                return obj;
            }
        } else if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.A02 = atomicReferenceArray2;
        obj = atomicReferenceArray2.get(i2);
        if (obj != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj;
    }

    public C137416Km(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.A03 = atomicReferenceArray;
        this.A05 = i2;
        this.A00 = Math.min(numberOfLeadingZeros / 4, A08);
        this.A02 = atomicReferenceArray;
        this.A04 = i2;
        this.A01 = i2 - 1;
        this.A07.lazySet(0L);
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
