package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class BI9 extends C0T6 implements InterfaceC31096Dle {
    public final ImageUrl A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI9) {
                BI9 bi9 = (BI9) obj;
                if (!C14360o3.A0K(this.A00, bi9.A00) || !C14360o3.A0K(this.A01, bi9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public BI9(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }
}
