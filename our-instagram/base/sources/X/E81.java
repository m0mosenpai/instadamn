package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class E81 extends C0T6 implements InterfaceC31093Dlb {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E81) {
                E81 e81 = (E81) obj;
                if (!C14360o3.A0K(this.A01, e81.A01) || !C14360o3.A0K(this.A02, e81.A02) || !C14360o3.A0K(this.A00, e81.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)));
    }

    public E81(ImageUrl imageUrl, String str, String str2) {
        AbstractC167027dH.A13(str, str2, imageUrl);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
    }
}
