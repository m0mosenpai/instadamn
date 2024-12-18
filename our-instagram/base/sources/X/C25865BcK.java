package X;

import com.instagram.user.model.User;

/* renamed from: X.BcK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25865BcK extends AbstractC52922bZ {
    public final C27268C1l A00;
    public final C38321qM A01;
    public final String A02;
    public final InterfaceC19390xP A03;
    public final InterfaceC06180Ui A04;
    public final C05A A05;
    public final C0UO A06;
    public final HYF A07;

    public static final void A00(C25865BcK c25865BcK, int i) {
        Object value;
        boolean z;
        boolean z2;
        InterfaceC30810Dgl interfaceC30810Dgl;
        AbstractC27827COq abstractC27827COq;
        C05A c05a = c25865BcK.A05;
        do {
            value = c05a.getValue();
            C26085BgE c26085BgE = (C26085BgE) value;
            z = true;
            if (i <= 1) {
                z = false;
            }
            z2 = c26085BgE.A04;
            interfaceC30810Dgl = (InterfaceC30810Dgl) c26085BgE.A02;
            abstractC27827COq = (AbstractC27827COq) c26085BgE.A01;
            AbstractC167017dG.A1R(interfaceC30810Dgl, abstractC27827COq);
        } while (!c05a.AIi(value, new C26085BgE(abstractC27827COq, interfaceC30810Dgl, z2, z)));
    }

    public final void A01(InterfaceC30811Dgm interfaceC30811Dgm) {
        Object value;
        boolean z;
        InterfaceC30810Dgl interfaceC30810Dgl;
        AbstractC27827COq abstractC27827COq;
        C141796aw A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        Object value2;
        boolean z2;
        InterfaceC30810Dgl interfaceC30810Dgl2;
        AbstractC27827COq abstractC27827COq2;
        if (interfaceC30811Dgm instanceof C23823AgY) {
            C05A c05a = this.A05;
            do {
                value2 = c05a.getValue();
                C26085BgE c26085BgE = (C26085BgE) value2;
                interfaceC23621Ds = null;
                z2 = c26085BgE.A03;
                interfaceC30810Dgl2 = (InterfaceC30810Dgl) c26085BgE.A02;
                abstractC27827COq2 = (AbstractC27827COq) c26085BgE.A01;
                AbstractC167017dG.A1R(interfaceC30810Dgl2, abstractC27827COq2);
            } while (!c05a.AIi(value2, new C26085BgE(abstractC27827COq2, interfaceC30810Dgl2, false, z2)));
            A00 = AbstractC141776au.A00(this);
            i = 23;
        } else if (interfaceC30811Dgm instanceof C29224CuT) {
            A00 = AbstractC141776au.A00(this);
            interfaceC23621Ds = null;
            i = 24;
        } else {
            if (interfaceC30811Dgm instanceof C23822AgX) {
                C05A c05a2 = this.A05;
                do {
                    value = c05a2.getValue();
                    C26085BgE c26085BgE2 = (C26085BgE) value;
                    z = c26085BgE2.A03;
                    interfaceC30810Dgl = (InterfaceC30810Dgl) c26085BgE2.A02;
                    abstractC27827COq = (AbstractC27827COq) c26085BgE2.A01;
                    AbstractC167017dG.A1R(interfaceC30810Dgl, abstractC27827COq);
                } while (!c05a2.AIi(value, new C26085BgE(abstractC27827COq, interfaceC30810Dgl, true, z)));
                return;
            }
            if (interfaceC30811Dgm instanceof C29225CuU) {
                C27268C1l c27268C1l = this.A00;
                C05A c05a3 = c27268C1l.A02;
                do {
                } while (!c05a3.AIi(c05a3.getValue(), c27268C1l.A00.next()));
                return;
            }
            throw B4Z.A00();
        }
        AbstractC166987dD.A1Z(new C25024B5f(this, interfaceC23621Ds, i), A00);
    }

    public C25865BcK(C27268C1l c27268C1l, HYF hyf, String str) {
        C38321qM c38321qM;
        InterfaceC30810Dgl interfaceC30810Dgl;
        String str2;
        InterfaceC31134DmH Bie;
        String text;
        this.A00 = c27268C1l;
        this.A07 = hyf;
        this.A02 = str;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A04 = A00;
        this.A03 = A00;
        if (str != null) {
            c38321qM = AbstractC25229BEm.A0h(hyf.A01, str);
        } else {
            c38321qM = null;
        }
        this.A01 = c38321qM;
        if (c38321qM != null && AbstractC25226BEj.A14(c38321qM) != null) {
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null) {
                str2 = A14.getUsername();
            } else {
                str2 = null;
            }
            String str3 = "";
            str2 = str2 == null ? "" : str2;
            InterfaceC31135DmI BfC = c38321qM.A0C.BfC();
            if (BfC != null && (Bie = BfC.Bie()) != null && (text = Bie.getText()) != null) {
                str3 = text;
            }
            interfaceC30810Dgl = new C23818AgT(str2, str3);
        } else {
            interfaceC30810Dgl = C29223CuS.A00;
        }
        C008002u A1H = AbstractC25225BEi.A1H(new C26085BgE((AbstractC27827COq) c27268C1l.A04.getValue(), interfaceC30810Dgl));
        this.A05 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new C25024B5f(this, null, 22), AbstractC141776au.A00(this));
    }
}
