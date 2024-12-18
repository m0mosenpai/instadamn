package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class W3w {
    public static final W3w A00 = new Object();

    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        User CDj;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        String str6 = null;
        if (str3 == null) {
            if (A0h != null && (CDj = A0h.A0C.CDj()) != null) {
                str3 = CDj.getId();
            } else {
                str3 = null;
            }
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "barcelona_post_tap");
        CharSequence charSequence = (CharSequence) AbstractC167007dF.A0m(str, "_", 0).get(0);
        if (charSequence.length() == 0) {
            charSequence = "0";
        }
        AbstractC25236BEt.A0r(A002, (String) charSequence);
        A002.AAP("module_name", interfaceC11380iw.getModuleName());
        A002.AAP("nav_chain", AbstractC31178DnM.A0b());
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        A002.A9K("media_author_id", l);
        if (str2 != null) {
            C38801rC c38801rC = C38321qM.A0h;
            l2 = AbstractC25228BEl.A13(C38801rC.A06(str2));
        } else {
            l2 = null;
        }
        A002.A9K(AbstractC111324zv.A00(1234), l2);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_session_id", null);
        c0Zx.A06("serp_session_id", null);
        c0Zx.A06("query_text", null);
        c0Zx.A06("rank_token", null);
        A002.AAQ(c0Zx, "search_context");
        if (str4 != null) {
            C38801rC c38801rC2 = C38321qM.A0h;
            l3 = AbstractC25231BEo.A0j(0, C38801rC.A06(str4));
        } else {
            l3 = null;
        }
        A002.A9K(AbstractC111324zv.A00(177), l3);
        if (str5 != null) {
            C38801rC c38801rC3 = C38321qM.A0h;
            l4 = AbstractC25231BEo.A0j(0, C38801rC.A06(str5));
        } else {
            l4 = null;
        }
        A002.A9K(AbstractC111324zv.A00(32), l4);
        if (A0h != null) {
            str6 = A0h.A0C.getLoggingInfoToken();
        }
        A002.AAP("ranking_info_token", str6);
        A002.Cht();
    }
}
