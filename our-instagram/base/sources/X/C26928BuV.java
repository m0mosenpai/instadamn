package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BuV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26928BuV extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C26928BuV(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A05 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26928BuV) {
                C26928BuV c26928BuV = (C26928BuV) obj;
                if (!C14360o3.A0K(this.A01, c26928BuV.A01) || !C14360o3.A0K(this.A02, c26928BuV.A02) || !C14360o3.A0K(this.A03, c26928BuV.A03) || !C14360o3.A0K(this.A04, c26928BuV.A04) || !C14360o3.A0K(this.A00, c26928BuV.A00) || this.A06 != c26928BuV.A06 || !C14360o3.A0K(this.A05, c26928BuV.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Remix(id=");
        AbstractC29162CtT.A01(A1C, this.A01);
        AbstractC29162CtT.A03(A1C, this.A02);
        AbstractC29162CtT.A02(A1C, this.A03);
        AbstractC25235BEs.A1K(A1C, this.A04);
        A1C.append(this.A00);
        A1C.append(", isChecked=");
        A1C.append(this.A06);
        A1C.append(", userId=");
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
