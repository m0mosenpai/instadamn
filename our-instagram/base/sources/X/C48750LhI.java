package X;

/* renamed from: X.LhI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48750LhI implements InterfaceC50492MQu {
    public final /* synthetic */ L90 A00;

    public C48750LhI(L90 l90) {
        this.A00 = l90;
    }

    @Override // X.InterfaceC50492MQu
    public final void D01() {
        C45999KXn c45999KXn = this.A00.A03;
        c45999KXn.A0R();
        c45999KXn.A0Y(null);
    }

    @Override // X.InterfaceC50492MQu
    public final void D9m(long j) {
        C45999KXn c45999KXn = this.A00.A03;
        if (j != 0) {
            c45999KXn.A0N(C49454LtS.A00, 0L);
            c45999KXn.A05.A08(j);
            C45999KXn.A05(C45999KXn.A01(c45999KXn), c45999KXn, 15.0f, 250L, true, true, false);
        }
    }

    @Override // X.InterfaceC50492MQu
    public final void Dxz(String str) {
        C45999KXn c45999KXn = this.A00.A03;
        c45999KXn.A05.A0B(str);
        c45999KXn.A0M(new C49459LtX(1.0f));
    }

    @Override // X.InterfaceC50492MQu
    public final void ElJ() {
        LHE.A02(this.A00.A00, EnumC46180KcI.A06);
    }
}
