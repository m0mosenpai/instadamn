package X;

/* loaded from: classes12.dex */
public abstract class Y1j {
    public final float A00;
    public final float A01;

    public static float A00(Y1j y1j, Y1j y1j2) {
        float f = y1j.A00;
        float f2 = y1j.A01;
        double d = f - y1j2.A00;
        double d2 = f2 - y1j2.A01;
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y1j)) {
            return false;
        }
        Y1j y1j = (Y1j) obj;
        if (this.A00 != y1j.A00 || this.A01 != y1j.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public Y1j(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("(");
        A1C.append(this.A00);
        A1C.append(',');
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
