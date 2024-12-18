package X;

/* renamed from: X.Muf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51775Muf extends C0T6 implements InterfaceC58213PrJ {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final float A05;
    public final float A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51775Muf) {
                C51775Muf c51775Muf = (C51775Muf) obj;
                if (Float.compare(this.A05, c51775Muf.A05) != 0 || this.A01 != c51775Muf.A01 || this.A02 != c51775Muf.A02 || this.A03 != c51775Muf.A03 || this.A04 != c51775Muf.A04 || Float.compare(this.A06, c51775Muf.A06) != 0 || this.A00 != c51775Muf.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A01, Float.floatToIntBits(this.A05) * 31)))), this.A06) + this.A00;
    }

    public C51775Muf(float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = f;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A06 = f2;
        this.A00 = i;
    }
}
