package X;

/* loaded from: classes9.dex */
public final class NYT extends AbstractC53541Nm8 {
    public final int A00;
    public final OB6 A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYT) {
                NYT nyt = (NYT) obj;
                if (!C14360o3.A0K(this.A02, nyt.A02) || !C14360o3.A0K(this.A01, nyt.A01) || this.A00 != nyt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00;
    }

    public NYT(OB6 ob6, String str, int i) {
        this.A02 = str;
        this.A01 = ob6;
        this.A00 = i;
    }
}
