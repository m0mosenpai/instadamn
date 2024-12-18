package X;

import java.util.List;

/* renamed from: X.Gyy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38657Gyy extends C0T6 {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;

    public C38657Gyy(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, boolean z) {
        C14360o3.A0B(str3, 4);
        this.A0D = z;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = bool;
        this.A0A = list;
        this.A07 = str6;
        this.A01 = num;
        this.A0B = list2;
        this.A0C = list3;
        this.A08 = str7;
        this.A09 = str8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38657Gyy) {
                C38657Gyy c38657Gyy = (C38657Gyy) obj;
                if (this.A0D != c38657Gyy.A0D || !C14360o3.A0K(this.A02, c38657Gyy.A02) || !C14360o3.A0K(this.A03, c38657Gyy.A03) || !C14360o3.A0K(this.A04, c38657Gyy.A04) || !C14360o3.A0K(this.A05, c38657Gyy.A05) || !C14360o3.A0K(this.A06, c38657Gyy.A06) || !C14360o3.A0K(this.A00, c38657Gyy.A00) || !C14360o3.A0K(this.A0A, c38657Gyy.A0A) || !C14360o3.A0K(this.A07, c38657Gyy.A07) || !C14360o3.A0K(this.A01, c38657Gyy.A01) || !C14360o3.A0K(this.A0B, c38657Gyy.A0B) || !C14360o3.A0K(this.A0C, c38657Gyy.A0C) || !C14360o3.A0K(this.A08, c38657Gyy.A08) || !C14360o3.A0K(this.A09, c38657Gyy.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((AbstractC166997dE.A0K(this.A04, (((AbstractC25225BEi.A08(this.A0D) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A09);
    }
}
