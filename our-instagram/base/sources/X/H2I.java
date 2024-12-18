package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class H2I extends C0T6 implements InterfaceC58212PrI {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2I) {
                H2I h2i = (H2I) obj;
                if (!C14360o3.A0K(this.A01, h2i.A01) || !C14360o3.A0K(this.A02, h2i.A02) || !C14360o3.A0K(this.A00, h2i.A00) || !C14360o3.A0K(this.A03, h2i.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0J(this.A00, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A02)) * 31));
    }

    public H2I(ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC37302Gc3.A1U(imageUrl, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
        this.A03 = str3;
    }
}
