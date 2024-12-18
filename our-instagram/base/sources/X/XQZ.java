package X;

import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public final class XQZ extends AbstractC72460Xe6 {
    public final Bitmap A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XQZ) {
                XQZ xqz = (XQZ) obj;
                if (!C14360o3.A0K(this.A01, xqz.A01) || !C14360o3.A0K(this.A00, xqz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public XQZ(Bitmap bitmap, String str) {
        this.A01 = str;
        this.A00 = bitmap;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputBitmap(type=");
        A1C.append(this.A01);
        A1C.append(", bitmap=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
