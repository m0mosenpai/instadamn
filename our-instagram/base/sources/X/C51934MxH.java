package X;

/* renamed from: X.MxH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51934MxH extends C0T6 implements InterfaceC57874Ple {
    public final C41181vS A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51934MxH) {
                C51934MxH c51934MxH = (C51934MxH) obj;
                if (!C14360o3.A0K(this.A00, c51934MxH.A00) || this.A01 != c51934MxH.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC54143Nwf.A00(this.A01)) * 31 * 31) + AbstractC53644Nnp.A00();
    }

    public C51934MxH(C41181vS c41181vS, Integer num) {
        AbstractC167017dG.A1P(c41181vS, num);
        this.A00 = c41181vS;
        this.A01 = num;
    }
}
