package X;

/* loaded from: classes5.dex */
public final class CWG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC31156Dn0 A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWG) {
                CWG cwg = (CWG) obj;
                if (!C14360o3.A0K(this.A05, cwg.A05) || !C14360o3.A0K(this.A06, cwg.A06) || !C14360o3.A0K(this.A03, cwg.A03) || this.A02 != cwg.A02 || this.A01 != cwg.A01 || !C14360o3.A0K(this.A04, cwg.A04) || this.A00 != cwg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC25225BEi.A05((((AbstractC166997dE.A0J(this.A03, ((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + 1) * 31) + this.A02) * 31, this.A01) * 31) + AbstractC166997dE.A0I(this.A04)) * 31) + this.A00;
    }

    public CWG(InterfaceC31156Dn0 interfaceC31156Dn0, Integer num, Integer num2, Integer num3, int i, int i2, int i3) {
        this.A05 = num;
        this.A06 = num2;
        this.A03 = interfaceC31156Dn0;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = num3;
        this.A00 = i3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextBadgeStyleValues(textBaselineSpacingDp=");
        A1C.append(this.A05);
        A1C.append(", textCapSpacingDp=");
        A1C.append(this.A06);
        A1C.append(", textVariant=");
        A1C.append(this.A03);
        A1C.append(", textMaxLines=");
        A1C.append(1);
        A1C.append(", textStartPaddingDp=");
        A1C.append(this.A02);
        A1C.append(", textEndPaddingDp=");
        A1C.append(this.A01);
        A1C.append(", textTopPaddingDp=");
        A1C.append(0);
        A1C.append(", textBottomPaddingDp=");
        A1C.append(0);
        A1C.append(", backgroundColor=");
        A1C.append(this.A04);
        A1C.append(", cornerRadiusDp=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
