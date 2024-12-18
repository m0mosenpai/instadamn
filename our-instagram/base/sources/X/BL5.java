package X;

/* loaded from: classes5.dex */
public final class BL5 extends C0T6 implements InterfaceC30868Dhh {
    public final C38321qM A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL5) {
                BL5 bl5 = (BL5) obj;
                if (!C14360o3.A0K(this.A00, bl5.A00) || !C14360o3.A0K(this.A01, bl5.A01) || !C14360o3.A0K(this.A02, bl5.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public BL5(C38321qM c38321qM, String str, String str2) {
        this.A00 = c38321qM;
        this.A01 = str;
        this.A02 = str2;
    }
}
