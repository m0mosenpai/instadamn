package X;

/* loaded from: classes5.dex */
public final class CWN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C29464Cye A05;
    public final AbstractC27449C9r A06;
    public final InterfaceC31155Dmz A07;
    public final InterfaceC31156Dn0 A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWN) {
                CWN cwn = (CWN) obj;
                if (!C14360o3.A0K(this.A08, cwn.A08) || !C14360o3.A0K(this.A0E, cwn.A0E) || !C14360o3.A0K(this.A0D, cwn.A0D) || !C14360o3.A0K(this.A0C, cwn.A0C) || !C14360o3.A0K(this.A0B, cwn.A0B) || this.A02 != cwn.A02 || !C14360o3.A0K(this.A09, cwn.A09) || this.A01 != cwn.A01 || this.A00 != cwn.A00 || !C14360o3.A0K(this.A0A, cwn.A0A) || this.A04 != cwn.A04 || this.A03 != cwn.A03 || !C14360o3.A0K(this.A06, cwn.A06) || !C14360o3.A0K(this.A07, cwn.A07) || !C14360o3.A0K(this.A05, cwn.A05) || Float.compare(0.7f, 0.7f) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A06, ((((((((((((((((((((AbstractC166997dE.A0J(this.A0D, AbstractC166997dE.A0J(this.A0E, (AbstractC166987dD.A0G(this.A08) + 1) * 31)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) - 766850501) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + this.A04) * 31) + this.A03) * 31) * 31) + AbstractC166997dE.A0I(this.A05)) * 31, 0.7f);
    }

    public CWN(C29464Cye c29464Cye, AbstractC27449C9r abstractC27449C9r, InterfaceC31155Dmz interfaceC31155Dmz, InterfaceC31156Dn0 interfaceC31156Dn0, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, int i2, int i3, int i4, int i5) {
        this.A08 = interfaceC31156Dn0;
        this.A0E = num;
        this.A0D = num2;
        this.A0C = num3;
        this.A0B = num4;
        this.A02 = i;
        this.A09 = num5;
        this.A01 = i2;
        this.A00 = i3;
        this.A0A = num6;
        this.A04 = i4;
        this.A03 = i5;
        this.A06 = abstractC27449C9r;
        this.A07 = interfaceC31155Dmz;
        this.A05 = c29464Cye;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ButtonStyleValues(textVariant=");
        A1C.append(this.A08);
        A1C.append(", textMaxLines=");
        A1C.append(1);
        A1C.append(", textCapSpacingDp=");
        A1C.append(this.A0E);
        A1C.append(", textBaselineSpacingDp=");
        A1C.append(this.A0D);
        AbstractC25235BEs.A1L(A1C, ", startIconVariant=");
        A1C.append(", startIconSizeDp=");
        A1C.append(this.A0C);
        A1C.append(", startIconMarginEndDp=");
        A1C.append(this.A0B);
        A1C.append(", startIconAlignment=");
        A1C.append("CENTERED_WITH_TEXT");
        A1C.append(", heightDp=");
        A1C.append(this.A02);
        A1C.append(", backgroundColor=");
        A1C.append(this.A09);
        A1C.append(", cornerRadiusDp=");
        A1C.append(this.A01);
        A1C.append(", borderWidthDp=");
        A1C.append(this.A00);
        A1C.append(", borderColor=");
        A1C.append(this.A0A);
        A1C.append(", paddingStartDp=");
        A1C.append(this.A04);
        A1C.append(", paddingEndDp=");
        A1C.append(this.A03);
        A1C.append(", widthMode=");
        A1C.append(this.A06);
        A1C.append(", touchExpansionDp=");
        A1C.append(0);
        A1C.append(", pressedStateVariant=");
        A1C.append(this.A07);
        A1C.append(", loadingSpinnerVariant=");
        A1C.append(this.A05);
        A1C.append(", disabledAlpha=");
        A1C.append(0.7f);
        return AbstractC167017dG.A0p(A1C);
    }
}
