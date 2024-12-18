package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* loaded from: classes5.dex */
public final class Bf4 extends C0T6 {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final Reel A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bf4) {
                Bf4 bf4 = (Bf4) obj;
                if (!C14360o3.A0K(this.A05, bf4.A05) || !C14360o3.A0K(this.A04, bf4.A04) || !C14360o3.A0K(this.A02, bf4.A02) || this.A01 != bf4.A01 || this.A09 != bf4.A09 || !C14360o3.A0K(this.A07, bf4.A07) || !C14360o3.A0K(this.A08, bf4.A08) || !C14360o3.A0K(this.A03, bf4.A03) || this.A0A != bf4.A0A || !C14360o3.A0K(this.A06, bf4.A06) || this.A00 != bf4.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A0A, (((((AbstractC167007dF.A0D(this.A09, (((AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A05)) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31)) + this.A00;
    }

    public Bf4(ImageUrl imageUrl, ImageUrl imageUrl2, Reel reel, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2) {
        this.A05 = str;
        this.A04 = reel;
        this.A02 = imageUrl;
        this.A01 = i;
        this.A09 = z;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = imageUrl2;
        this.A0A = z2;
        this.A06 = str4;
        this.A00 = i2;
    }
}
