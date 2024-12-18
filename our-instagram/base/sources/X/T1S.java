package X;

/* loaded from: classes10.dex */
public final class T1S implements InterfaceC65498TlM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public T1S(C4Q9 c4q9, C64082Syy c64082Syy, int i) {
        this.A00 = i;
        this.A01 = c64082Syy;
        this.A02 = c4q9;
    }

    @Override // X.InterfaceC65498TlM
    public final void DG6(Integer num) {
        Runnable tkc;
        int i = this.A00;
        C64082Syy c64082Syy = (C64082Syy) this.A01;
        if (i != 0) {
            tkc = new TKE(this);
        } else {
            tkc = new TKC(this);
        }
        C64082Syy.A03(c64082Syy, tkc);
    }

    @Override // X.InterfaceC65498TlM
    public final void Dpi(long j) {
        Runnable tkb;
        int i = this.A00;
        C64082Syy c64082Syy = (C64082Syy) this.A01;
        if (i != 0) {
            tkb = new TKD(this);
        } else {
            tkb = new TKB(this);
        }
        C64082Syy.A03(c64082Syy, tkb);
    }
}
