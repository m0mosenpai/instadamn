package X;

import java.util.List;

/* renamed from: X.Gyi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38641Gyi extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38641Gyi) {
                C38641Gyi c38641Gyi = (C38641Gyi) obj;
                if (!C14360o3.A0K(this.A00, c38641Gyi.A00) || !C14360o3.A0K(this.A03, c38641Gyi.A03) || !C14360o3.A0K(this.A04, c38641Gyi.A04) || !C14360o3.A0K(this.A05, c38641Gyi.A05) || !C14360o3.A0K(this.A01, c38641Gyi.A01) || !C14360o3.A0K(this.A02, c38641Gyi.A02) || !C14360o3.A0K(this.A08, c38641Gyi.A08) || !C14360o3.A0K(this.A07, c38641Gyi.A07) || !C14360o3.A0K(this.A06, c38641Gyi.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A00))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public C38641Gyi(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A00 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A02 = str6;
        this.A08 = str7;
        this.A07 = list;
        this.A06 = list2;
    }
}
