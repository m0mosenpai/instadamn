package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.BuR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26924BuR extends AbstractC29162CtT {
    public final Drawable A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26924BuR) {
                C26924BuR c26924BuR = (C26924BuR) obj;
                if (!C14360o3.A0K(this.A02, c26924BuR.A02) || !C14360o3.A0K(this.A03, c26924BuR.A03) || !C14360o3.A0K(this.A04, c26924BuR.A04) || !C14360o3.A0K(this.A05, c26924BuR.A05) || !C14360o3.A0K(this.A01, c26924BuR.A01) || !C14360o3.A0K(this.A00, c26924BuR.A00) || this.A06 != c26924BuR.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C26924BuR(Drawable drawable, String str, String str2, String str3, boolean z) {
        SimpleImageUrl A0t = AbstractC25225BEi.A0t("");
        C14360o3.A0B(str2, 2);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = "";
        this.A01 = A0t;
        this.A00 = drawable;
        this.A06 = z;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, (AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)))) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AppMoreInfo(id=");
        AbstractC29162CtT.A01(A1C, this.A02);
        AbstractC29162CtT.A03(A1C, this.A03);
        AbstractC29162CtT.A02(A1C, this.A04);
        A1C.append(this.A05);
        AbstractC25235BEs.A1M(A1C, ", isChecked=");
        A1C.append(", imageUrl=");
        A1C.append(this.A01);
        A1C.append(", imageDrawable=");
        A1C.append(this.A00);
        A1C.append(", isRatingsReviews=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }
}
