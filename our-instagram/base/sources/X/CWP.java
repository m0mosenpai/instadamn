package X;

/* loaded from: classes5.dex */
public final class CWP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final InterfaceC31156Dn0 A0C;
    public final InterfaceC31156Dn0 A0D;
    public final CVO A0E;
    public final CVO A0F;
    public final CVO A0G;
    public final InterfaceC31001Dk0 A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWP) {
                CWP cwp = (CWP) obj;
                if (!C14360o3.A0K(this.A0D, cwp.A0D) || !C14360o3.A0K(this.A0C, cwp.A0C) || this.A06 != cwp.A06 || !C14360o3.A0K(this.A0J, cwp.A0J) || this.A01 != cwp.A01 || this.A07 != cwp.A07 || this.A09 != cwp.A09 || this.A0A != cwp.A0A || this.A04 != cwp.A04 || this.A00 != cwp.A00 || this.A05 != cwp.A05 || !C14360o3.A0K(this.A0F, cwp.A0F) || this.A0B != cwp.A0B || !C14360o3.A0K(this.A0G, cwp.A0G) || this.A02 != cwp.A02 || !C14360o3.A0K(this.A0E, cwp.A0E) || this.A08 != cwp.A08 || !C14360o3.A0K(this.A0H, cwp.A0H) || this.A03 != cwp.A03 || this.A0I != cwp.A0I) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC166997dE.A0J(this.A0E, (AbstractC166997dE.A0J(this.A0G, (AbstractC166997dE.A0J(this.A0F, (AbstractC25225BEi.A05(((((((((AbstractC25225BEi.A05(((AbstractC25225BEi.A05((AbstractC25225BEi.A05(AbstractC166997dE.A0J(this.A0C, AbstractC166987dD.A0G(this.A0D)), this.A06) + AbstractC167017dG.A0M(this.A0J)) * 31, this.A01) * 31 * 31 * 31 * 31) + 1700509087) * 31, 2014820470) * 31 * 31 * 31 * 31 * 31) + this.A07) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A04) * 31, this.A00) + this.A05) * 31) + this.A0B) * 31) + this.A02) * 31) * 31) + this.A08) * 31) + CZD.A00(this.A0K)) * 31) + AbstractC166997dE.A0I(this.A0H)) * 31) + this.A03) * 31) + CZD.A00(this.A0I);
    }

    public CWP(InterfaceC31156Dn0 interfaceC31156Dn0, InterfaceC31156Dn0 interfaceC31156Dn02, CVO cvo, CVO cvo2, CVO cvo3, InterfaceC31001Dk0 interfaceC31001Dk0, Integer num, Integer num2, Integer num3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        AbstractC167017dG.A1P(interfaceC31156Dn0, interfaceC31156Dn02);
        C14360o3.A0B(num3, 37);
        this.A0D = interfaceC31156Dn0;
        this.A0C = interfaceC31156Dn02;
        this.A06 = i;
        this.A0J = num;
        this.A01 = i2;
        this.A07 = i3;
        this.A09 = i4;
        this.A0A = i5;
        this.A04 = i6;
        this.A00 = i7;
        this.A05 = i8;
        this.A0F = cvo;
        this.A0B = i9;
        this.A0G = cvo2;
        this.A02 = i10;
        this.A0E = cvo3;
        this.A08 = i11;
        this.A0K = num2;
        this.A0H = interfaceC31001Dk0;
        this.A03 = i12;
        this.A0I = num3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextInputStyleValues(inputTextVariant=");
        A1C.append(this.A0D);
        A1C.append(", disabledInputTextVariant=");
        A1C.append(this.A0C);
        A1C.append(", inputMaxLines=");
        A1C.append(this.A06);
        A1C.append(", inputStaticPrefixLength=");
        A1C.append(0);
        A1C.append(", hintTextColor=");
        A1C.append(this.A0J);
        A1C.append(", cursorColor=");
        A1C.append(this.A01);
        A1C.append(", highlightColor=");
        A1C.append((Object) null);
        A1C.append(", labelTextVariant=");
        A1C.append((Object) null);
        A1C.append(", labelCapSpacingDp=");
        A1C.append(0);
        A1C.append(", labelBaselineSpacingDp=");
        A1C.append(0);
        A1C.append(", labelMaxLines=");
        A1C.append(0);
        A1C.append(", labelBehaviour=");
        A1C.append("EditTextHint");
        A1C.append(", textColumnVerticalAlignment=");
        A1C.append("Center");
        A1C.append(", floatingLabelTextVariant=");
        A1C.append((Object) null);
        A1C.append(", floatingLabelCapSpacingDp=");
        A1C.append(0);
        A1C.append(", floatingLabelBaselineSpacingDp=");
        A1C.append(0);
        A1C.append(", floatingLabelMaxLines=");
        A1C.append(0);
        A1C.append(", floatingLabelStartDp=");
        A1C.append(0);
        A1C.append(", floatingLabelTopDp=");
        A1C.append(0);
        A1C.append(", minHeightDp=");
        A1C.append(this.A07);
        A1C.append(", startPaddingDp=");
        A1C.append(this.A09);
        A1C.append(", topPaddingDp=");
        A1C.append(this.A0A);
        A1C.append(", endPaddingDp=");
        A1C.append(this.A04);
        A1C.append(", bottomPaddingDp=");
        A1C.append(this.A00);
        A1C.append(", inputToLabelDp=");
        A1C.append(0);
        A1C.append(", focusedBackgroundColor=");
        A1C.append(this.A05);
        A1C.append(", focusedBorder=");
        A1C.append(this.A0F);
        A1C.append(", unFocusedBackgroundColor=");
        A1C.append(this.A0B);
        A1C.append(", unFocusedBorder=");
        A1C.append(this.A0G);
        A1C.append(", disabledBackgroundColor=");
        A1C.append(this.A02);
        A1C.append(", disabledBorder=");
        A1C.append(this.A0E);
        AbstractC25235BEs.A1L(A1C, ", startAddOn=");
        A1C.append(", startAddOnEndMarginDp=");
        A1C.append(this.A08);
        A1C.append(", startAddOnVerticalAlignment=");
        A1C.append(CZD.A01(this.A0K));
        A1C.append(", endAddOn=");
        A1C.append(this.A0H);
        A1C.append(", endAddOnStartMarginDp=");
        A1C.append(this.A03);
        A1C.append(", endAddOnVerticalAlignment=");
        return AbstractC25236BEt.A0Y(CZD.A01(this.A0I), A1C);
    }
}
