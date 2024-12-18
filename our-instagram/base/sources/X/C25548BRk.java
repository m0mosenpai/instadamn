package X;

/* renamed from: X.BRk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25548BRk extends C0T6 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25548BRk) {
                C25548BRk c25548BRk = (C25548BRk) obj;
                if (Double.compare(this.A04, c25548BRk.A04) != 0 || this.A05 != c25548BRk.A05 || Double.compare(this.A03, c25548BRk.A03) != 0 || Double.compare(this.A01, c25548BRk.A01) != 0 || Double.compare(this.A00, c25548BRk.A00) != 0 || Double.compare(this.A02, c25548BRk.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC28006CWd.A01(this.A00, AbstractC28006CWd.A01(this.A01, AbstractC28006CWd.A01(this.A03, ((AbstractC25228BEl.A03(Double.doubleToLongBits(this.A04)) * 31) + this.A05) * 31))) + AbstractC25228BEl.A03(Double.doubleToLongBits(this.A02));
    }

    public C25548BRk(double d, double d2, double d3, double d4, double d5, int i) {
        this.A04 = d;
        this.A05 = i;
        this.A03 = d2;
        this.A01 = d3;
        this.A00 = d4;
        this.A02 = d5;
    }
}
