package X;

/* renamed from: X.KPx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45818KPx extends AbstractC46429Kgp {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C45127Jxw A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45818KPx) {
                C45818KPx c45818KPx = (C45818KPx) obj;
                if (this.A01 != c45818KPx.A01 || !C14360o3.A0K(this.A03, c45818KPx.A03) || this.A02 != c45818KPx.A02 || this.A00 != c45818KPx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public C45818KPx(C45127Jxw c45127Jxw, int i, int i2, int i3) {
        this.A01 = i;
        this.A03 = c45127Jxw;
        this.A02 = i2;
        this.A00 = i3;
    }
}
