package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BJt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25350BJt extends AbstractC64162vb {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC09390do A03;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C75113Zb c75113Zb;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (c75113Zb = c37644Ghd.A0E) != null) {
            UserSession userSession = this.A00;
            int position = c75113Zb.getPosition();
            int i = c75113Zb.A03;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82623mQ.A01(userSession, this.A01, c38321qM, interfaceC60442pS, c75113Zb, null, null, null, position, i);
            C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
            if (c37695GiW != null) {
                c37695GiW.A05(c120985dq, interfaceC60442pS.getModuleName(), c75113Zb.getPosition(), false);
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C75113Zb c75113Zb;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (c75113Zb = c37644Ghd.A0E) != null) {
            UserSession userSession = this.A00;
            int position = c75113Zb.getPosition();
            int i = c75113Zb.A03;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82623mQ.A02(userSession, this.A01, c38321qM, interfaceC60442pS, null, null, position, i);
            C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
            if (c37695GiW != null) {
                c37695GiW.A05(c120985dq, interfaceC60442pS.getModuleName(), c75113Zb.getPosition(), A1a);
            }
        }
    }

    public C25350BJt(UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS) {
        super(AbstractC62712tA.A00(userSession).A00());
        this.A02 = interfaceC60442pS;
        this.A01 = c30w;
        this.A00 = userSession;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(this, 4));
    }
}
