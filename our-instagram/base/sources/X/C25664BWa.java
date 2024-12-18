package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BWa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25664BWa implements InterfaceC31026DkP {
    public InterfaceC16620sF A00;
    public final UserSession A01;
    public final C37522Gfe A02;

    @Override // X.InterfaceC31026DkP
    public final void CKT(C22P c22p, C38321qM c38321qM) {
        long j;
        Long l;
        Long A0j;
        InterfaceC16620sF interfaceC16620sF = this.A00;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(c38321qM, c22p);
        }
        UserSession userSession = this.A01;
        C37522Gfe c37522Gfe = this.A02;
        InterfaceC02590Ai A10 = AbstractC25232BEp.A10(c37522Gfe, userSession);
        if (A10.isSampled()) {
            C37604Ggz A0W = AbstractC25234BEr.A0W(A10, c37522Gfe, "use_template_tap");
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A10, j);
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null) {
                l = AbstractC25231BEo.A0k(A14);
            } else {
                l = null;
            }
            A10.A9K("media_author_id", l);
            A10.A8R(EnumC72417XdN.A02, "midcard_type");
            A10.AAP("chaining_session_id", A0W.A00);
            A10.Cht();
        }
    }

    public C25664BWa(UserSession userSession, C37522Gfe c37522Gfe) {
        this.A02 = c37522Gfe;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC31026DkP
    public final void EXL(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }
}
