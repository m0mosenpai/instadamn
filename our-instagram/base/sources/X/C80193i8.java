package X;

/* renamed from: X.3i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80193i8 extends C0T6 {
    public final C86583tW A00;
    public final float A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80193i8) {
                C80193i8 c80193i8 = (C80193i8) obj;
                if (this.A04 != c80193i8.A04 || this.A02 != c80193i8.A02 || this.A03 != c80193i8.A03 || Float.compare(this.A01, c80193i8.A01) != 0 || !C14360o3.A0K(this.A00, c80193i8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        return ((((i4 + i5) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A00.hashCode();
    }

    public C80193i8(C86583tW c86583tW, float f, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A01 = f;
        this.A00 = c86583tW;
    }
}
