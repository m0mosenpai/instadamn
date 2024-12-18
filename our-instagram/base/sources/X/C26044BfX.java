package X;

/* renamed from: X.BfX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26044BfX extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26044BfX) {
                C26044BfX c26044BfX = (C26044BfX) obj;
                if (this.A04 != c26044BfX.A04 || this.A03 != c26044BfX.A03 || Float.compare(this.A00, c26044BfX.A00) != 0 || Float.compare(this.A01, c26044BfX.A01) != 0 || Float.compare(this.A02, c26044BfX.A02) != 0 || this.A06 != c26044BfX.A06 || this.A05 != c26044BfX.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(((this.A04 * 31) + this.A03) * 31, this.A00), this.A01), this.A02)));
    }

    public C26044BfX(float f, float f2, float f3, int i, int i2, boolean z, boolean z2) {
        this.A04 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A06 = z;
        this.A05 = z2;
    }

    public C26044BfX() {
        this(0.0f, 0.0f, 0.0f, 0, 0, true, true);
    }
}
