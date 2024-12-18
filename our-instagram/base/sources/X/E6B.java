package X;

import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class E6B extends C0T6 {
    public final float A00;
    public final RectF A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6B) {
                E6B e6b = (E6B) obj;
                if (!C14360o3.A0K(this.A01, e6b.A01) || Float.compare(this.A00, e6b.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + Float.floatToIntBits(this.A00);
    }

    public E6B(RectF rectF, float f) {
        this.A01 = rectF;
        this.A00 = f;
    }
}
