package X;

/* renamed from: X.MtL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51738MtL extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C51738MtL(AbstractC54520O6x abstractC54520O6x, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(abstractC54520O6x, 3);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = abstractC54520O6x;
        this.A02 = z3;
        this.A05 = z4;
    }

    public final C51738MtL A00(AbstractC54520O6x abstractC54520O6x, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AbstractC54520O6x abstractC54520O6x2 = abstractC54520O6x;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A04;
        }
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = this.A03;
        }
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = this.A02;
        }
        if (abstractC54520O6x == null) {
            abstractC54520O6x2 = (AbstractC54520O6x) this.A01;
        }
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = this.A05;
        }
        C14360o3.A0B(abstractC54520O6x2, 2);
        return new C51738MtL(abstractC54520O6x2, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51738MtL) {
                    C51738MtL c51738MtL = (C51738MtL) obj;
                    if (c51738MtL.A00 == 1 && this.A02 == c51738MtL.A02 && this.A01 == c51738MtL.A01 && this.A05 == c51738MtL.A05 && this.A04 == c51738MtL.A04) {
                        z = this.A03;
                        z2 = c51738MtL.A03;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C51738MtL)) {
                return false;
            }
            C51738MtL c51738MtL2 = (C51738MtL) obj;
            if (c51738MtL2.A00 != 0 || this.A04 != c51738MtL2.A04 || this.A03 != c51738MtL2.A03 || !C14360o3.A0K(this.A01, c51738MtL2.A01) || this.A02 != c51738MtL2.A02) {
                return false;
            }
            z = this.A05;
            z2 = c51738MtL2.A05;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        boolean z;
        if (this.A00 != 0) {
            A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, (AbstractC25225BEi.A08(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31));
            z = this.A03;
        } else {
            A0D = AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A04))));
            z = this.A05;
        }
        return AbstractC166987dD.A0K(z, A0D);
    }

    public C51738MtL(int i, boolean z) {
        this((AbstractC54520O6x) ((i & 4) != 0 ? new C52070N1v(100L) : null), false, false, false, AbstractC25226BEj.A1U(i & 16, z));
    }

    public C51738MtL(EnumC76383bi enumC76383bi, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = enumC76383bi;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public C51738MtL() {
        this((EnumC76383bi) null, true, false, false, false);
    }
}
