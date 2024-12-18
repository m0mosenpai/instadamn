package X;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class C4G extends CA0 {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4G) && C14360o3.A0K(this.A00, ((C4G) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C4G(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PhotoBitmapReady(bitmap=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
