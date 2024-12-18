package X;

/* renamed from: X.9aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212009aV extends C0T6 implements BD1 {
    public final int A00;
    public final YFD A01;
    public final C42658IuF A02;
    public final C65882yQ A03;

    @Override // X.BD1
    public final void E5U(Integer num) {
        C14360o3.A0B(num, 0);
        C65882yQ c65882yQ = this.A03;
        YFD yfd = this.A01;
        C14360o3.A0B(yfd, 1);
        C65892yR c65892yR = c65882yQ.A02;
        String str = yfd.A00.A05;
        if (str == null) {
            str = "";
        }
        c65892yR.A07(str, B7P.A00, new DGY(c65882yQ, 36), new DGY(c65882yQ, 37));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C212009aV) {
                C212009aV c212009aV = (C212009aV) obj;
                if (this.A00 != c212009aV.A00 || !C14360o3.A0K(this.A01, c212009aV.A01) || !C14360o3.A0K(this.A02, c212009aV.A02) || !C14360o3.A0K(this.A03, c212009aV.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.BD1
    public final void clear() {
        C65882yQ c65882yQ = this.A03;
        YFD yfd = this.A01;
        C14360o3.A0B(yfd, 1);
        C65892yR c65892yR = c65882yQ.A02;
        String str = yfd.A00.A05;
        if (str == null) {
            str = "";
        }
        c65892yR.A02.A03(str);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, this.A00 * 31)));
    }

    public C212009aV(YFD yfd, C42658IuF c42658IuF, C65882yQ c65882yQ, int i) {
        AbstractC167017dG.A1R(yfd, c42658IuF);
        C14360o3.A0B(c65882yQ, 4);
        this.A00 = i;
        this.A01 = yfd;
        this.A02 = c42658IuF;
        this.A03 = c65882yQ;
    }
}
