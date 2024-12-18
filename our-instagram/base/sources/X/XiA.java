package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* loaded from: classes12.dex */
public abstract class XiA {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    public static final void A00(Context context, UserSession userSession, JH8 jh8, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, int i, boolean z, boolean z2) {
        EnumC77173d3 enumC77173d3;
        Long l;
        Long l2;
        C0Zx c0Zx;
        AbstractC25229BEm.A1I(context, 4, interfaceC60442pS);
        if (z) {
            enumC77173d3 = EnumC77173d3.A02;
        } else {
            enumC77173d3 = EnumC77173d3.A03;
        }
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        I0H.A00(userSession, c38321qM.A1c(), enumC77173d3, c38321qM);
        Integer num = C05F.A00;
        Integer valueOf = Integer.valueOf(i);
        AbstractC41706Idc.A03(context, interfaceC60442pS, userSession, jh8, enumC77173d3, c38321qM, null, num, valueOf, valueOf, -1, null, str, null, null, false, z2);
        EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, enumC77173d3 == enumC77173d32 ? "like" : "unlike");
        A04.A0G(userSession, c38321qM);
        A04.A09(i);
        A04.A75 = "button";
        A04.A6f = c38321qM.A0C.Bk6();
        if (str2 != null) {
            l = AbstractC25231BEo.A0j(0, C38801rC.A06(str2));
        } else {
            l = null;
        }
        A04.A3Q = l;
        if (str3 != null) {
            l2 = AbstractC25231BEo.A0j(0, C38801rC.A06(str3));
        } else {
            l2 = null;
        }
        A04.A3P = l2;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        if (Hx1.A00(c38321qM, interfaceC60442pS)) {
            if (enumC77173d3 == enumC77173d32) {
                Xio.A00(A01, A04, interfaceC60442pS);
                return;
            } else {
                AbstractC72634Xit.A00(A01, A04, interfaceC60442pS);
                return;
            }
        }
        if (enumC77173d3 == enumC77173d32) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_organic_like");
            C11520jB A012 = A04.A01();
            if (!A0f.isSampled()) {
                return;
            }
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5K, A012);
            if (A0R == null) {
                A0R = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R);
            AbstractC72047XLn.A1M(A0f, A012);
            AbstractC72047XLn.A1L(A0f, A012);
            AbstractC72047XLn.A1Q(A0f, A012);
            AbstractC72047XLn.A1O(A0f, A012);
            AbstractC72048XLo.A0X(A0f, C5I8.A5c, A012);
            AbstractC72047XLn.A1B(A0f, A012);
            AbstractC72047XLn.A1T(A0f, A012, AbstractC72046XLm.A0Y(C5I8.A0Z, A012), "a_pk");
            AbstractC72047XLn.A1C(A0f, A012);
            AbstractC72047XLn.A0Z(A0f, A012);
            AbstractC72046XLm.A16(A0f, A012);
            AbstractC72047XLn.A1F(A0f, A012);
            AbstractC72046XLm.A1E(A0f, A012);
            AbstractC72047XLn.A0p(A0f, A012);
            AbstractC72046XLm.A13(A0f, A012);
            A0f.AAP("search_session_id", AbstractC37300Gc1.A0R(C5I8.A7v, A012));
            A0f.AAP("serp_session_id", AbstractC37300Gc1.A0R(C5I8.A81, A012));
            A0f.AAP("query_text", AbstractC37300Gc1.A0R(C5I8.A6p, A012));
            A0f.AAP("rank_token", AbstractC37300Gc1.A0R(C5I8.A6t, A012));
            HashMap hashMap = (HashMap) A012.A01(C5I8.A7u);
            if (hashMap != null) {
                SearchContext A00 = AbstractC40792I5u.A00(hashMap);
                c0Zx = new C0Zx();
                c0Zx.A06("search_session_id", A00.A05);
                c0Zx.A06("serp_session_id", A00.A06);
                c0Zx.A06("query_text", A00.A02);
                c0Zx.A06("rank_token", A00.A03);
                c0Zx.A06("click_id", A00.A00);
            } else {
                c0Zx = null;
            }
            A0f.AAQ(c0Zx, "search_context");
            A0f.A9K("barcelona_source_reply_id", AbstractC72046XLm.A0Y(C5I8.A0b, A012));
            A0f.A9K(AbstractC111324zv.A00(32), AbstractC72046XLm.A0Y(C5I8.A0a, A012));
            A0f.AAP(AbstractC111324zv.A00(357), C72Z.A00());
            A0f.Cht();
            return;
        }
        AbstractC72640Xiz.A00(A01, A04, interfaceC60442pS);
    }
}
