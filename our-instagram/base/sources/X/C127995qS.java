package X;

/* renamed from: X.5qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C127995qS extends AbstractC127945qN implements InterfaceC127975qQ, InterfaceC127985qR {
    public long A00;
    public C38321qM A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C127995qS(X.C127915qK r3, X.C130505uv r4, X.C38321qM r5) {
        /*
            r2 = this;
            r0 = 2
            X.C14360o3.A0B(r5, r0)
            java.lang.String r0 = r5.getId()
            if (r0 == 0) goto L14
            r2.<init>(r3, r4, r0)
            r2.A01 = r5
            r0 = -1
            r2.A00 = r0
            return
        L14:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127995qS.<init>(X.5qK, X.5uv, X.1qM):void");
    }

    @Override // X.InterfaceC127975qQ
    public final C38321qM BQN() {
        return this.A01;
    }

    @Override // X.InterfaceC127985qR
    public final long Bb4() {
        return this.A00;
    }

    @Override // X.InterfaceC127985qR
    public final void EaT(long j) {
        this.A00 = j;
    }
}
