package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;

/* renamed from: X.BhN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26136BhN extends C0T6 implements JJS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ClipsMidCardSubtype A03;
    public final ClipsMidCardType A04;
    public final InstagramMidcardType A05;
    public final C26133BhK A06;
    public final MidCardLayoutType A07;
    public final C26137BhO A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C26136BhN(ClipsMidCardSubtype clipsMidCardSubtype, ClipsMidCardType clipsMidCardType, InstagramMidcardType instagramMidcardType, C26133BhK c26133BhK, MidCardLayoutType midCardLayoutType, C26137BhO c26137BhO, String str, String str2, String str3, int i, int i2, int i3) {
        AbstractC25233BEq.A0x(3, c26133BhK, str2, midCardLayoutType);
        C14360o3.A0B(instagramMidcardType, 11);
        this.A0A = str;
        this.A00 = i;
        this.A06 = c26133BhK;
        this.A09 = str2;
        this.A07 = midCardLayoutType;
        this.A08 = c26137BhO;
        this.A03 = clipsMidCardSubtype;
        this.A04 = clipsMidCardType;
        this.A0B = str3;
        this.A01 = i2;
        this.A05 = instagramMidcardType;
        this.A02 = i3;
    }

    @Override // X.JJS
    public final C26136BhN Ewo(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26136BhN) {
                C26136BhN c26136BhN = (C26136BhN) obj;
                if (!C14360o3.A0K(this.A0A, c26136BhN.A0A) || this.A00 != c26136BhN.A00 || !C14360o3.A0K(this.A06, c26136BhN.A06) || !C14360o3.A0K(this.A09, c26136BhN.A09) || this.A07 != c26136BhN.A07 || !C14360o3.A0K(this.A08, c26136BhN.A08) || this.A03 != c26136BhN.A03 || this.A04 != c26136BhN.A04 || !C14360o3.A0K(this.A0B, c26136BhN.A0B) || this.A01 != c26136BhN.A01 || this.A05 != c26136BhN.A05 || this.A02 != c26136BhN.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, (((((((((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A06, ((AbstractC167017dG.A0O(this.A0A) * 31) + this.A00) * 31))) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A0B)) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // X.JJS
    public final JJS E9K(C1DY c1dy) {
        return this;
    }
}
