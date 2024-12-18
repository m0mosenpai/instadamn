package X;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public final class OLk {
    public final Bitmap A00;
    public final C7V A01;
    public final String A02;

    public OLk(Bitmap bitmap, C7V c7v, String str) {
        C14360o3.A0B(c7v, 1);
        this.A01 = c7v;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLk) {
                OLk oLk = (OLk) obj;
                if (this.A01 != oLk.A01 || !C14360o3.A0K(this.A00, oLk.A00) || !C14360o3.A0K(this.A02, oLk.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MEmuPoseData(memuPose=");
        A1C.append(this.A01);
        A1C.append(", bitmap=");
        A1C.append(this.A00);
        A1C.append(", uploadHandle=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
