package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Jsk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44813Jsk extends AbstractC72460Xe6 {
    public final List A00;
    public final float[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44813Jsk) {
                C44813Jsk c44813Jsk = (C44813Jsk) obj;
                if (!C14360o3.A0K(this.A00, c44813Jsk.A00) || !C14360o3.A0K(this.A01, c44813Jsk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        float[] fArr = this.A01;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return A0M + i;
    }

    public C44813Jsk(List list, float[] fArr) {
        this.A00 = list;
        this.A01 = fArr;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RetinaFaceFacialLandmarksOutputModel(facialLandmarks=");
        A1C.append(this.A00);
        A1C.append(", facialLandmarksScores=");
        return AbstractC25236BEt.A0Y(Arrays.toString(this.A01), A1C);
    }

    public C44813Jsk() {
        this(null, null);
    }
}
