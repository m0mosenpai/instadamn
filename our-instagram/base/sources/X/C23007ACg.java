package X;

/* renamed from: X.ACg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23007ACg {
    public String A01;
    public final String A03;
    public boolean A02 = false;
    public C122505gl A00 = null;

    public C23007ACg(String str, String str2) {
        this.A03 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23007ACg) {
                C23007ACg c23007ACg = (C23007ACg) obj;
                if (!C14360o3.A0K(this.A03, c23007ACg.A03) || !C14360o3.A0K(this.A01, c23007ACg.A01) || this.A02 != c23007ACg.A02 || !C14360o3.A0K(this.A00, c23007ACg.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextSubstitution(layoutCache=");
        A1C.append(this.A00);
        A1C.append(", isShowingSubstitution=");
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }
}
