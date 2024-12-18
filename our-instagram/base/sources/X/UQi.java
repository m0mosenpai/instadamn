package X;

import com.instagram.api.schemas.BoostedActionStatus;

/* loaded from: classes11.dex */
public final class UQi extends C0T6 implements XF7 {
    public final BoostedActionStatus A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQi) {
                UQi uQi = (UQi) obj;
                if (this.A00 != uQi.A00 || !C14360o3.A0K(this.A0E, uQi.A0E) || !C14360o3.A0K(this.A01, uQi.A01) || !C14360o3.A0K(this.A02, uQi.A02) || !C14360o3.A0K(this.A0B, uQi.A0B) || !C14360o3.A0K(this.A03, uQi.A03) || !C14360o3.A0K(this.A04, uQi.A04) || !C14360o3.A0K(this.A05, uQi.A05) || !C14360o3.A0K(this.A0C, uQi.A0C) || !C14360o3.A0K(this.A06, uQi.A06) || !C14360o3.A0K(this.A07, uQi.A07) || !C14360o3.A0K(this.A0D, uQi.A0D) || !C14360o3.A0K(this.A08, uQi.A08) || !C14360o3.A0K(this.A09, uQi.A09) || !C14360o3.A0K(this.A0A, uQi.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31;
        Integer num = this.A0A;
        if (num != null) {
            i = num.hashCode();
        }
        return A0M + i;
    }

    public UQi(BoostedActionStatus boostedActionStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str, String str2, String str3, String str4) {
        this.A00 = boostedActionStatus;
        this.A0E = str;
        this.A01 = num;
        this.A02 = num2;
        this.A0B = str2;
        this.A03 = num3;
        this.A04 = num4;
        this.A05 = num5;
        this.A0C = str3;
        this.A06 = num6;
        this.A07 = num7;
        this.A0D = str4;
        this.A08 = num8;
        this.A09 = num9;
        this.A0A = num10;
    }
}
