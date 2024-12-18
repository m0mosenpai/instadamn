package X;

/* renamed from: X.JwE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45023JwE extends C0T6 {
    public final C5QE A00;
    public final EnumC46138Kbc A01;
    public final EnumC46139Kbd A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45023JwE) {
                C45023JwE c45023JwE = (C45023JwE) obj;
                if (this.A02 != c45023JwE.A02 || this.A01 != c45023JwE.A01 || !C14360o3.A0K(this.A00, c45023JwE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A00);
    }

    public C45023JwE(C5QE c5qe, EnumC46138Kbc enumC46138Kbc, EnumC46139Kbd enumC46139Kbd) {
        AbstractC167017dG.A1P(enumC46139Kbd, enumC46138Kbc);
        this.A02 = enumC46139Kbd;
        this.A01 = enumC46138Kbc;
        this.A00 = c5qe;
    }
}
