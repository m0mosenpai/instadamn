package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.Bex, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26009Bex extends C0T6 {
    public final int A00;
    public final Bitmap A01;
    public final ImageUrl A02;
    public final Reel A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26009Bex) {
                C26009Bex c26009Bex = (C26009Bex) obj;
                if (!C14360o3.A0K(this.A05, c26009Bex.A05) || !C14360o3.A0K(this.A03, c26009Bex.A03) || !C14360o3.A0K(this.A02, c26009Bex.A02) || this.A07 != c26009Bex.A07 || this.A08 != c26009Bex.A08 || !C14360o3.A0K(this.A01, c26009Bex.A01) || !C14360o3.A0K(this.A04, c26009Bex.A04) || this.A06 != c26009Bex.A06 || this.A00 != c26009Bex.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, (((AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, (AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A05)) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31) + this.A00;
    }

    public C26009Bex(Bitmap bitmap, ImageUrl imageUrl, Reel reel, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A03 = reel;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A08 = z2;
        this.A01 = bitmap;
        this.A04 = str2;
        this.A06 = z3;
        this.A00 = i;
    }
}
