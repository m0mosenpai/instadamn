package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BuK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26917BuK extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04 = "";
    public final String A05 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26917BuK) {
                C26917BuK c26917BuK = (C26917BuK) obj;
                if (!C14360o3.A0K(this.A01, c26917BuK.A01) || !C14360o3.A0K(this.A03, c26917BuK.A03) || !C14360o3.A0K(this.A04, c26917BuK.A04) || !C14360o3.A0K(this.A05, c26917BuK.A05) || !C14360o3.A0K(this.A00, c26917BuK.A00) || !C14360o3.A0K(this.A02, c26917BuK.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26917BuK(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A01 = str;
        this.A03 = str2;
        this.A00 = imageUrl;
        this.A02 = str3;
    }

    public final int hashCode() {
        return (AbstractC25236BEt.A05(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A01))))) * 31) + AbstractC167017dG.A0O(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BusinessCategory(id=");
        AbstractC29162CtT.A01(A1C, this.A01);
        AbstractC29162CtT.A03(A1C, this.A03);
        AbstractC29162CtT.A02(A1C, this.A04);
        AbstractC25235BEs.A1K(A1C, this.A05);
        AbstractC29162CtT.A00(A1C, this.A00);
        A1C.append(", mediaId=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
