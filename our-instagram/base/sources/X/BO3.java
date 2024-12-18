package X;

/* loaded from: classes5.dex */
public final class BO3 extends C0T6 implements InterfaceC30879Dhs {
    public final int A00;
    public final C38321qM A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BO3) {
                BO3 bo3 = (BO3) obj;
                if (!C14360o3.A0K(this.A01, bo3.A01) || this.A00 != bo3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public BO3(C38321qM c38321qM, int i) {
        this.A01 = c38321qM;
        this.A00 = i;
    }
}
