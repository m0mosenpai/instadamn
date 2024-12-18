package X;

/* renamed from: X.31k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C671931k implements InterfaceC672031l {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final InterfaceC62242sP A04;

    @Override // X.InterfaceC672031l
    public final int BS8() {
        return this.A02;
    }

    @Override // X.InterfaceC672031l
    public final int BS9() {
        return this.A03;
    }

    @Override // X.InterfaceC672031l
    public final void CtE(int i, Object obj) {
        InterfaceC62242sP interfaceC62242sP = this.A04;
        if (interfaceC62242sP.CdX(obj)) {
            this.A00 = i;
            this.A02 = 0;
        } else {
            if (!interfaceC62242sP.CZK(obj)) {
                return;
            }
            this.A01 = i;
            this.A03 = 0;
        }
    }

    @Override // X.InterfaceC672031l
    public final void CtP(int i) {
        if (i >= this.A00) {
            this.A02++;
        }
    }

    @Override // X.InterfaceC672031l
    public final void CtQ(int i) {
        if (i >= this.A01) {
            this.A03++;
        }
    }

    public C671931k(InterfaceC62242sP interfaceC62242sP) {
        this.A04 = interfaceC62242sP;
    }
}
