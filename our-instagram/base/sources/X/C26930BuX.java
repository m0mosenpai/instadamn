package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectPreviewIntf;

/* renamed from: X.BuX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26930BuX extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final EffectPreviewIntf A01;
    public final C38321qM A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26930BuX) {
                C26930BuX c26930BuX = (C26930BuX) obj;
                if (!C14360o3.A0K(this.A03, c26930BuX.A03) || !C14360o3.A0K(this.A04, c26930BuX.A04) || !C14360o3.A0K(this.A05, c26930BuX.A05) || !C14360o3.A0K(this.A06, c26930BuX.A06) || !C14360o3.A0K(this.A00, c26930BuX.A00) || this.A07 != c26930BuX.A07 || !C14360o3.A0K(this.A01, c26930BuX.A01) || !C14360o3.A0K(this.A02, c26930BuX.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03))))))));
    }

    public C26930BuX(ImageUrl imageUrl, EffectPreviewIntf effectPreviewIntf, C38321qM c38321qM, String str, String str2, String str3, String str4, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = imageUrl;
        this.A07 = z;
        this.A01 = effectPreviewIntf;
        this.A02 = c38321qM;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Effect(id=");
        AbstractC29162CtT.A01(A1C, this.A03);
        AbstractC29162CtT.A03(A1C, this.A04);
        AbstractC29162CtT.A02(A1C, this.A05);
        AbstractC25235BEs.A1K(A1C, this.A06);
        A1C.append(this.A00);
        A1C.append(", isChecked=");
        A1C.append(this.A07);
        A1C.append(", config=");
        A1C.append(this.A01);
        A1C.append(", media=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
