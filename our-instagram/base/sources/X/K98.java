package X;

/* loaded from: classes8.dex */
public final class K98 extends AbstractC46369Kfr {
    public final C45127Jxw A00;
    public final C45063Jws A01;
    public final Integer A02;
    public final boolean A03;

    public K98(C45127Jxw c45127Jxw, C45063Jws c45063Jws, Integer num, boolean z) {
        C14360o3.A0B(num, 4);
        this.A01 = c45063Jws;
        this.A03 = z;
        this.A00 = c45127Jxw;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K98) {
                K98 k98 = (K98) obj;
                if (!C14360o3.A0K(this.A01, k98.A01) || this.A03 != k98.A03 || !C14360o3.A0K(this.A00, k98.A00) || this.A02 != k98.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC46609Kjm.A00(this.A02);
    }
}
