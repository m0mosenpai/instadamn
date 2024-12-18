package X;

/* renamed from: X.9Wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211429Wq extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2 {
    public final boolean A00;
    public final boolean A01;

    @Override // X.AbstractC63223SfY, X.InterfaceC65639Tq2
    public final void Cso(QF6 qf6) {
        InterfaceC172717mh interfaceC172717mh;
        VD2 vd2;
        if (this.A01) {
            interfaceC172717mh = this.A03;
            if (interfaceC172717mh != null) {
                vd2 = VD2.A05;
            } else {
                return;
            }
        } else if (!this.A00 || (interfaceC172717mh = this.A03) == null) {
            return;
        } else {
            vd2 = VD2.A03;
        }
        interfaceC172717mh.FD0(vd2, C05F.A0Y);
    }

    public C211429Wq(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
