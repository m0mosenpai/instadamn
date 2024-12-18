package X;

import java.util.List;

/* renamed from: X.Gz3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38662Gz3 extends C0T6 {
    public final float A00;
    public final C9BD A01;
    public final C9BS A02;
    public final C9C3 A03;
    public final C51749MtY A04;
    public final C80143i3 A05;
    public final EnumC79303gb A06;
    public final C101734hi A07;
    public final C3t9 A08;
    public final C80243iD A09;
    public final EnumC74373Vt A0A;
    public final Integer A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final String A0H;
    public final String A0I;

    public C38662Gz3(C9BD c9bd, C9BS c9bs, C9C3 c9c3, C51749MtY c51749MtY, C80143i3 c80143i3, EnumC79303gb enumC79303gb, C101734hi c101734hi, C3t9 c3t9, C80243iD c80243iD, EnumC74373Vt enumC74373Vt, Integer num, String str, String str2, List list, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 3);
        AbstractC25229BEm.A1O(enumC74373Vt, 14, enumC79303gb);
        this.A0I = str;
        this.A0H = str2;
        this.A0B = num;
        this.A00 = f;
        this.A05 = c80143i3;
        this.A01 = c9bd;
        this.A0C = list;
        this.A02 = c9bs;
        this.A0D = z;
        this.A08 = c3t9;
        this.A07 = c101734hi;
        this.A09 = c80243iD;
        this.A03 = c9c3;
        this.A0A = enumC74373Vt;
        this.A06 = enumC79303gb;
        this.A0E = z2;
        this.A04 = c51749MtY;
        this.A0F = z3;
        this.A0G = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38662Gz3) {
                C38662Gz3 c38662Gz3 = (C38662Gz3) obj;
                if (!C14360o3.A0K(this.A0I, c38662Gz3.A0I) || !C14360o3.A0K(this.A0H, c38662Gz3.A0H) || this.A0B != c38662Gz3.A0B || Float.compare(this.A00, c38662Gz3.A00) != 0 || !C14360o3.A0K(this.A05, c38662Gz3.A05) || !C14360o3.A0K(this.A01, c38662Gz3.A01) || !C14360o3.A0K(this.A0C, c38662Gz3.A0C) || !C14360o3.A0K(this.A02, c38662Gz3.A02) || this.A0D != c38662Gz3.A0D || !C14360o3.A0K(this.A08, c38662Gz3.A08) || !C14360o3.A0K(this.A07, c38662Gz3.A07) || !C14360o3.A0K(this.A09, c38662Gz3.A09) || !C14360o3.A0K(this.A03, c38662Gz3.A03) || this.A0A != c38662Gz3.A0A || this.A06 != c38662Gz3.A06 || this.A0E != c38662Gz3.A0E || !C14360o3.A0K(this.A04, c38662Gz3.A04) || this.A0F != c38662Gz3.A0F || this.A0G != c38662Gz3.A0G) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = (AbstractC166987dD.A0J(this.A0I) + AbstractC167017dG.A0O(this.A0H)) * 31;
        int intValue = this.A0B.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "ROUNDED_BORDER";
        }
        return AbstractC166987dD.A0K(this.A0G, AbstractC167007dF.A0D(this.A0F, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A07, (AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A0C, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A00(AbstractC25231BEo.A0H(str, intValue, A0J), this.A00)))))) + AbstractC166997dE.A0I(this.A08)) * 31)))))))));
    }
}
