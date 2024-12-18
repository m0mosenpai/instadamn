package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BK0 extends AbstractC64162vb {
    public final C07T A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC09390do A03;

    public BK0(C07T c07t, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, "clips_viewer_halfcard")));
        this.A00 = c07t;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(this, 1));
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        AbstractC166987dD.A1Z(new PXT(this, null, 8), AbstractC57302k5.A00(this.A00));
        UserSession userSession = this.A01;
        if (AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36329964420743771L).booleanValue()) {
            C41712Idi.A00(userSession).A01(c120985dq, null, c37644Ghd.A06());
        }
        C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
        if (c37695GiW != null) {
            AbstractC25231BEo.A1D(c120985dq, c37644Ghd, this.A02, c37695GiW, false);
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
        if (c37695GiW != null) {
            AbstractC25231BEo.A1D(c120985dq, c37644Ghd, this.A02, c37695GiW, A1a);
        }
    }
}
