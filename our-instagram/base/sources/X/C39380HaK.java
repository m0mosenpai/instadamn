package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.HaK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39380HaK extends AbstractC64292vo {
    public final C18920wW A00;
    public final InterfaceC60442pS A01;
    public final UserSession A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        OUA oua = (OUA) obj;
        String str = oua.A02;
        C115785Lr c115785Lr = (C115785Lr) C115775Lq.A02.get(str);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            if (c115785Lr != null && AbstractC31171DnF.A1b(c115785Lr.A01)) {
                C14360o3.A06(obj);
                LinkedHashMap A02 = AbstractC77703du.A02(str);
                if (!A02.isEmpty()) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_rendering_validation_automatic");
                    if (A0f.isSampled()) {
                        C51442Mno c51442Mno = oua.A00;
                        A0f.AAP("ad_id", oua.A01);
                        A0f.AAP("a_pk", oua.A04);
                        AbstractC37300Gc1.A0l(A0f, str);
                        AbstractC37300Gc1.A0o(A0f, oua.A03);
                        A0f.AAP("source_of_action", this.A01.getModuleName());
                        A0f.AAP("fb_locale", C1Q2.A00());
                        A0f.AAP("country", C1Q2.A02().getCountry());
                        A0f.A9M("pc_component_dict_new", A02);
                        AbstractC37303Gc4.A0b(A0f);
                        A0f.AAQ(c51442Mno, "lead_gen_info");
                        A0f.Cht();
                    }
                }
            }
            C115775Lq.A03(str);
            return;
        }
        A02(c59062n7, interfaceC57162jr, str, false);
    }

    public C39380HaK(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(userSession);
        this.A02 = userSession;
        this.A01 = interfaceC60442pS;
        this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
    }
}
