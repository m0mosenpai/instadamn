package X;

/* renamed from: X.JwW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45041JwW extends C0T6 {
    public final C5QE A00;
    public final C5QE A01;
    public final EnumC46150Kbo A02;
    public final EnumC46158Kbw A03;
    public final EnumC46138Kbc A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45041JwW) {
                C45041JwW c45041JwW = (C45041JwW) obj;
                if (this.A04 != c45041JwW.A04 || this.A03 != c45041JwW.A03 || !C14360o3.A0K(this.A00, c45041JwW.A00) || !C14360o3.A0K(this.A01, c45041JwW.A01) || this.A02 != c45041JwW.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A04)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public C45041JwW(C5QE c5qe, C5QE c5qe2, EnumC46150Kbo enumC46150Kbo, EnumC46158Kbw enumC46158Kbw, EnumC46138Kbc enumC46138Kbc) {
        AbstractC167017dG.A1P(enumC46138Kbc, enumC46158Kbw);
        C14360o3.A0B(enumC46150Kbo, 5);
        this.A04 = enumC46138Kbc;
        this.A03 = enumC46158Kbw;
        this.A00 = c5qe;
        this.A01 = c5qe2;
        this.A02 = enumC46150Kbo;
    }
}
