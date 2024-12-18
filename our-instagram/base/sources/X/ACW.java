package X;

import android.graphics.RectF;

/* loaded from: classes4.dex */
public final class ACW {
    public final RectF A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ACW) {
                ACW acw = (ACW) obj;
                if (!C14360o3.A0K(this.A01, acw.A01) || !C14360o3.A0K(this.A00, acw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public ACW(RectF rectF, String str) {
        this.A01 = str;
        this.A00 = rectF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SingleHandPredictionData(gesture=");
        A1C.append(this.A01);
        A1C.append(", boundingBox=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
