package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BuW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26929BuW extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final C38321qM A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05 = "";
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26929BuW) {
                C26929BuW c26929BuW = (C26929BuW) obj;
                if (!C14360o3.A0K(this.A02, c26929BuW.A02) || !C14360o3.A0K(this.A03, c26929BuW.A03) || !C14360o3.A0K(this.A04, c26929BuW.A04) || !C14360o3.A0K(this.A05, c26929BuW.A05) || !C14360o3.A0K(this.A00, c26929BuW.A00) || this.A06 != c26929BuW.A06 || !C14360o3.A0K(this.A01, c26929BuW.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26929BuW(ImageUrl imageUrl, C38321qM c38321qM, String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A01 = c38321qM;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Template(id=");
        AbstractC29162CtT.A01(A1C, this.A02);
        AbstractC29162CtT.A03(A1C, this.A03);
        AbstractC29162CtT.A02(A1C, this.A04);
        AbstractC25235BEs.A1K(A1C, this.A05);
        A1C.append(this.A00);
        A1C.append(", isChecked=");
        A1C.append(this.A06);
        A1C.append(", media=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
