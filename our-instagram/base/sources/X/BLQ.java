package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BLQ implements InterfaceC31070DlC {
    public InterfaceC16740sR A00;
    public InterfaceC16660sJ A01;
    public C0s7 A02;
    public final UserSession A03;
    public final BMG A04;
    public final C37522Gfe A05;
    public final C37604Ggz A06;

    public BLQ(UserSession userSession, BMG bmg, C37522Gfe c37522Gfe, C37604Ggz c37604Ggz) {
        C14360o3.A0B(c37604Ggz, 4);
        this.A04 = bmg;
        this.A03 = userSession;
        this.A05 = c37522Gfe;
        this.A06 = c37604Ggz;
    }

    @Override // X.InterfaceC31070DlC
    public final void CJI(C120985dq c120985dq, C37644Ghd c37644Ghd, C2Fb c2Fb) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC167017dG.A1P(c37644Ghd, c2Fb);
        C0s7 c0s7 = this.A02;
        if (c0s7 != null) {
            Integer valueOf = Integer.valueOf(c37644Ghd.A06());
            Float valueOf2 = Float.valueOf(-1.0f);
            c0s7.invoke(c120985dq, c37644Ghd, valueOf, valueOf2, valueOf2, null, c2Fb, false, false);
        }
    }

    @Override // X.InterfaceC31070DlC
    public final void CJU(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC16740sR interfaceC16740sR = this.A00;
            if (interfaceC16740sR != null) {
                interfaceC16740sR.CP2(c120985dq, c37644Ghd, c120985dq.A09(this.A03), C76493bt.A01(c120985dq), null, null, "attribution_row_business_category", null, null, null, null, false, Boolean.valueOf(z), null, null, null, null);
            }
            C37522Gfe c37522Gfe = this.A05;
            UserSession userSession = this.A03;
            C37604Ggz c37604Ggz = this.A06;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            Long l2 = null;
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            }
            AbstractC37670Gi3.A08(EnumC120795dP.A02, BQL.A0L, c37522Gfe, userSession, c37604Ggz, null, l, l2, AbstractC25226BEj.A1G(c38321qM), c37644Ghd.A06(), j);
        }
    }

    @Override // X.InterfaceC31070DlC
    public final void CK2(BQL bql, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, bql);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AbstractC37670Gi3.A06(EnumC120795dP.A02, bql, c120985dq, this.A05, this.A03, c38321qM, this.A06, null, c37644Ghd.A06());
        }
    }

    @Override // X.InterfaceC31070DlC
    public final void CJV(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC16660sJ interfaceC16660sJ = this.A01;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(c120985dq);
            }
            C37522Gfe c37522Gfe = this.A05;
            UserSession userSession = this.A03;
            C37604Ggz c37604Ggz = this.A06;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            Long l2 = null;
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            }
            AbstractC37670Gi3.A08(EnumC120795dP.A02, BQL.A0M, c37522Gfe, userSession, c37604Ggz, null, l, l2, AbstractC25226BEj.A1G(c38321qM), c37644Ghd.A06(), j);
        }
    }

    @Override // X.InterfaceC31070DlC
    public final void EX9(C0s7 c0s7) {
        this.A02 = c0s7;
    }

    @Override // X.InterfaceC31070DlC
    public final void EXG(InterfaceC16740sR interfaceC16740sR) {
        this.A00 = interfaceC16740sR;
    }

    @Override // X.InterfaceC31070DlC
    public final void EXH(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
