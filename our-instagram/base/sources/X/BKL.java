package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BKL extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C64842wi A02;
    public final InterfaceC09390do A03;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        if (c120985dq.A01 == EnumC129395t1.A0J) {
            this.A02.Dcq(c120985dq.A08());
            C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
            if (c37695GiW != null) {
                AbstractC25231BEo.A1D(c120985dq, c37644Ghd, this.A01, c37695GiW, false);
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C37695GiW c37695GiW = (C37695GiW) this.A03.getValue();
        if (c37695GiW != null) {
            AbstractC25231BEo.A1D(c120985dq, c37644Ghd, this.A01, c37695GiW, A1a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKL(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64842wi c64842wi) {
        super(C1BX.A03.A01(new C681034y(userSession, "clips_viewer_qp")));
        AbstractC167027dH.A13(c64842wi, interfaceC60442pS, userSession);
        this.A02 = c64842wi;
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(this, 7));
    }
}
