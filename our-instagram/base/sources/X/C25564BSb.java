package X;

/* renamed from: X.BSb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25564BSb extends C0T6 {
    public final double A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25564BSb) {
                C25564BSb c25564BSb = (C25564BSb) obj;
                if (Double.compare(this.A00, c25564BSb.A00) != 0 || this.A01 != c25564BSb.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25228BEl.A03(Double.doubleToLongBits(this.A00)) * 31);
    }

    public C25564BSb(double d, boolean z) {
        this.A00 = d;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FanOutMenuButtonLayout(centerAngle=");
        A1C.append(this.A00);
        A1C.append(", shouldFlipButtons=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
