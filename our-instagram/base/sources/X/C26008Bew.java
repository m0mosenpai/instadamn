package X;

/* renamed from: X.Bew, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26008Bew extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26008Bew) {
                C26008Bew c26008Bew = (C26008Bew) obj;
                if (this.A00 != c26008Bew.A00 || !C14360o3.A0K(this.A02, c26008Bew.A02) || !C14360o3.A0K(this.A01, c26008Bew.A01) || this.A04 != c26008Bew.A04 || this.A08 != c26008Bew.A08 || this.A05 != c26008Bew.A05 || this.A07 != c26008Bew.A07 || this.A06 != c26008Bew.A06 || this.A03 != c26008Bew.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, this.A00 * 31))))))));
    }

    public C26008Bew(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A08 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A03 = z6;
    }
}
