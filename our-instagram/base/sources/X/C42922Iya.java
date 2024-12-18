package X;

/* renamed from: X.Iya, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42922Iya implements JI6 {
    public final JID A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16660sJ A05;

    @Override // X.JI6
    public final JID BUL() {
        return this.A00;
    }

    @Override // X.JI6
    public final C38321qM Byj() {
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ != null) {
            return (C38321qM) interfaceC16820sZ.invoke();
        }
        return null;
    }

    @Override // X.JI6
    public final C41726Idx C02() {
        return (C41726Idx) this.A02.invoke();
    }

    @Override // X.JI6
    public final void EZF(JID jid) {
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(jid);
        }
    }

    @Override // X.JI6
    public final void Eec(C38321qM c38321qM) {
        InterfaceC16660sJ interfaceC16660sJ = this.A04;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c38321qM);
        }
    }

    @Override // X.JI6
    public final void Eej(C41726Idx c41726Idx) {
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c41726Idx);
        }
    }

    public C42922Iya(JID jid, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        this.A02 = interfaceC16820sZ;
        this.A00 = jid;
        this.A01 = interfaceC16820sZ2;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A05 = interfaceC16660sJ3;
    }
}
