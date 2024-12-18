package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211989aP extends C0T6 implements BEY {
    public final C211999aQ A00;
    public final EnumC185548Kw A01;
    public final ImageUrl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211989aP) {
                C211989aP c211989aP = (C211989aP) obj;
                if (!C14360o3.A0K(this.A00, c211989aP.A00) || this.A01 != c211989aP.A01 || !C14360o3.A0K(this.A02, c211989aP.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.BEY
    public final EnumC185548Kw C3o() {
        return this.A01;
    }

    @Override // X.BEY
    public final ImageUrl C89() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C211989aP(EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, C211999aQ c211999aQ) {
        AbstractC167017dG.A1R(enumC185548Kw, imageUrl);
        this.A00 = c211999aQ;
        this.A01 = enumC185548Kw;
        this.A02 = imageUrl;
    }
}
