package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MrP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51632MrP extends C0T6 {
    public final double A00;
    public final int A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51632MrP) {
                C51632MrP c51632MrP = (C51632MrP) obj;
                if (!C14360o3.A0K(this.A04, c51632MrP.A04) || !C14360o3.A0K(this.A02, c51632MrP.A02) || !C14360o3.A0K(this.A05, c51632MrP.A05) || !C14360o3.A0K(this.A07, c51632MrP.A07) || !C14360o3.A0K(this.A03, c51632MrP.A03) || !C14360o3.A0K(this.A06, c51632MrP.A06) || this.A01 != c51632MrP.A01 || Double.compare(this.A00, c51632MrP.A00) != 0 || this.A08 != c51632MrP.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, (((((AbstractC166997dE.A0K(this.A03, (AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A04))) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31) + this.A01) * 31) + AbstractC28006CWd.A00(this.A00)) * 31);
    }

    public C51632MrP(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, double d, int i, boolean z) {
        this.A04 = str;
        this.A02 = imageUrl;
        this.A05 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A01 = i;
        this.A00 = d;
        this.A08 = z;
    }
}
