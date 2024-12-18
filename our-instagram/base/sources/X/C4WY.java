package X;

/* renamed from: X.4WY, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4WY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4WY)) {
            return false;
        }
        C4WY c4wy = (C4WY) obj;
        return this.A04.equals(c4wy.A04) && this.A00 == c4wy.A00 && this.A01 == c4wy.A01 && this.A03 == c4wy.A03 && this.A02 == c4wy.A02;
    }

    public final int hashCode() {
        return ((((((((527 + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + this.A02;
    }

    public C4WY(C4WY c4wy) {
        this.A04 = c4wy.A04;
        this.A00 = c4wy.A00;
        this.A01 = c4wy.A01;
        this.A03 = c4wy.A03;
        this.A02 = c4wy.A02;
    }

    public C4WY(Object obj, int i, int i2, int i3, long j) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }
}
