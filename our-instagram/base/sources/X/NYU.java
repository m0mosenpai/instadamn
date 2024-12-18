package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class NYU extends AbstractC53541Nm8 {
    public final Drawable A00;
    public final ImageUrl A01;
    public final OB6 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public NYU(Drawable drawable, ImageUrl imageUrl, OB6 ob6, String str, String str2, String str3, String str4) {
        AbstractC25233BEq.A0w(2, str2, imageUrl, str3);
        C14360o3.A0B(str4, 7);
        this.A06 = str;
        this.A05 = str2;
        this.A01 = imageUrl;
        this.A03 = str3;
        this.A00 = drawable;
        this.A02 = ob6;
        this.A04 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYU) {
                NYU nyu = (NYU) obj;
                if (!C14360o3.A0K(this.A06, nyu.A06) || !C14360o3.A0K(this.A05, nyu.A05) || !C14360o3.A0K(this.A01, nyu.A01) || !C14360o3.A0K(this.A03, nyu.A03) || !C14360o3.A0K(this.A00, nyu.A00) || !C14360o3.A0K(this.A02, nyu.A02) || !C14360o3.A0K(this.A04, nyu.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A06)))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
