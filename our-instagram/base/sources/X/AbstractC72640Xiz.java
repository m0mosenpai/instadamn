package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.search.common.analytics.SearchContext;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Xiz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72640Xiz {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4693));
        C11520jB A01 = c82713mZ.A01();
        C19260xA c19260xA = c82713mZ.A00().A06;
        if (A0f.isSampled()) {
            C11500j9 c11500j9 = C5I8.A5K;
            String A0R = AbstractC37300Gc1.A0R(c11500j9, A01);
            Serializable serializable = "";
            if (A0R == null) {
                A0R = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R);
            Serializable A012 = A01.A01(C5I8.A4N);
            if (A012 == null) {
                A012 = "";
            }
            A0f.A9T("is_igtv", A012);
            A0f.A9T("nav_stack", C26771Rh.A00().A01());
            Serializable A013 = A01.A01(C5I8.A42);
            if (A013 != null) {
                serializable = A013;
            }
            A0f.A9T("is_checkout_enabled", serializable);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72046XLm.A1F(A0f, A01);
            AbstractC72047XLn.A1Q(A0f, A01);
            C0Zx c0Zx = null;
            A0f.AAQ(null, "location_info");
            AbstractC72047XLn.A0N(A0f, A01);
            AbstractC72048XLo.A0s(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "release_channel", AbstractC37300Gc1.A0R(C5I8.A7f, A01));
            AbstractC72047XLn.A1P(A0f, A01);
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            AbstractC72047XLn.A0O(A0f, A01);
            AbstractC72047XLn.A1C(A0f, A01);
            AbstractC72046XLm.A1D(A0f, A01);
            AbstractC72047XLn.A0a(A0f, A01);
            AbstractC72048XLo.A0t(A0f, A01);
            C11500j9 c11500j92 = C5I8.A2Z;
            A0f.AAP("entity_follow_status", AbstractC37300Gc1.A0R(c11500j92, A01));
            AbstractC72047XLn.A13(A0f, A01);
            AbstractC72046XLm.A10(A0f, A01);
            A0f.A9K("entity_page_id", AbstractC72047XLn.A0B(C5I8.A2c, A01));
            AbstractC72047XLn.A0v(A0f, A01);
            AbstractC72046XLm.A11(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72047XLn.A1U(A0f, A01, "carousel_media_id", AbstractC37300Gc1.A0R(C5I8.A10, A01));
            C11500j9 c11500j93 = C5I8.A12;
            AbstractC72046XLm.A0v(A0f, c11500j93, A01);
            AbstractCollection A0e = AbstractC72046XLm.A0e(A01);
            if (A0e != null) {
                linkedHashMap = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0e));
                Iterator it = A0e.iterator();
                while (it.hasNext()) {
                    AbstractC72048XLo.A1X(it, linkedHashMap);
                }
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("tagged_user_ids", linkedHashMap);
            AbstractC72047XLn.A16(A0f, A01);
            AbstractC72048XLo.A0W(A0f, C5I8.A6U, A01);
            AbstractC72046XLm.A19(A0f, A01);
            AbstractC72048XLo.A0q(A0f, A01);
            AbstractC72047XLn.A10(A0f, A01);
            AbstractC72047XLn.A1F(A0f, A01);
            AbstractC72047XLn.A19(A0f, A01);
            A0f.A7v("guide_open_status", null);
            AbstractC72047XLn.A0p(A0f, A01);
            AbstractC72047XLn.A0j(A0f, A01);
            AbstractC72046XLm.A0p(A0f, AbstractC129005sL.A03, A01);
            AbstractC72046XLm.A17(A0f, A01);
            AbstractC72046XLm.A0q(A0f, AbstractC129005sL.A01, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            AbstractC72047XLn.A0k(A0f, A01);
            AbstractC72048XLo.A0r(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "surface");
            AbstractC72046XLm.A0o(A0f, c19260xA, "product");
            A0f.A9K("main_feed_carousel_starting_media_id", AbstractC72047XLn.A0B(C5I8.A5C, A01));
            AbstractC72046XLm.A0t(A0f, C5I8.A0C, A01);
            AbstractC72048XLo.A0h(A0f, A01);
            AbstractC72046XLm.A1B(A0f, A01);
            AbstractCollection A0d = AbstractC72046XLm.A0d(A01);
            if (A0d != null) {
                LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0d));
                Iterator it2 = A0d.iterator();
                while (it2.hasNext()) {
                    AbstractC72048XLo.A1X(it2, A18);
                }
                linkedHashMap2 = AbstractC06930Yk.A03(A18);
            } else {
                linkedHashMap2 = null;
            }
            A0f.A9M("product_ids", linkedHashMap2);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72048XLo.A0Y(A0f, A01);
            AbstractC72047XLn.A17(A0f, A01);
            AbstractCollection abstractCollection = (AbstractCollection) AbstractC72047XLn.A06(A0f, A01);
            if (abstractCollection != null) {
                LinkedHashMap A182 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(abstractCollection));
                Iterator it3 = abstractCollection.iterator();
                while (it3.hasNext()) {
                    Long valueOf = Long.valueOf(MSY.A07(it3));
                    A182.put(valueOf, valueOf);
                }
                linkedHashMap3 = AbstractC06930Yk.A03(A182);
            } else {
                linkedHashMap3 = null;
            }
            A0f.A9M("sponsor_tag_ids", linkedHashMap3);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72046XLm.A0w(A0f, c11500j93, A01);
            A0f.AAk("media_layout", null);
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC37300Gc1.A0h(A0f, AbstractC72047XLn.A0E(c11500j9, A01));
            AbstractC72047XLn.A0W(A0f, A01);
            A0f.A9K("tap_type", null);
            AbstractC72046XLm.A1J(A0f, AbstractC72048XLo.A0F(A01));
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72047XLn.A15(A0f, A01);
            AbstractC72048XLo.A0x(A0f, A01);
            A0f.A9K(AbstractC111324zv.A00(474), null);
            AbstractC72046XLm.A0o(A0f, c19260xA, "impression_token");
            A0f.A9K("upcoming_event_id", AbstractC72047XLn.A0B(C5I8.A9e, A01));
            A0f.A9M("shared_product_ids", null);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null) {
                linkedHashMap4 = AbstractC72047XLn.A0G(A0f2);
                Iterator A14 = AbstractC166997dE.A14(A0f2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    Iterable iterable = (Iterable) A1K.getValue();
                    LinkedHashMap A183 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(iterable));
                    for (Object obj : iterable) {
                        A183.put(obj, obj);
                    }
                    linkedHashMap4.put(key, A183);
                }
            } else {
                linkedHashMap4 = null;
            }
            AbstractC72046XLm.A1K(A0f, linkedHashMap4);
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractC72047XLn.A0d(A0f, A01);
            A0f.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC72047XLn.A0B(C5I8.A9Z, A01));
            AbstractC72046XLm.A15(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "feed_type");
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC37300Gc1.A0R(C5I8.A2f, A01));
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(269));
            AbstractC72046XLm.A0o(A0f, c19260xA, "entity_page_type");
            A0f.AAP("rank_token", AbstractC37300Gc1.A0R(C5I8.A6t, A01));
            A0f.AAP("search_session_id", AbstractC37300Gc1.A0R(C5I8.A7v, A01));
            A0f.AAP("query_text", AbstractC37300Gc1.A0R(C5I8.A6p, A01));
            A0f.A7v("is_top_post", AbstractC72047XLn.A07(c19260xA, "is_top_post"));
            A0f.AAP("component_type", c19260xA.A05("COMPONENT_TYPE"));
            AbstractC72046XLm.A12(A0f, A01);
            A0f.A9K("video_y_position", AbstractC72047XLn.A0A(c19260xA, "video_y_position"));
            C11500j9 c11500j94 = C5I8.A5c;
            AbstractC72046XLm.A0u(A0f, c11500j94, A01);
            A0f.AAP("position", AbstractC72046XLm.A0a(C5I8.A6Y, A01));
            AbstractC72048XLo.A0b(A0f, A01);
            A0f.AAP("audience", AbstractC37300Gc1.A0R(C5I8.A0W, A01));
            AbstractC72047XLn.A0z(A0f, A01);
            AbstractC72048XLo.A0c(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(442));
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, AbstractC111324zv.A00(2519));
            AbstractC72047XLn.A0P(A0f, A01);
            String A00 = AbstractC111324zv.A00(1053);
            A0f.A7v(A00, AbstractC72047XLn.A07(c19260xA, A00));
            A0f.A8I("tap_y_position", AbstractC72046XLm.A0U(C5I8.A8x, A01));
            AbstractC72046XLm.A0o(A0f, c19260xA, "algorithm");
            A0f.A9K("sponsor_tag_id", AbstractC72047XLn.A0B(C5I8.A8O, A01));
            AbstractC72047XLn.A0x(A0f, A01);
            AbstractC72046XLm.A0o(A0f, c19260xA, "chaining_feed_session_id");
            A0f.A9K("video_x_position", AbstractC72047XLn.A0A(c19260xA, "video_x_position"));
            A0f.A9M("mentioned_product_ids", null);
            A0f.A9M("product_mention_ids", null);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A2J, A01);
            if (A0c != null) {
                linkedHashMap5 = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0c));
                Iterator it4 = A0c.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    linkedHashMap5.put(next, next);
                }
            } else {
                linkedHashMap5 = null;
            }
            A0f.A9M("drops_product_ids", linkedHashMap5);
            AbstractC72047XLn.A0U(A0f, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            AbstractC72046XLm.A0r(A0f, c11500j94, A01);
            A0f.AAP(AbstractC111324zv.A00(4380), AbstractC37300Gc1.A0R(c11500j92, A01));
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A1E(A0f, A01);
            A0f.A9K("media_index", AbstractC72046XLm.A0Y(C5I8.A5N, A01));
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72046XLm.A14(A0f, A01);
            A0f.A9K("recs_ix", AbstractC72047XLn.A0A(c19260xA, "recs_ix"));
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72047XLn.A0X(A0f, A01);
            AbstractC72048XLo.A13(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A11, A01), "carousel_media_id_int");
            HashMap hashMap = (HashMap) A01.A01(C5I8.A7u);
            if (hashMap != null) {
                SearchContext A002 = AbstractC40792I5u.A00(hashMap);
                c0Zx = new C0Zx();
                c0Zx.A06("search_session_id", A002.A05);
                c0Zx.A06("serp_session_id", A002.A06);
                c0Zx.A06("query_text", A002.A02);
                c0Zx.A06("rank_token", A002.A03);
                c0Zx.A06("click_id", A002.A00);
            }
            A0f.AAQ(c0Zx, "search_context");
            A0f.Cht();
        }
    }
}
