package X;

/* renamed from: X.BqZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26692BqZ extends AbstractC29093CsK {
    public final int A00;
    public final C51665Mrw A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26692BqZ) {
                C26692BqZ c26692BqZ = (C26692BqZ) obj;
                if (this.A00 != c26692BqZ.A00 || !C14360o3.A0K(this.A03, c26692BqZ.A03) || !C14360o3.A0K(this.A02, c26692BqZ.A02) || !C14360o3.A0K(this.A01, c26692BqZ.A01) || this.A04 != c26692BqZ.A04 || this.A05 != c26692BqZ.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A04, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, this.A00 * 31)) + AbstractC167017dG.A0M(this.A01)) * 31));
    }

    public C26692BqZ(C51665Mrw c51665Mrw, String str, String str2, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = c51665Mrw;
        this.A04 = z;
        this.A05 = z2;
    }
}
