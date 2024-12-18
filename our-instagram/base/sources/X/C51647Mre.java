package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;

/* renamed from: X.Mre, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51647Mre extends C0T6 {
    public final IGCreatorIncentiveProgram A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51647Mre) {
                C51647Mre c51647Mre = (C51647Mre) obj;
                if (!C14360o3.A0K(this.A03, c51647Mre.A03) || !C14360o3.A0K(this.A07, c51647Mre.A07) || !C14360o3.A0K(this.A01, c51647Mre.A01) || !C14360o3.A0K(this.A08, c51647Mre.A08) || !C14360o3.A0K(this.A09, c51647Mre.A09) || !C14360o3.A0K(this.A04, c51647Mre.A04) || !C14360o3.A0K(this.A05, c51647Mre.A05) || !C14360o3.A0K(this.A0A, c51647Mre.A0A) || !C14360o3.A0K(this.A0B, c51647Mre.A0B) || !C14360o3.A0K(this.A06, c51647Mre.A06) || this.A00 != c51647Mre.A00 || this.A0E != c51647Mre.A0E || !C14360o3.A0K(this.A02, c51647Mre.A02) || !C14360o3.A0K(this.A0C, c51647Mre.A0C) || !C14360o3.A0K(this.A0D, c51647Mre.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0D, (((AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A06, (AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, ((((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31))) + AbstractC167017dG.A0O(this.A0B)) * 31))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A0C)) * 31);
    }

    public C51647Mre(IGCreatorIncentiveProgram iGCreatorIncentiveProgram, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        AbstractC167017dG.A1U(str3, str4);
        C14360o3.A0B(str5, 8);
        AbstractC25232BEp.A1P(str7, iGCreatorIncentiveProgram);
        C14360o3.A0B(str9, 15);
        this.A03 = str;
        this.A07 = num;
        this.A01 = num2;
        this.A08 = num3;
        this.A09 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A0A = str5;
        this.A0B = str6;
        this.A06 = str7;
        this.A00 = iGCreatorIncentiveProgram;
        this.A0E = z;
        this.A02 = num4;
        this.A0C = str8;
        this.A0D = str9;
    }
}
