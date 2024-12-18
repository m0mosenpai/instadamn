package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JxB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45081JxB extends C0T6 {
    public final float A00;
    public final long A01 = -1;
    public final ImageUrl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45081JxB) {
                C45081JxB c45081JxB = (C45081JxB) obj;
                if (Float.compare(this.A00, c45081JxB.A00) != 0 || !C14360o3.A0K(this.A02, c45081JxB.A02) || this.A01 != c45081JxB.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C45081JxB(ImageUrl imageUrl, float f) {
        this.A00 = f;
        this.A02 = imageUrl;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, Float.floatToIntBits(this.A00) * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImageFields(aspectRatio=");
        A1C.append(this.A00);
        A1C.append(", url=");
        A1C.append(this.A02);
        A1C.append(", expiringAtMillis=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
