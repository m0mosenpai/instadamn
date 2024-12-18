package X;

/* loaded from: classes6.dex */
public final class E6Y extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public E6Y(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, boolean z5) {
        AbstractC167007dF.A1H(str, 1, str3);
        C14360o3.A0B(str4, 8);
        this.A01 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = str2;
        this.A06 = z3;
        this.A07 = z4;
        this.A00 = str3;
        this.A03 = str4;
        this.A08 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6Y) {
                E6Y e6y = (E6Y) obj;
                if (!C14360o3.A0K(this.A01, e6y.A01) || this.A04 != e6y.A04 || this.A05 != e6y.A05 || !C14360o3.A0K(this.A02, e6y.A02) || this.A06 != e6y.A06 || this.A07 != e6y.A07 || !C14360o3.A0K(this.A00, e6y.A00) || !C14360o3.A0K(this.A03, e6y.A03) || this.A08 != e6y.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A00, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0J(this.A01))) + AbstractC167017dG.A0O(this.A02)) * 31)))));
    }
}
