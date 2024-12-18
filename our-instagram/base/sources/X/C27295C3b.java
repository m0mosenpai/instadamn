package X;

import android.graphics.Bitmap;

/* renamed from: X.C3b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27295C3b extends AbstractC27455C9x {
    public final Bitmap A00;
    public final String A01;

    public C27295C3b(Bitmap bitmap, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27295C3b) {
                C27295C3b c27295C3b = (C27295C3b) obj;
                if (!C14360o3.A0K(this.A01, c27295C3b.A01) || !C14360o3.A0K(this.A00, c27295C3b.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AddBitmapToCache(imageId=");
        A1C.append(this.A01);
        A1C.append(", bitmap=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
