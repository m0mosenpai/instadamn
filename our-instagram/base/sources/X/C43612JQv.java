package X;

/* renamed from: X.JQv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43612JQv {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;
    public final AbstractC29601bb A03;
    public final AbstractC29601bb A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(X.C43612JQv r8, java.lang.String r9, java.util.Collection r10, X.InterfaceC23621Ds r11, long r12) {
        /*
            r7 = 2
            boolean r0 = X.C50630MWr.A01(r11, r7)
            if (r0 == 0) goto L2a
            r5 = r11
            X.MWr r5 = (X.C50630MWr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A04
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r6 = 3
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L4a
            if (r1 == r7) goto L80
            if (r1 == r6) goto L80
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2a:
            X.MWr r5 = new X.MWr
            r5.<init>(r8, r11, r7)
            goto L15
        L30:
            X.AbstractC09560e7.A00(r2)
            r5.A02 = r8
            r5.A03 = r10
            r5.A01 = r12
            r5.A00 = r0
            X.1YP r2 = r8.A01
            r1 = 0
            X.JbG r0 = new X.JbG
            r0.<init>(r9, r8, r1)
            java.lang.Object r0 = X.C2Q9.A01(r2, r0, r5)
            if (r0 != r4) goto L57
            return r4
        L4a:
            long r12 = r5.A01
            java.lang.Object r10 = r5.A03
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r8 = r5.A02
            X.JQv r8 = (X.C43612JQv) r8
            X.AbstractC09560e7.A00(r2)
        L57:
            r2 = 0
            r1 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L74
            r5.A02 = r1
            r5.A03 = r1
            r5.A00 = r7
        L64:
            X.1YP r2 = r8.A01
            r1 = 9
            X.JZn r0 = new X.JZn
            r0.<init>(r1, r8, r10)
            java.lang.Object r0 = X.C2Q9.A01(r2, r0, r5)
            if (r0 != r4) goto L83
            return r4
        L74:
            int r0 = (int) r12
            java.util.List r10 = X.AbstractC001800i.A0d(r10, r0)
            r5.A02 = r1
            r5.A03 = r1
            r5.A00 = r6
            goto L64
        L80:
            X.AbstractC09560e7.A00(r2)
        L83:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43612JQv.A00(X.JQv, java.lang.String, java.util.Collection, X.1Ds, long):java.lang.Object");
    }

    public C43612JQv(C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new C43906JbH(c1yp, this, 5);
        this.A03 = new C44083Je8(c1yp, this, 16);
        this.A02 = new C44083Je8(c1yp, this, 17);
        this.A04 = new C44083Je8(c1yp, this, 18);
    }

    public C43612JQv() {
    }
}
