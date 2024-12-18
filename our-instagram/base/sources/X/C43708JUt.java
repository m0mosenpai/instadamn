package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JUt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43708JUt extends AbstractC46437Kgx {
    public final ImageUrl A00;
    public final ImageUrl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43708JUt) {
                C43708JUt c43708JUt = (C43708JUt) obj;
                if (!C14360o3.A0K(this.A00, c43708JUt.A00) || !C14360o3.A0K(this.A01, c43708JUt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public C43708JUt(ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Double(first=");
        A1C.append(this.A00);
        A1C.append(", second=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
