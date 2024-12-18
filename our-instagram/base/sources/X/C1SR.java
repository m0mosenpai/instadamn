package X;

/* renamed from: X.1SR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1SR extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1SR) {
                C1SR c1sr = (C1SR) obj;
                if (this.A03 != c1sr.A03 || this.A01 != c1sr.A01 || this.A00 != c1sr.A00 || this.A02 != c1sr.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03 * 31) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }

    public C1SR(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }
}
