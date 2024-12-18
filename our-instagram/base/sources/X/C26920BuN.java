package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.BuN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26920BuN extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final C38321qM A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26920BuN) {
                C26920BuN c26920BuN = (C26920BuN) obj;
                if (!C14360o3.A0K(this.A02, c26920BuN.A02) || !C14360o3.A0K(this.A03, c26920BuN.A03) || !C14360o3.A0K(this.A04, c26920BuN.A04) || !C14360o3.A0K(this.A05, c26920BuN.A05) || !C14360o3.A0K(this.A00, c26920BuN.A00) || !C14360o3.A0K(this.A01, c26920BuN.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C26920BuN(C38321qM c38321qM, String str, String str2) {
        SimpleImageUrl A0t = AbstractC25225BEi.A0t("");
        this.A02 = str;
        this.A03 = str2;
        this.A04 = "";
        this.A05 = "";
        this.A00 = A0t;
        this.A01 = c38321qM;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25236BEt.A05(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))))) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaVerifiedLink(id=");
        AbstractC29162CtT.A01(A1C, this.A02);
        AbstractC29162CtT.A03(A1C, this.A03);
        AbstractC29162CtT.A02(A1C, this.A04);
        AbstractC25235BEs.A1K(A1C, this.A05);
        AbstractC29162CtT.A00(A1C, this.A00);
        A1C.append(", media=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
