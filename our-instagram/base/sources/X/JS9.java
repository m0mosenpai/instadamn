package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class JS9 extends AbstractC46437Kgx {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof JS9) && C14360o3.A0K(this.A00, ((JS9) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public JS9(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Single(url=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
