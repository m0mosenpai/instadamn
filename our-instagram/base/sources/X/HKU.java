package X;

/* loaded from: classes7.dex */
public final class HKU extends AbstractC127945qN implements InterfaceC127965qP, InterfaceC127985qR {
    public long A00;
    public final C132785z1 A01;
    public final boolean A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HKU(X.C127915qK r3, X.C132785z1 r4, boolean r5) {
        /*
            r2 = this;
            r0 = 2
            X.C14360o3.A0B(r4, r0)
            X.1qM r0 = r4.A00
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L18
            r2.<init>(r3, r0)
            r2.A01 = r4
            r2.A02 = r5
            r0 = -1
            r2.A00 = r0
            return
        L18:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HKU.<init>(X.5qK, X.5z1, boolean):void");
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 16L;
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC127985qR
    public final long Bb4() {
        return this.A00;
    }

    @Override // X.InterfaceC127965qP
    public final boolean CQJ() {
        return this.A02;
    }

    @Override // X.InterfaceC127965qP
    public final String getId() {
        return getKey();
    }

    @Override // X.InterfaceC127985qR
    public final void EaT(long j) {
        this.A00 = j;
    }
}
