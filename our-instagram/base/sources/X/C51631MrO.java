package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MrO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51631MrO extends C0T6 {
    public float A00;
    public boolean A01;
    public final ImageUrl A02;
    public final O2A A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51631MrO) {
                C51631MrO c51631MrO = (C51631MrO) obj;
                if (!C14360o3.A0K(this.A04, c51631MrO.A04) || !C14360o3.A0K(this.A05, c51631MrO.A05) || !C14360o3.A0K(this.A07, c51631MrO.A07) || !C14360o3.A0K(this.A06, c51631MrO.A06) || !C14360o3.A0K(this.A02, c51631MrO.A02) || Float.compare(this.A00, c51631MrO.A00) != 0 || !C14360o3.A0K(this.A03, c51631MrO.A03) || !C14360o3.A0K(this.A08, c51631MrO.A08) || this.A01 != c51631MrO.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, (AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A00(((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31, this.A00)) + AbstractC25227BEk.A07(this.A08)) * 31);
    }

    public C51631MrO(ImageUrl imageUrl, O2A o2a, String str, String str2, String str3, String str4, String str5, float f, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A02 = imageUrl;
        this.A00 = f;
        this.A03 = o2a;
        this.A08 = str5;
        this.A01 = z;
    }
}
