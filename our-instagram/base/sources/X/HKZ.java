package X;

/* loaded from: classes7.dex */
public final class HKZ extends AbstractC127945qN implements InterfaceC127975qQ, InterfaceC127965qP {
    public float A00;
    public C5qT A01;
    public C38321qM A02;
    public C38321qM A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HKZ(X.C5qT r5, X.C38321qM r6, float r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r3 = r6.getId()
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L2f
            X.5qK r1 = X.AbstractC127905qJ.A02(r0, r0)
            r0 = 0
            r4.<init>(r1, r0, r3)
            r4.A02 = r6
            r4.A01 = r5
            r4.A00 = r7
            r4.A03 = r6
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L2a
            r4.A04 = r0
            X.1qM r0 = r4.A02
            boolean r0 = r0.Cff()
            r4.A05 = r0
            return
        L2a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        L2f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HKZ.<init>(X.5qT, X.1qM, float):void");
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 0L;
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        return this.A03;
    }

    @Override // X.InterfaceC127965qP
    public final boolean CQJ() {
        return this.A05;
    }

    @Override // X.InterfaceC127965qP
    public final String getId() {
        return this.A04;
    }
}
