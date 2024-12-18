package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129875tr {
    public static final C129885ts A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C129885ts) userSession.A01(C129885ts.class, new C206839Do(userSession, 44));
    }

    public static final boolean A02(EnumC33402EpZ enumC33402EpZ) {
        C14360o3.A0B(enumC33402EpZ, 0);
        if (enumC33402EpZ != EnumC33402EpZ.A06 && enumC33402EpZ != EnumC33402EpZ.A05 && enumC33402EpZ != EnumC33402EpZ.A0A) {
            return false;
        }
        return true;
    }

    public static final void A01(C19260xA c19260xA, UserSession userSession, C38321qM c38321qM, UserDetailEntryInfo userDetailEntryInfo, SearchContext searchContext, EnumC77563dg enumC77563dg, EnumC33402EpZ enumC33402EpZ, User user, Double d, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        C0Zx c0Zx;
        String id;
        String str7 = str4;
        C14360o3.A0B(num, 3);
        C26771Rh A00 = C26771Rh.A00();
        C14360o3.A07(A00);
        String A002 = AbstractC37442GeM.A00(num);
        long parseLong = Long.parseLong(user.getId());
        if (str4 == null) {
            str7 = A00.A00;
            C14360o3.A07(str7);
        }
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(str7), userSession);
        InterfaceC02590Ai A003 = A01.A00(A01.A00, "follow_button_tapped");
        A003.AAP("request_type", enumC33402EpZ.A00);
        Long valueOf = Long.valueOf(parseLong);
        A003.A9K("a_pk", valueOf);
        A003.A9K("entity_id", valueOf);
        A003.AAP("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A003.AAP("entity_follow_status", A002);
        if (str != null) {
            A003.AAP("click_point", str);
        }
        A003.A8I("media_pct_watched", d);
        if (c38321qM != null) {
            A003.A9K("entry_media_type", Long.valueOf(c38321qM.BRp().A00));
            String mezqlToken = c38321qM.A0C.getMezqlToken();
            if (mezqlToken != null) {
                A003.AAP("mezql_token", mezqlToken);
            }
            String loggingInfoToken = c38321qM.A0C.getLoggingInfoToken();
            if (loggingInfoToken != null) {
                A003.AAP("ranking_info_token", loggingInfoToken);
            }
            String BJN = c38321qM.A0C.BJN();
            if (BJN != null) {
                A003.AAP("inventory_source", BJN);
            }
            List CAf = c38321qM.A0C.CAf();
            if (CAf != null && (!CAf.isEmpty()) && AbstractC75373a4.A07(userSession)) {
                A003.AAP("translated_language", ((InterfaceC105674pe) CAf.get(0)).BL7());
                List singletonList = Collections.singletonList(EnumC37904Gm1.CLOSED_CAPTION);
                C14360o3.A07(singletonList);
                A003.AAk("translation_delivery_method", singletonList);
            }
        }
        if (str5 != null) {
            A003.AAP("m_pk", str5);
        }
        if (str2 != null) {
            A003.AAP("entry_trigger", str2);
        }
        if (str3 != null) {
            A003.AAP("entry_module", str3);
        }
        if (userDetailEntryInfo != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("entity_id", userDetailEntryInfo.A02);
            hashMap.put("entity_name", userDetailEntryInfo.A03);
            hashMap.put("entity_follow_status", userDetailEntryInfo.A01);
            hashMap.put("entity_type", userDetailEntryInfo.A04);
            A003.A9M("entry_info", hashMap);
            String str8 = userDetailEntryInfo.A00;
            if (str8 != null) {
                A003.AAP("display_format", str8);
            }
            String str9 = userDetailEntryInfo.A05;
            if (str9 != null) {
                A003.AAP("insertion_context", str9);
            }
        }
        String str10 = C1QM.A00.A02.A00;
        if (str10 != null) {
            A003.AAP("nav_chain", str10);
        }
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            String A06 = C38801rC.A06(id);
            C14360o3.A0B(A06, 0);
            Long A0k = AbstractC003100w.A0k(10, A06);
            if (A0k != null) {
                A003.A9K("current_media_id", A0k);
            }
            String A04 = C38801rC.A04(id);
            C14360o3.A0B(A04, 0);
            Long A0k2 = AbstractC003100w.A0k(10, A04);
            if (A0k2 != null) {
                A003.A9K("current_media_author_id", A0k2);
            }
        }
        SearchContext searchContext2 = AnonymousClass729.A00(userSession).A00;
        if (searchContext2 != null) {
            c0Zx = new C0Zx();
            c0Zx.A06("search_session_id", searchContext2.A05);
            c0Zx.A06("rank_token", searchContext2.A03);
            c0Zx.A06("query_text", searchContext2.A02);
            c0Zx.A06("serp_session_id", searchContext2.A06);
            c0Zx.A06("click_id", searchContext2.A00);
        } else {
            c0Zx = null;
        }
        A003.AAQ(c0Zx, "search_context");
        if (searchContext != null) {
            C0Zx c0Zx2 = new C0Zx();
            String str11 = searchContext.A05;
            c0Zx2.A06("search_session_id", str11);
            c0Zx2.A06("serp_session_id", searchContext.A06);
            String str12 = searchContext.A02;
            c0Zx2.A06("query_text", str12);
            String str13 = searchContext.A03;
            c0Zx2.A06("rank_token", str13);
            c0Zx2.A06("click_id", searchContext.A00);
            A003.AAQ(c0Zx2, "search_context");
            if (str11 != null) {
                A003.AAP("search_session_id", str11);
            }
            if (str13 != null) {
                A003.AAP("rank_token", str13);
            }
            if (str12 != null) {
                A003.AAP("query_text", str12);
            }
        }
        if (c19260xA != null) {
            String A05 = c19260xA.A05("starting_clips_media_id");
            if (A05 != null) {
                A003.AAP("m_pk", A05);
                if (A05.length() > 0 && !A05.equals("null")) {
                    C38801rC c38801rC = C38321qM.A0h;
                    String A062 = C38801rC.A06(A05);
                    C14360o3.A0B(A062, 0);
                    Long A0k3 = AbstractC003100w.A0k(10, A062);
                    if (A0k3 != null) {
                        A003.A9K("starting_clips_media_id", A0k3);
                    }
                }
            }
            String A052 = c19260xA.A05("starting_clips_ranking_info_token");
            if (A052 != null) {
                A003.AAP("starting_clips_ranking_info_token", A052);
            }
            if (c19260xA.A03("chaining_seed_media_id") != null) {
                A003.A9K("chaining_seed_media_id", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("chaining_seed_author_id") != null) {
                A003.A9K("chaining_seed_author_id", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("chaining_position") != null) {
                A003.A9K("chaining_position", Long.valueOf(r0.intValue()));
            }
            String A053 = c19260xA.A05("chaining_session_id");
            if (A053 != null) {
                A003.AAP("chaining_session_id", A053);
            }
            String A054 = c19260xA.A05("hashtag_follow_status");
            if (A054 != null) {
                A003.AAP("hashtag_follow_status", A054);
            }
            if (c19260xA.A03("hashtag_id") != null) {
                A003.A9K("hashtag_id", Long.valueOf(r0.intValue()));
            }
            String A055 = c19260xA.A05("hashtag_name");
            if (A055 != null) {
                A003.AAP("hashtag_name", A055);
            }
            String A056 = c19260xA.A05("hashtag_feed_type");
            if (A056 != null) {
                A003.AAP("hashtag_feed_type", A056);
            }
            String A057 = c19260xA.A05("topic_cluster_debug_info");
            if (A057 != null) {
                A003.AAP("topic_cluster_debug_info", A057);
            }
            String A058 = c19260xA.A05("topic_cluster_id");
            if (A058 != null) {
                A003.AAP("topic_cluster_id", A058);
            }
            String A059 = c19260xA.A05("topic_cluster_title");
            if (A059 != null) {
                A003.AAP("topic_cluster_title", A059);
            }
            String A0510 = c19260xA.A05("topic_cluster_type");
            if (A0510 != null) {
                A003.AAP("topic_cluster_type", A0510);
            }
            if (c19260xA.A03("entity_page_id") != null) {
                A003.A9K("entity_page_id", Long.valueOf(r0.intValue()));
            }
            String A0511 = c19260xA.A05("entity_page_name");
            if (A0511 != null) {
                A003.AAP("entity_page_name", A0511);
            }
            String A0512 = c19260xA.A05("entity_page_follow_status");
            if (A0512 != null) {
                A003.AAP("entity_page_follow_status", A0512);
            }
            if (c19260xA.A03("entry_entity_id") != null) {
                A003.A9K("entry_entity_id", Long.valueOf(r0.intValue()));
            }
            String A0513 = c19260xA.A05("entry_entity_name");
            if (A0513 != null) {
                A003.AAP("entry_entity_name", A0513);
            }
            String A0514 = c19260xA.A05("entry_entity_follow_status");
            if (A0514 != null) {
                A003.AAP("entry_entity_follow_status", A0514);
            }
            String A0515 = c19260xA.A05("entry_entity_type");
            if (A0515 != null) {
                A003.AAP("entry_entity_type", A0515);
            }
            if (c19260xA.A03("entry_media_id") != null) {
                A003.A9K("entry_media_id", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("entry_media_author_id") != null) {
                A003.A9K("entry_media_author_id", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("view_state_item_type") != null) {
                A003.A9K("view_state_item_type", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("recs_ix") != null) {
                A003.A9K("recs_ix", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("m_ix") != null) {
                A003.A9K("m_ix", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A05("parent_m_pk") != null) {
                A003.AAP("parent_m_pk", c19260xA.A05("parent_m_pk"));
            }
            if (c19260xA.A03("position") != null) {
                A003.A9K("position", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("unit_id") != null) {
                A003.A9K("unit_id", Long.valueOf(r0.intValue()));
            }
            String A0516 = c19260xA.A05("impression_uuid");
            if (A0516 != null) {
                A003.AAP("impression_uuid", A0516);
            }
            String A0517 = c19260xA.A05("rank_token");
            if (A0517 != null) {
                A003.AAP("rank_token", A0517);
            }
            String A0518 = c19260xA.A05("search_session_id");
            if (A0518 != null) {
                A003.AAP("search_session_id", A0518);
            }
            if (c19260xA.A03("best_audio_cluster_id") != null) {
                A003.A9K("best_audio_cluster_id", Long.valueOf(r0.intValue()));
            }
            if (c19260xA.A03("a_pk") != null) {
                A003.A9K("a_pk", Long.valueOf(r0.intValue()));
            }
            String A0519 = c19260xA.A05("social_context_text");
            if (A0519 != null) {
                A003.AAP("social_context", A0519);
            }
            String A0520 = c19260xA.A05("social_context_type");
            if (A0520 != null) {
                A003.AAP("social_context_type", A0520);
            }
            Long A042 = c19260xA.A04("collection_id");
            if (A042 != null) {
                A003.A9K("collection_id", A042);
            }
            String A0521 = c19260xA.A05("collection_name");
            if (A0521 != null) {
                A003.AAP("collection_name", A0521);
            }
        }
        if (enumC77563dg != null) {
            A003.AAP("tap_info", enumC77563dg.A00);
        }
        A003.A9K("carousel_index", l);
        A003.A9K("carousel_media_id_int", AbstractC82733mb.A00(str6));
        A003.AAP("canonical_attributed_notifications", C72Z.A00());
        A003.Cht();
    }
}
