package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xiq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72631Xiq {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Map map;
        LinkedHashMap linkedHashMap4;
        Long l;
        Long l2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4677));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            Integer num = C05F.A0j;
            AbstractC72049XLp.A0H(A0f, A01, num, "container_module");
            AbstractC72046XLm.A1A(A0f, A01);
            C11500j9 c11500j9 = C5I8.A0Z;
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(c11500j9, A01), "a_pk");
            C11500j9 c11500j92 = C5I8.A5c;
            AbstractC72046XLm.A0r(A0f, c11500j92, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            C11500j9 c11500j93 = C5I8.A0C;
            AbstractC72046XLm.A0t(A0f, c11500j93, A01);
            AbstractC72047XLn.A1B(A0f, A01);
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            AbstractC72048XLo.A12(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0z, A01), "carousel_index");
            C11500j9 c11500j94 = C5I8.A12;
            AbstractC72046XLm.A0w(A0f, c11500j94, A01);
            AbstractC72046XLm.A0v(A0f, c11500j94, A01);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72049XLp.A0F(A0f, c11500j92, A01);
            C11500j9 c11500j95 = C5I8.A6U;
            A0f.AAP(AbstractC111324zv.A00(131), AbstractC37300Gc1.A0R(c11500j95, A01));
            A0f.A9K("author_id", AbstractC37302Gc3.A0W(AbstractC37300Gc1.A0R(C5I8.A0Y, A01)));
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72048XLo.A0V(A0f, C5I8.A93, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72048XLo.A0a(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72048XLo.A0W(A0f, c11500j95, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72048XLo.A0g(A0f, A01);
            AbstractC72047XLn.A0H(A0f, c11500j9, A01);
            AbstractC72049XLp.A0G(A0f, c11500j93, A01);
            AbstractC72046XLm.A14(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                ArrayList A0i = AbstractC167007dF.A0i(abstractCollection);
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    AbstractC72048XLo.A1U(A0i, it);
                }
                linkedHashMap = AbstractC72046XLm.A0h(A0i);
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap);
            AbstractC72046XLm.A0x(A0f, A01);
            AbstractC72047XLn.A18(A0f, A01);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A1B(A0f, A01);
            AbstractC72047XLn.A0t(A0f, A01);
            AbstractC72047XLn.A0b(A0f, A01);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0E(C5I8.A2c, A01));
            AbstractC72047XLn.A15(A0f, A01);
            A0f.A9M("client_ad_creative_optimization_output", null);
            AbstractC72047XLn.A0o(A0f, A01);
            A0f.A9K("multi_ads_first_ad_id", AbstractC72047XLn.A0E(C5I8.A5v, A01));
            AbstractC72047XLn.A0m(A0f, A01);
            AbstractC72047XLn.A11(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            A0f.A9K("hscroll_seed_ad_id", AbstractC72047XLn.A0E(C5I8.A3c, A01));
            AbstractC72047XLn.A0r(A0f, A01);
            AbstractC72047XLn.A0Y(A0f, A01);
            A0f.AAP("contextual_ads_category", AbstractC37300Gc1.A0R(C5I8.A1c, A01));
            A0f.A9K("first_hscroll_item_ad_id", AbstractC72047XLn.A0E(C5I8.A2v, A01));
            A0f.A9K("seed_ad_id", AbstractC72047XLn.A0E(C5I8.A7w, A01));
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                ArrayList A0i2 = AbstractC167007dF.A0i(A0d);
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it2);
                    if (A1B != null) {
                        l = AbstractC003100w.A0k(10, A1B);
                        l2 = AbstractC003100w.A0k(10, A1B);
                    } else {
                        l = null;
                        l2 = null;
                    }
                    AbstractC166997dE.A1R(l, l2, A0i2);
                }
                linkedHashMap2 = AbstractC72046XLm.A0h(A0i2);
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
                    ArrayList A0i3 = AbstractC167007dF.A0i(iterable);
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        AbstractC72048XLo.A1U(A0i3, it3);
                    }
                    linkedHashMap3.put(key, AbstractC06930Yk.A08(A0i3));
                }
            } else {
                linkedHashMap3 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap3);
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            AbstractC72046XLm.A1G(A0f, A01);
            C11500j9 c11500j96 = C5I8.A5U;
            A0f.A9K("media_owner_id", AbstractC72046XLm.A0Y(c11500j96, A01));
            AbstractC72047XLn.A0J(A0f, A01);
            AbstractC72046XLm.A1I(A0f, A01);
            A0f.A7v("is_below_eof", AbstractC72046XLm.A0S(C5I8.A3z, A01));
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0E(C5I8.A5C, A01));
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0E(C5I8.A9e, A01));
            A0f.AAQ(null, "multi_ads_extra");
            A0f.A7v("impression_logger_validate", AbstractC72046XLm.A0S(C5I8.A3j, A01));
            AbstractC72047XLn.A0V(A0f, A01);
            A0f.A9K("imp_logger_ver", AbstractC72046XLm.A0Y(C5I8.A3l, A01));
            AbstractC72046XLm.A1H(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                ArrayList A0i4 = AbstractC167007dF.A0i(A0e);
                Iterator it4 = A0e.iterator();
                while (it4.hasNext()) {
                    AbstractC72048XLo.A1W(A0i4, it4);
                }
                map = AbstractC06930Yk.A08(A0i4);
            } else {
                map = null;
            }
            A0f.A9M("tagged_user_ids", map);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0E(C5I8.A9Z, A01));
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            A0f.A9K("connection_id", AbstractC72047XLn.A0E(C5I8.A1X, A01));
            AbstractC72046XLm.A0q(A0f, AbstractC129005sL.A01, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0p(A0f, AbstractC129005sL.A03, A01);
            A0f.A9K("media_owner_id_long", AbstractC72046XLm.A0Y(c11500j96, A01));
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A2J, A01);
            if (A0c != null) {
                ArrayList A0i5 = AbstractC167007dF.A0i(A0c);
                Iterator it5 = A0c.iterator();
                while (it5.hasNext()) {
                    AbstractC72048XLo.A1U(A0i5, it5);
                }
                linkedHashMap4 = AbstractC72046XLm.A0h(A0i5);
            } else {
                linkedHashMap4 = null;
            }
            A0f.A9M("drops_product_ids", linkedHashMap4);
            AbstractC72047XLn.A0g(A0f, A01);
            A0f.A9K("counter_id", AbstractC72047XLn.A0E(C5I8.A1g, A01));
            A0f.A9K("counter_sid", AbstractC72047XLn.A0E(C5I8.A1h, A01));
            AbstractC72046XLm.A15(A0f, A01);
            A0f.AAP("click_source", AbstractC37300Gc1.A0R(C5I8.A1H, A01));
            AbstractC72047XLn.A1K(A0f, A01);
            A0f.A9K("feed_recs_post_position", AbstractC72046XLm.A0Y(C5I8.A2s, A01));
            A0f.A9K("recs_ix", AbstractC72047XLn.A0F(AbstractC72046XLm.A0Z(C5I8.A6w, A01)));
            A0f.A7v("is_acp_delivesed", null);
            AbstractC72047XLn.A1S(A0f, A01, num);
            A0f.A9K("host_profile_id", AbstractC72046XLm.A0Y(C5I8.A3Z, A01));
            A0f.Cht();
        }
    }
}
