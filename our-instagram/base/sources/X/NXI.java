package X;

/* loaded from: classes9.dex */
public final class NXI extends AbstractC53539Nm6 {
    public final C5QE A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NXI) {
                NXI nxi = (NXI) obj;
                if (!C14360o3.A0K(this.A00, nxi.A00) || !C14360o3.A0K(this.A01, nxi.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public NXI(C5QE c5qe, String str) {
        this.A00 = c5qe;
        this.A01 = str;
    }
}
