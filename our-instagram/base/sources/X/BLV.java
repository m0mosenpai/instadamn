package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLV implements InterfaceC31053Dkt {
    public InterfaceC16660sJ A00;
    public InterfaceC16620sF A01;
    public final BMN A02;
    public final BMO A03;

    public BLV(BMN bmn, BMO bmo) {
        C14360o3.A0B(bmn, 2);
        this.A03 = bmo;
        this.A02 = bmn;
    }

    @Override // X.InterfaceC31053Dkt
    public final void D5a(BL5 bl5, InterfaceC16820sZ interfaceC16820sZ) {
        Object invoke;
        InterfaceC16620sF interfaceC16620sF;
        C14360o3.A0B(bl5, 0);
        BMO bmo = this.A03;
        String str = bl5.A01;
        C14360o3.A0B(str, 0);
        UserSession userSession = bmo.A00;
        if (!C14360o3.A0K(userSession.userId, str) && OOI.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36316065908199364L) && (invoke = interfaceC16820sZ.invoke()) != null && (interfaceC16620sF = this.A01) != null) {
            interfaceC16620sF.invoke(invoke, bl5.A02);
        }
    }

    @Override // X.InterfaceC31053Dkt
    public final void D5c(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c38321qM);
            BMN bmn = this.A02;
            UserSession userSession = bmn.A01;
            AnonymousClass229.A01(userSession);
            InterfaceC43589JPu interfaceC43589JPu = bmn.A02;
            InterfaceC11380iw interfaceC11380iw = bmn.A00;
            InterfaceC02590Ai A10 = AbstractC25232BEp.A10(interfaceC11380iw, userSession);
            if (A10.isSampled()) {
                A10.AAP("organic_tap_action", "close_friends_tap");
                A10.AAP("organic_tap_action_source", "close_friends_cta");
                AbstractC25229BEm.A1A(A10, interfaceC11380iw);
                AbstractC25229BEm.A19(A10, 0);
                AbstractC25225BEi.A1P(A10, interfaceC43589JPu.CGJ());
                String A2u = c38321qM.A2u();
                A2u.getClass();
                AbstractC25236BEt.A0r(A10, A2u);
                AbstractC25230BEn.A1D(A10, Long.parseLong(AbstractC25226BEj.A14(c38321qM).getId()));
                A10.AAP("chaining_session_id", interfaceC43589JPu.Amq());
                A10.Cht();
            }
        }
    }

    @Override // X.InterfaceC31053Dkt
    public final void EXp(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31053Dkt
    public final void EeE(InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
    }
}
