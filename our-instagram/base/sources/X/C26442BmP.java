package X;

/* renamed from: X.BmP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26442BmP extends AbstractC51572Yf {
    public final long A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final InterfaceC31021DkK A03;
    public final InterfaceC30884Dhx A04;

    public C26442BmP(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31021DkK interfaceC31021DkK, InterfaceC30884Dhx interfaceC30884Dhx, long j) {
        AbstractC25234BEr.A0j(2, c120985dq, c37644Ghd, interfaceC31021DkK, interfaceC30884Dhx);
        this.A00 = j;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A03 = interfaceC31021DkK;
        this.A04 = interfaceC30884Dhx;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C38321qM c38321qM = this.A01.A02;
        C75113Zb c75113Zb = this.A02.A0E;
        InterfaceC30884Dhx interfaceC30884Dhx = this.A04;
        if (interfaceC30884Dhx instanceof D0M) {
            return null;
        }
        if (interfaceC30884Dhx instanceof BLD) {
            return new C26417Bm0(c38321qM, c75113Zb, this.A03, this.A00);
        }
        throw B4Z.A00();
    }
}
