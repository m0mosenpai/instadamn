package X;

import android.graphics.RectF;

/* renamed from: X.Mrt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51662Mrt extends C0T6 {
    public final int A00;
    public final int A01;
    public final RectF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51662Mrt) {
                C51662Mrt c51662Mrt = (C51662Mrt) obj;
                if (this.A01 != c51662Mrt.A01 || this.A00 != c51662Mrt.A00 || !C14360o3.A0K(this.A02, c51662Mrt.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public C51662Mrt(RectF rectF, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = rectF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RectFWithOriginalDimen(originalWidth=");
        A1C.append(this.A01);
        A1C.append(", originalHeight=");
        A1C.append(this.A00);
        A1C.append(", rectF=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
