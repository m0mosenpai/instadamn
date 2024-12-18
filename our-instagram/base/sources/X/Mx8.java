package X;

/* loaded from: classes9.dex */
public final class Mx8 extends C0T6 implements InterfaceC57867PlX {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final C51759Mti A02;
    public final C51759Mti A03;

    public Mx8(C51759Mti c51759Mti, C51759Mti c51759Mti2, C51759Mti c51759Mti3, C51759Mti c51759Mti4) {
        C14360o3.A0B(c51759Mti, 1);
        this.A03 = c51759Mti;
        this.A00 = c51759Mti2;
        this.A01 = c51759Mti3;
        this.A02 = c51759Mti4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Mx8) {
                Mx8 mx8 = (Mx8) obj;
                if (!C14360o3.A0K(this.A03, mx8.A03) || !C14360o3.A0K(this.A00, mx8.A00) || !C14360o3.A0K(this.A01, mx8.A01) || !C14360o3.A0K(this.A02, mx8.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (((AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }
}
