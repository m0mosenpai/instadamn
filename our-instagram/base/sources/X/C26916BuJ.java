package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BuJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26916BuJ extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26916BuJ) {
                C26916BuJ c26916BuJ = (C26916BuJ) obj;
                if (!C14360o3.A0K(this.A01, c26916BuJ.A01) || !C14360o3.A0K(this.A02, c26916BuJ.A02) || !C14360o3.A0K(this.A03, c26916BuJ.A03) || !C14360o3.A0K(this.A04, c26916BuJ.A04) || !C14360o3.A0K(this.A00, c26916BuJ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26916BuJ(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A05(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Person(id=");
        AbstractC29162CtT.A01(A1C, this.A01);
        AbstractC29162CtT.A03(A1C, this.A02);
        AbstractC29162CtT.A02(A1C, this.A03);
        AbstractC25235BEs.A1K(A1C, this.A04);
        A1C.append(this.A00);
        A1C.append(", isChecked=");
        return AbstractC25236BEt.A0a(A1C, false);
    }
}
