package X;

/* renamed from: X.Mrs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51661Mrs extends C0T6 {
    public final float A00;
    public final int A01;
    public final boolean A02;

    public C51661Mrs(int i, float f, boolean z) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this.A01 != 0) {
            if (this != obj) {
                if (obj instanceof C51661Mrs) {
                    C51661Mrs c51661Mrs = (C51661Mrs) obj;
                    if (c51661Mrs.A01 != 1 || this.A02 != c51661Mrs.A02 || Float.compare(this.A00, c51661Mrs.A00) != 0) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51661Mrs)) {
                return false;
            }
            C51661Mrs c51661Mrs2 = (C51661Mrs) obj;
            if (c51661Mrs2.A01 != 0 || Float.compare(this.A00, c51661Mrs2.A00) != 0 || this.A02 != c51661Mrs2.A02) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits;
        int i;
        if (this.A01 != 0) {
            floatToIntBits = AbstractC25225BEi.A08(this.A02);
            i = Float.floatToIntBits(this.A00);
        } else {
            floatToIntBits = Float.floatToIntBits(this.A00) * 31;
            i = 1237;
            if (this.A02) {
                i = 1231;
            }
        }
        return floatToIntBits + i;
    }

    public final String toString() {
        if (this.A01 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoPreview(postCropAspectRatio=");
        A1C.append(this.A00);
        A1C.append(", isLandscape=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
