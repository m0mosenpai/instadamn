package X;

/* loaded from: classes7.dex */
public final class HKa extends AbstractC127945qN implements InterfaceC127975qQ, InterfaceC127985qR {
    public long A00;
    public C40952IBz A01;
    public C38321qM A02;
    public final long A03;

    @Override // X.AbstractC127945qN
    public final long A00() {
        return this.A03;
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A02 */
    public final String getKey() {
        String A0T;
        C130505uv c130505uv = super.A03;
        if (c130505uv == null || (A0T = AnonymousClass001.A0T(c130505uv.A00(), this.A04, ':')) == null) {
            return this.A04;
        }
        return A0T;
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        return this.A02;
    }

    @Override // X.InterfaceC127985qR
    public final long Bb4() {
        return this.A00;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HKa(X.C127915qK r3, X.C40952IBz r4, X.C130505uv r5, X.C38321qM r6) {
        /*
            r2 = this;
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L16
            r2.<init>(r3, r5, r0)
            r2.A02 = r6
            r2.A01 = r4
            r0 = -1
            r2.A00 = r0
            r0 = 32
            r2.A03 = r0
            return
        L16:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HKa.<init>(X.5qK, X.IBz, X.5uv, X.1qM):void");
    }

    @Override // X.InterfaceC127985qR
    public final void EaT(long j) {
        this.A00 = j;
    }
}
