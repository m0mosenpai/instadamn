package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BJv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25352BJv extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC09390do A02;

    public C25352BJv(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, "clips_viewer_survey")));
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(this, 8));
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167017dG.A1N(c120985dq, obj2);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c38321qM.A3x();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C37695GiW c37695GiW = (C37695GiW) this.A02.getValue();
        if (c37695GiW != null) {
            AbstractC25231BEo.A1D(c120985dq, c37644Ghd, this.A01, c37695GiW, A1a);
        }
    }
}
