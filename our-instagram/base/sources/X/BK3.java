package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BK3 extends AbstractC64162vb {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC09390do A03;

    public BK3(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(C1BX.A03.A01(new C681034y(userSession, "clips_viewer_qp")));
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A01 = new C30W(userSession, null);
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(this, 6));
    }

    private final void A00(C120985dq c120985dq) {
        String id;
        C3x9 A0u;
        C5HN BYO;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (id = c38321qM.getId()) != null && (A0u = AbstractC25226BEj.A0u(c38321qM)) != null && (BYO = A0u.BYO()) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A02, this.A00), "instagram_new_reels_impression");
            A0f.A9K("qp_id", Long.valueOf(BYO.BjK()));
            A0f.AAP("m_pk", id);
            A0f.Cht();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C38321qM c38321qM;
        C75113Zb c75113Zb;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0I && (c38321qM = c120985dq.A02) != null && (c75113Zb = c37644Ghd.A0E) != null) {
            UserSession userSession = this.A00;
            if (AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36329964420743771L).booleanValue()) {
                C41712Idi.A00(userSession).A01(c120985dq, null, c37644Ghd.A06());
            }
            int position = c75113Zb.getPosition();
            int i = c75113Zb.A03;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82623mQ.A01(userSession, this.A01, c38321qM, interfaceC60442pS, c75113Zb, null, null, null, position, i);
            A00(c120985dq);
            C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
            if (c37695GiW != null) {
                AbstractC25231BEo.A1D(c120985dq, c37644Ghd, interfaceC60442pS, c37695GiW, false);
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C38321qM c38321qM;
        C75113Zb c75113Zb;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0I && (c38321qM = c120985dq.A02) != null && (c75113Zb = c37644Ghd.A0E) != null) {
            UserSession userSession = this.A00;
            int position = c75113Zb.getPosition();
            int i = c75113Zb.A03;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82623mQ.A02(userSession, this.A01, c38321qM, interfaceC60442pS, null, null, position, i);
            A00(c120985dq);
            C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
            if (c37695GiW != null) {
                AbstractC25231BEo.A1D(c120985dq, c37644Ghd, interfaceC60442pS, c37695GiW, A1a);
            }
        }
    }
}
