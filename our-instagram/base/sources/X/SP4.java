package X;

/* loaded from: classes10.dex */
public final class SP4 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SP4) {
                SP4 sp4 = (SP4) obj;
                if (this.A03 != sp4.A03 || Float.compare(this.A00, sp4.A00) != 0 || Float.compare(this.A01, sp4.A01) != 0 || Float.compare(this.A02, sp4.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(this.A03 * 31, this.A00), this.A01) + Float.floatToIntBits(this.A02);
    }

    public SP4(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC111324zv.A00(3758));
        A1C.append(this.A03);
        A1C.append(", offsetX=");
        A1C.append(this.A00);
        A1C.append(", offsetY=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(575));
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }
}
