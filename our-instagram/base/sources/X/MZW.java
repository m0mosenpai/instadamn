package X;

/* loaded from: classes9.dex */
public final class MZW extends Tx3 {
    public final C51760Mtj A00;
    public final VWV A01;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        if ((abstractC127945qN instanceof MZW) && ((MZW) abstractC127945qN).A00.A00 == this.A00.A00) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MZW(X.C51760Mtj r3, X.VWV r4) {
        /*
            r2 = this;
            X.AbstractC167017dG.A1P(r3, r4)
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L27
            java.lang.String r0 = X.MZX.A00(r0)
        L11:
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            java.lang.Object r0 = r3.A01
            java.lang.String r0 = X.AbstractC166997dE.A0v(r0, r1)
            r2.<init>(r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        L27:
            java.lang.String r0 = "null"
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZW.<init>(X.Mtj, X.VWV):void");
    }
}
