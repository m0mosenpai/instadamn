package X;

import android.graphics.RectF;

/* renamed from: X.9VG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VG extends AbstractC72460Xe6 {
    public final float A00;
    public final RectF A01;

    public C9VG(RectF rectF, float f) {
        C14360o3.A0B(rectF, 1);
        this.A01 = rectF;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VG) {
                C9VG c9vg = (C9VG) obj;
                if (!C14360o3.A0K(this.A01, c9vg.A01) || Float.compare(this.A00, c9vg.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BoundingBox(box=");
        A1C.append(this.A01);
        A1C.append(", score=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
