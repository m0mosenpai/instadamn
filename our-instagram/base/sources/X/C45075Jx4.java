package X;

/* renamed from: X.Jx4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45075Jx4 extends C0T6 {
    public final C5QE A00;
    public final EnumC46171Kc9 A01;
    public final EnumC46172KcA A02;
    public final EnumC46165Kc3 A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45075Jx4) {
                C45075Jx4 c45075Jx4 = (C45075Jx4) obj;
                if (this.A02 != c45075Jx4.A02 || this.A03 != c45075Jx4.A03 || this.A09 != c45075Jx4.A09 || this.A01 != c45075Jx4.A01 || this.A0C != c45075Jx4.A0C || this.A04 != c45075Jx4.A04 || this.A05 != c45075Jx4.A05 || this.A08 != c45075Jx4.A08 || this.A07 != c45075Jx4.A07 || this.A06 != c45075Jx4.A06 || !C14360o3.A0K(this.A00, c45075Jx4.A00) || this.A0A != c45075Jx4.A0A || this.A0B != c45075Jx4.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0B, AbstractC167007dF.A0D(this.A0A, (AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A0C, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)))))))))) + AbstractC167017dG.A0M(this.A00)) * 31));
    }

    public C45075Jx4(C5QE c5qe, EnumC46171Kc9 enumC46171Kc9, EnumC46172KcA enumC46172KcA, EnumC46165Kc3 enumC46165Kc3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AbstractC25234BEr.A1P(enumC46172KcA, enumC46165Kc3, enumC46171Kc9);
        this.A02 = enumC46172KcA;
        this.A03 = enumC46165Kc3;
        this.A09 = z;
        this.A01 = enumC46171Kc9;
        this.A0C = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A08 = z5;
        this.A07 = z6;
        this.A06 = z7;
        this.A00 = c5qe;
        this.A0A = z8;
        this.A0B = z9;
    }
}
