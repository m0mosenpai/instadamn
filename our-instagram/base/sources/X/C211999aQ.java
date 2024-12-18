package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9aQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211999aQ extends C0T6 implements InterfaceC185178Ji {
    public final EnumC185548Kw A00;
    public final ImageUrl A01;
    public final C38321qM A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211999aQ) {
                C211999aQ c211999aQ = (C211999aQ) obj;
                if (this.A00 != c211999aQ.A00 || !C14360o3.A0K(this.A03, c211999aQ.A03) || !C14360o3.A0K(this.A01, c211999aQ.A01) || this.A04 != c211999aQ.A04 || !C14360o3.A0K(this.A02, c211999aQ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0M(this.A02);
    }

    public C211999aQ(EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, C38321qM c38321qM, String str, boolean z) {
        AbstractC167017dG.A1R(str, imageUrl);
        this.A00 = enumC185548Kw;
        this.A03 = str;
        this.A01 = imageUrl;
        this.A04 = z;
        this.A02 = c38321qM;
    }
}
