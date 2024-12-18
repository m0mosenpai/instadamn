package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82623mQ {
    public static final C82623mQ A00 = new Object();

    public static final void A02(UserSession userSession, C30W c30w, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Boolean bool, Boolean bool2, int i, int i2) {
        C11520jB c11520jB;
        C128215qq c128215qq;
        Long valueOf;
        Long l;
        String str;
        long j;
        String str2;
        String str3;
        C4SX c4sx;
        Boolean bool3;
        List list;
        Map map;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Boolean bool4;
        String str12;
        Long l2;
        String str13;
        String str14;
        String str15;
        Long l3;
        long j2;
        String str16;
        Long l4;
        String str17;
        Long l5;
        Boolean bool5;
        String str18;
        String str19;
        Long l6;
        HashMap hashMap;
        String str20;
        String str21;
        String Bnr;
        Map map2;
        String id;
        C14360o3.A0B(c30w, 5);
        C18920wW A002 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A03, userSession);
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "instagram_organic_sub_impression");
        if (A003.isSampled()) {
            Long l7 = null;
            if (interfaceC60442pS instanceof AnonymousClass309) {
                c11520jB = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM);
            } else {
                c11520jB = null;
            }
            if (c38321qM.A3S(true) != null && (!r0.isEmpty())) {
                c128215qq = C128205qp.A04(c38321qM);
            } else {
                c128215qq = null;
            }
            A003.AAP("module_name", interfaceC60442pS.getModuleName());
            A003.AAP("nav_chain", C1QM.A00.A02.A00);
            A003.AAP("m_pk", c38321qM.getId());
            A003.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
            if (i == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(i);
            }
            A003.A9K("m_ix", valueOf);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                l = AbstractC003100w.A0k(10, A2E.getId());
            } else {
                l = null;
            }
            A003.A9K("a_pk", l);
            A003.AAP(AbstractC31187DnW.A02(9, 10, 110), AbstractC82633mR.A0A(c11520jB, c30w));
            A003.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
            if (c11520jB != null) {
                str = (String) c11520jB.A01(C5I8.A6U);
            } else {
                str = null;
            }
            A003.AAP("parent_m_pk", str);
            A003.A9K("carousel_m_t", AbstractC82633mR.A08(c38321qM, i2));
            A003.AAP("inventory_source", c38321qM.A0C.BJN());
            A003.AAP("delivery_flags", AbstractC77343dK.A00(c38321qM.A0e));
            if (C1H6.A03()) {
                j = 1;
            } else {
                j = 0;
            }
            A003.A9K("is_dark_mode", Long.valueOf(j));
            if (c11520jB != null) {
                str2 = (String) c11520jB.A01(C5I8.A9o);
            } else {
                str2 = null;
            }
            A003.AAP("viewer_session_id", str2);
            A003.AAP("tracking_token", AbstractC82633mR.A0E(userSession, c38321qM, interfaceC60442pS));
            A003.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
            A003.AAP("mezql_token", c38321qM.A0C.getMezqlToken());
            if (c11520jB != null) {
                str3 = (String) c11520jB.A01(AbstractC37793Gk8.A00);
            } else {
                str3 = null;
            }
            A003.AAP("search_session_id", str3);
            A003.A9K("carousel_index", AbstractC82633mR.A07(c38321qM, i2));
            A003.AAP("carousel_media_id", AbstractC82633mR.A0H(c38321qM, i2));
            A003.AAP("carousel_cover_media_id", AbstractC82633mR.A0G(c38321qM, i2));
            A003.A9K("carousel_size", AbstractC82633mR.A09(c38321qM, i2));
            if (c128215qq != null) {
                c4sx = c128215qq.A00;
            } else {
                c4sx = null;
            }
            A003.AAK(c4sx, "merchant_id");
            if (c128215qq != null) {
                bool3 = c128215qq.A01;
            } else {
                bool3 = null;
            }
            A003.A7v("is_checkout_enabled", bool3);
            if (c128215qq != null) {
                list = c128215qq.A03;
            } else {
                list = null;
            }
            A003.AAk("product_ids", list);
            if (c128215qq != null) {
                map = c128215qq.A08;
            } else {
                map = null;
            }
            A003.A9M("product_merchant_ids", map);
            if (c11520jB != null) {
                str4 = (String) c11520jB.A01(C5I8.A9J);
            } else {
                str4 = null;
            }
            A003.AAP("topic_cluster_id", str4);
            if (c11520jB != null) {
                str5 = (String) c11520jB.A01(C5I8.A9L);
            } else {
                str5 = null;
            }
            A003.AAP("topic_cluster_title", str5);
            if (c11520jB != null) {
                str6 = (String) c11520jB.A01(C5I8.A9M);
            } else {
                str6 = null;
            }
            A003.AAP("topic_cluster_type", str6);
            if (c11520jB != null) {
                str7 = (String) c11520jB.A01(C5I8.A9I);
            } else {
                str7 = null;
            }
            A003.AAP("topic_cluster_debug_info", str7);
            if (c11520jB != null) {
                str8 = (String) c11520jB.A01(AbstractC128995sK.A00);
            } else {
                str8 = null;
            }
            A003.AAP("entity_follow_status", str8);
            A003.A9K("entity_id", AbstractC82633mR.A02(c11520jB));
            if (c11520jB != null) {
                str9 = (String) c11520jB.A01(AbstractC128995sK.A02);
            } else {
                str9 = null;
            }
            A003.AAP("entity_name", str9);
            if (c11520jB != null) {
                str10 = (String) c11520jB.A01(AbstractC128995sK.A06);
            } else {
                str10 = null;
            }
            A003.AAP("entity_type", str10);
            A003.A9K("entity_page_id", AbstractC82633mR.A03(c11520jB));
            if (c11520jB != null) {
                str11 = (String) c11520jB.A01(AbstractC128995sK.A04);
            } else {
                str11 = null;
            }
            A003.AAP("entity_page_name", str11);
            A003.A7v("is_eof", c38321qM.A0C.CTu());
            A003.AAP("feed_request_id", c38321qM.A0R);
            if (c38321qM.A5g()) {
                bool4 = true;
            } else {
                bool4 = null;
            }
            A003.A7v("is_igtv", bool4);
            A003.AAP("source_of_action", interfaceC60442pS.getModuleName());
            if (c11520jB != null) {
                str12 = (String) c11520jB.A01(C5I8.A1C);
            } else {
                str12 = null;
            }
            A003.AAP("chaining_session_id", str12);
            if (c11520jB != null) {
                l2 = (Long) c11520jB.A01(C5I8.A1A);
            } else {
                l2 = null;
            }
            A003.A9K("chaining_position", l2);
            A003.AAP("last_navigation_module", C55772hI.A00(userSession).A0C);
            if (c11520jB != null) {
                str13 = (String) c11520jB.A01(AbstractC37486Gf4.A00);
            } else {
                str13 = null;
            }
            A003.AAP("collection_id", str13);
            if (c11520jB != null) {
                str14 = (String) c11520jB.A01(AbstractC37486Gf4.A01);
            } else {
                str14 = null;
            }
            A003.AAP("collection_name", str14);
            A003.A9K("hashtag_id", AbstractC82633mR.A04(c11520jB, c38321qM));
            A003.AAP("hashtag_name", AbstractC82633mR.A0C(c11520jB, c38321qM));
            if (c11520jB != null) {
                str15 = (String) c11520jB.A01(AbstractC129005sL.A00);
            } else {
                str15 = null;
            }
            A003.AAP("hashtag_feed_type", str15);
            A003.A7v("is_app_backgrounded", Boolean.valueOf(C218914p.A08()));
            if (c38321qM.A58()) {
                l3 = Long.valueOf(c38321qM.A6p().length);
            } else {
                l3 = null;
            }
            A003.A9K("sponsor_tag_count", l3);
            A003.AAP("action", AbstractC82633mR.A0F(c38321qM));
            A003.AAP("follow_status", AbstractC82633mR.A0D(userSession, c38321qM));
            A003.A8I("elapsed_time_since_last_item", Double.valueOf(-1.0d));
            A003.A7v("is_acp_delivered", false);
            if (C55772hI.A00(userSession).A03 != null) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            A003.A9K("nav_in_transit", Long.valueOf(j2));
            A003.A9K("imp_logger_ver", 24L);
            if (c11520jB != null) {
                str16 = (String) c11520jB.A01(AbstractC128225qr.A00);
            } else {
                str16 = null;
            }
            A003.AAP("media_thumbnail_section", str16);
            A003.AAk("tagged_user_ids", AbstractC82633mR.A0J(c38321qM));
            String A0I = AbstractC82633mR.A0I(c38321qM, i2);
            if (A0I != null) {
                l4 = AbstractC003100w.A0k(10, A0I);
            } else {
                l4 = null;
            }
            A003.A9K("main_feed_carousel_starting_media_id", l4);
            A003.AAP("connection_id", c38321qM.A0C.getConnectionId());
            if (c11520jB != null) {
                str17 = (String) c11520jB.A01(C5I8.A2S);
            } else {
                str17 = null;
            }
            A003.AAP("endpoint_type", str17);
            A003.AAP("hashtag_follow_status", AbstractC82633mR.A0B(c11520jB, c38321qM));
            if (c11520jB != null) {
                l5 = (Long) c11520jB.A01(AbstractC128225qr.A01);
            } else {
                l5 = null;
            }
            A003.A9K("tab_index", l5);
            if (c128215qq != null) {
                bool5 = Boolean.valueOf(c38321qM.A6e(userSession));
            } else {
                bool5 = null;
            }
            A003.A7v("is_influencer", bool5);
            A003.A9K("top_liker_count", AbstractC82633mR.A06(userSession, c38321qM));
            if (c11520jB != null) {
                str18 = (String) c11520jB.A01(AbstractC128995sK.A05);
            } else {
                str18 = null;
            }
            A003.AAP("entity_page_type", str18);
            if (c11520jB != null) {
                str19 = (String) c11520jB.A01(AbstractC129015sM.A01);
            } else {
                str19 = null;
            }
            A003.AAP("rank_token", str19);
            A003.A9K("dark_mode_state", Long.valueOf(AbstractC19730y1.A00(AbstractC12960li.A00).A00()));
            UpcomingEvent A2B = c38321qM.A2B(userSession);
            if (A2B != null && (id = A2B.getId()) != null) {
                l6 = AbstractC003100w.A0k(10, id);
            } else {
                l6 = null;
            }
            A003.A9K("upcoming_event_id", l6);
            A003.A7v("is_merlin_double_logging_enabled", bool2);
            A003.A7v("is_merlin_second_channel_enabled", null);
            if (C14360o3.A0K(bool, true)) {
                hashMap = AbstractC82643mS.A00(userSession);
            } else {
                hashMap = null;
            }
            A003.A9M("two_measurement_debugging_fields", hashMap);
            C1M1 c1m1 = c30w.A01;
            if (c1m1 != null) {
                str20 = c1m1.getSessionId();
            } else {
                str20 = null;
            }
            A003.AAP("ranking_session_id", str20);
            C0Zx c0Zx = new C0Zx();
            if (c128215qq != null && (map2 = c128215qq.A06) != null) {
                str21 = (String) map2.get("product_collection_id");
            } else {
                str21 = null;
            }
            c0Zx.A06("product_collection_id", str21);
            A003.AAQ(c0Zx, "collections_logging_info");
            JML Bns = c38321qM.A0C.Bns();
            if (Bns != null && (Bnr = Bns.Bnr()) != null) {
                l7 = AbstractC003100w.A0k(10, Bnr);
            }
            A003.A9K("repost_id", l7);
            A003.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A003.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
            A003.AAP("device_fold_orientation", AbstractC82673mV.A00);
            A003.AAP("device_fold_state", AbstractC82683mW.A00);
            A003.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
            A003.Cht();
        }
    }

    public static final void A00(Context context, C82713mZ c82713mZ, C75113Zb c75113Zb) {
        if (c75113Zb.A0j != null) {
            c82713mZ.A0P(Float.valueOf(AbstractC13880nE.A01(context, r2.A01)), Float.valueOf(AbstractC13880nE.A01(context, r2.A00)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r1 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.instagram.common.session.UserSession r4, X.C82713mZ r5, X.C38321qM r6, X.InterfaceC60442pS r7, X.C75113Zb r8) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82623mQ.A03(com.instagram.common.session.UserSession, X.3mZ, X.1qM, X.2pS, X.3Zb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r15, X.C30W r16, X.C38321qM r17, X.InterfaceC60442pS r18, X.C75113Zb r19, java.lang.Boolean r20, java.lang.Boolean r21, java.lang.Boolean r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 1683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82623mQ.A01(com.instagram.common.session.UserSession, X.30W, X.1qM, X.2pS, X.3Zb, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, int):void");
    }
}
