package X;

import android.text.SpannableString;

/* renamed from: X.6Uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139816Uk extends C0T6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SpannableString A07;
    public final SpannableString A08;
    public final C93F A09;
    public final C139806Uj A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final InterfaceC16620sF A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139816Uk) {
                C139816Uk c139816Uk = (C139816Uk) obj;
                if (this.A05 != c139816Uk.A05 || !C14360o3.A0K(this.A09, c139816Uk.A09) || !C14360o3.A0K(this.A0C, c139816Uk.A0C) || this.A06 != c139816Uk.A06 || this.A04 != c139816Uk.A04 || this.A03 != c139816Uk.A03 || this.A02 != c139816Uk.A02 || !C14360o3.A0K(this.A07, c139816Uk.A07) || this.A0F != c139816Uk.A0F || !C14360o3.A0K(this.A08, c139816Uk.A08) || this.A0G != c139816Uk.A0G || this.A0B != c139816Uk.A0B || Float.compare(this.A00, c139816Uk.A00) != 0 || !C14360o3.A0K(this.A0D, c139816Uk.A0D) || this.A0E != c139816Uk.A0E || Float.compare(this.A01, c139816Uk.A01) != 0 || !C14360o3.A0K(this.A0A, c139816Uk.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public C139816Uk(SpannableString spannableString, SpannableString spannableString2, C93F c93f, C139806Uj c139806Uj, Integer num, Integer num2, InterfaceC16620sF interfaceC16620sF, float f, float f2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(spannableString, 8);
        this.A05 = i;
        this.A09 = c93f;
        this.A0C = num;
        this.A06 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A07 = spannableString;
        this.A0F = z;
        this.A08 = spannableString2;
        this.A0G = z2;
        this.A0B = num2;
        this.A00 = f;
        this.A0D = interfaceC16620sF;
        this.A0E = z3;
        this.A01 = f2;
        this.A0A = c139806Uj;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str;
        int hashCode3 = ((this.A05 * 31) + this.A09.hashCode()) * 31;
        Integer num = this.A0C;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((((((((((hashCode3 + hashCode) * 31) + this.A06) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A07.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        int i3 = (hashCode4 + i2) * 31;
        SpannableString spannableString = this.A08;
        if (spannableString == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = spannableString.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        int i5 = 1237;
        if (this.A0G) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int intValue = this.A0B.intValue();
        switch (intValue) {
            case 1:
                str = "WORD";
                break;
            case 2:
                str = "LINE";
                break;
            default:
                str = AbstractC43591JPw.A00(239);
                break;
        }
        int hashCode5 = (((i6 + str.hashCode() + intValue) * 31) + Float.floatToIntBits(this.A00)) * 31;
        InterfaceC16620sF interfaceC16620sF = this.A0D;
        if (interfaceC16620sF != null) {
            i = interfaceC16620sF.hashCode();
        }
        int i7 = (hashCode5 + i) * 31;
        int i8 = 1237;
        if (this.A0E) {
            i8 = 1231;
        }
        return ((((i7 + i8) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A0A.hashCode();
    }
}
