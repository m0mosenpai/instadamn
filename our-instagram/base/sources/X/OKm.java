package X;

/* loaded from: classes9.dex */
public final class OKm {
    public float A00;
    public final float A03;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public final float A00() {
        float f = this.A02;
        if (f >= 1.0f) {
            return this.A03;
        }
        float f2 = this.A01;
        return f2 + (((this.A03 - f2) / (1.0f - f)) * (this.A00 - f));
    }

    public final void A01(float f, float f2) {
        if (this.A02 < 0.0f) {
            this.A02 = f;
            this.A01 = f2;
        }
        this.A00 = f;
    }

    public OKm(float f) {
        this.A03 = f;
    }
}
