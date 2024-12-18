package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class CVN {
    public final int A00;
    public final Drawable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVN) {
                CVN cvn = (CVN) obj;
                if (this.A00 != cvn.A00 || !C14360o3.A0K(this.A01, cvn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }

    public CVN(Drawable drawable, int i) {
        this.A00 = i;
        this.A01 = drawable;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SpinnerStyleValues(sizeDp=");
        A1C.append(this.A00);
        A1C.append(", indeterminateDrawable=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
