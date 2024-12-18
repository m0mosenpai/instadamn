package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xiy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72639Xiy {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        Long l;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(2571));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            String str = "";
            if (A0R == null) {
                A0R = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R);
            long j = 0;
            A0f.A9K("a_pk", Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A0Z, A01))));
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A2w, A01);
            if (A0R2 == null) {
                A0R2 = "";
            }
            A0f.AAP("follow_status", A0R2);
            AbstractC37301Gc2.A0y(A0f, AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A5c, A01)));
            A0f.A9K("m_ts", Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A93, A01))));
            String A0R3 = AbstractC37300Gc1.A0R(C5I8.A8G, A01);
            if (A0R3 != null) {
                str = A0R3;
            }
            A0f.AAP("source_of_action", str);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A0y(A0f, A01);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "ranking_session_id", AbstractC37300Gc1.A0R(C5I8.A6s, A01));
            Number A0Z = AbstractC72046XLm.A0Z(C5I8.A2Q, A01);
            if (A0Z != null) {
                l = Long.valueOf((long) A0Z.doubleValue());
            } else {
                l = null;
            }
            A0f.A9K("elapsed_time_since_last_item", l);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72047XLn.A1A(A0f, A01);
            AbstractC72046XLm.A19(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                arrayList = AbstractC167007dF.A0i(A0e);
                Iterator it = A0e.iterator();
                while (it.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), arrayList);
                }
            } else {
                arrayList = null;
            }
            A0f.AAk("tagged_user_ids", arrayList);
            AbstractC72046XLm.A0v(A0f, C5I8.A12, A01);
            A0f.A9K("carousel_size", AbstractC72046XLm.A0Y(C5I8.A15, A01));
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0E(C5I8.A2c, A01));
            AbstractC72046XLm.A10(A0f, A01);
            AbstractC72046XLm.A14(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0r(A0f, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0p(A0f, C5I8.A3R, A01);
            A0f.A9K("is_igtv", Long.valueOf(AbstractC37302Gc3.A03(C14360o3.A0K(A01.A01(C5I8.A4N), true) ? 1 : 0)));
            AbstractC72047XLn.A1O(A0f, A01);
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0E(C5I8.A5C, A01));
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72048XLo.A0Y(A0f, A01);
            A0f.A9K("normalized_feed_position", AbstractC72046XLm.A0Y(C5I8.A6A, A01));
            if (C14360o3.A0K(A01.A01(C5I8.A42), true)) {
                j = 1;
            }
            A0f.A9K("is_checkout_enabled", Long.valueOf(j));
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72046XLm.A12(A0f, A01);
            A0f.A9K("merchant_id", AbstractC72047XLn.A0E(C5I8.A5g, A01));
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                arrayList2 = AbstractC167007dF.A0i(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it2), arrayList2);
                }
            } else {
                arrayList2 = null;
            }
            A0f.AAk("product_ids", arrayList2);
            AbstractC72046XLm.A1K(A0f, (Map) A01.A01(C5I8.A6n));
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A0p(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.AAP("rank_token", AbstractC37300Gc1.A0R(C5I8.A6t, A01));
            A0f.AAP("search_session_id", AbstractC37300Gc1.A0R(C5I8.A7v, A01));
            A0f.AAP("query_text", AbstractC37300Gc1.A0R(C5I8.A6p, A01));
            AbstractC72047XLn.A1I(A0f, A01);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("search_session_id", null);
            c0Zx.A06("serp_session_id", null);
            c0Zx.A06("query_text", null);
            c0Zx.A06("rank_token", null);
            A0f.AAQ(c0Zx, "search_context");
            A0f.AAP(AbstractC111324zv.A00(357), C72Z.A00());
            A0f.Cht();
        }
    }
}
