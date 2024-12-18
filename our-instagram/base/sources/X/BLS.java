package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BLS implements InterfaceC31074DlG, InterfaceC31022DkL {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;
    public InterfaceC16620sF A02;
    public InterfaceC16610sE A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final SearchContext A06;
    public final InterfaceC43589JPu A07;
    public final C26914BuH A08;
    public final InterfaceC31022DkL A09;
    public final IG5 A0A;

    @Override // X.InterfaceC31074DlG
    public final void DFG(BL0 bl0) {
        C14360o3.A0B(bl0, 0);
        User user = bl0.A04;
        C38321qM c38321qM = bl0.A01;
        UserSession userSession = this.A05;
        C1571673v.A07(this.A04, userSession, C1571673v.A00(userSession, user), "follow", user.getId(), c38321qM.getId(), c38321qM.CAR());
    }

    @Override // X.InterfaceC31074DlG
    public final void DHw(BL0 bl0) {
        C14360o3.A0B(bl0, 0);
        UserSession userSession = this.A05;
        C37813GkT A00 = AbstractC37802GkH.A00(MusicPageTabType.A04, userSession);
        C38321qM c38321qM = bl0.A01;
        A00.A01(AbstractC25226BEj.A0u(c38321qM), userSession, "follow_creator", this.A04.getModuleName());
        CJZ(bl0.A00, EnumC37860GlF.A03, EnumC37861GlG.A0G);
        C57582kX A002 = C57582kX.A00(userSession);
        User user = bl0.A04;
        boolean A1X = AbstractC167007dF.A1X(A002.A0N(user), FollowStatus.A05);
        InterfaceC16620sF interfaceC16620sF = this.A02;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(Boolean.valueOf(A1X), user.getUsername());
        }
        if (A1X) {
            AbstractC54029Nuf.A00(userSession).A01();
            C26914BuH c26914BuH = this.A08;
            if (c26914BuH != null) {
                C26914BuH.A02(c26914BuH, C05F.A00, c38321qM.getId());
            }
        }
    }

    @Override // X.InterfaceC31074DlG
    public final void DwY(C75113Zb c75113Zb, BL0 bl0) {
        Long l;
        InterfaceC16610sE interfaceC16610sE = this.A03;
        if (interfaceC16610sE != null) {
            C38321qM c38321qM = bl0.A01;
            AbstractC25227BEk.A1N(c38321qM, Boolean.valueOf(c38321qM.A4j()), interfaceC16610sE, true);
            InterfaceC11380iw interfaceC11380iw = this.A04;
            long position = c75113Zb.getPosition();
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            String str = null;
            if (A0u != null) {
                l = AbstractC117245Sj.A04(A0u);
            } else {
                l = null;
            }
            UserSession userSession = this.A05;
            OOQ.A01(interfaceC11380iw, userSession, c38321qM, this.A06, this.A07, l, this.A0A.A00, position);
            ArrayList A3Q = c38321qM.A3Q();
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str = A2E.getId();
            }
            if (A3Q != null && !A3Q.isEmpty() && OWJ.A00.A01(userSession, str, c38321qM.A5P()) && !c38321qM.A4j()) {
                ArrayList A1E = AbstractC166987dD.A1E();
                ArrayList A3M = c38321qM.A3M();
                if (A3M != null) {
                    A1E.addAll(A3M);
                }
                A1E.addAll(A3Q);
                if (AbstractC25226BEj.A1b(A1E)) {
                    AnonymousClass426.A00.A08(userSession, c38321qM.getId(), AbstractC166997dE.A0o(), AbstractC111324zv.A00(178), A1E);
                }
            }
        }
    }

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A09.ER9(interfaceC16610sE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.DkL, java.lang.Object] */
    public /* synthetic */ BLS(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, C26914BuH c26914BuH, IG5 ig5) {
        ?? obj = new Object();
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A0A = ig5;
        this.A07 = interfaceC43589JPu;
        this.A06 = searchContext;
        this.A08 = c26914BuH;
        this.A09 = obj;
    }

    @Override // X.InterfaceC31074DlG
    public final void DR8(C75113Zb c75113Zb, BL0 bl0) {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(bl0.A01);
        }
    }

    @Override // X.InterfaceC31074DlG
    public final void DX4(C75113Zb c75113Zb, BL0 bl0) {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(bl0.A01);
        }
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A09.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.InterfaceC31074DlG
    public final void EXc(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31074DlG
    public final void EXd(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31074DlG
    public final void EXe(InterfaceC16610sE interfaceC16610sE) {
        this.A03 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31074DlG
    public final void EZq(InterfaceC16620sF interfaceC16620sF) {
        this.A02 = interfaceC16620sF;
    }
}
