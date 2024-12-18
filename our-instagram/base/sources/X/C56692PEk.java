package X;

/* renamed from: X.PEk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56692PEk implements InterfaceC58126Ppp {
    public final /* synthetic */ NTR A00;

    @Override // X.InterfaceC58126Ppp
    public final void DiV() {
    }

    public C56692PEk(NTR ntr) {
        this.A00 = ntr;
    }

    @Override // X.InterfaceC58126Ppp
    public final void DiW() {
        NTR ntr = this.A00;
        ntr.A09.A02(0L);
        ntr.A08.A00.A00(new C56575P9x(C05F.A00));
    }

    @Override // X.InterfaceC58126Ppp
    public final void DiX() {
        NTR ntr = this.A00;
        String str = ntr.A02;
        if (str != null) {
            AbstractC54900OPv.A00(ntr.A03, ntr.A05, null, str, false);
            ntr.A09.A01();
            ntr.A08.A00.A00(new C56576P9y(C05F.A00));
        }
    }
}
