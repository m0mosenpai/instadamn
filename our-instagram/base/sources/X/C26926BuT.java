package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.BuT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26926BuT extends AbstractC29162CtT {
    public final Drawable A00;
    public final ImageUrl A01;
    public final C38321qM A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26926BuT) {
                C26926BuT c26926BuT = (C26926BuT) obj;
                if (!C14360o3.A0K(this.A03, c26926BuT.A03) || !C14360o3.A0K(this.A04, c26926BuT.A04) || !C14360o3.A0K(this.A05, c26926BuT.A05) || !C14360o3.A0K(this.A06, c26926BuT.A06) || !C14360o3.A0K(this.A01, c26926BuT.A01) || !C14360o3.A0K(this.A00, c26926BuT.A00) || !C14360o3.A0K(this.A02, c26926BuT.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C26926BuT(Drawable drawable, C38321qM c38321qM, String str, String str2) {
        SimpleImageUrl A0t = AbstractC25225BEi.A0t("");
        this.A03 = str;
        this.A04 = str2;
        this.A05 = "";
        this.A06 = "";
        this.A01 = A0t;
        this.A00 = drawable;
        this.A02 = c38321qM;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, ((AbstractC25236BEt.A05(this.A01, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03))))) * 31) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HorizonWorldsLabel(id=");
        AbstractC29162CtT.A01(A1C, this.A03);
        AbstractC29162CtT.A03(A1C, this.A04);
        AbstractC29162CtT.A02(A1C, this.A05);
        AbstractC25235BEs.A1K(A1C, this.A06);
        AbstractC29162CtT.A00(A1C, this.A01);
        A1C.append(", imageDrawable=");
        A1C.append(this.A00);
        A1C.append(", media=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}