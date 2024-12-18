package X;

/* renamed from: X.NHr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52421NHr extends O7N {
    public final int A00;
    public final C51831MvZ A01;
    public final float A02;

    public C52421NHr(C51831MvZ c51831MvZ, float f, int i) {
        super(2, String.valueOf(2));
        this.A01 = c51831MvZ;
        this.A00 = i;
        this.A02 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52421NHr) {
                C52421NHr c52421NHr = (C52421NHr) obj;
                if (!C14360o3.A0K(this.A01, c52421NHr.A01) || this.A00 != c52421NHr.A00 || Float.compare(this.A02, c52421NHr.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() + 62) * 31) + this.A00) * 31) + Float.floatToIntBits(this.A02);
    }
}
