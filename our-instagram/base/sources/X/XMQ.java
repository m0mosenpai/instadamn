package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class XMQ extends AtomicInteger implements YP6, YRQ {
    public Throwable A00;
    public YP6 A01;
    public final AtomicLong A02 = new AtomicLong();
    public final AtomicReference A03 = new AtomicReference();
    public final InterfaceC73610YPe A04;
    public volatile boolean A05;
    public volatile boolean A06;

    @Override // X.InterfaceC73610YPe
    public final void onComplete() {
        this.A06 = true;
        A00();
    }

    @Override // X.InterfaceC73610YPe
    public final void DVo(Object obj) {
        this.A03.lazySet(obj);
        A00();
    }

    @Override // X.InterfaceC73610YPe
    public final void Dpd(YP6 yp6) {
        if (this.A01 != null) {
            yp6.cancel();
            AbstractC142886co.A02(new IllegalStateException("Subscription already set!"));
        } else {
            this.A01 = yp6;
            this.A04.Dpd(this);
            yp6.EIy(Long.MAX_VALUE);
        }
    }

    @Override // X.YP6
    public final void EIy(long j) {
        if (j <= 0) {
            AbstractC142886co.A02(AbstractC166987dD.A12(AnonymousClass001.A0Q("n > 0 required but it was ", j)));
        } else {
            XMU.A00(this.A02, j);
            A00();
        }
    }

    @Override // X.YP6
    public final void cancel() {
        if (!this.A05) {
            this.A05 = true;
            this.A01.cancel();
            if (getAndIncrement() == 0) {
                this.A03.lazySet(null);
            }
        }
    }

    @Override // X.InterfaceC73610YPe
    public final void onError(Throwable th) {
        this.A00 = th;
        this.A06 = true;
        A00();
    }

    public XMQ(InterfaceC73610YPe interfaceC73610YPe) {
        this.A04 = interfaceC73610YPe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        if (r10 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006d, code lost:
    
        r2 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
    
        if (r2 == Long.MAX_VALUE) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        r4 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:
    
        if (r4 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
    
        X.AbstractC142886co.A02(new java.lang.IllegalStateException(X.AnonymousClass001.A0Q("More produced than requested: ", r4)));
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
    
        if (r7.compareAndSet(r2, r4) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        r9 = addAndGet(-r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r14 = this;
            int r0 = r14.getAndIncrement()
            if (r0 != 0) goto L2c
            X.YPe r8 = r14.A04
            java.util.concurrent.atomic.AtomicLong r7 = r14.A02
            java.util.concurrent.atomic.AtomicReference r6 = r14.A03
            r9 = 1
        Ld:
            r12 = 0
            r10 = 0
        L11:
            long r1 = r7.get()
            r5 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
            boolean r4 = r14.A06
            r3 = 0
            java.lang.Object r2 = r6.getAndSet(r3)
            r1 = 0
            if (r2 != 0) goto L25
            r1 = 1
        L25:
            boolean r0 = r14.A05
            if (r0 == 0) goto L2d
            r6.lazySet(r3)
        L2c:
            return
        L2d:
            if (r4 == 0) goto L3a
            java.lang.Throwable r0 = r14.A00
            if (r0 == 0) goto L37
            r6.lazySet(r3)
            goto L5f
        L37:
            if (r1 == 0) goto L9e
            goto L65
        L3a:
            if (r1 == 0) goto L9e
        L3c:
            long r1 = r7.get()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L69
            boolean r2 = r14.A06
            java.lang.Object r0 = r6.get()
            if (r0 != 0) goto L4d
            r5 = 1
        L4d:
            boolean r0 = r14.A05
            r1 = 0
            if (r0 == 0) goto L56
            r6.lazySet(r1)
            return
        L56:
            if (r2 == 0) goto L69
            java.lang.Throwable r0 = r14.A00
            if (r0 == 0) goto L63
            r6.lazySet(r1)
        L5f:
            r8.onError(r0)
            return
        L63:
            if (r5 == 0) goto L69
        L65:
            r8.onComplete()
            return
        L69:
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L96
        L6d:
            long r2 = r7.get()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L96
            long r4 = r2 - r10
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L90
            java.lang.String r0 = "More produced than requested: "
            java.lang.String r1 = X.AnonymousClass001.A0Q(r0, r4)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            X.AbstractC142886co.A02(r0)
            r4 = 0
        L90:
            boolean r0 = r7.compareAndSet(r2, r4)
            if (r0 == 0) goto L6d
        L96:
            int r0 = -r9
            int r9 = r14.addAndGet(r0)
            if (r9 != 0) goto Ld
            return
        L9e:
            r8.DVo(r2)
            r0 = 1
            long r10 = r10 + r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XMQ.A00():void");
    }
}
