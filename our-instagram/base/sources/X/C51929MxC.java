package X;

/* renamed from: X.MxC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51929MxC extends C0T6 implements InterfaceC57871Plb {
    public final C41181vS A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51929MxC) {
                C51929MxC c51929MxC = (C51929MxC) obj;
                if (!C14360o3.A0K(this.A00, c51929MxC.A00) || this.A01 != c51929MxC.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC54143Nwf.A00(this.A01)) * 31 * 31) + AbstractC53644Nnp.A00();
    }

    public C51929MxC(C41181vS c41181vS, Integer num) {
        this.A00 = c41181vS;
        this.A01 = num;
    }
}
