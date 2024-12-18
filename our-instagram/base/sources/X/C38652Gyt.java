package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gyt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38652Gyt extends C0T6 {
    public Integer A00;
    public final int A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public C38652Gyt(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        C14360o3.A0B(str, 1);
        AbstractC167017dG.A1T(str2, str3);
        this.A03 = str;
        this.A02 = imageUrl;
        this.A01 = i;
        this.A0B = z;
        this.A06 = str2;
        this.A0A = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A05 = str8;
        this.A00 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38652Gyt) {
                C38652Gyt c38652Gyt = (C38652Gyt) obj;
                if (!C14360o3.A0K(this.A03, c38652Gyt.A03) || !C14360o3.A0K(this.A02, c38652Gyt.A02) || this.A01 != c38652Gyt.A01 || this.A0B != c38652Gyt.A0B || !C14360o3.A0K(this.A06, c38652Gyt.A06) || !C14360o3.A0K(this.A0A, c38652Gyt.A0A) || !C14360o3.A0K(this.A04, c38652Gyt.A04) || !C14360o3.A0K(this.A07, c38652Gyt.A07) || !C14360o3.A0K(this.A08, c38652Gyt.A08) || !C14360o3.A0K(this.A09, c38652Gyt.A09) || !C14360o3.A0K(this.A05, c38652Gyt.A05) || !C14360o3.A0K(this.A00, c38652Gyt.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A0B, (((AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A01) * 31))))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
