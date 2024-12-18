package X;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* renamed from: X.BZw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25757BZw extends C5YV {
    public float[] A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25757BZw) {
                float[] fArr = this.A00;
                if (fArr == null) {
                    ColorFilter colorFilter = super.A00;
                    if (colorFilter instanceof ColorMatrixColorFilter) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
                        fArr = colorMatrix.getArray();
                        this.A00 = fArr;
                    } else {
                        throw AbstractC166987dD.A12("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
                    }
                }
                C25757BZw c25757BZw = (C25757BZw) obj;
                float[] fArr2 = c25757BZw.A00;
                if (fArr2 == null) {
                    ColorFilter colorFilter2 = ((C5YV) c25757BZw).A00;
                    if (colorFilter2 instanceof ColorMatrixColorFilter) {
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        ((ColorMatrixColorFilter) colorFilter2).getColorMatrix(colorMatrix2);
                        fArr2 = colorMatrix2.getArray();
                        c25757BZw.A00 = fArr2;
                    } else {
                        throw AbstractC166987dD.A12("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
                    }
                }
                if (!Arrays.equals(fArr, fArr2)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float[] fArr = this.A00;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String A0r;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.A00;
        if (fArr == null) {
            A0r = "null";
        } else {
            A0r = AbstractC25235BEs.A0r("ColorMatrix(values=", Arrays.toString(fArr));
        }
        return AbstractC167017dG.A0o(A0r, A1C);
    }
}
