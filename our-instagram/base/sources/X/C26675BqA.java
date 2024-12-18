package X;

/* renamed from: X.BqA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26675BqA extends C98 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26675BqA) {
                C26675BqA c26675BqA = (C26675BqA) obj;
                if (Float.compare(this.A00, c26675BqA.A00) != 0 || Float.compare(this.A01, c26675BqA.A01) != 0 || Float.compare(this.A02, c26675BqA.A02) != 0 || Float.compare(this.A03, c26675BqA.A03) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final float A00(float f) {
        float A01 = C17s.A01((f - this.A00) / this.A01);
        float f2 = this.A02;
        return f2 + ((this.A03 - f2) * A01);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01), this.A02), this.A03);
    }

    public C26675BqA(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
