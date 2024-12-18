package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class YKZ extends AtomicInteger implements InterfaceC41801wU {
    public final InterfaceC42071wx A00;
    public final C6D4 A01;
    public final C73488YFr[] A02;
    public final Object[] A03;
    public volatile boolean A04;

    public final void A00() {
        C73488YFr[] c73488YFrArr = this.A02;
        for (C73488YFr c73488YFr : c73488YFrArr) {
            c73488YFr.A02.clear();
        }
        for (C73488YFr c73488YFr2 : c73488YFrArr) {
            C6KP.A01(c73488YFr2.A03);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            C73488YFr[] c73488YFrArr = this.A02;
            for (C73488YFr c73488YFr : c73488YFrArr) {
                C6KP.A01(c73488YFr.A03);
            }
            if (getAndIncrement() == 0) {
                for (C73488YFr c73488YFr2 : c73488YFrArr) {
                    c73488YFr2.A02.clear();
                }
            }
        }
    }

    public YKZ(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, int i) {
        this.A00 = interfaceC42071wx;
        this.A01 = c6d4;
        this.A02 = new C73488YFr[i];
        this.A03 = new Object[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        A00();
        r4.onError(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 != 0) goto L2c
            X.YFr[] r5 = r13.A02
            X.1wx r4 = r13.A00
            java.lang.Object[] r3 = r13.A03
            r6 = 1
        Ld:
            int r10 = r5.length
            r9 = 0
            r12 = 0
            r11 = 0
        L11:
            if (r9 >= r10) goto L55
            r8 = r5[r9]
            r0 = r3[r11]
            boolean r7 = r8.A04
            if (r0 != 0) goto L3c
            X.6Km r0 = r8.A02
            java.lang.Object r2 = r0.poll()
            boolean r1 = X.AbstractC25229BEm.A1Z(r2)
            boolean r0 = r13.A04
            if (r0 == 0) goto L2d
            r13.A00()
        L2c:
            return
        L2d:
            if (r7 == 0) goto L49
            java.lang.Throwable r0 = r8.A00
            if (r0 != 0) goto L42
            if (r1 == 0) goto L52
            r13.A00()
            r4.onComplete()
            return
        L3c:
            if (r7 == 0) goto L4d
            java.lang.Throwable r0 = r8.A00
            if (r0 == 0) goto L4d
        L42:
            r13.A00()
            r4.onError(r0)
            return
        L49:
            if (r1 == 0) goto L52
            int r12 = r12 + 1
        L4d:
            int r11 = r11 + 1
            int r9 = r9 + 1
            goto L11
        L52:
            r3[r11] = r2
            goto L4d
        L55:
            if (r12 == 0) goto L5f
            int r0 = -r6
            int r6 = r13.addAndGet(r0)
            if (r6 != 0) goto Ld
            return
        L5f:
            X.6D4 r1 = r13.A01     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r3.clone()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "The zipper returned a null value"
            X.AbstractC42141x4.A01(r1, r0)     // Catch: java.lang.Throwable -> L76
            r4.DVo(r1)
            r0 = 0
            java.util.Arrays.fill(r3, r0)
            goto Ld
        L76:
            r0 = move-exception
            X.AbstractC62281S5a.A00(r0)
            r13.A00()
            r4.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YKZ.A01():void");
    }
}
