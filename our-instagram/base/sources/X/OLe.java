package X;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes9.dex */
public final class OLe {
    public final Bitmap A00;
    public final List A01;
    public final boolean A02;

    public OLe(Bitmap bitmap, List list, boolean z) {
        C14360o3.A0B(list, 2);
        this.A00 = bitmap;
        this.A01 = list;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLe) {
                OLe oLe = (OLe) obj;
                if (!C14360o3.A0K(this.A00, oLe.A00) || !C14360o3.A0K(this.A01, oLe.A01) || this.A02 != oLe.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UploadEditInputData(maskBitmap=");
        A1C.append(this.A00);
        A1C.append(", outputPoints=");
        A1C.append(this.A01);
        A1C.append(", audioEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
