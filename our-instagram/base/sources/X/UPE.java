package X;

/* loaded from: classes11.dex */
public final class UPE extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPE) {
                UPE upe = (UPE) obj;
                if (this.A05 != upe.A05 || this.A04 != upe.A04 || Float.compare(this.A01, upe.A01) != 0 || Float.compare(this.A02, upe.A02) != 0 || Float.compare(this.A03, upe.A03) != 0 || Float.compare(this.A00, upe.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(((this.A05 * 31) + this.A04) * 31, this.A01), this.A02), this.A03) + Float.floatToIntBits(this.A00);
    }

    public UPE(float f, float f2, int i, float f3, int i2, float f4) {
        this.A05 = i;
        this.A04 = i2;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }
}
