package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BLN implements InterfaceC31059Dl1 {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;
    public InterfaceC16660sJ A02;
    public InterfaceC16620sF A03;
    public InterfaceC16610sE A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final SearchContext A07;
    public final InterfaceC43589JPu A08;
    public final IG5 A09;

    public BLN(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, IG5 ig5) {
        C14360o3.A0B(interfaceC43589JPu, 4);
        this.A05 = interfaceC11380iw;
        this.A06 = userSession;
        this.A07 = searchContext;
        this.A08 = interfaceC43589JPu;
        this.A09 = ig5;
    }

    public final void A00(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        Long l;
        InterfaceC16610sE interfaceC16610sE = this.A04;
        if (interfaceC16610sE != null) {
            AbstractC25227BEk.A1N(c38321qM, Boolean.valueOf(z), interfaceC16610sE, false);
            InterfaceC11380iw interfaceC11380iw = this.A05;
            long position = c75113Zb.getPosition();
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null) {
                l = AbstractC117245Sj.A04(A0u);
            } else {
                l = null;
            }
            UserSession userSession = this.A06;
            OOQ.A01(interfaceC11380iw, userSession, c38321qM, this.A07, this.A08, l, this.A09.A00, position);
            String id = c38321qM.getId();
            ArrayList A02 = AnonymousClass426.A02(AbstractC76193bO.A04(userSession, c38321qM, c75113Zb));
            if (AnonymousClass426.A04(A02)) {
                AnonymousClass426.A03(null, EnumC53372NjN.CROSSPOST_CLIP_WITH_FB_TAGS_TAG_PILL_CLICK, null, userSession, userSession.userId, id, null, AnonymousClass426.A01(id, A02), null);
            }
            ArrayList A3Q = c38321qM.A3Q();
            String A0t = AbstractC25231BEo.A0t(c38321qM.A2E(userSession));
            if (A3Q != null && !A3Q.isEmpty() && OWJ.A00.A01(userSession, A0t, c38321qM.A5P()) && !z) {
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

    @Override // X.InterfaceC31059Dl1
    public final void EXs(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXv(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXw(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A04 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXx(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A03 = interfaceC16620sF;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXy(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A02 = interfaceC16660sJ;
    }
}
