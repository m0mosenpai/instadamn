package X;

/* loaded from: classes6.dex */
public final class E6T extends C0T6 {
    public String A00 = "not_eligible";
    public boolean A05 = false;
    public String A01 = "$0.00";
    public boolean A04 = false;
    public boolean A06 = false;
    public boolean A03 = false;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6T) {
                E6T e6t = (E6T) obj;
                if (!C14360o3.A0K(this.A00, e6t.A00) || this.A05 != e6t.A05 || !C14360o3.A0K(this.A01, e6t.A01) || this.A04 != e6t.A04 || this.A06 != e6t.A06 || this.A03 != e6t.A03 || this.A02 != e6t.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0J(this.A00)))))));
    }
}
