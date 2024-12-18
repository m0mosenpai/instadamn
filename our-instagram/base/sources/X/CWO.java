package X;

/* loaded from: classes5.dex */
public final class CWO {
    public final int A00;
    public final C27882CQt A01;
    public final InterfaceC31000Djz A02;
    public final InterfaceC31000Djz A03;
    public final InterfaceC31155Dmz A04;
    public final InterfaceC31156Dn0 A05;
    public final InterfaceC31156Dn0 A06;
    public final InterfaceC31156Dn0 A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWO) {
                CWO cwo = (CWO) obj;
                if (!C14360o3.A0K(this.A06, cwo.A06) || !C14360o3.A0K(this.A0C, cwo.A0C) || !C14360o3.A0K(this.A0B, cwo.A0B) || !C14360o3.A0K(this.A05, cwo.A05) || !C14360o3.A0K(this.A09, cwo.A09) || !C14360o3.A0K(this.A08, cwo.A08) || !C14360o3.A0K(this.A07, cwo.A07) || !C14360o3.A0K(this.A0E, cwo.A0E) || !C14360o3.A0K(this.A0D, cwo.A0D) || !C14360o3.A0K(this.A04, cwo.A04) || !C14360o3.A0K(this.A03, cwo.A03) || this.A0F != cwo.A0F || !C14360o3.A0K(this.A02, cwo.A02) || this.A00 != cwo.A00 || !C14360o3.A0K(this.A01, cwo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((AbstractC166997dE.A0J(this.A04, (((((((((((((AbstractC166997dE.A0J(this.A0D, AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A05, (((AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A0C, AbstractC166987dD.A0G(this.A06) * 31)) + 1) * 31) + 1) * 31) * 31)) + 1) * 31) * 31)) + 1984282710) * 31) + 79219778) * 31) + 52) * 31) + 16) * 31) + 12) * 31) + 16) * 31) + 12) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + 12) * 31) + CZC.A00(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + 12) * 31) + CZC.A00(this.A0A)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public CWO(C27882CQt c27882CQt, InterfaceC31000Djz interfaceC31000Djz, InterfaceC31000Djz interfaceC31000Djz2, InterfaceC31155Dmz interfaceC31155Dmz, InterfaceC31156Dn0 interfaceC31156Dn0, InterfaceC31156Dn0 interfaceC31156Dn02, InterfaceC31156Dn0 interfaceC31156Dn03, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i) {
        this.A06 = interfaceC31156Dn0;
        this.A0C = num;
        this.A0B = num2;
        this.A05 = interfaceC31156Dn02;
        this.A09 = num3;
        this.A08 = num4;
        this.A07 = interfaceC31156Dn03;
        this.A0E = num5;
        this.A0D = num6;
        this.A04 = interfaceC31155Dmz;
        this.A03 = interfaceC31000Djz;
        this.A0F = num7;
        this.A02 = interfaceC31000Djz2;
        this.A0A = num8;
        this.A00 = i;
        this.A01 = c27882CQt;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ListCellStyleValues(headlineTextVariant=");
        A1C.append(this.A06);
        AbstractC25235BEs.A1L(A1C, ", headlineMaxLines=");
        A1C.append(", headlineCapSpacingDp=");
        A1C.append(this.A0C);
        A1C.append(", headlineBaselineSpacingDp=");
        A1C.append(this.A0B);
        A1C.append(", headlineToBodySpacingDp=");
        A1C.append(1);
        A1C.append(", headlineToMetaSpacingDp=");
        A1C.append(1);
        A1C.append(", bodyTextVariant=");
        A1C.append(this.A05);
        AbstractC25235BEs.A1L(A1C, ", bodyMaxLines=");
        A1C.append(", bodyCapSpacingDp=");
        A1C.append(this.A09);
        A1C.append(", bodyBaselineSpacingDp=");
        A1C.append(this.A08);
        A1C.append(", bodyToMetaSpacingDp=");
        A1C.append(1);
        A1C.append(", metaTextVariant=");
        A1C.append(this.A07);
        AbstractC25235BEs.A1L(A1C, ", metaMaxLines=");
        A1C.append(", metaCapSpacingDp=");
        A1C.append(this.A0E);
        A1C.append(", metaBaselineSpacingDp=");
        A1C.append(this.A0D);
        A1C.append(", textColumnVerticalAlignment=");
        A1C.append("CENTER");
        A1C.append(", textColumnHorizontalAlignment=");
        A1C.append("START");
        A1C.append(", minHeightDp=");
        A1C.append(52);
        A1C.append(", startPaddingDp=");
        A1C.append(16);
        A1C.append(", topPaddingDp=");
        A1C.append(12);
        A1C.append(", endPaddingDp=");
        A1C.append(16);
        A1C.append(", bottomPaddingDp=");
        A1C.append(12);
        A1C.append(", pressedStateVariant=");
        A1C.append(this.A04);
        A1C.append(", startAddOn=");
        A1C.append(this.A03);
        A1C.append(", startAddOnEndMarginDp=");
        A1C.append(12);
        A1C.append(", startAddOnVerticalAlignment=");
        A1C.append(CZC.A01(this.A0F));
        A1C.append(", endAddOn=");
        A1C.append(this.A02);
        A1C.append(", endAddOnStartMarginDp=");
        A1C.append(12);
        A1C.append(", endAddOnVerticalAlignment=");
        A1C.append(CZC.A01(this.A0A));
        A1C.append(", badgeTopMarginDp=");
        A1C.append(this.A00);
        A1C.append(", badge=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
