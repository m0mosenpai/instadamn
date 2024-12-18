package X;

/* renamed from: X.L9q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47808L9q {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47808L9q) {
                C47808L9q c47808L9q = (C47808L9q) obj;
                if (Float.compare(this.A00, c47808L9q.A00) != 0 || Float.compare(this.A03, c47808L9q.A03) != 0 || Float.compare(this.A01, c47808L9q.A01) != 0 || Float.compare(this.A04, c47808L9q.A04) != 0 || Float.compare(this.A02, c47808L9q.A02) != 0 || Float.compare(this.A05, c47808L9q.A05) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A03), this.A01), this.A04), this.A02) + Float.floatToIntBits(this.A05);
    }

    public C47808L9q(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A05 = f6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PathCubicCommandArgs(x1=");
        A1C.append(this.A00);
        A1C.append(", y1=");
        A1C.append(this.A03);
        A1C.append(", x2=");
        A1C.append(this.A01);
        A1C.append(", y2=");
        A1C.append(this.A04);
        A1C.append(", x3=");
        A1C.append(this.A02);
        A1C.append(", y3=");
        A1C.append(this.A05);
        return AbstractC167017dG.A0p(A1C);
    }
}
