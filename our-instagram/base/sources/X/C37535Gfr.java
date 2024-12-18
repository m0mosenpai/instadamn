package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.Gfr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37535Gfr extends AbstractC64292vo {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C0Zx c0Zx;
        String str;
        String A0h;
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        C120985dq c120985dq = (C120985dq) obj;
        String id = c120985dq.getId();
        C115785Lr c115785Lr = (C115785Lr) C115775Lq.A02.get(id);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            if (c115785Lr != null && AbstractC31171DnF.A1b(c115785Lr.A01)) {
                C14360o3.A06(obj);
                LinkedHashMap A02 = AbstractC77703du.A02(id);
                if (!A02.isEmpty()) {
                    C138406Ow A00 = C115775Lq.A00(id);
                    AdFormatType adFormatType = c120985dq.A0E;
                    if (adFormatType != null) {
                        if (adFormatType == AdFormatType.A05) {
                            A0h = "hscroll";
                        } else {
                            A0h = AbstractC167007dF.A0h(adFormatType.name());
                        }
                        A00.A06("format_type", A0h);
                    }
                    UserSession userSession = this.A01;
                    String str2 = null;
                    if (C18U.A06(C06090Tz.A05, userSession, 36315133899508786L)) {
                        c0Zx = (C0Zx) C115775Lq.A04.get(id);
                    } else {
                        c0Zx = null;
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_rendering_validation_automatic");
                    if (A0f.isSampled()) {
                        A0f.AAP("ad_id", c120985dq.getId());
                        User user = c120985dq.A0K;
                        if (user != null) {
                            str = user.getId();
                        } else {
                            str = null;
                        }
                        String str3 = "";
                        if (str == null) {
                            str = "";
                        }
                        A0f.AAP("a_pk", str);
                        AbstractC37300Gc1.A0l(A0f, c120985dq.A0C());
                        String BzL = c120985dq.BzL(userSession);
                        if (BzL == null) {
                            BzL = "";
                        }
                        AbstractC37300Gc1.A0o(A0f, BzL);
                        String moduleName = this.A02.getModuleName();
                        if (moduleName != null) {
                            str3 = moduleName;
                        }
                        A0f.AAP("source_of_action", str3);
                        A0f.AAP("fb_locale", C1Q2.A00());
                        A0f.AAQ(A00, "layout_info");
                        A0f.AAP("country", C1Q2.A02().getCountry());
                        EnumC40111tc enumC40111tc = c120985dq.A0J;
                        if (enumC40111tc != null) {
                            str2 = enumC40111tc.name();
                        }
                        A0f.AAP("media_type", str2);
                        A0f.A9M("pc_component_dict_new", A02);
                        AbstractC37303Gc4.A0b(A0f);
                        if (c0Zx != null) {
                            A0f.AAQ(c0Zx, "lead_gen_info");
                        }
                        A0f.Cht();
                    }
                }
            }
            C115775Lq.A03(id);
            return;
        }
        A02(c59062n7, interfaceC57162jr, c120985dq.getId(), false);
    }

    public C37535Gfr(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(userSession);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
    }
}
