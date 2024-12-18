package X;

/* renamed from: X.Bf0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26012Bf0 extends C0T6 {
    public final int A00;
    public final C50679MYx A01;
    public final C50679MYx A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26012Bf0) {
                C26012Bf0 c26012Bf0 = (C26012Bf0) obj;
                if (this.A00 != c26012Bf0.A00 || !C14360o3.A0K(this.A02, c26012Bf0.A02) || !C14360o3.A0K(this.A01, c26012Bf0.A01) || this.A04 != c26012Bf0.A04 || this.A08 != c26012Bf0.A08 || this.A05 != c26012Bf0.A05 || this.A07 != c26012Bf0.A07 || this.A06 != c26012Bf0.A06 || this.A03 != c26012Bf0.A03 || this.A09 != c26012Bf0.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, this.A00 * 31)))))))));
    }

    public C26012Bf0(C50679MYx c50679MYx, C50679MYx c50679MYx2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = i;
        this.A02 = c50679MYx;
        this.A01 = c50679MYx2;
        this.A04 = z;
        this.A08 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A03 = z6;
        this.A09 = z7;
    }
}
