package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes4.dex */
public abstract class B0V implements Iterator {
    public int A00;
    public int A01 = -1;
    public C200398ti A02;
    public TTY A03;
    public TTY A04;
    public InterfaceC200438tm A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ ConcurrentMapC200188tN A07;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r3 = this;
            r0 = 0
            r3.A04 = r0
            X.8tm r0 = r3.A05
            if (r0 == 0) goto L3a
        L7:
            X.8tm r0 = r0.BWn()
            r3.A05 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.8tm r0 = r3.A05
            goto L7
        L18:
            int r2 = r3.A00
            if (r2 < 0) goto L69
            X.8tN r0 = r3.A07
            X.8ti[] r1 = r0.A0K
            int r0 = r2 + (-1)
            r3.A00 = r0
            r0 = r1[r2]
            r3.A02 = r0
            int r0 = r0.A0C
            if (r0 == 0) goto L18
            X.8ti r0 = r3.A02
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.A0D
            r3.A06 = r0
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r3.A01 = r0
        L3a:
            int r2 = r3.A01
            if (r2 < 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.A06
            int r0 = r2 + (-1)
            r3.A01 = r0
            java.lang.Object r0 = r1.get(r2)
            X.8tm r0 = (X.InterfaceC200438tm) r0
            r3.A05 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.8tm r0 = r3.A05
            if (r0 == 0) goto L3a
        L58:
            X.8tm r0 = r0.BWn()
            r3.A05 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.8tm r0 = r3.A05
            goto L58
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0V.A00():void");
    }

    @Override // java.util.Iterator
    public abstract Object next();

    public B0V(final ConcurrentMapC200188tN this$0) {
        this.A07 = this$0;
        this.A00 = this$0.A0K.length - 1;
        A00();
    }

    public final boolean A01(InterfaceC200438tm entry) {
        boolean z;
        Object obj;
        try {
            ConcurrentMapC200188tN concurrentMapC200188tN = this.A07;
            long A00 = concurrentMapC200188tN.A0B.A00();
            Object key = entry.getKey();
            if (entry.getKey() != null && (obj = entry.CEZ().get()) != null && !concurrentMapC200188tN.A03(entry, A00)) {
                this.A04 = new TTY(concurrentMapC200188tN, key, obj);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.A02.A0D();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1W(this.A04);
    }

    @Override // java.util.Iterator
    public final void remove() {
        TTY tty = this.A03;
        C18C.A0F(AbstractC167007dF.A1W(tty));
        this.A07.remove(tty.getKey());
        this.A03 = null;
    }
}
