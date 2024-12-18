package X;

/* renamed from: X.GyF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38612GyF extends C0T6 {
    public final float A00;
    public final C51760Mtj A01;
    public final C80143i3 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38612GyF) {
                C38612GyF c38612GyF = (C38612GyF) obj;
                if (Float.compare(this.A00, c38612GyF.A00) != 0 || !C14360o3.A0K(this.A02, c38612GyF.A02) || !C14360o3.A0K(this.A01, c38612GyF.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, Float.floatToIntBits(this.A00) * 31));
    }

    public C38612GyF(C51760Mtj c51760Mtj, C80143i3 c80143i3, float f) {
        this.A00 = f;
        this.A02 = c80143i3;
        this.A01 = c51760Mtj;
    }
}
