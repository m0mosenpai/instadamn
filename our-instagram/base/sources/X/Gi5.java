package X;

import android.content.Context;
import android.view.View;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class Gi5 implements InterfaceC31165Dn9, InterfaceC31022DkL {
    public BKS A00;
    public InterfaceC16610sE A01;
    public final UserSession A02;
    public final C75473aE A03;
    public final BM8 A04;
    public final InterfaceC31022DkL A05;
    public final C37522Gfe A06;

    @Override // X.InterfaceC31165Dn9
    public final View.OnTouchListener Adj(Context context, C120985dq c120985dq) {
        C38321qM c38321qM;
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A01 == EnumC129395t1.A03 || (c38321qM = c120985dq.A02) == null) {
            return null;
        }
        CJZ(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A04);
        return new C105174oX(context, this.A02, c38321qM, C05F.A00, this.A06.getModuleName());
    }

    @Override // X.InterfaceC31165Dn9
    public final void CJJ(C8JW c8jw, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        InterfaceC16610sE interfaceC16610sE;
        C38321qM c38321qM;
        long j;
        Long l;
        Long l2;
        BQL bql;
        EnumC120795dP enumC120795dP;
        String attributionAppId;
        Long A0j;
        Long A04;
        String str;
        C14360o3.A0B(c120985dq, 0);
        AbstractC25233BEq.A0v(1, c37644Ghd, clipsViewerConfig, c8jw);
        if (c120985dq.A01 != EnumC129395t1.A03 && (interfaceC16610sE = this.A01) != null && AbstractC166987dD.A1a(interfaceC16610sE.invoke(c120985dq, clipsViewerConfig, c8jw)) && (c38321qM = c120985dq.A02) != null) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null && (A04 = AbstractC117245Sj.A04(A0u)) != null) {
                String A0j2 = AbstractC167017dG.A0j();
                String A0j3 = AbstractC167017dG.A0j();
                InterfaceC84063oq Adx = A0u.Adx();
                C37522Gfe c37522Gfe = this.A06;
                UserSession userSession = this.A02;
                EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0G;
                long longValue = A04.longValue();
                long A06 = c37644Ghd.A06();
                String str2 = c37522Gfe.A03.A01;
                String str3 = c37522Gfe.A04;
                C8JW c8jw2 = C8JW.A09;
                if (Adx != null) {
                    str = Adx.getBestAudioClusterId();
                } else {
                    str = null;
                }
                AbstractC37670Gi3.A0K(enumC39652Hih, c8jw2, c37522Gfe, userSession, c38321qM, clipsViewerConfig.A0S, Boolean.valueOf(AbstractC76643c9.A0H(userSession, c38321qM)), Boolean.valueOf(AbstractC76643c9.A0K(c38321qM)), Boolean.valueOf(AbstractC37302Gc3.A1b(c38321qM)), null, A0j2, str2, str3, A0j3, str, null, longValue, A06);
            }
            C37522Gfe c37522Gfe2 = this.A06;
            UserSession userSession2 = this.A02;
            C37604Ggz c37604Ggz = c37522Gfe2.A03;
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l = AbstractC166997dE.A0j(attributionAppId);
            } else {
                l = null;
            }
            User A2E = c38321qM.A2E(userSession2);
            if (A2E != null) {
                l2 = AbstractC25231BEo.A0k(A2E);
            } else {
                l2 = null;
            }
            String A1G = AbstractC25226BEj.A1G(c38321qM);
            int A062 = c37644Ghd.A06();
            boolean A0K = AbstractC76643c9.A0K(c38321qM);
            boolean A1b = AbstractC37302Gc3.A1b(c38321qM);
            if (A0K) {
                if (A1b) {
                    bql = BQL.A0D;
                } else {
                    bql = BQL.A0C;
                }
            } else if (A1b) {
                bql = BQL.A09;
            } else {
                bql = BQL.A0B;
            }
            boolean A0K2 = AbstractC76643c9.A0K(c38321qM);
            if (AbstractC37302Gc3.A1b(c38321qM)) {
                enumC120795dP = EnumC120795dP.A04;
            } else if (A0K2) {
                enumC120795dP = EnumC120795dP.A05;
            } else {
                enumC120795dP = EnumC120795dP.A02;
            }
            AbstractC37670Gi3.A08(enumC120795dP, bql, c37522Gfe2, userSession2, c37604Ggz, 0, l, l2, A1G, A062, j);
            CJZ(c120985dq, EnumC37860GlF.A04, EnumC37861GlG.A04);
        }
    }

    @Override // X.InterfaceC31165Dn9
    public final void CJK(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        C38321qM c38321qM;
        BQL bql;
        EnumC120795dP enumC120795dP;
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        C75473aE c75473aE = this.A03;
        c75473aE.A01 = false;
        c75473aE.A02 = null;
        if (c120985dq.A01 != EnumC129395t1.A03 && (c38321qM = c120985dq.A02) != null) {
            boolean A0K = AbstractC76643c9.A0K(c38321qM);
            boolean A1b = AbstractC37302Gc3.A1b(c38321qM);
            if (A0K) {
                if (A1b) {
                    bql = BQL.A0D;
                } else {
                    bql = BQL.A0C;
                }
            } else if (A1b) {
                bql = BQL.A09;
            } else if (z) {
                bql = BQL.A0h;
            } else {
                bql = BQL.A0B;
            }
            if (bql != BQL.A0B) {
                C37522Gfe c37522Gfe = this.A06;
                UserSession userSession = this.A02;
                C37604Ggz c37604Ggz = c37522Gfe.A03;
                int A06 = c37644Ghd.A06();
                boolean A0K2 = AbstractC76643c9.A0K(c38321qM);
                if (AbstractC37302Gc3.A1b(c38321qM)) {
                    enumC120795dP = EnumC120795dP.A04;
                } else if (A0K2) {
                    enumC120795dP = EnumC120795dP.A05;
                } else {
                    enumC120795dP = EnumC120795dP.A02;
                }
                AbstractC37670Gi3.A06(enumC120795dP, bql, c120985dq, c37522Gfe, userSession, c38321qM, c37604Ggz, 0, A06);
            }
        }
    }

    @Override // X.InterfaceC31165Dn9
    public final void CKP(C120985dq c120985dq, C37644Ghd c37644Ghd, int i, boolean z) {
        BKS bks;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C37522Gfe c37522Gfe = this.A06;
            AbstractC37670Gi3.A0A(EnumC120795dP.A02, BQL.A0B, this.A02, c38321qM, c37522Gfe, c37522Gfe.A03, c37644Ghd.A06());
            if (z && (bks = this.A00) != null) {
                bks.A00.A01(c120985dq, c37644Ghd, c38321qM, c37644Ghd.A06(), !c120985dq.CdW());
            }
        }
    }

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A05.ER9(interfaceC16610sE);
    }

    public Gi5(UserSession userSession, BM8 bm8, InterfaceC31022DkL interfaceC31022DkL, C37522Gfe c37522Gfe) {
        this.A04 = bm8;
        this.A02 = userSession;
        this.A06 = c37522Gfe;
        this.A05 = interfaceC31022DkL;
        this.A03 = (C75473aE) userSession.A01(C75473aE.class, new C57526Pg0(userSession, 35));
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A05.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.InterfaceC31165Dn9
    public final void EXB(InterfaceC16610sE interfaceC16610sE) {
        this.A01 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31165Dn9
    public final void EXE(BKS bks) {
        this.A00 = bks;
    }
}
