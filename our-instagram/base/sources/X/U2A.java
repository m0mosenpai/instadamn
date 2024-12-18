package X;

/* loaded from: classes11.dex */
public final class U2A implements XBD {
    public final /* synthetic */ AbstractC65919TwQ A00;

    public U2A(AbstractC65919TwQ abstractC65919TwQ) {
        this.A00 = abstractC65919TwQ;
    }

    @Override // X.XBD
    public final void Djn() {
        String str;
        AbstractC65919TwQ abstractC65919TwQ = this.A00;
        C66157U1y c66157U1y = abstractC65919TwQ.A0C;
        if (c66157U1y != null) {
            String str2 = abstractC65919TwQ.A01.A01;
            C14360o3.A0B(str2, 0);
            c66157U1y.A00.add(str2);
            InterfaceC190488c6 A0F = abstractC65919TwQ.A0F();
            String E6d = abstractC65919TwQ.A0i.E6d();
            if (E6d != null) {
                A0F.CkP(E6d, abstractC65919TwQ.A0k.E6U());
                C65960TxC c65960TxC = abstractC65919TwQ.A07;
                if (c65960TxC == null) {
                    str = "dataSource";
                } else {
                    C65963TxG.A00(c65960TxC, abstractC65919TwQ);
                    U1U u1u = abstractC65919TwQ.A06;
                    if (u1u != null) {
                        u1u.A02();
                        return;
                    }
                    return;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            str = "seeMoreController";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
