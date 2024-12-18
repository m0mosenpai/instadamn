package X;

/* loaded from: classes5.dex */
public final class BRP extends AbstractC51572Yf {
    public final long A00;
    public final long A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final InterfaceC30883Dhw A04;
    public final InterfaceC31067Dl9 A05;

    public BRP(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC30883Dhw interfaceC30883Dhw, InterfaceC31067Dl9 interfaceC31067Dl9, long j, long j2) {
        AbstractC167027dH.A0a(1, c120985dq, c37644Ghd, interfaceC30883Dhw, interfaceC31067Dl9);
        this.A02 = c120985dq;
        this.A03 = c37644Ghd;
        this.A04 = interfaceC30883Dhw;
        this.A05 = interfaceC31067Dl9;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC30883Dhw interfaceC30883Dhw = this.A04;
        if (interfaceC30883Dhw instanceof BTW) {
            return null;
        }
        if (interfaceC30883Dhw instanceof BO4) {
            C75113Zb c75113Zb = this.A03.A0E;
            if (c75113Zb == null) {
                return null;
            }
            return new BRQ(c75113Zb, (BO4) interfaceC30883Dhw, this.A05, this.A00, this.A01);
        }
        throw B4Z.A00();
    }
}
