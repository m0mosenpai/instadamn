package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xix, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72638Xix {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, Long l, Long l2) {
        Map map;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        EnumC37904Gm1 enumC37904Gm1;
        Long l3;
        Long l4;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(2568));
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            if (A0R == null) {
                A0R = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0Z, A01), "a_pk");
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "tracking_token", AbstractC37300Gc1.A0R(C5I8.A9R, A01));
            AbstractC72048XLo.A0X(A0f, C5I8.A5c, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72046XLm.A19(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0t(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72047XLn.A0f(A0f, A01);
            AbstractC72047XLn.A1A(A0f, A01);
            ArrayList arrayList = null;
            A0f.A9M("c_pk_list", null);
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0B(C5I8.A2c, A01));
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i = AbstractC167007dF.A0i(A0e);
                Iterator it = A0e.iterator();
                while (it.hasNext()) {
                    AbstractC72048XLo.A1W(A0i, it);
                }
                map = AbstractC06930Yk.A08(A0i);
            } else {
                map = null;
            }
            A0f.A9M("tagged_user_ids", map);
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A01));
            C11500j9 c11500j9 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j9, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72046XLm.A0p(A0f, C5I8.A3R, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0q(A0f, C5I8.A3Q, A01);
            AbstractC72047XLn.A1H(A0f, A01);
            AbstractC72047XLn.A0p(A0f, A01);
            AbstractC72048XLo.A0Y(A0f, A01);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72048XLo.A0r(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            A0f.A9K("recs_ix", AbstractC72047XLn.A0A(c19260xA, "recs_ix"));
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(abstractCollection);
                Iterator it2 = abstractCollection.iterator();
                while (it2.hasNext()) {
                    AbstractC72048XLo.A1U(A0i2, it2);
                }
                linkedHashMap = AbstractC72046XLm.A0h(A0i2);
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap);
            AbstractC72046XLm.A0w(A0f, c11500j9, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            String A00 = AbstractC111324zv.A00(1053);
            A0f.A7v(A00, AbstractC72047XLn.A07(c19260xA, A00));
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(4486));
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(5036));
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(5037));
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(5088));
            AbstractC72046XLm.A0o(A0f, c19260xA, "referrer");
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(5207));
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(5239));
            A0f.AAP("url", AbstractC37300Gc1.A0R(C5I8.A9g, A01));
            AbstractC72046XLm.A0o(A0f, c19260xA, "impression_token");
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            A0f.A7v("is_top_post", AbstractC72047XLn.A07(c19260xA, "is_top_post"));
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.A9M("shared_product_ids", null);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0B(C5I8.A9Z, A01));
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0B(C5I8.A9e, A01));
            A0f.A7v("pwa", AbstractC72047XLn.A07(c19260xA, "pwa"));
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72048XLo.A0c(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "entity_page_type");
            A0f.AAP("rank_token", AbstractC37300Gc1.A0R(C5I8.A6t, A01));
            A0f.AAP("search_session_id", AbstractC37300Gc1.A0R(C5I8.A7v, A01));
            AbstractC72048XLo.A0b(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72046XLm.A15(A0f, A01);
            A0f.AAP("audience", AbstractC37300Gc1.A0R(C5I8.A0W, A01));
            AbstractC72047XLn.A0P(A0f, A01);
            AbstractC72046XLm.A1B(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(A0d);
                Iterator it3 = A0d.iterator();
                while (it3.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it3);
                    if (A1B != null) {
                        l3 = AbstractC25228BEl.A13(A1B);
                        l4 = AbstractC25228BEl.A13(A1B);
                    } else {
                        l3 = null;
                        l4 = null;
                    }
                    AbstractC166997dE.A1R(l3, l4, A0i3);
                }
                linkedHashMap2 = AbstractC72046XLm.A0h(A0i3);
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("product_ids", linkedHashMap2);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap3 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable iterable = (Iterable) A1K.getValue();
                    ArrayList A0i4 = AbstractC167007dF.A0i(iterable);
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        AbstractC72048XLo.A1U(A0i4, it4);
                    }
                    linkedHashMap3.put(key, AbstractC06930Yk.A08(A0i4));
                }
            } else {
                linkedHashMap3 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap3);
            A0f.AAP("byline_text", AbstractC37300Gc1.A0R(C5I8.A0l, A01));
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0B(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0B(C5I8.A1h, A01));
            A0f.AAP("sponsored_label_text", AbstractC37300Gc1.A0R(C5I8.A8J, A01));
            AbstractC72047XLn.A0x(A0f, A01);
            A0f.A9K("sponsor_tag_id", AbstractC72047XLn.A0B(C5I8.A8O, A01));
            AbstractC72046XLm.A12(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "chaining_feed_session_id");
            AbstractC72048XLo.A0h(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            A0f.AAP("query_text", AbstractC37300Gc1.A0R(C5I8.A6p, A01));
            A0f.A8I(AbstractC111324zv.A00(1100), AbstractC72046XLm.A0U(C5I8.A5W, A01));
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("search_session_id", null);
            c0Zx.A06("serp_session_id", null);
            c0Zx.A06("query_text", null);
            c0Zx.A06("rank_token", null);
            A0f.AAQ(c0Zx, "search_context");
            A0f.A9K("barcelona_source_reply_id", l);
            A0f.A9K(AbstractC111324zv.A00(32), l2);
            A0f.AAP(AbstractC111324zv.A00(1347), AbstractC37300Gc1.A0R(C5I8.A9T, A01));
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A9U, A01);
            if (A0c != null) {
                ArrayList A0i5 = AbstractC167007dF.A0i(A0c);
                Iterator it5 = A0c.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    EnumC37904Gm1[] values = EnumC37904Gm1.values();
                    int i = 0;
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            enumC37904Gm1 = values[i];
                            if (!C14360o3.A0K(enumC37904Gm1.A00, next)) {
                                i++;
                            }
                        } else {
                            enumC37904Gm1 = null;
                            break;
                        }
                    }
                    A0i5.add(enumC37904Gm1);
                }
                arrayList = A0i5;
            }
            A0f.AAk(AbstractC111324zv.A00(1348), arrayList);
            A0f.AAk(AbstractC111324zv.A00(4481), (List) A01.A01(C5I8.A2z));
            A0f.AAk(AbstractC111324zv.A00(4147), (List) A01.A01(C5I8.A2y));
            A0f.A9K(AbstractC111324zv.A00(490), Long.valueOf(AbstractC25232BEp.A0t(AbstractC72046XLm.A0Z(C5I8.A6I, A01))));
            List list = (ArrayList) A01.A01(C5I8.A9w);
            if (list == null) {
                list = C16930sl.A00;
            }
            A0f.AAk(MSV.A00(451), list);
            A0f.AAP(AbstractC111324zv.A00(358), AbstractC25041Ki.A00);
            A0f.AAP(AbstractC111324zv.A00(357), C72Z.A00());
            A0f.Cht();
        }
    }
}
