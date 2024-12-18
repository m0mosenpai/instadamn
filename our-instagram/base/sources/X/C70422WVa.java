package X;

/* renamed from: X.WVa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70422WVa implements XEQ {
    public int A00 = -1;
    public C1VO A01;

    private final synchronized void A00() {
        C1VO.A01(this.A01);
        this.A01 = null;
        this.A00 = -1;
    }

    @Override // X.XEQ
    public final synchronized C1VO AgB(int i, int i2, int i3) {
        C1VO c1vo;
        try {
            C1VO c1vo2 = this.A01;
            if (c1vo2 != null) {
                c1vo = c1vo2.A03();
            } else {
                c1vo = null;
            }
        } finally {
            A00();
        }
        return c1vo;
    }

    @Override // X.XEQ
    public final synchronized C1VO Ajc(int i) {
        C1VO c1vo;
        C1VO c1vo2;
        if (this.A00 == i && (c1vo2 = this.A01) != null) {
            c1vo = c1vo2.A03();
        } else {
            c1vo = null;
        }
        return c1vo;
    }

    @Override // X.XEQ
    public final synchronized C1VO B4L(int i) {
        C1VO c1vo;
        C1VO c1vo2 = this.A01;
        if (c1vo2 != null) {
            c1vo = c1vo2.A03();
        } else {
            c1vo = null;
        }
        return c1vo;
    }

    @Override // X.XEQ
    public final void DIK(C1VO c1vo, int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (X.C14360o3.A0K(r1, r0) != false) goto L12;
     */
    @Override // X.XEQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void DIQ(X.C1VO r3, int r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.1VO r0 = r2.A01     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r3.A04()     // Catch: java.lang.Throwable -> L2c
            X.1VO r0 = r2.A01     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.A04()     // Catch: java.lang.Throwable -> L2c
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L2c
        L13:
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> L2c
            goto L28
        L18:
            r0 = 0
            goto L13
        L1a:
            X.1VO r0 = r2.A01     // Catch: java.lang.Throwable -> L2c
            X.C1VO.A01(r0)     // Catch: java.lang.Throwable -> L2c
            X.1VO r0 = r3.A03()     // Catch: java.lang.Throwable -> L2c
            r2.A01 = r0     // Catch: java.lang.Throwable -> L2c
            r2.A00 = r4     // Catch: java.lang.Throwable -> L2c
            goto L2a
        L28:
            if (r0 == 0) goto L1a
        L2a:
            monitor-exit(r2)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70422WVa.DIQ(X.1VO, int, int):void");
    }

    @Override // X.XEQ
    public final synchronized void clear() {
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 == false) goto L9;
     */
    @Override // X.XEQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean contains(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L13
            if (r3 != r0) goto L10
            X.1VO r0 = r2.A01     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r1 = r0.A05()     // Catch: java.lang.Throwable -> L13
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70422WVa.contains(int):boolean");
    }
}
