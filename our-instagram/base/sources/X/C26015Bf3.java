package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bf3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26015Bf3 extends C0T6 {
    public final AbstractC27461CAe A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26015Bf3) {
                C26015Bf3 c26015Bf3 = (C26015Bf3) obj;
                if (!C14360o3.A0K(this.A00, c26015Bf3.A00) || !C14360o3.A0K(this.A02, c26015Bf3.A02) || !C14360o3.A0K(this.A03, c26015Bf3.A03) || !C14360o3.A0K(this.A05, c26015Bf3.A05) || !C14360o3.A0K(this.A04, c26015Bf3.A04) || this.A0A != c26015Bf3.A0A || !C14360o3.A0K(this.A01, c26015Bf3.A01) || !C14360o3.A0K(this.A06, c26015Bf3.A06) || !C14360o3.A0K(this.A07, c26015Bf3.A07) || this.A09 != c26015Bf3.A09 || this.A08 != c26015Bf3.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A09, (((AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A0A, (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07)) * 31));
    }

    public C26015Bf3(AbstractC27461CAe abstractC27461CAe, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.A00 = abstractC27461CAe;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A0A = z;
        this.A01 = imageUrl;
        this.A06 = str5;
        this.A07 = str6;
        this.A09 = z2;
        this.A08 = z3;
    }
}
