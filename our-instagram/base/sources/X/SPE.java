package X;

import android.graphics.Rect;

/* loaded from: classes10.dex */
public final class SPE {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Rect A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPE) {
                SPE spe = (SPE) obj;
                if (Float.compare(this.A00, spe.A00) != 0 || Float.compare(this.A01, spe.A01) != 0 || !C14360o3.A0K(this.A04, spe.A04) || this.A03 != spe.A03 || this.A02 != spe.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A01) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A03) * 31) + this.A02;
    }

    public SPE(Rect rect, float f, float f2, int i, int i2) {
        this.A00 = f;
        this.A01 = f2;
        this.A04 = rect;
        this.A03 = i;
        this.A02 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DetectedFace(xAngle=");
        A1C.append(this.A00);
        A1C.append(", yAngle=");
        A1C.append(this.A01);
        A1C.append(", faceRect=");
        A1C.append(this.A04);
        A1C.append(", containerWidth=");
        A1C.append(this.A03);
        A1C.append(", containerHeight=");
        return AbstractC25236BEt.A0Z(A1C, this.A02);
    }
}
