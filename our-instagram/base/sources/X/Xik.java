package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class Xik {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LinkedHashMap linkedHashMap;
        C0Zx c0Zx;
        java.util.Set keySet;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4672));
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0C, A01), "ad_id");
            AbstractC72046XLm.A1A(A0f, A01);
            AbstractC72048XLo.A0X(A0f, C5I8.A5c, A01);
            AbstractC72047XLn.A1L(A0f, A01);
            C0Zx c0Zx2 = null;
            A0f.A8I("start_x_position", AbstractC72046XLm.A0V(AbstractC72046XLm.A0Z(C5I8.A8R, A01)));
            A0f.A8I("start_y_position", AbstractC72048XLo.A0E(C5I8.A8S, A01));
            AbstractC72047XLn.A1M(A0f, A01);
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC37300Gc1.A0R(C5I8.A9Z, A01));
            A0f.A9K("screen_height", null);
            A0f.A9K("screen_width", null);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            A0f.AAP("tray_session_id", AbstractC37300Gc1.A0R(C5I8.A7a, A01));
            C11500j9 c11500j9 = C5I8.A9o;
            A0f.AAP("viewer_session_id", AbstractC37300Gc1.A0R(c11500j9, A01));
            AbstractC72047XLn.A0i(A0f, A01);
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            A0f.A8I("screen_density", null);
            A0f.A8I("device_height", null);
            A0f.A8I("device_width", null);
            AbstractC72047XLn.A14(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A0T(A0f, A01);
            A0f.A9K("elapsed_time_since_last_item", AbstractC72047XLn.A0D(C5I8.A2Q, A01));
            AbstractC72047XLn.A0W(A0f, A01);
            A0f.AAk("header_layout", null);
            A0f.A8I("current_play_time", AbstractC72048XLo.A0E(C5I8.A1x, A01));
            AbstractC72047XLn.A0e(A0f, A01);
            AbstractC72047XLn.A0S(A0f, A01);
            AbstractC72047XLn.A1D(A0f, A01);
            A0f.A9M("media_layout", null);
            AbstractC72047XLn.A0P(A0f, A01);
            A0f.A8I("end_x_position", AbstractC72048XLo.A0E(C5I8.A2T, A01));
            A0f.A8I("end_y_position", AbstractC72048XLo.A0E(C5I8.A2U, A01));
            A0f.A8I("x_velocity", AbstractC72048XLo.A0E(C5I8.AA0, A01));
            A0f.A8I("y_velocity", AbstractC72048XLo.A0E(C5I8.AA1, A01));
            AbstractC72048XLo.A0k(A0f, A01);
            ArrayList arrayList5 = (ArrayList) A01.A01(C5I8.A9m);
            if (arrayList5 != null) {
                arrayList = AbstractC166987dD.A1F(arrayList5);
            } else {
                arrayList = null;
            }
            if (!C15500q5.A09(arrayList)) {
                arrayList = null;
            }
            A0f.AAk("video_to_carousel_cut_secs", arrayList);
            AbstractC72047XLn.A0o(A0f, A01);
            AbstractC72047XLn.A16(A0f, A01);
            A0f.AAk("sponsor_tag_ids", (List) AbstractC72047XLn.A06(A0f, A01));
            AbstractC72048XLo.A14(A0f, A01, "inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A01));
            A0f.A8I("bottom_black_bar_position_y", null);
            AbstractC72048XLo.A0p(A0f, A01);
            AbstractC72048XLo.A0z(A0f, A01, AbstractC72046XLm.A0U(C5I8.A5V, A01), "media_time_paused");
            A0f.AAP("opt_in_state", null);
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72046XLm.A1B(A0f, A01);
            ArrayList arrayList6 = (ArrayList) A01.A01(C5I8.A6l);
            if (arrayList6 != null) {
                arrayList2 = AbstractC166987dD.A1F(arrayList6);
            } else {
                arrayList2 = null;
            }
            if (!C15500q5.A09(arrayList2)) {
                arrayList2 = null;
            }
            A0f.AAk("product_ids", arrayList2);
            AbstractMap A0f2 = AbstractC72046XLm.A0f(A01);
            if (A0f2 != null && (keySet = A0f2.keySet()) != null) {
                arrayList3 = AbstractC166987dD.A1F(keySet);
            } else {
                arrayList3 = null;
            }
            if (!C15500q5.A09(arrayList3)) {
                arrayList3 = null;
            }
            A0f.AAk("product_merchant_ids", arrayList3);
            ArrayList arrayList7 = (ArrayList) A01.A01(C5I8.A8p);
            if (arrayList7 != null) {
                arrayList4 = AbstractC166987dD.A1F(arrayList7);
            } else {
                arrayList4 = null;
            }
            if (!C15500q5.A09(arrayList4)) {
                arrayList4 = null;
            }
            A0f.AAk("tagged_user_ids", arrayList4);
            A0f.A9K("normalized_feed_position", AbstractC72046XLm.A0Y(C5I8.A6A, A01));
            AbstractC72046XLm.A1E(A0f, A01);
            A0f.A8I("pan_end_x_position", null);
            A0f.A8I("pan_end_y_position", null);
            A0f.A8I("pan_timespent", null);
            A0f.A9K("pan_direction_change_count", null);
            A0f.A8I("pan_displacement_percentage", null);
            A0f.A8I("pan_speed", null);
            A0f.A7v("pan_successful_trigger", null);
            A0f.A7v("is_tap_and_hold_displayed", null);
            A0f.A7v("is_first_pan", null);
            A0f.A8I("pan_view_height", null);
            A0f.A8I("pan_end_angle", null);
            A0f.A8I("pan_overall_angle", null);
            A0f.AAP("viewer_session_id", AbstractC37300Gc1.A0R(c11500j9, A01));
            AbstractC72046XLm.A16(A0f, A01);
            AbstractC72047XLn.A1P(A0f, A01);
            A0f.A9M("sticker_types", null);
            AbstractC72047XLn.A0u(A0f, A01);
            A0f.AAQ(null, "toolbar_layout");
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractCollection A0c = AbstractC72046XLm.A0c(C5I8.A17, A01);
            if (A0c != null) {
                linkedHashMap = AbstractC25225BEi.A18(AbstractC72047XLn.A00(A0c));
                Iterator it = A0c.iterator();
                while (it.hasNext()) {
                    AbstractC72048XLo.A1Y(it, linkedHashMap);
                }
            } else {
                linkedHashMap = null;
            }
            A0f.A9M("carousel_transformation_cards", linkedHashMap);
            A0f.A9K("carousel_transformation_type", null);
            A0f.A8I("bottom_black_bar_height", null);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72048XLo.A0e(A0f, A01);
            AbstractC72047XLn.A0l(A0f, A01);
            AbstractC72048XLo.A0U(A0f, interfaceC60442pS, A01, AbstractC72046XLm.A0Y(C5I8.A5M, A01), "media_id");
            A0f.A9K("is_prod", 1L);
            AbstractC72047XLn.A1B(A0f, A01);
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC72047XLn.A1E(A0f, A01);
            C11520jB c11520jB = (C11520jB) A01.A01(C5I8.A8t);
            Double d = null;
            if (c11520jB == null) {
                c0Zx = null;
            } else {
                c0Zx = new C0Zx();
                c0Zx.A06(AbstractC111324zv.A00(1324), AbstractC37300Gc1.A0R(C5I8.A6y, c11520jB));
                c0Zx.A04("tap_source_top_left_x_position", AbstractC72048XLo.A0E(C5I8.A8u, c11520jB));
                c0Zx.A04("tap_source_top_left_y_position", AbstractC72048XLo.A0E(C5I8.A8v, c11520jB));
                c0Zx.A04("tap_source_bottom_right_x_position", AbstractC72048XLo.A0E(C5I8.A8r, c11520jB));
                if (AbstractC72046XLm.A0Z(C5I8.A8s, c11520jB) != null) {
                    d = Double.valueOf(r0.floatValue());
                }
                c0Zx.A04("tap_source_bottom_right_y_position", d);
            }
            A0f.AAQ(c0Zx, "tap_source_info");
            C11520jB c11520jB2 = (C11520jB) A01.A01(C5I8.A7M);
            Double d2 = null;
            if (c11520jB2 != null) {
                c0Zx2 = new C0Zx();
                c0Zx2.A04("overlay_ads_top_left_x_position", AbstractC72048XLo.A0E(C5I8.A7P, c11520jB2));
                c0Zx2.A04("overlay_ads_top_left_y_position", AbstractC72048XLo.A0E(C5I8.A7Q, c11520jB2));
                c0Zx2.A04("overlay_ads_bottom_right_x_position", AbstractC72048XLo.A0E(C5I8.A7N, c11520jB2));
                if (AbstractC72046XLm.A0Z(C5I8.A7O, c11520jB2) != null) {
                    d2 = Double.valueOf(r0.floatValue());
                }
                c0Zx2.A04("overlay_ads_bottom_right_y_position", d2);
            }
            A0f.AAQ(c0Zx2, "reels_overlay_ads_info");
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
