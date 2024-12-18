package X;

import java.util.List;

/* renamed from: X.Gz2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38661Gz2 extends C0T6 {
    public InterfaceC43509JJv A00;
    public C38321qM A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public List A0G;
    public boolean A0H;

    public C38661Gz2(InterfaceC43509JJv interfaceC43509JJv, C38321qM c38321qM, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, boolean z) {
        AbstractC167007dF.A1F(str2, 2, str3);
        this.A09 = str;
        this.A0B = str2;
        this.A03 = num;
        this.A0E = str3;
        this.A01 = c38321qM;
        this.A0D = str4;
        this.A0A = str5;
        this.A07 = str6;
        this.A05 = str7;
        this.A06 = str8;
        this.A0H = z;
        this.A04 = l;
        this.A08 = str9;
        this.A00 = interfaceC43509JJv;
        this.A0F = list;
        this.A0G = list2;
        this.A0C = str10;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38661Gz2) {
                C38661Gz2 c38661Gz2 = (C38661Gz2) obj;
                if (!C14360o3.A0K(this.A09, c38661Gz2.A09) || !C14360o3.A0K(this.A0B, c38661Gz2.A0B) || !C14360o3.A0K(this.A03, c38661Gz2.A03) || !C14360o3.A0K(this.A0E, c38661Gz2.A0E) || !C14360o3.A0K(this.A01, c38661Gz2.A01) || !C14360o3.A0K(this.A0D, c38661Gz2.A0D) || !C14360o3.A0K(this.A0A, c38661Gz2.A0A) || !C14360o3.A0K(this.A07, c38661Gz2.A07) || !C14360o3.A0K(this.A05, c38661Gz2.A05) || !C14360o3.A0K(this.A06, c38661Gz2.A06) || this.A0H != c38661Gz2.A0H || !C14360o3.A0K(this.A04, c38661Gz2.A04) || !C14360o3.A0K(this.A08, c38661Gz2.A08) || !C14360o3.A0K(this.A00, c38661Gz2.A00) || !C14360o3.A0K(this.A0F, c38661Gz2.A0F) || !C14360o3.A0K(this.A0G, c38661Gz2.A0G) || !C14360o3.A0K(this.A0C, c38661Gz2.A0C) || !C14360o3.A0K(this.A02, c38661Gz2.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((AbstractC167007dF.A0D(this.A0H, (((((((((((AbstractC166997dE.A0K(this.A0E, (AbstractC166997dE.A0K(this.A0B, AbstractC167017dG.A0O(this.A09) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
