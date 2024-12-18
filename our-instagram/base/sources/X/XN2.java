package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class XN2 {
    public static final void A00(C18920wW c18920wW, C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS) {
        double d;
        long j;
        String str;
        Long A0j;
        Long A0j2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_organic_gesture");
        C11520jB A01 = c82713mZ.A01();
        if (A0f.isSampled()) {
            String A0R = AbstractC37300Gc1.A0R(C5I8.A8G, A01);
            String str2 = "";
            if (A0R == null) {
                A0R = "";
            }
            A0f.AAP("source_of_action", A0R);
            Number A0Z = AbstractC72046XLm.A0Z(C5I8.A8R, A01);
            double d2 = 0.0d;
            if (A0Z != null) {
                d = A0Z.floatValue();
            } else {
                d = 0.0d;
            }
            A0f.A8I("start_x_position", Double.valueOf(d));
            Number A0Z2 = AbstractC72046XLm.A0Z(C5I8.A8S, A01);
            if (A0Z2 != null) {
                d2 = A0Z2.floatValue();
            }
            A0f.A8I("start_y_position", Double.valueOf(d2));
            String A0R2 = AbstractC37300Gc1.A0R(C5I8.A9Z, A01);
            if (A0R2 == null) {
                A0R2 = "";
            }
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0R2);
            String A0R3 = AbstractC37300Gc1.A0R(C5I8.A5K, A01);
            if (A0R3 == null) {
                A0R3 = "";
            }
            AbstractC37300Gc1.A0l(A0f, A0R3);
            String A0R4 = AbstractC37300Gc1.A0R(C5I8.A8U, A01);
            if (A0R4 != null) {
                str2 = A0R4;
            }
            A0f.AAP("story_ranking_token", str2);
            String A0R5 = AbstractC37300Gc1.A0R(C5I8.A9W, A01);
            long j2 = 0;
            if (A0R5 != null && (A0j2 = AbstractC166997dE.A0j(A0R5)) != null) {
                j = A0j2.longValue();
            } else {
                j = 0;
            }
            A0f.A9K("tray_pos_excl_own_story", Long.valueOf(j));
            ArrayList arrayList = (ArrayList) A01.A01(C5I8.A2r);
            if (arrayList != null && (str = (String) AbstractC001800i.A0O(arrayList, 0)) != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j2 = A0j.longValue();
            }
            A0f.A9K("feed_sticker_media_id", Long.valueOf(j2));
            A0f.A7v("is_ad", false);
            AbstractC72046XLm.A0s(A0f, C5I8.A0Z, A01);
            AbstractC72047XLn.A1T(A0f, A01, AbstractC72046XLm.A0Y(C5I8.A0C, A01), "ad_id");
            AbstractC72048XLo.A0X(A0f, C5I8.A5c, A01);
            AbstractC72047XLn.A1M(A0f, A01);
            AbstractC72048XLo.A0i(A0f, A01);
            AbstractC72048XLo.A0m(A0f, A01);
            AbstractC72047XLn.A0q(A0f, A01);
            AbstractC72047XLn.A0R(A0f, A01);
            A0f.AAP("tray_session_id", AbstractC37300Gc1.A0R(C5I8.A7a, A01));
            AbstractC72047XLn.A1N(A0f, A01);
            AbstractC72047XLn.A0Z(A0f, A01);
            AbstractC72047XLn.A0h(A0f, A01);
            AbstractC72047XLn.A14(A0f, A01);
            AbstractC72046XLm.A0z(A0f, A01);
            AbstractC72047XLn.A0T(A0f, A01);
            AbstractC72047XLn.A0W(A0f, A01);
            Long l = null;
            A0f.A8I("current_play_time", AbstractC72046XLm.A0V(AbstractC72046XLm.A0Z(C5I8.A1x, A01)));
            AbstractC72047XLn.A0e(A0f, A01);
            AbstractC72047XLn.A0P(A0f, A01);
            A0f.A8I("end_x_position", AbstractC72048XLo.A0E(C5I8.A2T, A01));
            A0f.A8I("end_y_position", AbstractC72048XLo.A0E(C5I8.A2U, A01));
            A0f.A8I("x_velocity", AbstractC72048XLo.A0E(C5I8.AA0, A01));
            A0f.A8I("y_velocity", AbstractC72048XLo.A0E(C5I8.AA1, A01));
            AbstractC72047XLn.A0o(A0f, A01);
            A0f.A9K("sponsor_tag_count", AbstractC72046XLm.A0Y(C5I8.A8L, A01));
            AbstractC72048XLo.A14(A0f, A01, "inventory_source", AbstractC37300Gc1.A0R(C5I8.A3r, A01));
            AbstractC72048XLo.A0p(A0f, A01);
            AbstractC72048XLo.A0z(A0f, A01, AbstractC72046XLm.A0U(C5I8.A5V, A01), "media_time_paused");
            AbstractC72048XLo.A0d(A0f, A01);
            AbstractC72047XLn.A0M(A0f, A01);
            AbstractC72046XLm.A13(A0f, A01);
            AbstractC72046XLm.A1B(A0f, A01);
            AbstractC72046XLm.A1E(A0f, A01);
            AbstractC72046XLm.A14(A0f, A01);
            AbstractC72046XLm.A16(A0f, A01);
            String A0R6 = AbstractC37300Gc1.A0R(C5I8.A6b, A01);
            if (A0R6 != null) {
                l = AbstractC166997dE.A0j(A0R6);
            }
            A0f.A9K("post_id", l);
            AbstractC72047XLn.A1O(A0f, A01);
            AbstractC72048XLo.A0y(A0f, A01);
            AbstractC72047XLn.A0Q(A0f, A01);
            AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
            AbstractC72047XLn.A0y(A0f, A01);
            AbstractC72047XLn.A1V(A0f, A01, "ranking_info_token", AbstractC37300Gc1.A0R(C5I8.A6r, A01));
            AbstractC72047XLn.A0c(A0f, A01);
            AbstractC72047XLn.A1E(A0f, A01);
            AbstractC72046XLm.A1C(A0f, A01);
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
