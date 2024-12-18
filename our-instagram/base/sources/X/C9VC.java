package X;

import android.graphics.Bitmap;

/* renamed from: X.9VC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VC extends AbstractC72459Xe5 {
    public final Bitmap A00;

    public C9VC(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 1);
        this.A00 = bitmap;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9VC) && C14360o3.A0K(this.A00, ((C9VC) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiInputBitmap(bitmap=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
