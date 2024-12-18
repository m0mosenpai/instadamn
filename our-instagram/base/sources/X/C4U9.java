package X;

/* renamed from: X.4U9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U9 {
    public static final C4U9 A04 = new C4U9(1.0f, 0, 0, 0);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4U9)) {
                return false;
            }
            C4U9 c4u9 = (C4U9) obj;
            if (this.A03 != c4u9.A03 || this.A01 != c4u9.A01 || this.A02 != c4u9.A02 || this.A00 != c4u9.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((217 + this.A03) * 31) + this.A01) * 31) + this.A02) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public C4U9(float f, int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }
}
