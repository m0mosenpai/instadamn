package X;

/* renamed from: X.MwT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51885MwT extends C0T6 implements InterfaceC57855PlL {
    public final Boolean A00;
    public final Long A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51885MwT) {
                C51885MwT c51885MwT = (C51885MwT) obj;
                if (this.A04 != c51885MwT.A04 || this.A06 != c51885MwT.A06 || this.A05 != c51885MwT.A05 || this.A07 != c51885MwT.A07 || !C14360o3.A0K(this.A01, c51885MwT.A01) || !C14360o3.A0K(this.A02, c51885MwT.A02) || !C14360o3.A0K(this.A03, c51885MwT.A03) || this.A0A != c51885MwT.A0A || !C14360o3.A0K(this.A00, c51885MwT.A00) || this.A09 != c51885MwT.A09 || this.A08 != c51885MwT.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A09, (AbstractC167007dF.A0D(this.A0A, (((((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC25225BEi.A08(this.A04)))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31));
    }

    public C51885MwT(Boolean bool, Long l, Long l2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A04 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A01 = l;
        this.A02 = l2;
        this.A03 = str;
        this.A0A = z5;
        this.A00 = bool;
        this.A09 = z6;
        this.A08 = z7;
    }

    public C51885MwT() {
        this(null, null, null, null, false, false, false, true, true, false, true);
    }
}
