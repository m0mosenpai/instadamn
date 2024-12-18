package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9aO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211979aO extends C0T6 implements BEX {
    public final EnumC185548Kw A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211979aO) {
                C211979aO c211979aO = (C211979aO) obj;
                if (!C14360o3.A0K(this.A06, c211979aO.A06) || !C14360o3.A0K(this.A04, c211979aO.A04) || !C14360o3.A0K(this.A03, c211979aO.A03) || !C14360o3.A0K(this.A07, c211979aO.A07) || !C14360o3.A0K(this.A05, c211979aO.A05) || !C14360o3.A0K(this.A01, c211979aO.A01) || this.A00 != c211979aO.A00 || !C14360o3.A0K(this.A02, c211979aO.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.BEX
    public final String B0Q() {
        return this.A04;
    }

    @Override // X.BEX
    public final String B0R() {
        return this.A05;
    }

    @Override // X.BEX
    public final String B0V() {
        return this.A07;
    }

    @Override // X.BEX
    public final Boolean B0e() {
        return this.A03;
    }

    @Override // X.BEX
    public final ImageUrl B0h() {
        return this.A01;
    }

    @Override // X.BEY
    public final EnumC185548Kw C3o() {
        return this.A00;
    }

    @Override // X.BEY
    public final ImageUrl C89() {
        return this.A02;
    }

    @Override // X.BEX
    public final String getEffectId() {
        return this.A06;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((AbstractC166987dD.A0J(this.A06) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, (A0J + i) * 31)));
    }

    public C211979aO(EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, String str, String str2, String str3, String str4) {
        this.A06 = str;
        this.A04 = str2;
        this.A03 = bool;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = imageUrl;
        this.A00 = enumC185548Kw;
        this.A02 = imageUrl2;
    }
}
