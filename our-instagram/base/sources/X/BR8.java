package X;

import android.graphics.Point;

/* loaded from: classes5.dex */
public final class BR8 extends C0T6 {
    public final float A00;
    public final int A01;
    public final Point A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BR8) {
                BR8 br8 = (BR8) obj;
                if (this.A01 != br8.A01 || Float.compare(this.A00, br8.A00) != 0 || !C14360o3.A0K(this.A02, br8.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A00(this.A01 * 31, this.A00));
    }

    public BR8(Point point, float f, int i) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = point;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FaceSwarmTemplateSpecifier(rank=");
        A1C.append(this.A01);
        A1C.append(", sizeDp=");
        A1C.append(this.A00);
        A1C.append(", point=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
