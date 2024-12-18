package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BuP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26922BuP extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04 = "";
    public final C38321qM A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26922BuP) {
                C26922BuP c26922BuP = (C26922BuP) obj;
                if (!C14360o3.A0K(this.A01, c26922BuP.A01) || !C14360o3.A0K(this.A02, c26922BuP.A02) || !C14360o3.A0K(this.A03, c26922BuP.A03) || !C14360o3.A0K(this.A04, c26922BuP.A04) || !C14360o3.A0K(this.A00, c26922BuP.A00) || !C14360o3.A0K(this.A05, c26922BuP.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26922BuP(ImageUrl imageUrl, C38321qM c38321qM, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
        this.A05 = c38321qM;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, AbstractC25236BEt.A05(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))))) * 31 * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WearablesRayBanLabel(id=");
        AbstractC29162CtT.A01(A1C, this.A01);
        AbstractC29162CtT.A03(A1C, this.A02);
        AbstractC29162CtT.A02(A1C, this.A03);
        AbstractC25235BEs.A1K(A1C, this.A04);
        AbstractC29162CtT.A00(A1C, this.A00);
        AbstractC25235BEs.A1L(A1C, ", imageDrawable=");
        A1C.append(", media=");
        return AbstractC167017dG.A0o(this.A05, A1C);
    }
}
