package X;

/* renamed from: X.5Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118435Xf extends AbstractC118405Xc {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C118435Xf) {
            C118435Xf c118435Xf = (C118435Xf) obj;
            if (c118435Xf.A00 == this.A00 && c118435Xf.A01 == this.A01 && c118435Xf.A02 == this.A02 && c118435Xf.A03 == this.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationVector4D: v1 = ");
        sb.append(this.A00);
        sb.append(", v2 = ");
        sb.append(this.A01);
        sb.append(", v3 = ");
        sb.append(this.A02);
        sb.append(", v4 = ");
        sb.append(this.A03);
        return sb.toString();
    }
}
