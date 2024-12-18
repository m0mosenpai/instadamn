package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bxo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27125Bxo extends AbstractC27126Bxp {
    public final ImageUrl A00;
    public final InterfaceC30814Dgp A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27125Bxo) {
                C27125Bxo c27125Bxo = (C27125Bxo) obj;
                if (!C14360o3.A0K(this.A03, c27125Bxo.A03) || !C14360o3.A0K(this.A02, c27125Bxo.A02) || this.A04 != c27125Bxo.A04 || !C14360o3.A0K(this.A01, c27125Bxo.A01) || !C14360o3.A0K(this.A00, c27125Bxo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)))) + AbstractC167017dG.A0M(this.A00);
    }

    public C27125Bxo(ImageUrl imageUrl, InterfaceC30814Dgp interfaceC30814Dgp, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = interfaceC30814Dgp;
        this.A00 = imageUrl;
    }
}
