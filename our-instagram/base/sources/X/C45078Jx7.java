package X;

/* renamed from: X.Jx7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45078Jx7 extends C0T6 {
    public final long A00;
    public final EnumC72377XcD A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45078Jx7) {
                C45078Jx7 c45078Jx7 = (C45078Jx7) obj;
                if (!C14360o3.A0K(this.A0C, c45078Jx7.A0C) || this.A00 != c45078Jx7.A00 || !C14360o3.A0K(this.A0D, c45078Jx7.A0D) || !C14360o3.A0K(this.A06, c45078Jx7.A06) || !C14360o3.A0K(this.A08, c45078Jx7.A08) || !C14360o3.A0K(this.A07, c45078Jx7.A07) || !C14360o3.A0K(this.A0B, c45078Jx7.A0B) || !C14360o3.A0K(this.A0A, c45078Jx7.A0A) || !C14360o3.A0K(this.A09, c45078Jx7.A09) || this.A01 != c45078Jx7.A01 || this.A03 != c45078Jx7.A03 || this.A04 != c45078Jx7.A04 || this.A05 != c45078Jx7.A05 || this.A02 != c45078Jx7.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public C45078Jx7(EnumC72377XcD enumC72377XcD, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        C14360o3.A0B(num, 11);
        AbstractC25234BEr.A1Q(num2, num3, num4);
        this.A0C = str;
        this.A00 = j;
        this.A0D = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A0B = str6;
        this.A0A = str7;
        this.A09 = str8;
        this.A01 = enumC72377XcD;
        this.A03 = num;
        this.A04 = num2;
        this.A05 = num3;
        this.A02 = num4;
    }

    public final int hashCode() {
        String A00;
        String str;
        String str2;
        String str3;
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A09, (((((((AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A0D, AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A0C)))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC25227BEk.A07(this.A0A)) * 31));
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            A00 = MSV.A00(369);
        } else {
            A00 = AbstractC58317Pt9.A00(182);
        }
        int A0H = AbstractC25231BEo.A0H(A00, intValue, A0J);
        int intValue2 = this.A04.intValue();
        if (1 != intValue2) {
            str = "PRIMARY";
        } else {
            str = "SECONDARY";
        }
        int A0H2 = AbstractC25231BEo.A0H(str, intValue2, A0H);
        int intValue3 = this.A05.intValue();
        if (1 != intValue3) {
            str2 = "PRIMARY";
        } else {
            str2 = "SECONDARY";
        }
        int A0H3 = AbstractC25231BEo.A0H(str2, intValue3, A0H2);
        int intValue4 = this.A02.intValue();
        switch (intValue4) {
            case 1:
                str3 = "COMPOSER_BLOCK";
                break;
            case 2:
                str3 = "ABOVE_COMPOSER_BANNER";
                break;
            default:
                str3 = "TOP_BANNER";
                break;
        }
        return A0H3 + AbstractC25226BEj.A02(str3, intValue4);
    }
}
