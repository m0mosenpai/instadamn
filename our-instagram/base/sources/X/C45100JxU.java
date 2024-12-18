package X;

import java.util.List;

/* renamed from: X.JxU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45100JxU extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C45100JxU(Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        C14360o3.A0B(str4, 6);
        this.A01 = list;
        this.A04 = str;
        this.A02 = l;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A03 = list2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45100JxU) {
                    C45100JxU c45100JxU = (C45100JxU) obj;
                    if (c45100JxU.A00 == 1 && C14360o3.A0K(this.A01, c45100JxU.A01) && C14360o3.A0K(this.A04, c45100JxU.A04) && C14360o3.A0K(this.A02, c45100JxU.A02) && C14360o3.A0K(this.A05, c45100JxU.A05) && C14360o3.A0K(this.A06, c45100JxU.A06) && C14360o3.A0K(this.A07, c45100JxU.A07) && C14360o3.A0K(this.A08, c45100JxU.A08) && C14360o3.A0K(this.A09, c45100JxU.A09)) {
                        obj2 = this.A03;
                        obj3 = c45100JxU.A03;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C45100JxU)) {
                return false;
            }
            C45100JxU c45100JxU2 = (C45100JxU) obj;
            if (c45100JxU2.A00 != 0 || !C14360o3.A0K(this.A06, c45100JxU2.A06) || !C14360o3.A0K(this.A05, c45100JxU2.A05) || !C14360o3.A0K(this.A04, c45100JxU2.A04) || !C14360o3.A0K(this.A07, c45100JxU2.A07) || !C14360o3.A0K(this.A01, c45100JxU2.A01) || !C14360o3.A0K(this.A03, c45100JxU2.A03) || !C14360o3.A0K(this.A08, c45100JxU2.A08) || !C14360o3.A0K(this.A02, c45100JxU2.A02)) {
                return false;
            }
            obj2 = this.A09;
            obj3 = c45100JxU2.A09;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int A07;
        if (this.A00 != 0) {
            A0J = (((AbstractC166997dE.A0K(this.A07, ((((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31;
            A07 = AbstractC166997dE.A0I(this.A03);
        } else {
            A0J = (((((((((((((AbstractC166987dD.A0J(this.A06) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
            A07 = AbstractC25227BEk.A07(this.A09);
        }
        return A0J + A07;
    }

    public C45100JxU(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A07 = str4;
        this.A01 = num;
        this.A03 = num2;
        this.A08 = str5;
        this.A02 = bool;
        this.A09 = str6;
    }
}
