package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bc5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25850Bc5 extends AbstractC52922bZ {
    public final UserSession A00;
    public final HYF A01;
    public final String A02;
    public final String A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;
    public final C0UO A07;

    public C25850Bc5(UserSession userSession, HYF hyf, String str, String str2) {
        C14360o3.A0B(hyf, 1);
        this.A01 = hyf;
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        Integer num = C05F.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C26060Bfn(BJ3.A03, EnumC77173d3.A03, num, "", "", "", C16930sl.A00, 0L, true, true));
        this.A06 = A1H;
        this.A07 = AbstractC208910l.A02(A1H);
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A05 = A00;
        this.A04 = A00;
        C141796aw A002 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new GSQ(this, null, 45), A002);
    }

    public final void A00(InterfaceC30830Dh5 interfaceC30830Dh5) {
        C19L A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        String A2u;
        InterfaceC16620sF pzq;
        if (interfaceC30830Dh5 instanceof C29345Cwe) {
            A00 = AbstractC141776au.A00(this);
            interfaceC23621Ds = null;
            i = 6;
        } else {
            if (interfaceC30830Dh5 instanceof C29343Cwc) {
                HYF hyf = this.A01;
                String str = this.A02;
                C14360o3.A0B(str, 0);
                C38321qM A0h = AbstractC25229BEm.A0h(hyf.A01, str);
                if (A0h == null || (A2u = A0h.A2u()) == null) {
                    return;
                }
                C57748Pjb c57748Pjb = new C57748Pjb(this, 15);
                A00 = ((C4A7) hyf).A01;
                pzq = new PZQ(c57748Pjb, hyf, A2u, null, 7);
                AbstractC166987dD.A1Z(pzq, A00);
            }
            if (interfaceC30830Dh5 instanceof C29344Cwd) {
                A00 = AbstractC141776au.A00(this);
                interfaceC23621Ds = null;
                i = 5;
            } else {
                throw B4Z.A00();
            }
        }
        pzq = new PZB(this, interfaceC23621Ds, i);
        AbstractC166987dD.A1Z(pzq, A00);
    }
}
