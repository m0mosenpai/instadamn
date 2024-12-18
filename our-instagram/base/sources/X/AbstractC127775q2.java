package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5q2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127775q2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v106, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [X.0Zx] */
    public static void A00(InterfaceC02550Ad interfaceC02550Ad, EnumC63542ub enumC63542ub, C82543mI c82543mI, Integer num, String str, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ) {
        C82713mZ c82713mZ;
        long j;
        Long valueOf;
        C0Zx c0Zx;
        C0Zx c0Zx2;
        String str2;
        Long l;
        Long l2;
        Long l3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C0Zx c0Zx3;
        C0Zx c0Zx4;
        Long l4;
        Long l5;
        Long l6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        C0Zx c0Zx5;
        ArrayList arrayList13;
        Long A0k;
        java.util.Set<Map.Entry> entrySet;
        Long l7;
        Long l8;
        String str3;
        Long valueOf2;
        String str4;
        C14360o3.A0B(enumC63542ub, 4);
        if (str == null) {
            C0K8.A0C("MerlinLoggerV2", "No origin provided to merlin logger");
            return;
        }
        AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) interfaceC16660sJ.invoke(interfaceC02550Ad);
        if (!abstractC02600Aj.A00.isSampled()) {
            return;
        }
        abstractC02600Aj.A0R("origin", str);
        C82533mH c82533mH = c82543mI.A01;
        C14360o3.A0B(c82533mH, 1);
        List A0a = AbstractC001800i.A0a(c82533mH.A00.values());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            Iterator it2 = A0a.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException("attachToEvent");
            }
        }
        C0Zx c0Zx6 = (C0Zx) interfaceC16820sZ2.invoke();
        List list2 = c82543mI.A06;
        ArrayList arrayList14 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList14.add(((C82493mD) it3.next()).A01);
        }
        ArrayList arrayList15 = new ArrayList();
        Iterator it4 = arrayList14.iterator();
        while (it4.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it4.next()).A07, arrayList15);
        }
        c0Zx6.A07("t_0", AbstractC127805q5.A00(arrayList15, C127795q4.A00));
        ArrayList arrayList16 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList16.add(((C82493mD) it5.next()).A01);
        }
        ArrayList arrayList17 = new ArrayList();
        Iterator it6 = arrayList16.iterator();
        while (it6.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it6.next()).A02, arrayList17);
        }
        c0Zx6.A07("t_50", AbstractC127805q5.A00(arrayList17, C5q7.A00));
        ?? r2 = C16930sl.A00;
        ArrayList arrayList18 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            arrayList18.add(((C82493mD) it7.next()).A01);
        }
        ArrayList arrayList19 = new ArrayList();
        Iterator it8 = arrayList18.iterator();
        while (it8.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it8.next()).A04, arrayList19);
        }
        c0Zx6.A07("t_100", AbstractC127805q5.A00(arrayList19, C5q8.A00));
        C0Zx c0Zx7 = (C0Zx) interfaceC16820sZ.invoke();
        ArrayList arrayList20 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList20.add(((C82493mD) it9.next()).A01);
        }
        ArrayList arrayList21 = new ArrayList();
        Iterator it10 = arrayList20.iterator();
        while (it10.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it10.next()).A03, arrayList21);
        }
        c0Zx7.A07("t_50", AbstractC127805q5.A00(arrayList21, C127815qA.A00));
        ArrayList arrayList22 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it11 = list2.iterator();
        while (it11.hasNext()) {
            arrayList22.add(((C82493mD) it11.next()).A01);
        }
        ArrayList arrayList23 = new ArrayList();
        Iterator it12 = arrayList22.iterator();
        while (it12.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it12.next()).A05, arrayList23);
        }
        c0Zx7.A07("t_100", AbstractC127805q5.A00(arrayList23, C127825qB.A00));
        InterfaceC82443m8 interfaceC82443m8 = c82543mI.A02;
        C0Zx c0Zx8 = null;
        c0Zx8 = null;
        if (interfaceC82443m8 == null || !(interfaceC82443m8 instanceof InterfaceC82433m7)) {
            c82713mZ = null;
        } else {
            c82713mZ = ((InterfaceC82433m7) interfaceC82443m8).BH8();
        }
        try {
            InterfaceC82423m6 interfaceC82423m6 = c82543mI.A00;
            if (interfaceC82423m6 != null && (interfaceC82423m6 instanceof InterfaceC82433m7)) {
                c82713mZ = ((InterfaceC82433m7) interfaceC82423m6).BH8();
            }
        } catch (ClassCastException e) {
            C0w9.A03("MerlinLogger", AnonymousClass001.A0R("onViewabilityAggregated:type cast issue: ", e.getMessage()));
        }
        if (c82713mZ != null) {
            C11520jB A01 = c82713mZ.A01();
            C11500j9 c11500j9 = C5I8.A7b;
            if (!C14360o3.A0K(A01.A01(c11500j9), "live_preview")) {
                c0Zx8 = new C0Zx();
                try {
                    C19260xA c19260xA = c82713mZ.A00().A06;
                    C11520jB A012 = c82713mZ.A01();
                    c0Zx = new C0Zx();
                    String str5 = (String) A012.A01(C5I8.A0Y);
                    Long l9 = null;
                    if (str5 == null || (l7 = AbstractC003100w.A0k(10, str5)) == null) {
                        l7 = null;
                    }
                    c0Zx.A05("a_pk", l7);
                    c0Zx.A05("c_pk", AbstractC127855qE.A00((String) A012.A01(C5I8.A1V)));
                    String str6 = (String) A012.A01(C5I8.A1S);
                    if (str6 != null) {
                        l8 = Long.valueOf(Long.parseLong(str6));
                    } else {
                        l8 = null;
                    }
                    c0Zx.A05("ca_pk", l8);
                    c0Zx.A05("parent_c_pk", AbstractC127855qE.A00((String) A012.A01(C5I8.A6S)));
                    c0Zx.A03("is_covered", (Boolean) A012.A01(C5I8.A44));
                    c0Zx.A05("like_count", (Long) A012.A01(C5I8.A59));
                    c0Zx.A03("is_truncated", (Boolean) A012.A01(C5I8.A4x));
                    c0Zx.A05("character_count", (Long) A012.A01(C5I8.A1T));
                    c0Zx.A03("is_media_organic", (Boolean) A012.A01(C5I8.A4Y));
                    c0Zx.A06("c_index", (String) A012.A01(C5I8.A1W));
                    String str7 = (String) A012.A01(C5I8.A3r);
                    if (str7 == null) {
                        str7 = c82713mZ.A5t;
                    }
                    c0Zx.A06("inventory_source", str7);
                    c0Zx.A06("tracking_token", (String) A012.A01(C5I8.A9R));
                    c0Zx.A06("m_pk", (String) A012.A01(C5I8.A5K));
                    Long l10 = (Long) A012.A01(C5I8.A5c);
                    if (l10 == null || (str3 = l10.toString()) == null) {
                        str3 = "";
                    }
                    c0Zx.A06("m_t", str3);
                    c0Zx.A06("media_type", c19260xA.A05("media_type_for_merlin"));
                    C11500j9 c11500j92 = C5I8.A6s;
                    c0Zx.A06("ranking_session_id", (String) A012.A01(c11500j92));
                    c0Zx.A05("num_visible_media_notes", (Long) A012.A01(C5I8.A6I));
                    c0Zx.A06("chaining_session_id", (String) A012.A01(C5I8.A1C));
                    c0Zx.A05("chaining_position", (Long) A012.A01(C5I8.A1A));
                    c0Zx.A05("chaining_seed_author_id", (Long) A012.A01(C5I8.A1B));
                    String str8 = (String) A012.A01(C5I8.A3f);
                    c0Zx.A05("chaining_seed_media_id", str8 != null ? Long.valueOf(Long.parseLong(str8)) : null);
                    c0Zx.A06("follow_status", (String) A012.A01(C5I8.A2w));
                    c0Zx.A05("m_ix", (Long) A012.A01(C5I8.A3n));
                    c0Zx.A06("reel_id", (String) A012.A01(C5I8.A7W));
                    c0Zx.A06("tray_session_id", (String) A012.A01(C5I8.A7a));
                    c0Zx.A06("viewer_session_id", (String) A012.A01(C5I8.A9o));
                    c0Zx.A05("reel_position", (Long) A012.A01(C5I8.A7X));
                    c0Zx.A05("reel_viewer_position", (Long) A012.A01(C5I8.A7e));
                    c0Zx.A06("reel_type", (String) A012.A01(c11500j9));
                    c0Zx.A05("reel_size", (Long) A012.A01(C5I8.A7Y));
                    c0Zx.A05("tray_position", (Long) A012.A01(C5I8.A9V));
                    c0Zx.A04("time_elapsed", (Double) A012.A01(C5I8.A95));
                    c0Zx.A04("time_remaining", (Double) A012.A01(C5I8.A9A));
                    c0Zx.A04("time_paused", (Double) A012.A01(C5I8.A99));
                    c0Zx.A04("client_receive_time", (Double) A012.A01(C5I8.A94));
                    c0Zx.A03("is_highlights_sourced", (Boolean) A012.A01(C5I8.A4L));
                    c0Zx.A03("is_zoomed_out", (Boolean) A012.A01(C5I8.A52));
                    c0Zx.A06("story_ranking_token", (String) A012.A01(C5I8.A8U));
                    c0Zx.A06("delivery_flags", (String) A012.A01(C5I8.A27));
                    c0Zx.A05("dynamic_story_duration", (Long) A012.A01(C5I8.A2O));
                    C11500j9 c11500j93 = C5I8.A5R;
                    c0Zx.A05("media_loading_progress", (Long) A012.A01(c11500j93));
                    c0Zx.A03("is_media_loaded", (Boolean) A012.A01(C5I8.A4U));
                    String str9 = (String) A012.A01(C5I8.A6t);
                    if (str9 == null) {
                        str9 = (String) A012.A01(AbstractC129015sM.A01);
                    }
                    c0Zx.A06("rank_token", str9);
                    c0Zx.A06("topic_cluster_id", (String) A012.A01(C5I8.A9J));
                    c0Zx.A06("topic_cluster_title", (String) A012.A01(C5I8.A9L));
                    c0Zx.A06("topic_cluster_type", (String) A012.A01(C5I8.A9M));
                    c0Zx.A06("topic_cluster_debug_info", (String) A012.A01(C5I8.A9I));
                    c0Zx.A06("mezql_token", (String) A012.A01(C5I8.A5i));
                    String str10 = (String) A012.A01(C5I8.A5C);
                    c0Zx.A05("main_feed_carousel_starting_media_id", str10 != null ? Long.valueOf(Long.parseLong(str10)) : null);
                    c0Zx.A06("carousel_cover_media_id", (String) A012.A01(C5I8.A0x));
                    c0Zx.A05("carousel_container_media_id", (Long) A012.A01(C5I8.A0w));
                    c0Zx.A05("carousel_cover_media_id_int", (Long) A012.A01(C5I8.A0y));
                    c0Zx.A05("carousel_index", (Long) A012.A01(C5I8.A0z));
                    c0Zx.A05("carousel_media_id_int", (Long) A012.A01(C5I8.A11));
                    c0Zx.A05("carousel_starting_media_id", (Long) A012.A01(C5I8.A16));
                    String str11 = (String) A012.A01(C5I8.A3Q);
                    if (str11 == null && (str11 = (String) A012.A01(AbstractC129005sL.A01)) == null) {
                        str11 = c82713mZ.A5X;
                    }
                    c0Zx.A06("hashtag_follow_status", str11);
                    String A05 = c19260xA.A05("hashtag_id");
                    c0Zx.A05("hashtag_id", A05 != null ? Long.valueOf(Long.parseLong(A05)) : null);
                    String str12 = (String) A012.A01(C5I8.A3R);
                    if (str12 == null && (str12 = (String) A012.A01(AbstractC129005sL.A03)) == null) {
                        str12 = c82713mZ.A5Y;
                    }
                    c0Zx.A06("hashtag_name", str12);
                    String str13 = (String) A012.A01(C5I8.A3O);
                    if (str13 == null) {
                        str13 = (String) A012.A01(AbstractC129005sL.A00);
                    }
                    c0Zx.A06("hashtag_feed_type", str13);
                    C11500j9 c11500j94 = C5I8.A62;
                    c0Zx.A06("nav_chain", (String) A012.A01(c11500j94));
                    c0Zx.A06("canonical_nav_chain", (String) A012.A01(c11500j94));
                    c0Zx.A06("feed_request_id", (String) A012.A01(C5I8.A8E));
                    c0Zx.A05("is_dark_mode", (Long) A012.A01(C5I8.A4C));
                    c0Zx.A06("parent_m_pk", (String) A012.A01(C5I8.A6U));
                    c0Zx.A06("source_of_action", (String) A012.A01(C5I8.A8G));
                    c0Zx.A06("ranking_info_token", (String) A012.A01(C5I8.A6r));
                    c0Zx.A05("imp_logger_ver", (Long) A012.A01(C5I8.A3l));
                    c0Zx.A06("carousel_media_id", (String) A012.A01(C5I8.A10));
                    c0Zx.A06("container_module", c19260xA.A05("container_module"));
                    c0Zx.A05("client_position", (Long) A012.A01(C5I8.A3s));
                    c0Zx.A05("engagement_tray_unit_id", (Long) A012.A01(C5I8.A2V));
                    c0Zx.A07("engagement_unit_ids", (List) A012.A01(C5I8.A2X));
                    c0Zx.A05("engagement_tray_unit_item_id", (Long) A012.A01(C5I8.A2W));
                    c0Zx.A01((EnumC130265uW) A012.A01(C5I8.A2Y), "engagement_unit_type");
                    c0Zx.A03("is_eof", (Boolean) A012.A01(C5I8.A4H));
                    String str14 = (String) A012.A01(C5I8.A2e);
                    if (str14 == null) {
                        str14 = (String) A012.A01(AbstractC128995sK.A06);
                    }
                    c0Zx.A06("entity_type", str14);
                    Long l11 = (Long) A012.A01(C5I8.A2a);
                    if (l11 == null) {
                        String str15 = (String) A012.A01(AbstractC128995sK.A01);
                        l11 = str15 != null ? Long.valueOf(Long.parseLong(str15)) : null;
                    }
                    c0Zx.A05("entity_id", l11);
                    String str16 = (String) A012.A01(C5I8.A2b);
                    if (str16 == null) {
                        str16 = (String) A012.A01(AbstractC128995sK.A02);
                    }
                    c0Zx.A06("entity_name", str16);
                    String str17 = (String) A012.A01(C5I8.A2d);
                    if (str17 == null) {
                        str17 = (String) A012.A01(AbstractC128995sK.A04);
                    }
                    c0Zx.A06("entity_page_name", str17);
                    String str18 = (String) A012.A01(C5I8.A2c);
                    if (str18 == null && (str18 = (String) A012.A01(AbstractC128995sK.A03)) == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(Long.parseLong(str18));
                    }
                    c0Zx.A05("entity_page_id", valueOf2);
                    String A052 = c19260xA.A05("recs_ix");
                    c0Zx.A05("recs_ix", A052 != null ? Long.valueOf(Long.parseLong(A052)) : null);
                    c0Zx.A03("is_stories_pog_impression", (Boolean) A012.A01(C5I8.A4b));
                    String str19 = (String) A012.A01(C5I8.A6T);
                    c0Zx.A05("parent_comment_index", str19 != null ? Long.valueOf(Long.parseLong(str19)) : null);
                    String str20 = (String) A012.A01(C5I8.A1F);
                    c0Zx.A05("child_comment_index", str20 != null ? Long.valueOf(Long.parseLong(str20)) : null);
                    c0Zx.A03("is_ranked_comment", (Boolean) A012.A01(C5I8.A4j));
                    c0Zx.A03("is_preview", (Boolean) A012.A01(C5I8.A4d));
                    c0Zx.A03("is_reply_highlight", (Boolean) A012.A01(C5I8.A4l));
                    c0Zx.A03("merlin_double_logging_enabled", (Boolean) A012.A01(C5I8.A4V));
                    c0Zx.A03("client_sub_impression", (Boolean) A012.A01(C5I8.A1I));
                    c0Zx.A04("sum_duration_ms", (Double) A012.A01(C5I8.A9x));
                    ArrayList A06 = c19260xA.A06("attribution_type");
                    if (!(A06 instanceof List)) {
                        A06 = null;
                    }
                    c0Zx.A07("attribution_type", A06);
                    C11500j9 c11500j95 = C5I8.A3W;
                    String str21 = (String) A012.A01(c11500j95);
                    c0Zx.A05("highlight_id", (str21 == null || (str4 = (String) AbstractC001800i.A0O(AbstractC001900j.A0R(str21, new String[]{":"}, 0), 1)) == null) ? null : Long.valueOf(Long.parseLong(str4)));
                    c0Zx.A06("highlight_reel_id", (String) A012.A01(c11500j95));
                    c0Zx.A06("social_context_type", (String) A012.A01(C5I8.A8C));
                    c0Zx.A07("social_context_user_ids", (List) A012.A01(C5I8.A8D));
                    c0Zx.A07("facepile_user_ids", (List) A012.A01(C5I8.A2m));
                    c0Zx.A07("friendly_bubble_user_ids", (List) A012.A01(C5I8.A2z));
                    c0Zx.A07("comment_bubble_user_ids", (List) A012.A01(C5I8.A2y));
                    c0Zx.A03("production_build", (Boolean) A012.A01(C5I8.A2i));
                    C11500j9 c11500j96 = C5I8.A5M;
                    c0Zx.A05("media_id", (Long) A012.A01(c11500j96));
                    C11500j9 c11500j97 = C5I8.A5G;
                    c0Zx.A05("media_author_id", (Long) A012.A01(c11500j97));
                    c0Zx.A03("has_translation", c19260xA.A01("has_translation"));
                    c0Zx.A03("is_checkout_enabled", (Boolean) A012.A01(C5I8.A42));
                    c0Zx.A05("repost_id", c82713mZ.A4F);
                    c0Zx.A01(c82713mZ.A0e, "is_audio_muted_type");
                    c0Zx.A06("serp_session_id", c82713mZ.A6z);
                    C9BB c9bb = c82713mZ.A0g;
                    if (c9bb != null) {
                        C0Zx c0Zx9 = new C0Zx();
                        c0Zx9.A05("view_height", Long.valueOf(c9bb.A00));
                        c0Zx9.A05("view_width", Long.valueOf(c9bb.A01));
                        c0Zx9.A03("is_paged", Boolean.valueOf(c9bb.A04));
                        c0Zx9.A03("is_tall", Boolean.valueOf(c9bb.A02));
                        c0Zx.A02(c0Zx9, "view_metadata");
                    }
                    C125225lT c125225lT = c82713mZ.A0w;
                    if (c125225lT != null) {
                        c0Zx.A06("netego_id", c125225lT.A07);
                        c0Zx.A06("netego_type", c125225lT.A03);
                        c0Zx.A07("netego_item_ids", c125225lT.A08);
                        c0Zx.A05("netego_subtype", c125225lT.A00);
                        c0Zx.A06("ranking_session_id", null);
                        c0Zx.A06("ranking_info_token", c125225lT.A05);
                        c0Zx.A06("module_name", c125225lT.A06);
                        c0Zx.A06("source_of_action", c125225lT.A01);
                        c0Zx.A06("tracking_token", c125225lT.A02);
                        c0Zx.A06("ranking_algorithm", c125225lT.A04);
                        c0Zx.A06("order_item_id", null);
                        c0Zx.A06("release_channel", null);
                        c0Zx.A06("format", null);
                    }
                    if (A012.A01(c11500j92) == null) {
                        c0Zx.A06("ranking_session_id", c82713mZ.A6h);
                    }
                    if (A012.A01(C5I8.A2t) == null) {
                        c0Zx.A06("feed_session_id", c82713mZ.A5N);
                    }
                    if (A012.A01(C5I8.A8X) == null) {
                        c0Zx.A05("sub_vpvd_reason_server", c82713mZ.A3H != null ? Long.valueOf(r0.intValue()) : null);
                    }
                    if (A012.A01(C5I8.A8W) == null) {
                        c0Zx.A05("sub_vpvd_reason_client", c82713mZ.A2v != null ? Long.valueOf(r0.intValue()) : null);
                    }
                    c0Zx.A06("context_string", c82713mZ.A4z);
                    if (A012.A01(c11500j93) == null) {
                        c0Zx.A05("media_loading_progress", c82713mZ.A3l);
                    }
                    if (A012.A01(c11500j96) == null) {
                        c0Zx.A05("media_id", c82713mZ.A3k);
                    }
                    if (A012.A01(c11500j97) == null) {
                        c0Zx.A05("media_author_id", c82713mZ.A3j);
                    }
                    if (A012.A01(C5I8.A0W) == null) {
                        c0Zx.A06("audience", c82713mZ.A4a);
                    }
                    if (c19260xA.A05("recs_ix") == null) {
                        int i = c82713mZ.A07;
                        if (i != -1 && Integer.valueOf(i) != null) {
                            l9 = Long.valueOf(i);
                        }
                        c0Zx.A05("recs_ix", l9);
                    }
                    c0Zx.A03("media_caption_has_see_more", c82713mZ.A29);
                    c0Zx.A05("num_likers_displayed", c82713mZ.A3z);
                    c0Zx.A05("num_named_likers_displayed", c82713mZ.A40);
                    c0Zx.A05("num_visible_story_comments", c82713mZ.A42);
                    List list3 = c82713mZ.A7r;
                    if (list3 != null) {
                        c0Zx.A07("attribution_type", list3);
                    }
                } catch (ClassCastException unused) {
                    c0Zx = new C0Zx();
                }
                c0Zx8.A02(c0Zx, "ig_vpv");
                int intValue = num.intValue();
                if (intValue == 0) {
                    try {
                        C19260xA c19260xA2 = c82713mZ.A00().A06;
                        C11520jB A013 = c82713mZ.A01();
                        C0Zx c0Zx10 = new C0Zx();
                        String str22 = (String) A013.A01(C5I8.A0Y);
                        if (str22 != null) {
                            l = C4SX.A00(str22).A00;
                        } else {
                            l = null;
                        }
                        c0Zx10.A05("a_pk", l);
                        c0Zx10.A05("c_pk", AbstractC127855qE.A00((String) A013.A01(C5I8.A1V)));
                        String str23 = (String) A013.A01(C5I8.A1S);
                        if (str23 != null) {
                            l2 = C4SX.A00(str23).A00;
                        } else {
                            l2 = null;
                        }
                        c0Zx10.A05("ca_pk", l2);
                        c0Zx10.A05("parent_c_pk", AbstractC127855qE.A00((String) A013.A01(C5I8.A6S)));
                        c0Zx10.A03("is_covered", (Boolean) A013.A01(C5I8.A44));
                        c0Zx10.A05("like_count", (Long) A013.A01(C5I8.A59));
                        c0Zx10.A03("is_media_organic", (Boolean) A013.A01(C5I8.A4Y));
                        c0Zx10.A06("c_index", (String) A013.A01(C5I8.A1W));
                        String A053 = c19260xA2.A05("sponsor_tag_count");
                        c0Zx10.A05("sponsor_tag_count", A053 != null ? Long.valueOf(Long.parseLong(A053)) : null);
                        c0Zx10.A06("m_pk", (String) A013.A01(C5I8.A5K));
                        c0Zx10.A06("tracking_token", (String) A013.A01(C5I8.A9R));
                        C11500j9 c11500j98 = C5I8.A5c;
                        c0Zx10.A05("m_t", (Long) A013.A01(c11500j98));
                        String A054 = c19260xA2.A05("hashtag_id");
                        c0Zx10.A05("hashtag_id", A054 != null ? Long.valueOf(Long.parseLong(A054)) : null);
                        c0Zx10.A07("feed_sticker_media_id", (List) A013.A01(C5I8.A2r));
                        c0Zx10.A06("inventory_source", (String) A013.A01(C5I8.A3r));
                        c0Zx10.A05("carousel_index", (Long) A013.A01(C5I8.A0z));
                        String str24 = (String) A013.A01(C5I8.A3y);
                        c0Zx10.A03("is_app_backgrounded", str24 != null ? Boolean.valueOf(Boolean.parseBoolean(str24)) : null);
                        c0Zx10.A06("last_navigation_module", (String) A013.A01(C5I8.A58));
                        c0Zx10.A06("application_state", (String) A013.A01(C5I8.A0Q));
                        c0Zx10.A06("hashtag_name", (String) A013.A01(C5I8.A3R));
                        c0Zx10.A06("hashtag_feed_type", (String) A013.A01(C5I8.A3O));
                        c0Zx10.A06("carousel_media_id", (String) A013.A01(C5I8.A10));
                        c0Zx10.A05("carousel_starting_media_id", (Long) A013.A01(C5I8.A16));
                        c0Zx10.A06("carousel_cover_media_id", (String) A013.A01(C5I8.A0x));
                        c0Zx10.A06("reel_id", (String) A013.A01(C5I8.A7W));
                        c0Zx10.A06("tray_session_id", (String) A013.A01(C5I8.A7a));
                        c0Zx10.A06("viewer_session_id", (String) A013.A01(C5I8.A9o));
                        c0Zx10.A06("ranking_session_id", (String) A013.A01(C5I8.A6s));
                        c0Zx10.A06("chaining_session_id", (String) A013.A01(C5I8.A1C));
                        c0Zx10.A05("chaining_position", (Long) A013.A01(C5I8.A1A));
                        c0Zx10.A06("action", (String) A013.A01(C5I8.A00));
                        c0Zx10.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A013.A01(C5I8.A2f));
                        String A00 = AbstractC58317Pt9.A00(35);
                        c0Zx10.A06(A00, c19260xA2.A05(A00));
                        c0Zx10.A03("is_checkout_enabled", (Boolean) A013.A01(C5I8.A42));
                        String A055 = c19260xA2.A05("can_add_to_bag");
                        c0Zx10.A03("can_add_to_bag", A055 != null ? Boolean.valueOf(Boolean.parseBoolean(A055)) : null);
                        String str25 = (String) A013.A01(C5I8.A5g);
                        if (str25 != null) {
                            l3 = C4SX.A00(str25).A00;
                        } else {
                            l3 = null;
                        }
                        c0Zx10.A05("merchant_id", l3);
                        c0Zx10.A06("prior_module", (String) A013.A01(C5I8.A6j));
                        String str26 = (String) A013.A01(C5I8.A6k);
                        c0Zx10.A05("product_id", str26 != null ? Long.valueOf(Long.parseLong(str26)) : null);
                        ArrayList arrayList24 = (ArrayList) A013.A01(C5I8.A6l);
                        if (arrayList24 != null) {
                            ArrayList arrayList25 = new ArrayList(AbstractC06950Ym.A1E(arrayList24, 10));
                            Iterator it13 = arrayList24.iterator();
                            while (it13.hasNext()) {
                                String str27 = (String) it13.next();
                                C14360o3.A0B(str27, 0);
                                arrayList25.add(AbstractC003100w.A0k(10, str27));
                            }
                            arrayList = new ArrayList(AbstractC001800i.A0X(arrayList25));
                        } else {
                            arrayList = null;
                        }
                        c0Zx10.A07("product_ids", arrayList);
                        c0Zx10.A05("m_ix", (Long) A013.A01(C5I8.A3n));
                        String str28 = (String) A013.A01(C5I8.A3f);
                        c0Zx10.A05("chaining_seed_media_id", str28 != null ? Long.valueOf(Long.parseLong(str28)) : null);
                        c0Zx10.A05("chaining_seed_author_id", (Long) A013.A01(C5I8.A1B));
                        c0Zx10.A05("reel_gap", (Long) A013.A01(C5I8.A7S));
                        c0Zx10.A06("event_trace_id", (String) A013.A01(C5I8.A2g));
                        c0Zx10.A06("host_video_pk", (String) A013.A01(C5I8.A3b));
                        c0Zx10.A06("media_layout_encoded_string", (String) A013.A01(C5I8.A5Q));
                        c0Zx10.A03("mop_should_double_logging", (Boolean) A013.A01(C5I8.A5p));
                        c0Zx10.A03("mop_should_rollout", (Boolean) A013.A01(C5I8.A5q));
                        c0Zx10.A03("is_zoomed_out", (Boolean) A013.A01(C5I8.A52));
                        ArrayList arrayList26 = (ArrayList) A013.A01(C5I8.A1e);
                        if (arrayList26 != null) {
                            ArrayList arrayList27 = new ArrayList(AbstractC06950Ym.A1E(arrayList26, 10));
                            Iterator it14 = arrayList26.iterator();
                            while (it14.hasNext()) {
                                arrayList27.add(AbstractC06930Yk.A03((HashMap) it14.next()));
                            }
                            arrayList2 = AbstractC001800i.A0U(arrayList27);
                        } else {
                            arrayList2 = null;
                        }
                        c0Zx10.A07("client_ad_creative_optimization_output", arrayList2);
                        c0Zx10.A03("is_previewable_video_ad", (Boolean) A013.A01(C5I8.A4c));
                        c0Zx10.A06("ad_skip_type", (String) A013.A01(C5I8.A0M));
                        c0Zx10.A03("is_cta_sticker_available", (Boolean) A013.A01(C5I8.A45));
                        c0Zx10.A03("is_cta_sticker_shown", (Boolean) A013.A01(C5I8.A48));
                        c0Zx10.A03("is_sensitive_vertical_ad", (Boolean) A013.A01(C5I8.A4q));
                        c0Zx10.A03("post_impression_column_override", (Boolean) A013.A01(C5I8.A6Q));
                        c0Zx10.A06("radio_type", (String) A013.A01(C5I8.A6q));
                        String str29 = (String) A013.A01(C5I8.A7w);
                        c0Zx10.A05("seed_ad_id", str29 != null ? Long.valueOf(Long.parseLong(str29)) : null);
                        String str30 = (String) A013.A01(C5I8.A3c);
                        c0Zx10.A05("hscroll_seed_ad_id", str30 != null ? Long.valueOf(Long.parseLong(str30)) : null);
                        String str31 = (String) A013.A01(C5I8.A2v);
                        c0Zx10.A05("first_hscroll_item_ad_id", str31 != null ? Long.valueOf(Long.parseLong(str31)) : null);
                        c0Zx10.A05("horizontal_position_on_hscroll", (Long) A013.A01(C5I8.A3X));
                        c0Zx10.A05("vertical_position_on_feed_of_ads", (Long) A013.A01(C5I8.A9j));
                        c0Zx10.A03("is_multi_ads", (Boolean) A013.A01(C5I8.A4W));
                        c0Zx10.A05("multi_ads_type", (Long) A013.A01(C5I8.A5y));
                        c0Zx10.A06("multi_ads_id", (String) A013.A01(C5I8.A5w));
                        c0Zx10.A05("position_in_multi_ads_unit", (Long) A013.A01(C5I8.A6a));
                        String str32 = (String) A013.A01(C5I8.A5v);
                        c0Zx10.A05("multi_ads_first_ad_id", str32 != null ? Long.valueOf(Long.parseLong(str32)) : null);
                        c0Zx10.A05("ad_consumed_media_gap", (Long) A013.A01(C5I8.A06));
                        c0Zx10.A05("netego_consumed_media_gap", (Long) A013.A01(C5I8.A63));
                        c0Zx10.A05("priority_index", (Long) A013.A01(C5I8.A6i));
                        c0Zx10.A05("highest_position_rule", (Long) A013.A01(C5I8.A3V));
                        c0Zx10.A05("max_reel_gap_to_previous_item", (Long) A013.A01(C5I8.A5D));
                        c0Zx10.A05("min_media_gap_to_previous_item", (Long) A013.A01(C5I8.A5n));
                        c0Zx10.A04("time_gap_to_previous_item_in_sec", (Double) A013.A01(C5I8.A97));
                        c0Zx10.A05("consumed_media_gap", (Long) A013.A01(C5I8.A1Z));
                        c0Zx10.A05("consumed_media_gap_highest_position", (Long) A013.A01(C5I8.A1a));
                        c0Zx10.A05("reel_gap_highest_position", (Long) A013.A01(C5I8.A7T));
                        c0Zx10.A06("previous_media_pk", (String) A013.A01(C5I8.A6c));
                        c0Zx10.A06("next_media_pk", (String) A013.A01(C5I8.A68));
                        c0Zx10.A05("segment_index", (Long) A013.A01(C5I8.A7y));
                        c0Zx10.A05("segment_count", (Long) A013.A01(C5I8.A7x));
                        c0Zx10.A06("ad_pod_id", (String) A013.A01(C5I8.A0G));
                        c0Zx10.A05("index_in_ad_pod", (Long) A013.A01(C5I8.A3o));
                        ArrayList arrayList28 = (ArrayList) A013.A01(C5I8.A9m);
                        if (arrayList28 != null) {
                            ArrayList arrayList29 = new ArrayList(AbstractC06950Ym.A1E(arrayList28, 10));
                            Iterator it15 = arrayList28.iterator();
                            while (it15.hasNext()) {
                                arrayList29.add(AnonymousClass010.A0m((String) it15.next()));
                            }
                            arrayList3 = new ArrayList(AbstractC001800i.A0X(arrayList29));
                        } else {
                            arrayList3 = null;
                        }
                        c0Zx10.A07("video_to_carousel_cut_secs", arrayList3);
                        c0Zx10.A05("seq_num", (Long) A013.A01(C5I8.A7z));
                        c0Zx10.A06("disclaimer_text", (String) A013.A01(C5I8.A2D));
                        c0Zx10.A06("disclaimer_title", (String) A013.A01(C5I8.A2E));
                        c0Zx10.A05("carousel_type", (Long) A013.A01(C5I8.A19));
                        c0Zx10.A05("has_top_likers", (Long) A013.A01(C5I8.A3U));
                        c0Zx10.A05("ad_delivery_position", (Long) A013.A01(C5I8.A0A));
                        c0Zx10.A03("is_first_ad_in_the_session", (Boolean) A013.A01(C5I8.A4I));
                        c0Zx10.A05("seq_session", (Long) A013.A01(C5I8.A80));
                        c0Zx10.A06("cache_key", (String) A013.A01(C5I8.A0m));
                        c0Zx10.A06("call_stack", (String) A013.A01(C5I8.A0n));
                        c0Zx10.A04("time_interval_since_reference_date", (Double) A013.A01(C5I8.A98));
                        C11500j9 c11500j99 = C5I8.A93;
                        c0Zx10.A04("time_stamp", ((Long) A013.A01(c11500j99)) != null ? Double.valueOf(r0.longValue()) : null);
                        c0Zx10.A06("disclaimer_url", (String) A013.A01(C5I8.A2F));
                        c0Zx10.A06("next_inventory_source", (String) A013.A01(C5I8.A69));
                        c0Zx10.A06("prev_inventory_source", (String) A013.A01(C5I8.A6d));
                        c0Zx10.A05("num_visible_story_comments", (Long) A013.A01(C5I8.A6J));
                        C11520jB c11520jB = (C11520jB) A013.A01(C5I8.A5P);
                        if (c11520jB != null) {
                            C19260xA A002 = c11520jB.A00();
                            C0Zx c0Zx11 = new C0Zx();
                            c0Zx11.A03("is_showreel_native", (Boolean) c11520jB.A01(C5I8.A4r));
                            String A056 = A002.A05("media_height");
                            c0Zx11.A04("media_height", A056 != null ? Double.valueOf(Double.parseDouble(A056)) : null);
                            String A057 = A002.A05("media_width");
                            c0Zx11.A04("media_width", A057 != null ? Double.valueOf(Double.parseDouble(A057)) : null);
                            String A058 = A002.A05("caption_font_size");
                            c0Zx11.A04("caption_font_size", A058 != null ? Double.valueOf(Double.parseDouble(A058)) : null);
                            String A059 = A002.A05("caption_position_start_x");
                            c0Zx11.A04("caption_position_start_x", A059 != null ? Double.valueOf(Double.parseDouble(A059)) : null);
                            String A0510 = A002.A05("caption_position_start_y");
                            c0Zx11.A04("caption_position_start_y", A0510 != null ? Double.valueOf(Double.parseDouble(A0510)) : null);
                            String A0511 = A002.A05("caption_line_height");
                            c0Zx11.A04("caption_line_height", A0511 != null ? Double.valueOf(Double.parseDouble(A0511)) : null);
                            String A0512 = A002.A05("caption_line_height");
                            c0Zx11.A04("caption_height", A0512 != null ? Double.valueOf(Double.parseDouble(A0512)) : null);
                            String A0513 = A002.A05("caption_width");
                            c0Zx11.A04("caption_width", A0513 != null ? Double.valueOf(Double.parseDouble(A0513)) : null);
                            String A0514 = A002.A05("is_caption_fully_displayed");
                            c0Zx11.A03("is_caption_fully_displayed", A0514 != null ? Boolean.valueOf(Boolean.parseBoolean(A0514)) : null);
                            c0Zx11.A06("background_color_bottom", A002.A05("background_color_bottom"));
                            c0Zx11.A06("background_color_caption", A002.A05("background_color_caption"));
                            c0Zx11.A06("background_color_top", A002.A05("background_color_top"));
                            c0Zx11.A06("caption_background_color_alpha", A002.A05("caption_background_color_alpha"));
                            String A0515 = A002.A05("caption_num_char_showed");
                            c0Zx11.A05("caption_num_char_showed", A0515 != null ? Long.valueOf(Long.parseLong(A0515)) : null);
                            String A0516 = A002.A05("caption_num_hashtags_showed");
                            c0Zx11.A05("caption_num_hashtags_showed", A0516 != null ? Long.valueOf(Long.parseLong(A0516)) : null);
                            String A0517 = A002.A05("caption_num_lines_showed");
                            c0Zx11.A05("caption_num_lines_showed", A0517 != null ? Long.valueOf(Long.parseLong(A0517)) : null);
                            String A0518 = A002.A05("caption_num_lines_total");
                            c0Zx11.A05("caption_num_lines_total", A0518 != null ? Long.valueOf(Long.parseLong(A0518)) : null);
                            String A0519 = A002.A05("caption_num_mentions_showed");
                            c0Zx11.A05("caption_num_mentions_showed", A0519 != null ? Long.valueOf(Long.parseLong(A0519)) : null);
                            c0Zx11.A06("caption_text_color", A002.A05("caption_text_color"));
                            c0Zx11.A06("cta_color", (String) c11520jB.A01(C5I8.A1i));
                            c0Zx11.A06("headline_text_showed", A002.A05("headline_text_showed"));
                            c0Zx11.A04("screen_density", (Double) c11520jB.A01(C5I8.A7o));
                            c0Zx11.A04("screen_height", (Double) c11520jB.A01(C5I8.A7p));
                            c0Zx11.A04("screen_width", (Double) c11520jB.A01(C5I8.A7q));
                            c0Zx10.A02(c0Zx11, "media_layout");
                        }
                        String A0520 = c19260xA2.A05("pk");
                        if (A0520 != null) {
                            c0Zx10.A05("pk", C4SX.A00(A0520).A00);
                        }
                        c0Zx10.A06("release_channel", (String) A013.A01(C5I8.A7f));
                        c0Zx10.A06("sessions_chain", (String) A013.A01(C5I8.A82));
                        c0Zx10.A03("production_build", (Boolean) A013.A01(C5I8.A2i));
                        c0Zx10.A06("topic_cluster_id", (String) A013.A01(C5I8.A9J));
                        c0Zx10.A06("topic_cluster_title", (String) A013.A01(C5I8.A9L));
                        c0Zx10.A06("topic_cluster_type", (String) A013.A01(C5I8.A9M));
                        c0Zx10.A06("topic_cluster_debug_info", (String) A013.A01(C5I8.A9I));
                        c0Zx10.A06("ranking_info_token", (String) A013.A01(C5I8.A6r));
                        c0Zx10.A06("shopping_session_id", (String) A013.A01(C5I8.A86));
                        c0Zx10.A06("follow_status", (String) A013.A01(C5I8.A2w));
                        c0Zx10.A06("source_of_action", (String) A013.A01(C5I8.A8G));
                        c0Zx10.A04("elapsed_time_since_last_item", (Double) A013.A01(C5I8.A2Q));
                        c0Zx10.A05("m_ts", (Long) A013.A01(c11500j99));
                        c0Zx10.A03("is_acp_delivered", (Boolean) A013.A01(C5I8.A3u));
                        c0Zx10.A03("is_ad", (Boolean) A013.A01(C5I8.A3t));
                        String str33 = (String) A013.A01(C5I8.A61);
                        c0Zx10.A05("nav_in_transit", str33 != null ? Long.valueOf(Long.parseLong(str33)) : null);
                        c0Zx10.A05("imp_logger_ver", (Long) A013.A01(C5I8.A3l));
                        c0Zx10.A05("reel_size", (Long) A013.A01(C5I8.A7Y));
                        c0Zx10.A05("reel_position", (Long) A013.A01(C5I8.A7X));
                        c0Zx10.A05("tray_position", (Long) A013.A01(C5I8.A9V));
                        c0Zx10.A05("session_reel_counter", (Long) A013.A01(C5I8.A84));
                        c0Zx10.A06("reel_type", (String) A013.A01(c11500j9));
                        c0Zx10.A05("reel_viewer_position", (Long) A013.A01(C5I8.A7e));
                        c0Zx10.A04("time_elapsed", (Double) A013.A01(C5I8.A95));
                        c0Zx10.A05("reel_start_position", (Long) A013.A01(C5I8.A7Z));
                        c0Zx10.A03("is_video_to_carousel", (Boolean) A013.A01(C5I8.A51));
                        c0Zx10.A06(AbstractC58461Pvm.A00(9, 10, 49), (String) A013.A01(C5I8.A83));
                        c0Zx10.A06("story_ranking_token", (String) A013.A01(C5I8.A8U));
                        c0Zx10.A06("delivery_flags", (String) A013.A01(C5I8.A27));
                        c0Zx10.A03("is_eof", (Boolean) A013.A01(C5I8.A4H));
                        c0Zx10.A06("feed_request_id", (String) A013.A01(C5I8.A8E));
                        c0Zx10.A06("entity_type", (String) A013.A01(C5I8.A2e));
                        c0Zx10.A05("entity_id", (Long) A013.A01(C5I8.A2a));
                        c0Zx10.A06("entity_name", (String) A013.A01(C5I8.A2b));
                        c0Zx10.A06("entity_follow_status", (String) A013.A01(C5I8.A2Z));
                        c0Zx10.A06("mezql_token", (String) A013.A01(C5I8.A5i));
                        c0Zx10.A06("media_thumbnail_section", (String) A013.A01(C5I8.A5Z));
                        c0Zx10.A06("entity_page_name", (String) A013.A01(C5I8.A2d));
                        String str34 = (String) A013.A01(C5I8.A2c);
                        c0Zx10.A05("entity_page_id", str34 != null ? Long.valueOf(Long.parseLong(str34)) : null);
                        ArrayList arrayList30 = (ArrayList) A013.A01(C5I8.A8p);
                        if (arrayList30 != null) {
                            ArrayList arrayList31 = new ArrayList(AbstractC06950Ym.A1E(arrayList30, 10));
                            Iterator it16 = arrayList30.iterator();
                            while (it16.hasNext()) {
                                String str35 = (String) it16.next();
                                C14360o3.A0B(str35, 0);
                                arrayList31.add(AbstractC003100w.A0k(10, str35));
                            }
                            arrayList4 = new ArrayList(AbstractC001800i.A0X(arrayList31));
                        } else {
                            arrayList4 = null;
                        }
                        c0Zx10.A07("tagged_user_ids", arrayList4);
                        c0Zx10.A06("connection_id", (String) A013.A01(C5I8.A1X));
                        c0Zx10.A05("carousel_size", (Long) A013.A01(C5I8.A15));
                        c0Zx10.A06("parent_m_pk", (String) A013.A01(C5I8.A6U));
                        c0Zx10.A05("carousel_media_type", (Long) A013.A01(C5I8.A12));
                        c0Zx10.A06("endpoint_type", (String) A013.A01(C5I8.A2S));
                        c0Zx10.A06("hashtag_follow_status", (String) A013.A01(C5I8.A3Q));
                        c0Zx10.A03("is_igtv", (Boolean) A013.A01(C5I8.A4N));
                        String str36 = (String) A013.A01(C5I8.A5C);
                        c0Zx10.A05("main_feed_carousel_starting_media_id", str36 != null ? Long.valueOf(Long.parseLong(str36)) : null);
                        c0Zx10.A05("is_dark_mode", (Long) A013.A01(C5I8.A4C));
                        C11500j9 c11500j910 = C5I8.A5R;
                        c0Zx10.A05("media_loading_progress", (Long) A013.A01(c11500j910));
                        c0Zx10.A06("current_module", c19260xA2.A05("current_module"));
                        c0Zx10.A06("is_coming_from", (String) A013.A01(C5I8.A43));
                        c0Zx10.A04("time_remaining", (Double) A013.A01(C5I8.A9A));
                        ArrayList A062 = c19260xA2.A06("shared_product_ids");
                        if (A062 == null) {
                            A062 = null;
                        }
                        c0Zx10.A07("shared_product_ids", A062);
                        c0Zx10.A03("is_highlights_sourced", (Boolean) A013.A01(C5I8.A4L));
                        c0Zx10.A05("media_loading_progress", (Long) A013.A01(c11500j910));
                        String str37 = (String) A013.A01(C5I8.A6b);
                        c0Zx10.A05("post_id", str37 != null ? Long.valueOf(Long.parseLong(str37)) : null);
                        String str38 = (String) A013.A01(C5I8.A9W);
                        c0Zx10.A05("tray_pos_excl_own_story", str38 != null ? Long.valueOf(Long.parseLong(str38)) : null);
                        c0Zx10.A05("tab_index", (Long) A013.A01(C5I8.A8o));
                        c0Zx10.A06("igtv_viewer_session_id", (String) A013.A01(C5I8.A3i));
                        c0Zx10.A06("channel_pk", (String) A013.A01(C5I8.A1E));
                        c0Zx10.A06("collection_id", (String) A013.A01(C5I8.A1L));
                        c0Zx10.A06("collection_name", (String) A013.A01(C5I8.A1N));
                        c0Zx10.A06("audience", (String) A013.A01(C5I8.A0W));
                        c0Zx10.A03("impression_logger_validate", (Boolean) A013.A01(C5I8.A3j));
                        c0Zx10.A06("nav_chain", (String) A013.A01(C5I8.A62));
                        ArrayList arrayList32 = (ArrayList) A013.A01(C5I8.A8M);
                        if (arrayList32 != null) {
                            ArrayList arrayList33 = new ArrayList(AbstractC06950Ym.A1E(arrayList32, 10));
                            Iterator it17 = arrayList32.iterator();
                            while (it17.hasNext()) {
                                String str39 = (String) it17.next();
                                C14360o3.A0B(str39, 0);
                                arrayList33.add(AbstractC003100w.A0k(10, str39));
                            }
                            arrayList5 = new ArrayList(AbstractC001800i.A0X(arrayList33));
                        } else {
                            arrayList5 = null;
                        }
                        c0Zx10.A07("sponsor_tag_ids", arrayList5);
                        String A0521 = c19260xA2.A05("is_replay");
                        c0Zx10.A03("is_replay", A0521 != null ? Boolean.valueOf(Boolean.parseBoolean(A0521)) : null);
                        c0Zx10.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c19260xA2.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                        c0Zx10.A03("is_influencer", (Boolean) A013.A01(C5I8.A4P));
                        Long l12 = (Long) A013.A01(C5I8.A2P);
                        if (l12 == null) {
                            l12 = null;
                        }
                        c0Zx10.A05("effect_id", l12);
                        Long l13 = (Long) A013.A01(C5I8.A5I);
                        if (l13 == null) {
                            l13 = null;
                        }
                        c0Zx10.A05("media_face_effect_id", l13);
                        c0Zx10.A05("carousel_media_type", (Long) A013.A01(C5I8.A13));
                        c0Zx10.A06("reply_type", c19260xA2.A05("reply_type"));
                        c0Zx10.A05("media_id", (Long) A013.A01(C5I8.A5M));
                        c0Zx10.A05("media_author_id", (Long) A013.A01(C5I8.A5G));
                        c0Zx10.A06("surface", c19260xA2.A05("surface"));
                        String A0522 = c19260xA2.A05("has_ad_inserted");
                        c0Zx10.A03("has_ad_inserted", A0522 != null ? Boolean.valueOf(Boolean.parseBoolean(A0522)) : null);
                        c0Zx10.A06("source_channel_type", c19260xA2.A05("source_channel_type"));
                        c0Zx10.A06("component_type", c19260xA2.A05("component_type"));
                        String A0523 = c19260xA2.A05("video_y_position");
                        c0Zx10.A05("video_y_position", A0523 != null ? Long.valueOf(Long.parseLong(A0523)) : null);
                        c0Zx10.A05("ad_id", (Long) A013.A01(C5I8.A0C));
                        c0Zx10.A05("top_liker_count", (Long) A013.A01(C5I8.A9P));
                        String str40 = (String) A013.A01(C5I8.A2j);
                        c0Zx10.A05("e_counter_channel", str40 != null ? Long.valueOf(Long.parseLong(str40)) : null);
                        String str41 = (String) A013.A01(C5I8.A2k);
                        c0Zx10.A05("e_counter_id", str41 != null ? Long.valueOf(Long.parseLong(str41)) : null);
                        String str42 = (String) A013.A01(C5I8.A2l);
                        c0Zx10.A05("e_counter_sid", str42 != null ? Long.valueOf(Long.parseLong(str42)) : null);
                        c0Zx10.A03("is_besties_reel", (Boolean) A013.A01(C5I8.A41));
                        c0Zx10.A06("igtv_destination_session_id", c19260xA2.A05("igtv_destination_session_id"));
                        c0Zx10.A06("is_programmatic_scroll", (String) A013.A01(C5I8.A4h));
                        String A0524 = c19260xA2.A05("is_live_streaming");
                        c0Zx10.A05("is_live_streaming", A0524 != null ? Long.valueOf(Long.parseLong(A0524)) : null);
                        c0Zx10.A04("normalized_feed_position", ((Long) A013.A01(C5I8.A6A)) != null ? Double.valueOf(r0.longValue()) : null);
                        String str43 = (String) A013.A01(C5I8.A01);
                        c0Zx10.A05("actor_id", str43 != null ? Long.valueOf(Long.parseLong(str43)) : null);
                        String A0525 = c19260xA2.A05("is_live_questions");
                        c0Zx10.A05("is_live_questions", A0525 != null ? Long.valueOf(Long.parseLong(A0525)) : null);
                        c0Zx10.A06("feed_type", c19260xA2.A05("feed_type"));
                        c0Zx10.A06("impression_token", c19260xA2.A05("impression_token"));
                        c0Zx10.A03("is_besties_media", (Boolean) A013.A01(C5I8.A40));
                        c0Zx10.A03("is_image_loaded", (Boolean) A013.A01(C5I8.A4O));
                        c0Zx10.A06("media_tags_hashtag_name", (String) A013.A01(C5I8.A5X));
                        c0Zx10.A05("media_tags_total_hashtags", (Long) A013.A01(C5I8.A5Y));
                        c0Zx10.A06("igtv_browse_session_id", c19260xA2.A05("igtv_browse_session_id"));
                        c0Zx10.A06("is_on_screen", c19260xA2.A05("is_on_screen"));
                        String str44 = (String) A013.A01(C5I8.A9e);
                        c0Zx10.A05("upcoming_event_id", str44 != null ? Long.valueOf(Long.parseLong(str44)) : null);
                        c0Zx10.A06("product", c19260xA2.A05("product"));
                        String A0526 = c19260xA2.A05("guest_id");
                        c0Zx10.A05("guest_id", A0526 != null ? Long.valueOf(Long.parseLong(A0526)) : null);
                        c0Zx10.A04("media_dwell_time", (Double) A013.A01(C5I8.A5H));
                        c0Zx10.A04("media_time_elapsed", (Double) A013.A01(C5I8.A5a));
                        c0Zx10.A04("media_time_paused", (Double) A013.A01(C5I8.A5V));
                        c0Zx10.A04("media_time_remaining", (Double) A013.A01(C5I8.A5b));
                        c0Zx10.A04("media_time_to_load", (Double) A013.A01(C5I8.A5S));
                        c0Zx10.A06("search_session_id", (String) A013.A01(C5I8.A7v));
                        c0Zx10.A05("reel_gap_to_last_ad", (Long) A013.A01(C5I8.A7U));
                        c0Zx10.A05("reel_gap_to_last_netego", (Long) A013.A01(C5I8.A7V));
                        c0Zx10.A06("entity_page_type", c19260xA2.A05("entity_page_type"));
                        c0Zx10.A06("rank_token", (String) A013.A01(C5I8.A6t));
                        c0Zx10.A05("min_consumed_media_gap_to_previous_ad", (Long) A013.A01(C5I8.A5j));
                        c0Zx10.A05("min_consumed_media_gap_to_previous_netego", (Long) A013.A01(C5I8.A5k));
                        c0Zx10.A05("min_consumed_reel_gap_to_previous_ad", (Long) A013.A01(C5I8.A5l));
                        c0Zx10.A05("min_consumed_reel_gap_to_previous_netego", (Long) A013.A01(C5I8.A5m));
                        c0Zx10.A05("media_type", (Long) A013.A01(c11500j98));
                        ArrayList arrayList34 = (ArrayList) A013.A01(C5I8.A2I);
                        if (arrayList34 != null) {
                            ArrayList arrayList35 = new ArrayList(AbstractC06950Ym.A1E(arrayList34, 10));
                            Iterator it18 = arrayList34.iterator();
                            while (it18.hasNext()) {
                                String str45 = (String) it18.next();
                                C14360o3.A0B(str45, 0);
                                arrayList35.add(AbstractC003100w.A0k(10, str45));
                            }
                            arrayList6 = new ArrayList(AbstractC001800i.A0X(arrayList35));
                        } else {
                            arrayList6 = null;
                        }
                        c0Zx10.A07("drops_product_ids", arrayList6);
                        c0Zx10.A06("sponsored_label_text", (String) A013.A01(C5I8.A8J));
                        c0Zx10.A06("containermodule", c19260xA2.A05("container_module"));
                        c0Zx10.A06("delivery_class", c19260xA2.A05("delivery_class"));
                        c0Zx10.A06("event_name", c19260xA2.A05("event_name"));
                        c0Zx10.A06("frontend_env", c19260xA2.A05("frontend_env"));
                        String A0527 = c19260xA2.A05("is_id");
                        c0Zx10.A03("is_id", A0527 != null ? Boolean.valueOf(Boolean.parseBoolean(A0527)) : null);
                        c0Zx10.A06("media_type_name", c19260xA2.A05("media_type_name"));
                        c0Zx10.A06("original_referrer", c19260xA2.A05("original_referrer"));
                        c0Zx10.A06("original_referrer_domain", c19260xA2.A05("original_referrer_domain"));
                        c0Zx10.A06("primary_locale", c19260xA2.A05("primary_locale"));
                        c0Zx10.A06("referrer", c19260xA2.A05("referrer"));
                        c0Zx10.A06("referrer_domain", c19260xA2.A05("referrer_domain"));
                        c0Zx10.A06("rollout_hash", c19260xA2.A05("rollout_hash"));
                        c0Zx10.A06("url", (String) A013.A01(C5I8.A9g));
                        c0Zx10.A06("explore_topic_session_id", (String) A013.A01(C5I8.A2h));
                        String A0528 = c19260xA2.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        c0Zx10.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0528 != null ? Long.valueOf(Long.parseLong(A0528)) : null);
                        c0Zx10.A06("a_i", (String) A013.A01(C5I8.A9S));
                        String A0529 = c19260xA2.A05(TraceFieldType.BroadcastId);
                        c0Zx10.A05(TraceFieldType.BroadcastId, A0529 != null ? Long.valueOf(Long.parseLong(A0529)) : null);
                        String A0530 = c19260xA2.A05("is_top_post");
                        c0Zx10.A03("is_top_post", A0530 != null ? Boolean.valueOf(Boolean.parseBoolean(A0530)) : null);
                        String A0531 = c19260xA2.A05("live_donation");
                        c0Zx10.A05("live_donation", A0531 != null ? Long.valueOf(Long.parseLong(A0531)) : null);
                        c0Zx10.A06("video_type", (String) A013.A01(C5I8.A9n));
                        c0Zx10.A03("is_pride_media", (Boolean) A013.A01(C5I8.A4e));
                        c0Zx10.A05("next_max_id", (Long) A013.A01(C5I8.A67));
                        c0Zx10.A05("dark_mode_state", ((Integer) A013.A01(C5I8.A20)) != null ? Long.valueOf(r0.intValue()) : null);
                        String A0532 = c19260xA2.A05("within_stories_self_view");
                        c0Zx10.A03("within_stories_self_view", A0532 != null ? Boolean.valueOf(Boolean.parseBoolean(A0532)) : null);
                        c0Zx10.A06("discovery_session_id", (String) A013.A01(C5I8.A2G));
                        String A0533 = c19260xA2.A05("nt");
                        c0Zx10.A05("nt", A0533 != null ? Long.valueOf(Long.parseLong(A0533)) : null);
                        c0Zx10.A06("algorithm", c19260xA2.A05("algorithm"));
                        c0Zx10.A06("position", c19260xA2.A05("position"));
                        String A0534 = c19260xA2.A05("is_dash_eligible");
                        c0Zx10.A05("is_dash_eligible", A0534 != null ? Long.valueOf(Long.parseLong(A0534)) : null);
                        c0Zx10.A06("playback_format", c19260xA2.A05("playback_format"));
                        c0Zx10.A03("is_internal_build", (Boolean) A013.A01(C5I8.A4Q));
                        String str46 = (String) A013.A01(C5I8.A5T);
                        c0Zx10.A05("media_owner_id", str46 != null ? Long.valueOf(Long.parseLong(str46)) : null);
                        c0Zx10.A06("counter_channel", (String) A013.A01(C5I8.A1f));
                        String str47 = (String) A013.A01(C5I8.A1g);
                        c0Zx10.A05("counter_id", str47 != null ? Long.valueOf(Long.parseLong(str47)) : null);
                        String str48 = (String) A013.A01(C5I8.A1h);
                        c0Zx10.A05("counter_sid", str48 != null ? Long.valueOf(Long.parseLong(str48)) : null);
                        c0Zx10.A06("tray_rank_token", c19260xA2.A05("tray_rank_token"));
                        String A0535 = c19260xA2.A05("video_x_position");
                        c0Zx10.A05("video_x_position", A0535 != null ? Long.valueOf(Long.parseLong(A0535)) : null);
                        c0Zx10.A05("gap_to_last_ad", (Long) A013.A01(C5I8.A34));
                        Long l14 = (Long) A013.A01(C5I8.A35);
                        if (l14 == null) {
                            l14 = null;
                        }
                        c0Zx10.A05("gap_to_last_netego", l14);
                        c0Zx10.A03("is_holdout", (Boolean) A013.A01(C5I8.A4M));
                        c0Zx10.A05("top_followers_count", (Long) A013.A01(C5I8.A9N));
                        c0Zx10.A05("top_likers_count", (Long) A013.A01(C5I8.A9O));
                        c0Zx10.A05("dr_ad_type", (Long) A013.A01(C5I8.A2K));
                        c0Zx10.A06("impression_type", (String) A013.A01(C5I8.A3k));
                        c0Zx10.A06("async_ad_source", (String) A013.A01(C5I8.A0V));
                        c0Zx10.A03("is_pride_reel", (Boolean) A013.A01(C5I8.A4f));
                        c0Zx10.A05("carousel_opt_in_position", (Long) A013.A01(C5I8.A14));
                        c0Zx10.A06("camera_session_id", c19260xA2.A05("camera_session_id"));
                        c0Zx10.A06("chaining_feed_session_id", c19260xA2.A05("chaining_feed_session_id"));
                        String A0536 = c19260xA2.A05("is_main_feed_client_bump_item");
                        c0Zx10.A03("is_main_feed_client_bump_item", A0536 != null ? Boolean.valueOf(Boolean.parseBoolean(A0536)) : null);
                        String str49 = (String) A013.A01(C5I8.A8O);
                        c0Zx10.A05("sponsor_tag_id", str49 != null ? Long.valueOf(Long.parseLong(str49)) : null);
                        c0Zx10.A06("byline_text", (String) A013.A01(C5I8.A0l));
                        String A0537 = c19260xA2.A05("pwa");
                        c0Zx10.A03("pwa", A0537 != null ? Boolean.valueOf(Boolean.parseBoolean(A0537)) : null);
                        c0Zx10.A05("ad_inserted_position", (Long) A013.A01(C5I8.A0D));
                        c0Zx10.A05("ad_position_from_server", (Long) A013.A01(C5I8.A0I));
                        c0Zx10.A05("ad_received_position", (Long) A013.A01(C5I8.A0J));
                        c0Zx10.A05("ad_request_position", (Long) A013.A01(C5I8.A0L));
                        String str50 = (String) A013.A01(C5I8.A0j);
                        c0Zx10.A05("business_app_id", str50 != null ? Long.valueOf(Long.parseLong(str50)) : null);
                        c0Zx10.A05("reel_viewer_entry_position", (Long) A013.A01(C5I8.A7c));
                        c0Zx2 = c0Zx10;
                    } catch (ClassCastException unused2) {
                        c0Zx2 = new C0Zx();
                    }
                    str2 = "ig_impression";
                    c0Zx3 = c0Zx2;
                } else if (intValue == 1) {
                    try {
                        C19260xA c19260xA3 = c82713mZ.A00().A06;
                        C11520jB A014 = c82713mZ.A01();
                        C0Zx c0Zx12 = new C0Zx();
                        String str51 = (String) A014.A01(C5I8.A0Y);
                        if (str51 != null) {
                            l4 = C4SX.A00(str51).A00;
                        } else {
                            l4 = null;
                        }
                        c0Zx12.A05("a_pk", l4);
                        c0Zx12.A05("c_pk", AbstractC127855qE.A00((String) A014.A01(C5I8.A1V)));
                        String str52 = (String) A014.A01(C5I8.A1S);
                        if (str52 != null) {
                            l5 = C4SX.A00(str52).A00;
                        } else {
                            l5 = null;
                        }
                        c0Zx12.A05("ca_pk", l5);
                        c0Zx12.A05("parent_c_pk", AbstractC127855qE.A00((String) A014.A01(C5I8.A6S)));
                        c0Zx12.A03("is_covered", (Boolean) A014.A01(C5I8.A44));
                        c0Zx12.A05("like_count", (Long) A014.A01(C5I8.A59));
                        c0Zx12.A03("is_media_organic", (Boolean) A014.A01(C5I8.A4Y));
                        c0Zx12.A06("c_index", (String) A014.A01(C5I8.A1W));
                        String A0538 = c19260xA3.A05("sponsor_tag_count");
                        c0Zx12.A05("sponsor_tag_count", A0538 != null ? Long.valueOf(Long.parseLong(A0538)) : null);
                        c0Zx12.A06("m_pk", (String) A014.A01(C5I8.A5K));
                        c0Zx12.A06("tracking_token", (String) A014.A01(C5I8.A9R));
                        C11500j9 c11500j911 = C5I8.A5c;
                        c0Zx12.A05("m_t", (Long) A014.A01(c11500j911));
                        String A0539 = c19260xA3.A05("hashtag_id");
                        c0Zx12.A05("hashtag_id", A0539 != null ? Long.valueOf(Long.parseLong(A0539)) : null);
                        c0Zx12.A07("feed_sticker_media_id", (List) A014.A01(C5I8.A2r));
                        c0Zx12.A06("inventory_source", (String) A014.A01(C5I8.A3r));
                        c0Zx12.A05("carousel_index", (Long) A014.A01(C5I8.A0z));
                        String str53 = (String) A014.A01(C5I8.A3y);
                        c0Zx12.A03("is_app_backgrounded", str53 != null ? Boolean.valueOf(Boolean.parseBoolean(str53)) : null);
                        c0Zx12.A06("last_navigation_module", (String) A014.A01(C5I8.A58));
                        c0Zx12.A06("application_state", (String) A014.A01(C5I8.A0Q));
                        c0Zx12.A06("hashtag_name", (String) A014.A01(C5I8.A3R));
                        c0Zx12.A06("hashtag_feed_type", (String) A014.A01(C5I8.A3O));
                        c0Zx12.A06("carousel_media_id", (String) A014.A01(C5I8.A10));
                        c0Zx12.A05("carousel_starting_media_id", (Long) A014.A01(C5I8.A16));
                        c0Zx12.A06("carousel_cover_media_id", (String) A014.A01(C5I8.A0x));
                        c0Zx12.A06("reel_id", (String) A014.A01(C5I8.A7W));
                        c0Zx12.A06("tray_session_id", (String) A014.A01(C5I8.A7a));
                        c0Zx12.A06("viewer_session_id", (String) A014.A01(C5I8.A9o));
                        c0Zx12.A06("ranking_session_id", (String) A014.A01(C5I8.A6s));
                        c0Zx12.A06("chaining_session_id", (String) A014.A01(C5I8.A1C));
                        c0Zx12.A05("chaining_position", (Long) A014.A01(C5I8.A1A));
                        c0Zx12.A06("action", (String) A014.A01(C5I8.A00));
                        c0Zx12.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A014.A01(C5I8.A2f));
                        String A003 = AbstractC58317Pt9.A00(35);
                        c0Zx12.A06(A003, c19260xA3.A05(A003));
                        c0Zx12.A03("is_checkout_enabled", (Boolean) A014.A01(C5I8.A42));
                        String A0540 = c19260xA3.A05("can_add_to_bag");
                        c0Zx12.A03("can_add_to_bag", A0540 != null ? Boolean.valueOf(Boolean.parseBoolean(A0540)) : null);
                        String str54 = (String) A014.A01(C5I8.A5g);
                        if (str54 != null) {
                            l6 = C4SX.A00(str54).A00;
                        } else {
                            l6 = null;
                        }
                        c0Zx12.A05("merchant_id", l6);
                        c0Zx12.A06("prior_module", (String) A014.A01(C5I8.A6j));
                        String str55 = (String) A014.A01(C5I8.A6k);
                        c0Zx12.A05("product_id", str55 != null ? Long.valueOf(Long.parseLong(str55)) : null);
                        ArrayList arrayList36 = (ArrayList) A014.A01(C5I8.A6l);
                        if (arrayList36 != null) {
                            ArrayList arrayList37 = new ArrayList(AbstractC06950Ym.A1E(arrayList36, 10));
                            Iterator it19 = arrayList36.iterator();
                            while (it19.hasNext()) {
                                String str56 = (String) it19.next();
                                C14360o3.A0B(str56, 0);
                                arrayList37.add(AbstractC003100w.A0k(10, str56));
                            }
                            arrayList7 = new ArrayList(AbstractC001800i.A0X(arrayList37));
                        } else {
                            arrayList7 = null;
                        }
                        c0Zx12.A07("product_ids", arrayList7);
                        c0Zx12.A05("m_ix", (Long) A014.A01(C5I8.A3n));
                        String str57 = (String) A014.A01(C5I8.A3f);
                        c0Zx12.A05("chaining_seed_media_id", str57 != null ? Long.valueOf(Long.parseLong(str57)) : null);
                        c0Zx12.A05("chaining_seed_author_id", (Long) A014.A01(C5I8.A1B));
                        c0Zx12.A05("reel_gap", (Long) A014.A01(C5I8.A7S));
                        c0Zx12.A06("event_trace_id", (String) A014.A01(C5I8.A2g));
                        c0Zx12.A06("host_video_pk", (String) A014.A01(C5I8.A3b));
                        c0Zx12.A06("media_layout_encoded_string", (String) A014.A01(C5I8.A5Q));
                        c0Zx12.A03("mop_should_double_logging", (Boolean) A014.A01(C5I8.A5p));
                        c0Zx12.A03("mop_should_rollout", (Boolean) A014.A01(C5I8.A5q));
                        c0Zx12.A03("is_zoomed_out", (Boolean) A014.A01(C5I8.A52));
                        ArrayList arrayList38 = (ArrayList) A014.A01(C5I8.A1e);
                        if (arrayList38 != null) {
                            ArrayList arrayList39 = new ArrayList(AbstractC06950Ym.A1E(arrayList38, 10));
                            Iterator it20 = arrayList38.iterator();
                            while (it20.hasNext()) {
                                arrayList39.add(AbstractC06930Yk.A03((HashMap) it20.next()));
                            }
                            arrayList8 = AbstractC001800i.A0U(arrayList39);
                        } else {
                            arrayList8 = null;
                        }
                        c0Zx12.A07("client_ad_creative_optimization_output", arrayList8);
                        c0Zx12.A03("is_previewable_video_ad", (Boolean) A014.A01(C5I8.A4c));
                        c0Zx12.A06("ad_skip_type", (String) A014.A01(C5I8.A0M));
                        c0Zx12.A03("is_cta_sticker_available", (Boolean) A014.A01(C5I8.A45));
                        c0Zx12.A03("is_cta_sticker_shown", (Boolean) A014.A01(C5I8.A48));
                        c0Zx12.A03("is_sensitive_vertical_ad", (Boolean) A014.A01(C5I8.A4q));
                        c0Zx12.A03("post_impression_column_override", (Boolean) A014.A01(C5I8.A6Q));
                        c0Zx12.A06("radio_type", (String) A014.A01(C5I8.A6q));
                        String str58 = (String) A014.A01(C5I8.A7w);
                        c0Zx12.A05("seed_ad_id", str58 != null ? Long.valueOf(Long.parseLong(str58)) : null);
                        String str59 = (String) A014.A01(C5I8.A3c);
                        c0Zx12.A05("hscroll_seed_ad_id", str59 != null ? Long.valueOf(Long.parseLong(str59)) : null);
                        String str60 = (String) A014.A01(C5I8.A2v);
                        c0Zx12.A05("first_hscroll_item_ad_id", str60 != null ? Long.valueOf(Long.parseLong(str60)) : null);
                        c0Zx12.A05("horizontal_position_on_hscroll", (Long) A014.A01(C5I8.A3X));
                        c0Zx12.A05("vertical_position_on_feed_of_ads", (Long) A014.A01(C5I8.A9j));
                        c0Zx12.A03("is_multi_ads", (Boolean) A014.A01(C5I8.A4W));
                        c0Zx12.A05("multi_ads_type", (Long) A014.A01(C5I8.A5y));
                        c0Zx12.A06("multi_ads_id", (String) A014.A01(C5I8.A5w));
                        c0Zx12.A05("position_in_multi_ads_unit", (Long) A014.A01(C5I8.A6a));
                        String str61 = (String) A014.A01(C5I8.A5v);
                        c0Zx12.A05("multi_ads_first_ad_id", str61 != null ? Long.valueOf(Long.parseLong(str61)) : null);
                        c0Zx12.A05("ad_consumed_media_gap", (Long) A014.A01(C5I8.A06));
                        c0Zx12.A05("netego_consumed_media_gap", (Long) A014.A01(C5I8.A63));
                        c0Zx12.A05("priority_index", (Long) A014.A01(C5I8.A6i));
                        c0Zx12.A05("highest_position_rule", (Long) A014.A01(C5I8.A3V));
                        c0Zx12.A05("max_reel_gap_to_previous_item", (Long) A014.A01(C5I8.A5D));
                        c0Zx12.A05("min_media_gap_to_previous_item", (Long) A014.A01(C5I8.A5n));
                        c0Zx12.A04("time_gap_to_previous_item_in_sec", (Double) A014.A01(C5I8.A97));
                        c0Zx12.A05("consumed_media_gap", (Long) A014.A01(C5I8.A1Z));
                        c0Zx12.A05("consumed_media_gap_highest_position", (Long) A014.A01(C5I8.A1a));
                        c0Zx12.A05("reel_gap_highest_position", (Long) A014.A01(C5I8.A7T));
                        c0Zx12.A06("previous_media_pk", (String) A014.A01(C5I8.A6c));
                        c0Zx12.A06("next_media_pk", (String) A014.A01(C5I8.A68));
                        c0Zx12.A05("segment_index", (Long) A014.A01(C5I8.A7y));
                        c0Zx12.A05("segment_count", (Long) A014.A01(C5I8.A7x));
                        c0Zx12.A06("ad_pod_id", (String) A014.A01(C5I8.A0G));
                        c0Zx12.A05("index_in_ad_pod", (Long) A014.A01(C5I8.A3o));
                        ArrayList arrayList40 = (ArrayList) A014.A01(C5I8.A9m);
                        if (arrayList40 != null) {
                            ArrayList arrayList41 = new ArrayList(AbstractC06950Ym.A1E(arrayList40, 10));
                            Iterator it21 = arrayList40.iterator();
                            while (it21.hasNext()) {
                                arrayList41.add(AnonymousClass010.A0m((String) it21.next()));
                            }
                            arrayList9 = new ArrayList(AbstractC001800i.A0X(arrayList41));
                        } else {
                            arrayList9 = null;
                        }
                        c0Zx12.A07("video_to_carousel_cut_secs", arrayList9);
                        c0Zx12.A05("seq_num", (Long) A014.A01(C5I8.A7z));
                        c0Zx12.A06("disclaimer_text", (String) A014.A01(C5I8.A2D));
                        c0Zx12.A06("disclaimer_title", (String) A014.A01(C5I8.A2E));
                        c0Zx12.A05("carousel_type", (Long) A014.A01(C5I8.A19));
                        c0Zx12.A05("has_top_likers", (Long) A014.A01(C5I8.A3U));
                        c0Zx12.A05("ad_delivery_position", (Long) A014.A01(C5I8.A0A));
                        c0Zx12.A03("is_first_ad_in_the_session", (Boolean) A014.A01(C5I8.A4I));
                        c0Zx12.A05("seq_session", (Long) A014.A01(C5I8.A80));
                        c0Zx12.A06("cache_key", (String) A014.A01(C5I8.A0m));
                        c0Zx12.A06("call_stack", (String) A014.A01(C5I8.A0n));
                        c0Zx12.A04("time_interval_since_reference_date", (Double) A014.A01(C5I8.A98));
                        C11500j9 c11500j912 = C5I8.A93;
                        c0Zx12.A04("time_stamp", ((Long) A014.A01(c11500j912)) != null ? Double.valueOf(r0.longValue()) : null);
                        c0Zx12.A06("disclaimer_url", (String) A014.A01(C5I8.A2F));
                        c0Zx12.A06("next_inventory_source", (String) A014.A01(C5I8.A69));
                        c0Zx12.A06("prev_inventory_source", (String) A014.A01(C5I8.A6d));
                        C11520jB c11520jB2 = (C11520jB) A014.A01(C5I8.A5P);
                        if (c11520jB2 != null) {
                            C19260xA A004 = c11520jB2.A00();
                            C0Zx c0Zx13 = new C0Zx();
                            c0Zx13.A03("is_showreel_native", (Boolean) c11520jB2.A01(C5I8.A4r));
                            String A0541 = A004.A05("media_height");
                            c0Zx13.A04("media_height", A0541 != null ? Double.valueOf(Double.parseDouble(A0541)) : null);
                            String A0542 = A004.A05("media_width");
                            c0Zx13.A04("media_width", A0542 != null ? Double.valueOf(Double.parseDouble(A0542)) : null);
                            String A0543 = A004.A05("caption_font_size");
                            c0Zx13.A04("caption_font_size", A0543 != null ? Double.valueOf(Double.parseDouble(A0543)) : null);
                            String A0544 = A004.A05("caption_position_start_x");
                            c0Zx13.A04("caption_position_start_x", A0544 != null ? Double.valueOf(Double.parseDouble(A0544)) : null);
                            String A0545 = A004.A05("caption_position_start_y");
                            c0Zx13.A04("caption_position_start_y", A0545 != null ? Double.valueOf(Double.parseDouble(A0545)) : null);
                            String A0546 = A004.A05("caption_line_height");
                            c0Zx13.A04("caption_line_height", A0546 != null ? Double.valueOf(Double.parseDouble(A0546)) : null);
                            String A0547 = A004.A05("caption_line_height");
                            c0Zx13.A04("caption_height", A0547 != null ? Double.valueOf(Double.parseDouble(A0547)) : null);
                            String A0548 = A004.A05("caption_width");
                            c0Zx13.A04("caption_width", A0548 != null ? Double.valueOf(Double.parseDouble(A0548)) : null);
                            String A0549 = A004.A05("is_caption_fully_displayed");
                            c0Zx13.A03("is_caption_fully_displayed", A0549 != null ? Boolean.valueOf(Boolean.parseBoolean(A0549)) : null);
                            c0Zx13.A06("background_color_bottom", A004.A05("background_color_bottom"));
                            c0Zx13.A06("background_color_caption", A004.A05("background_color_caption"));
                            c0Zx13.A06("background_color_top", A004.A05("background_color_top"));
                            c0Zx13.A06("caption_background_color_alpha", A004.A05("caption_background_color_alpha"));
                            String A0550 = A004.A05("caption_num_char_showed");
                            c0Zx13.A05("caption_num_char_showed", A0550 != null ? Long.valueOf(Long.parseLong(A0550)) : null);
                            String A0551 = A004.A05("caption_num_hashtags_showed");
                            c0Zx13.A05("caption_num_hashtags_showed", A0551 != null ? Long.valueOf(Long.parseLong(A0551)) : null);
                            String A0552 = A004.A05("caption_num_lines_showed");
                            c0Zx13.A05("caption_num_lines_showed", A0552 != null ? Long.valueOf(Long.parseLong(A0552)) : null);
                            String A0553 = A004.A05("caption_num_lines_total");
                            c0Zx13.A05("caption_num_lines_total", A0553 != null ? Long.valueOf(Long.parseLong(A0553)) : null);
                            String A0554 = A004.A05("caption_num_mentions_showed");
                            c0Zx13.A05("caption_num_mentions_showed", A0554 != null ? Long.valueOf(Long.parseLong(A0554)) : null);
                            c0Zx13.A06("caption_text_color", A004.A05("caption_text_color"));
                            c0Zx13.A06("cta_color", (String) c11520jB2.A01(C5I8.A1i));
                            c0Zx13.A06("headline_text_showed", A004.A05("headline_text_showed"));
                            c0Zx13.A04("screen_density", (Double) c11520jB2.A01(C5I8.A7o));
                            c0Zx13.A04("screen_height", (Double) c11520jB2.A01(C5I8.A7p));
                            c0Zx13.A04("screen_width", (Double) c11520jB2.A01(C5I8.A7q));
                            c0Zx12.A02(c0Zx13, "media_layout");
                        }
                        String A0555 = c19260xA3.A05("pk");
                        if (A0555 != null) {
                            c0Zx12.A05("pk", C4SX.A00(A0555).A00);
                        }
                        c0Zx12.A06("release_channel", (String) A014.A01(C5I8.A7f));
                        c0Zx12.A06("sessions_chain", (String) A014.A01(C5I8.A82));
                        c0Zx12.A03("production_build", (Boolean) A014.A01(C5I8.A2i));
                        c0Zx12.A06("topic_cluster_id", (String) A014.A01(C5I8.A9J));
                        c0Zx12.A06("topic_cluster_title", (String) A014.A01(C5I8.A9L));
                        c0Zx12.A06("topic_cluster_type", (String) A014.A01(C5I8.A9M));
                        c0Zx12.A06("topic_cluster_debug_info", (String) A014.A01(C5I8.A9I));
                        c0Zx12.A06("ranking_info_token", (String) A014.A01(C5I8.A6r));
                        c0Zx12.A06("shopping_session_id", (String) A014.A01(C5I8.A86));
                        c0Zx12.A06("follow_status", (String) A014.A01(C5I8.A2w));
                        c0Zx12.A06("source_of_action", (String) A014.A01(C5I8.A8G));
                        c0Zx12.A04("elapsed_time_since_last_item", (Double) A014.A01(C5I8.A2Q));
                        c0Zx12.A05("m_ts", (Long) A014.A01(c11500j912));
                        c0Zx12.A03("is_acp_delivered", (Boolean) A014.A01(C5I8.A3u));
                        c0Zx12.A03("is_ad", (Boolean) A014.A01(C5I8.A3t));
                        String str62 = (String) A014.A01(C5I8.A61);
                        c0Zx12.A05("nav_in_transit", str62 != null ? Long.valueOf(Long.parseLong(str62)) : null);
                        c0Zx12.A05("imp_logger_ver", (Long) A014.A01(C5I8.A3l));
                        c0Zx12.A05("reel_size", (Long) A014.A01(C5I8.A7Y));
                        c0Zx12.A05("reel_position", (Long) A014.A01(C5I8.A7X));
                        c0Zx12.A05("tray_position", (Long) A014.A01(C5I8.A9V));
                        c0Zx12.A05("session_reel_counter", (Long) A014.A01(C5I8.A84));
                        c0Zx12.A06("reel_type", (String) A014.A01(c11500j9));
                        c0Zx12.A05("reel_viewer_position", (Long) A014.A01(C5I8.A7e));
                        c0Zx12.A04("time_elapsed", (Double) A014.A01(C5I8.A95));
                        c0Zx12.A05("reel_start_position", (Long) A014.A01(C5I8.A7Z));
                        c0Zx12.A03("is_video_to_carousel", (Boolean) A014.A01(C5I8.A51));
                        c0Zx12.A06(AbstractC58461Pvm.A00(9, 10, 49), (String) A014.A01(C5I8.A83));
                        c0Zx12.A06("story_ranking_token", (String) A014.A01(C5I8.A8U));
                        c0Zx12.A06("delivery_flags", (String) A014.A01(C5I8.A27));
                        c0Zx12.A03("is_eof", (Boolean) A014.A01(C5I8.A4H));
                        c0Zx12.A06("feed_request_id", (String) A014.A01(C5I8.A8E));
                        c0Zx12.A06("entity_type", (String) A014.A01(C5I8.A2e));
                        c0Zx12.A05("entity_id", (Long) A014.A01(C5I8.A2a));
                        c0Zx12.A06("entity_name", (String) A014.A01(C5I8.A2b));
                        c0Zx12.A06("entity_follow_status", (String) A014.A01(C5I8.A2Z));
                        c0Zx12.A06("mezql_token", (String) A014.A01(C5I8.A5i));
                        c0Zx12.A06("media_thumbnail_section", (String) A014.A01(C5I8.A5Z));
                        c0Zx12.A06("entity_page_name", (String) A014.A01(C5I8.A2d));
                        String str63 = (String) A014.A01(C5I8.A2c);
                        c0Zx12.A05("entity_page_id", str63 != null ? Long.valueOf(Long.parseLong(str63)) : null);
                        ArrayList arrayList42 = (ArrayList) A014.A01(C5I8.A8p);
                        if (arrayList42 != null) {
                            ArrayList arrayList43 = new ArrayList(AbstractC06950Ym.A1E(arrayList42, 10));
                            Iterator it22 = arrayList42.iterator();
                            while (it22.hasNext()) {
                                String str64 = (String) it22.next();
                                C14360o3.A0B(str64, 0);
                                arrayList43.add(AbstractC003100w.A0k(10, str64));
                            }
                            arrayList10 = new ArrayList(AbstractC001800i.A0X(arrayList43));
                        } else {
                            arrayList10 = null;
                        }
                        c0Zx12.A07("tagged_user_ids", arrayList10);
                        c0Zx12.A06("connection_id", (String) A014.A01(C5I8.A1X));
                        c0Zx12.A05("carousel_size", (Long) A014.A01(C5I8.A15));
                        c0Zx12.A06("parent_m_pk", (String) A014.A01(C5I8.A6U));
                        c0Zx12.A05("carousel_media_type", (Long) A014.A01(C5I8.A12));
                        c0Zx12.A06("endpoint_type", (String) A014.A01(C5I8.A2S));
                        c0Zx12.A06("hashtag_follow_status", (String) A014.A01(C5I8.A3Q));
                        c0Zx12.A03("is_igtv", (Boolean) A014.A01(C5I8.A4N));
                        String str65 = (String) A014.A01(C5I8.A5C);
                        c0Zx12.A05("main_feed_carousel_starting_media_id", str65 != null ? Long.valueOf(Long.parseLong(str65)) : null);
                        c0Zx12.A05("is_dark_mode", (Long) A014.A01(C5I8.A4C));
                        C11500j9 c11500j913 = C5I8.A5R;
                        c0Zx12.A05("media_loading_progress", (Long) A014.A01(c11500j913));
                        c0Zx12.A06("current_module", c19260xA3.A05("current_module"));
                        c0Zx12.A06("is_coming_from", (String) A014.A01(C5I8.A43));
                        c0Zx12.A04("time_remaining", (Double) A014.A01(C5I8.A9A));
                        ArrayList A063 = c19260xA3.A06("shared_product_ids");
                        if (A063 == null) {
                            A063 = null;
                        }
                        c0Zx12.A07("shared_product_ids", A063);
                        c0Zx12.A03("is_highlights_sourced", (Boolean) A014.A01(C5I8.A4L));
                        c0Zx12.A05("media_loading_progress", (Long) A014.A01(c11500j913));
                        String str66 = (String) A014.A01(C5I8.A6b);
                        c0Zx12.A05("post_id", str66 != null ? Long.valueOf(Long.parseLong(str66)) : null);
                        String str67 = (String) A014.A01(C5I8.A9W);
                        c0Zx12.A05("tray_pos_excl_own_story", str67 != null ? Long.valueOf(Long.parseLong(str67)) : null);
                        c0Zx12.A05("tab_index", (Long) A014.A01(C5I8.A8o));
                        c0Zx12.A06("igtv_viewer_session_id", (String) A014.A01(C5I8.A3i));
                        c0Zx12.A06("channel_pk", (String) A014.A01(C5I8.A1E));
                        c0Zx12.A06("collection_id", (String) A014.A01(C5I8.A1L));
                        c0Zx12.A06("collection_name", (String) A014.A01(C5I8.A1N));
                        c0Zx12.A06("audience", (String) A014.A01(C5I8.A0W));
                        c0Zx12.A03("impression_logger_validate", (Boolean) A014.A01(C5I8.A3j));
                        c0Zx12.A06("nav_chain", (String) A014.A01(C5I8.A62));
                        ArrayList arrayList44 = (ArrayList) A014.A01(C5I8.A8M);
                        if (arrayList44 != null) {
                            ArrayList arrayList45 = new ArrayList(AbstractC06950Ym.A1E(arrayList44, 10));
                            Iterator it23 = arrayList44.iterator();
                            while (it23.hasNext()) {
                                String str68 = (String) it23.next();
                                C14360o3.A0B(str68, 0);
                                arrayList45.add(AbstractC003100w.A0k(10, str68));
                            }
                            arrayList11 = new ArrayList(AbstractC001800i.A0X(arrayList45));
                        } else {
                            arrayList11 = null;
                        }
                        c0Zx12.A07("sponsor_tag_ids", arrayList11);
                        String A0556 = c19260xA3.A05("is_replay");
                        c0Zx12.A03("is_replay", A0556 != null ? Boolean.valueOf(Boolean.parseBoolean(A0556)) : null);
                        c0Zx12.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c19260xA3.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                        c0Zx12.A03("is_influencer", (Boolean) A014.A01(C5I8.A4P));
                        Long l15 = (Long) A014.A01(C5I8.A2P);
                        if (l15 == null) {
                            l15 = null;
                        }
                        c0Zx12.A05("effect_id", l15);
                        Long l16 = (Long) A014.A01(C5I8.A5I);
                        if (l16 == null) {
                            l16 = null;
                        }
                        c0Zx12.A05("media_face_effect_id", l16);
                        c0Zx12.A05("carousel_media_type", (Long) A014.A01(C5I8.A13));
                        c0Zx12.A06("reply_type", c19260xA3.A05("reply_type"));
                        c0Zx12.A05("media_id", (Long) A014.A01(C5I8.A5M));
                        c0Zx12.A05("media_author_id", (Long) A014.A01(C5I8.A5G));
                        c0Zx12.A06("surface", c19260xA3.A05("surface"));
                        String A0557 = c19260xA3.A05("has_ad_inserted");
                        c0Zx12.A03("has_ad_inserted", A0557 != null ? Boolean.valueOf(Boolean.parseBoolean(A0557)) : null);
                        c0Zx12.A06("source_channel_type", c19260xA3.A05("source_channel_type"));
                        c0Zx12.A06("component_type", c19260xA3.A05("component_type"));
                        String A0558 = c19260xA3.A05("video_y_position");
                        c0Zx12.A05("video_y_position", A0558 != null ? Long.valueOf(Long.parseLong(A0558)) : null);
                        c0Zx12.A05("ad_id", (Long) A014.A01(C5I8.A0C));
                        c0Zx12.A05("top_liker_count", (Long) A014.A01(C5I8.A9P));
                        String str69 = (String) A014.A01(C5I8.A2j);
                        c0Zx12.A05("e_counter_channel", str69 != null ? Long.valueOf(Long.parseLong(str69)) : null);
                        String str70 = (String) A014.A01(C5I8.A2k);
                        c0Zx12.A05("e_counter_id", str70 != null ? Long.valueOf(Long.parseLong(str70)) : null);
                        String str71 = (String) A014.A01(C5I8.A2l);
                        c0Zx12.A05("e_counter_sid", str71 != null ? Long.valueOf(Long.parseLong(str71)) : null);
                        c0Zx12.A03("is_besties_reel", (Boolean) A014.A01(C5I8.A41));
                        c0Zx12.A06("igtv_destination_session_id", c19260xA3.A05("igtv_destination_session_id"));
                        c0Zx12.A06("is_programmatic_scroll", (String) A014.A01(C5I8.A4h));
                        String A0559 = c19260xA3.A05("is_live_streaming");
                        c0Zx12.A05("is_live_streaming", A0559 != null ? Long.valueOf(Long.parseLong(A0559)) : null);
                        c0Zx12.A04("normalized_feed_position", ((Long) A014.A01(C5I8.A6A)) != null ? Double.valueOf(r0.longValue()) : null);
                        String str72 = (String) A014.A01(C5I8.A01);
                        c0Zx12.A05("actor_id", str72 != null ? Long.valueOf(Long.parseLong(str72)) : null);
                        String A0560 = c19260xA3.A05("is_live_questions");
                        c0Zx12.A05("is_live_questions", A0560 != null ? Long.valueOf(Long.parseLong(A0560)) : null);
                        c0Zx12.A06("feed_type", c19260xA3.A05("feed_type"));
                        c0Zx12.A06("impression_token", c19260xA3.A05("impression_token"));
                        c0Zx12.A03("is_besties_media", (Boolean) A014.A01(C5I8.A40));
                        c0Zx12.A03("is_image_loaded", (Boolean) A014.A01(C5I8.A4O));
                        c0Zx12.A06("media_tags_hashtag_name", (String) A014.A01(C5I8.A5X));
                        c0Zx12.A05("media_tags_total_hashtags", (Long) A014.A01(C5I8.A5Y));
                        c0Zx12.A06("igtv_browse_session_id", c19260xA3.A05("igtv_browse_session_id"));
                        c0Zx12.A06("is_on_screen", c19260xA3.A05("is_on_screen"));
                        String str73 = (String) A014.A01(C5I8.A9e);
                        c0Zx12.A05("upcoming_event_id", str73 != null ? Long.valueOf(Long.parseLong(str73)) : null);
                        c0Zx12.A06("product", c19260xA3.A05("product"));
                        String A0561 = c19260xA3.A05("guest_id");
                        c0Zx12.A05("guest_id", A0561 != null ? Long.valueOf(Long.parseLong(A0561)) : null);
                        c0Zx12.A04("media_dwell_time", (Double) A014.A01(C5I8.A5H));
                        c0Zx12.A04("media_time_elapsed", (Double) A014.A01(C5I8.A5a));
                        c0Zx12.A04("media_time_paused", (Double) A014.A01(C5I8.A5V));
                        c0Zx12.A04("media_time_remaining", (Double) A014.A01(C5I8.A5b));
                        c0Zx12.A04("media_time_to_load", (Double) A014.A01(C5I8.A5S));
                        c0Zx12.A06("search_session_id", (String) A014.A01(C5I8.A7v));
                        c0Zx12.A05("reel_gap_to_last_ad", (Long) A014.A01(C5I8.A7U));
                        c0Zx12.A05("reel_gap_to_last_netego", (Long) A014.A01(C5I8.A7V));
                        c0Zx12.A06("entity_page_type", c19260xA3.A05("entity_page_type"));
                        c0Zx12.A06("rank_token", (String) A014.A01(C5I8.A6t));
                        c0Zx12.A05("min_consumed_media_gap_to_previous_ad", (Long) A014.A01(C5I8.A5j));
                        c0Zx12.A05("min_consumed_media_gap_to_previous_netego", (Long) A014.A01(C5I8.A5k));
                        c0Zx12.A05("min_consumed_reel_gap_to_previous_ad", (Long) A014.A01(C5I8.A5l));
                        c0Zx12.A05("min_consumed_reel_gap_to_previous_netego", (Long) A014.A01(C5I8.A5m));
                        c0Zx12.A05("media_type", (Long) A014.A01(c11500j911));
                        ArrayList arrayList46 = (ArrayList) A014.A01(C5I8.A2I);
                        if (arrayList46 != null) {
                            ArrayList arrayList47 = new ArrayList(AbstractC06950Ym.A1E(arrayList46, 10));
                            Iterator it24 = arrayList46.iterator();
                            while (it24.hasNext()) {
                                String str74 = (String) it24.next();
                                C14360o3.A0B(str74, 0);
                                arrayList47.add(AbstractC003100w.A0k(10, str74));
                            }
                            arrayList12 = new ArrayList(AbstractC001800i.A0X(arrayList47));
                        } else {
                            arrayList12 = null;
                        }
                        c0Zx12.A07("drops_product_ids", arrayList12);
                        c0Zx12.A06("sponsored_label_text", (String) A014.A01(C5I8.A8J));
                        c0Zx12.A06("containermodule", c19260xA3.A05("container_module"));
                        c0Zx12.A06("delivery_class", c19260xA3.A05("delivery_class"));
                        c0Zx12.A06("event_name", c19260xA3.A05("event_name"));
                        c0Zx12.A06("frontend_env", c19260xA3.A05("frontend_env"));
                        String A0562 = c19260xA3.A05("is_id");
                        c0Zx12.A03("is_id", A0562 != null ? Boolean.valueOf(Boolean.parseBoolean(A0562)) : null);
                        c0Zx12.A06("media_type_name", c19260xA3.A05("media_type_name"));
                        c0Zx12.A06("original_referrer", c19260xA3.A05("original_referrer"));
                        c0Zx12.A06("original_referrer_domain", c19260xA3.A05("original_referrer_domain"));
                        c0Zx12.A06("primary_locale", c19260xA3.A05("primary_locale"));
                        c0Zx12.A06("referrer", c19260xA3.A05("referrer"));
                        c0Zx12.A06("referrer_domain", c19260xA3.A05("referrer_domain"));
                        c0Zx12.A06("rollout_hash", c19260xA3.A05("rollout_hash"));
                        c0Zx12.A06("url", (String) A014.A01(C5I8.A9g));
                        c0Zx12.A06("explore_topic_session_id", (String) A014.A01(C5I8.A2h));
                        String A0563 = c19260xA3.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        c0Zx12.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0563 != null ? Long.valueOf(Long.parseLong(A0563)) : null);
                        c0Zx12.A06("a_i", (String) A014.A01(C5I8.A9S));
                        String A0564 = c19260xA3.A05(TraceFieldType.BroadcastId);
                        c0Zx12.A05(TraceFieldType.BroadcastId, A0564 != null ? Long.valueOf(Long.parseLong(A0564)) : null);
                        String A0565 = c19260xA3.A05("is_top_post");
                        c0Zx12.A03("is_top_post", A0565 != null ? Boolean.valueOf(Boolean.parseBoolean(A0565)) : null);
                        String A0566 = c19260xA3.A05("live_donation");
                        c0Zx12.A05("live_donation", A0566 != null ? Long.valueOf(Long.parseLong(A0566)) : null);
                        c0Zx12.A06("video_type", (String) A014.A01(C5I8.A9n));
                        c0Zx12.A03("is_pride_media", (Boolean) A014.A01(C5I8.A4e));
                        c0Zx12.A05("next_max_id", (Long) A014.A01(C5I8.A67));
                        c0Zx12.A05("dark_mode_state", ((Integer) A014.A01(C5I8.A20)) != null ? Long.valueOf(r0.intValue()) : null);
                        String A0567 = c19260xA3.A05("within_stories_self_view");
                        c0Zx12.A03("within_stories_self_view", A0567 != null ? Boolean.valueOf(Boolean.parseBoolean(A0567)) : null);
                        c0Zx12.A06("discovery_session_id", (String) A014.A01(C5I8.A2G));
                        String A0568 = c19260xA3.A05("nt");
                        c0Zx12.A05("nt", A0568 != null ? Long.valueOf(Long.parseLong(A0568)) : null);
                        c0Zx12.A06("algorithm", c19260xA3.A05("algorithm"));
                        c0Zx12.A06("position", c19260xA3.A05("position"));
                        String A0569 = c19260xA3.A05("is_dash_eligible");
                        c0Zx12.A05("is_dash_eligible", A0569 != null ? Long.valueOf(Long.parseLong(A0569)) : null);
                        c0Zx12.A06("playback_format", c19260xA3.A05("playback_format"));
                        c0Zx12.A03("is_internal_build", (Boolean) A014.A01(C5I8.A4Q));
                        String str75 = (String) A014.A01(C5I8.A5T);
                        c0Zx12.A05("media_owner_id", str75 != null ? Long.valueOf(Long.parseLong(str75)) : null);
                        c0Zx12.A06("counter_channel", (String) A014.A01(C5I8.A1f));
                        String str76 = (String) A014.A01(C5I8.A1g);
                        c0Zx12.A05("counter_id", str76 != null ? Long.valueOf(Long.parseLong(str76)) : null);
                        String str77 = (String) A014.A01(C5I8.A1h);
                        c0Zx12.A05("counter_sid", str77 != null ? Long.valueOf(Long.parseLong(str77)) : null);
                        c0Zx12.A06("tray_rank_token", c19260xA3.A05("tray_rank_token"));
                        String A0570 = c19260xA3.A05("video_x_position");
                        c0Zx12.A05("video_x_position", A0570 != null ? Long.valueOf(Long.parseLong(A0570)) : null);
                        c0Zx12.A05("gap_to_last_ad", (Long) A014.A01(C5I8.A34));
                        Long l17 = (Long) A014.A01(C5I8.A35);
                        if (l17 == null) {
                            l17 = null;
                        }
                        c0Zx12.A05("gap_to_last_netego", l17);
                        c0Zx12.A03("is_holdout", (Boolean) A014.A01(C5I8.A4M));
                        c0Zx12.A05("top_followers_count", (Long) A014.A01(C5I8.A9N));
                        c0Zx12.A05("top_likers_count", (Long) A014.A01(C5I8.A9O));
                        c0Zx12.A05("dr_ad_type", (Long) A014.A01(C5I8.A2K));
                        c0Zx12.A06("impression_type", (String) A014.A01(C5I8.A3k));
                        c0Zx12.A06("async_ad_source", (String) A014.A01(C5I8.A0V));
                        c0Zx12.A03("is_pride_reel", (Boolean) A014.A01(C5I8.A4f));
                        c0Zx12.A05("carousel_opt_in_position", (Long) A014.A01(C5I8.A14));
                        c0Zx12.A06("camera_session_id", c19260xA3.A05("camera_session_id"));
                        c0Zx12.A06("chaining_feed_session_id", c19260xA3.A05("chaining_feed_session_id"));
                        String A0571 = c19260xA3.A05("is_main_feed_client_bump_item");
                        c0Zx12.A03("is_main_feed_client_bump_item", A0571 != null ? Boolean.valueOf(Boolean.parseBoolean(A0571)) : null);
                        String str78 = (String) A014.A01(C5I8.A8O);
                        c0Zx12.A05("sponsor_tag_id", str78 != null ? Long.valueOf(Long.parseLong(str78)) : null);
                        c0Zx12.A06("byline_text", (String) A014.A01(C5I8.A0l));
                        String A0572 = c19260xA3.A05("pwa");
                        c0Zx12.A03("pwa", A0572 != null ? Boolean.valueOf(Boolean.parseBoolean(A0572)) : null);
                        c0Zx12.A05("ad_inserted_position", (Long) A014.A01(C5I8.A0D));
                        c0Zx12.A05("ad_position_from_server", (Long) A014.A01(C5I8.A0I));
                        c0Zx12.A05("ad_received_position", (Long) A014.A01(C5I8.A0J));
                        c0Zx12.A05("ad_request_position", (Long) A014.A01(C5I8.A0L));
                        String str79 = (String) A014.A01(C5I8.A0j);
                        c0Zx12.A05("business_app_id", str79 != null ? Long.valueOf(Long.parseLong(str79)) : null);
                        c0Zx12.A05("reel_viewer_entry_position", (Long) A014.A01(C5I8.A7c));
                        c0Zx12.A05("num_visible_story_comments", (Long) A014.A01(C5I8.A6J));
                        c0Zx4 = c0Zx12;
                    } catch (ClassCastException unused3) {
                        c0Zx4 = new C0Zx();
                    }
                    str2 = "ig_sub_impression";
                    c0Zx3 = c0Zx4;
                } else if (intValue == 2) {
                    try {
                        C11520jB A015 = c82713mZ.A01();
                        ?? c0Zx14 = new C0Zx();
                        EnumC95784Sm enumC95784Sm = C14360o3.A0K(A015.A01(C5I8.A9S), "ad") ? EnumC95784Sm.PAID : EnumC95784Sm.ORGANIC;
                        ArrayList arrayList48 = (ArrayList) A015.A01(C5I8.A9l);
                        if (arrayList48 == null) {
                            arrayList48 = r2;
                        }
                        c0Zx14.A07("video_start", arrayList48);
                        ArrayList arrayList49 = (ArrayList) A015.A01(C5I8.A9k);
                        if (arrayList49 == null) {
                            arrayList49 = r2;
                        }
                        c0Zx14.A07("video_paused", arrayList49);
                        HashMap hashMap = (HashMap) A015.A01(C5I8.A6X);
                        if (hashMap != null && (entrySet = hashMap.entrySet()) != null) {
                            r2 = new ArrayList(AbstractC06950Ym.A1E(entrySet, 10));
                            for (Map.Entry entry : entrySet) {
                                C0Zx c0Zx15 = new C0Zx();
                                c0Zx15.A05("clock_time", (Long) entry.getKey());
                                c0Zx15.A05("player_time", (Long) entry.getValue());
                                r2.add(c0Zx15);
                            }
                        }
                        c0Zx14.A07("player_time", r2);
                        c0Zx14.A06("encoded_frames", (String) A015.A01(C5I8.A2R));
                        c0Zx14.A01((EnumC46291KeN) A015.A01(C5I8.A7g), "release_phase");
                        Double d = (Double) A015.A01(C5I8.A2L);
                        c0Zx14.A05("duration", d != null ? Long.valueOf((long) d.doubleValue()) : null);
                        C0Zx c0Zx16 = new C0Zx();
                        String str80 = (String) A015.A01(C5I8.A0Y);
                        if (str80 == null) {
                            str80 = "";
                        }
                        c0Zx16.A06("author_id", str80);
                        c0Zx16.A06("subtype", (String) A015.A01(C5I8.A8V));
                        c0Zx14.A02(c0Zx16, "product_metadata");
                        c0Zx14.A03("was_media_tracked", (Boolean) A015.A01(C5I8.A9y));
                        c0Zx14.A05("first_frame_timestamp", (Long) A015.A01(C5I8.A2u));
                        c0Zx14.A03("did_flush_frames", (Boolean) A015.A01(C5I8.A2C));
                        c0Zx14.A03("is_framebased_null", (Boolean) A015.A01(C5I8.A4K));
                        c0Zx14.A05("num_frames_captured", ((Integer) A015.A01(C5I8.A6E)) != null ? Long.valueOf(r0.intValue()) : null);
                        List<C11520jB> list4 = (List) A015.A01(C5I8.A9r);
                        if (list4 != null) {
                            arrayList13 = new ArrayList(AbstractC06950Ym.A1E(list4, 10));
                            for (C11520jB c11520jB3 : list4) {
                                C0Zx c0Zx17 = new C0Zx();
                                String str81 = (String) c11520jB3.A01(C5I8.A9v);
                                if (str81 == null) {
                                    str81 = "";
                                }
                                c0Zx17.A06("event_name", str81);
                                Long l18 = (Long) c11520jB3.A01(C5I8.A9s);
                                long j2 = 0;
                                c0Zx17.A05("client_time_ms", Long.valueOf(l18 != null ? l18.longValue() : 0L));
                                Long l19 = (Long) c11520jB3.A01(C5I8.A9u);
                                c0Zx17.A05("media_time_ms", Long.valueOf(l19 != null ? l19.longValue() : 0L));
                                Integer num2 = (Integer) c11520jB3.A01(C5I8.A9t);
                                if (num2 != null) {
                                    j2 = num2.intValue();
                                }
                                c0Zx17.A05("current_viewability", Long.valueOf(j2));
                                arrayList13.add(c0Zx17);
                            }
                        } else {
                            arrayList13 = null;
                        }
                        c0Zx14.A07("viper_video_events", arrayList13);
                        String str82 = (String) A015.A01(C5I8.A1z);
                        if (str82 == null) {
                            str82 = "";
                        }
                        c0Zx14.A06("current_watching_module", str82);
                        c0Zx14.A06("tracking_token", (String) A015.A01(C5I8.A9R));
                        c0Zx14.A06("nav_chain", (String) A015.A01(C5I8.A62));
                        Boolean bool = (Boolean) A015.A01(C5I8.A50);
                        if (bool != null) {
                            c0Zx14.A03("is_texture_view", bool);
                        }
                        String str83 = (String) A015.A01(C5I8.A5K);
                        if (str83 != null && (A0k = AbstractC003100w.A0k(10, str83)) != null) {
                            c0Zx14.A05("media_id", A0k);
                        }
                        c0Zx14.A01(enumC95784Sm, AbstractC43591JPw.A00(484));
                        c0Zx5 = c0Zx14;
                    } catch (ClassCastException unused4) {
                        c0Zx5 = new C0Zx();
                    }
                    str2 = "media_playback_compound_second_channel";
                    c0Zx3 = c0Zx5;
                } else if (intValue != 3) {
                    throw new RuntimeException();
                }
                c0Zx8.A02(c0Zx3, str2);
            }
        }
        ArrayList arrayList50 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it25 = list2.iterator();
        while (it25.hasNext()) {
            arrayList50.add(((C82493mD) it25.next()).A00);
        }
        ArrayList<C82523mG> arrayList51 = new ArrayList();
        Iterator it26 = arrayList50.iterator();
        while (it26.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it26.next()).A07, arrayList51);
        }
        ArrayList<C82523mG> arrayList52 = new ArrayList();
        Iterator it27 = arrayList50.iterator();
        while (it27.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it27.next()).A02, arrayList52);
        }
        ArrayList<C82523mG> arrayList53 = new ArrayList();
        Iterator it28 = arrayList50.iterator();
        while (it28.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it28.next()).A06, arrayList53);
        }
        ArrayList<C82523mG> arrayList54 = new ArrayList();
        Iterator it29 = arrayList50.iterator();
        while (it29.hasNext()) {
            AnonymousClass016.A16(((C82513mF) it29.next()).A04, arrayList54);
        }
        if (!arrayList51.isEmpty() || !arrayList53.isEmpty() || !arrayList52.isEmpty() || !arrayList54.isEmpty()) {
            C0Zx c0Zx18 = new C0Zx();
            ArrayList arrayList55 = new ArrayList(AbstractC06950Ym.A1E(arrayList51, 10));
            for (C82523mG c82523mG : arrayList51) {
                C0Zx c0Zx19 = new C0Zx();
                c0Zx19.A05("enter_ts", Long.valueOf(c82523mG.A01));
                c0Zx19.A05("exit_ts", Long.valueOf(c82523mG.A00));
                arrayList55.add(c0Zx19);
            }
            c0Zx18.A07("t_0", arrayList55);
            ArrayList arrayList56 = new ArrayList(AbstractC06950Ym.A1E(arrayList54, 10));
            for (C82523mG c82523mG2 : arrayList54) {
                C0Zx c0Zx20 = new C0Zx();
                c0Zx20.A05("enter_ts", Long.valueOf(c82523mG2.A01));
                c0Zx20.A05("exit_ts", Long.valueOf(c82523mG2.A00));
                arrayList56.add(c0Zx20);
            }
            c0Zx18.A07("t_100", arrayList56);
            ArrayList arrayList57 = new ArrayList(AbstractC06950Ym.A1E(arrayList52, 10));
            for (C82523mG c82523mG3 : arrayList52) {
                C0Zx c0Zx21 = new C0Zx();
                c0Zx21.A05("enter_ts", Long.valueOf(c82523mG3.A01));
                c0Zx21.A05("exit_ts", Long.valueOf(c82523mG3.A00));
                arrayList57.add(c0Zx21);
            }
            c0Zx18.A07("t_50", arrayList57);
            if (!arrayList53.isEmpty()) {
                ArrayList arrayList58 = new ArrayList(AbstractC06950Ym.A1E(arrayList53, 10));
                for (C82523mG c82523mG4 : arrayList53) {
                    C0Zx c0Zx22 = new C0Zx();
                    c0Zx22.A05("enter_ts", Long.valueOf(c82523mG4.A01));
                    c0Zx22.A05("exit_ts", Long.valueOf(c82523mG4.A00));
                    arrayList58.add(c0Zx22);
                }
                c0Zx18.A07("t_75", arrayList58);
            }
            abstractC02600Aj.A0N(c0Zx18, "nested_item_visibility_percent_ts");
        }
        if (!list2.isEmpty() && (valueOf = Long.valueOf((j = ((C82493mD) list2.get(0)).A01.A00))) != null && j > 0) {
            abstractC02600Aj.A0Q("full_impression_ts", valueOf);
        }
        abstractC02600Aj.A0R("entity_id", c82543mI.A03);
        abstractC02600Aj.A0N(c0Zx6, "element_visibility_percent_ts");
        abstractC02600Aj.A0N(c0Zx7, "screen_coverage_percent_ts");
        abstractC02600Aj.A0N(c0Zx8, "payload");
        abstractC02600Aj.A0M(enumC63542ub, "purpose");
        abstractC02600Aj.Cht();
    }
}
