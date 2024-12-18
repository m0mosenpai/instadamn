package X;

/* renamed from: X.ACf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23006ACf {
    public C5C8 A01;
    public final C5C8 A03;
    public boolean A02 = false;
    public C137626Li A00 = null;

    public C23006ACf(C5C8 c5c8, C5C8 c5c82) {
        this.A03 = c5c8;
        this.A01 = c5c82;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23006ACf) {
                C23006ACf c23006ACf = (C23006ACf) obj;
                if (!C14360o3.A0K(this.A03, c23006ACf.A03) || !C14360o3.A0K(this.A01, c23006ACf.A01) || this.A02 != c23006ACf.A02 || !C14360o3.A0K(this.A00, c23006ACf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03))) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextSubstitutionValue(original=");
        A1C.append((Object) this.A03);
        A1C.append(", substitution=");
        A1C.append((Object) this.A01);
        A1C.append(", isShowingSubstitution=");
        A1C.append(this.A02);
        A1C.append(", layoutCache=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
