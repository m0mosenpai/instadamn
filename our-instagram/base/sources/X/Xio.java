package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Xio {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        String str;
        Long l;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_ad_like");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A8G, A01);
            if (A0R == null) {
                A0R = "";
            }
            A0f.AAP("source_of_action", A0R);
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            ArrayList arrayList2 = (ArrayList) A01.A01(C5I8.A2r);
            C0Zx c0Zx = null;
            if (arrayList2 != null) {
                str = (String) AbstractC001800i.A0O(arrayList2, 0);
            } else {
                str = null;
            }
            A0f.AAP("feed_sticker_media_id", str);
            AbstractC72046XLm.A0r(A0f, C5I8.A5c, A01);
            AbstractC72047XLn.A1B(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            A0f.A9K("gap_to_last_ad", AbstractC72046XLm.A0Y(C5I8.A34, A01));
            AbstractC72048XLo.A0b(A0f, A01);
            AbstractC72047XLn.A1G(A0f, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A14, A01), "carousel_opt_in_position");
            A0f.A9K("reel_gap_to_last_ad", AbstractC72046XLm.A0Y(C5I8.A7U, A01));
            AbstractC72048XLo.A10(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A7S, A01));
            A0f.A8I(AbstractC111324zv.A00(838), AbstractC72046XLm.A0U(C5I8.A0o, A01));
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            AbstractC72047XLn.A1Q(A0f, A01);
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72048XLo.A14(A0f, A01, "release_channel", AbstractC37300Gc1.A0R(C5I8.A7f, A01));
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72048XLo.A12(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0z, A01), "carousel_index");
            AbstractC72046XLm.A0v(A0f, C5I8.A12, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            A0f.AAP(AbstractC37307Gc9.A00(), AbstractC37300Gc1.A0R(C5I8.A83, A01));
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            A0f.AAQ(null, "location_info");
            AbstractC72046XLm.A0w(A0f, C5I8.A13, A01);
            AbstractC72046XLm.A13(A0f, A01);
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A5g, A01);
            if (A0R2 != null) {
                l = C4SX.A00(A0R2).A00;
            } else {
                l = null;
            }
            A0f.A9K("merchant_id", l);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    AbstractC72047XLn.A1b(A0i, it);
                }
                arrayList = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0i));
            } else {
                arrayList = null;
            }
            A0f.AAk("product_ids", arrayList);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                LinkedHashMap A0G = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    A0G.put(A1K.getKey(), AbstractC001800i.A0U((Collection) A1K.getValue()));
                }
                linkedHashMap = AbstractC06930Yk.A03(A0G);
            } else {
                linkedHashMap = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap);
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            A0f.A9K("normalized_feed_position", AbstractC72046XLm.A0Y(C5I8.A6A, A01));
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A0p(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            A0f.A9K("reel_gap_to_last_netego", AbstractC72046XLm.A0Y(C5I8.A7V, A01));
            A0f.AAk("drops_product_ids", (List) A01.A01(C5I8.A2J));
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72047XLn.A1K(A0f, A01);
            A0f.A9K("reel_position", AbstractC72046XLm.A0Y(C5I8.A7X, A01));
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            AbstractC72048XLo.A0l(A0f, A01);
            A0f.A9K("is_prod", 1L);
            AbstractC72047XLn.A0c(A0f, A01);
            A0f.A9K("product_id", AbstractC72046XLm.A0Y(C5I8.A6m, A01));
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72047XLn.A0K(A0f, A01);
            A0f.A9K("reel_size", AbstractC72046XLm.A0Y(C5I8.A7Y, A01));
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72048XLo.A0w(A0f, A01);
            AbstractC72047XLn.A0Y(A0f, A01);
            AbstractC72047XLn.A0m(A0f, A01);
            AbstractC72047XLn.A11(A0f, A01);
            A0f.A9K("position_in_multi_ads_unit", AbstractC72046XLm.A0Y(C5I8.A6a, A01));
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0E(C5I8.A5v, A01));
            A0f.AAP("intent_aware_ads_trigger_type", AbstractC37300Gc1.A0R(C5I8.A3q, A01));
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A21);
            if (c11520jB != null) {
                c0Zx = new C0Zx();
                AbstractC72048XLo.A18(c0Zx, c11520jB);
                c0Zx.A04("remaining_time", AbstractC72046XLm.A0U(C5I8.A25, c11520jB));
            }
            A0f.AAQ(c0Zx, AbstractC111324zv.A00(203));
            AbstractC72047XLn.A0I(A0f, A01);
            A0f.Cht();
        }
    }
}
