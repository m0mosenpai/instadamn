package X;

/* renamed from: X.5Xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118425Xe extends AbstractC118405Xc {
    public float A00;
    public float A01;
    public float A02;

    public final boolean equals(Object obj) {
        if (obj instanceof C118425Xe) {
            C118425Xe c118425Xe = (C118425Xe) obj;
            if (c118425Xe.A00 == this.A00 && c118425Xe.A01 == this.A01 && c118425Xe.A02 == this.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationVector3D: v1 = ");
        sb.append(this.A00);
        sb.append(", v2 = ");
        sb.append(this.A01);
        sb.append(", v3 = ");
        sb.append(this.A02);
        return sb.toString();
    }
}
