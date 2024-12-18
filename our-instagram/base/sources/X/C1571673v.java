package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.profile.analytics.ProfileSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.73v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571673v {
    public static final C1571673v A00 = new Object();

    public static final EnumC1571773w A00(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 1);
        if (user != null) {
            if (userSession.userId.equals(user.getId())) {
                return EnumC1571773w.A05;
            }
            if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A05) {
                return EnumC1571773w.A03;
            }
        }
        return EnumC1571773w.A04;
    }

    public static final void A03(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        C14360o3.A0B(enumC1571773w, 3);
        A02(enumC1579076z, enumC33464Eqz, new C19270xB(str), userSession, enumC1571773w, null, null, Integer.valueOf(i), null, null, null, str2, str3, str4, null, null, null, null, null, null, null, str5, str6, null, null, null, null);
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, l, str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, null, null, null);
    }

    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC1571773w, 3);
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final void A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC1571773w, 3);
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final void A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4) {
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, null, str3, str4, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final void A08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(str, 2);
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, str5, str3, str4, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final void A09(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(enumC1571773w, 3);
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, str6, str3, str4, null, null, null, null, null, null, null, str5, null, null, null);
    }

    public static final void A0A(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(enumC1571773w, 3);
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, str7, str3, str4, null, null, null, str5, str6, null, null, null, null, null, null);
    }

    public static final void A0B(InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        String str;
        C14360o3.A0B(userSession, 0);
        if (z) {
            str = "click";
        } else {
            str = "impression";
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "nme_waterfall_event");
        A002.AAP("stage", "profile_editing");
        A002.AAP("substage", "profile");
        A002.AAP("event", str);
        A002.AAP("surface", "profile_screen");
        A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "nme_ig_verified_profile_editing");
        A002.AAP("event_target", "profile_editing_banner");
        A002.Cht();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.InterfaceC11380iw r7, com.instagram.common.session.UserSession r8, X.EnumC40111tc r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.List r20, int r21, int r22) {
        /*
            r6 = this;
            r5 = 0
            X.0wW r2 = X.AbstractC12220kQ.A01(r7, r8)
            java.lang.String r1 = "instagram_thumbnail_click"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            r3 = 0
            r1 = r17
            if (r17 == 0) goto L19
            r0 = 10
            java.lang.Long r4 = X.AbstractC003100w.A0k(r0, r1)     // Catch: java.lang.NumberFormatException -> L19
            goto L1a
        L19:
            r4 = r3
        L1a:
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto Ldc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_top_post"
            r2.A7v(r0, r1)
            java.lang.String r0 = "id"
            r2.AAP(r0, r11)
            java.lang.String r0 = "starting_media_id"
            r2.A9K(r0, r4)
            r1 = r21
            r0 = r22
            java.lang.String r1 = X.AbstractC154266wb.A00(r1, r0)
            java.lang.String r0 = "position"
            r2.AAP(r0, r1)
            java.lang.String r0 = "m_pk"
            r2.AAP(r0, r11)
            java.lang.String r0 = "pivot_page_session_id"
            r1 = r18
            r2.AAP(r0, r1)
            java.lang.String r0 = "product_ids"
            r1 = r19
            r2.AAk(r0, r1)
            r1 = r20
            if (r20 == 0) goto L78
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()
            X.4SX r0 = (X.C4SX) r0
            java.lang.Long r0 = r0.A00
            r3.add(r0)
            goto L66
        L78:
            java.lang.String r0 = "merchant_ids"
            r2.AAk(r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r2.AAP(r0, r12)
            java.lang.String r0 = "app_attribution_id"
            r2.AAP(r0, r13)
            if (r14 == 0) goto Lb1
            if (r10 == 0) goto Lb1
            X.9WC r1 = new X.9WC
            r1.<init>()
            java.lang.String r0 = "chain_type"
            r1.A06(r0, r14)
            java.lang.String r0 = "clip_count"
            r1.A05(r0, r10)
        L9a:
            java.lang.String r0 = "clip_chain_metadata"
            r2.AAQ(r1, r0)
            if (r9 == 0) goto Laa
            X.5i3 r1 = r9.A00()
            java.lang.String r0 = "media_type"
            r2.A8R(r1, r0)
        Laa:
            if (r15 == 0) goto Ldc
            r3 = r16
            if (r16 == 0) goto Ldc
            goto Lb3
        Lb1:
            r1 = 0
            goto L9a
        Lb3:
            long r0 = java.lang.Long.parseLong(r15)     // Catch: java.lang.NumberFormatException -> Lb8
            goto Lba
        Lb8:
            r0 = -1
        Lba:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "entity_id"
            r2.A9K(r0, r1)
            java.lang.String r0 = "entity_name"
            r2.AAP(r0, r3)
            java.lang.String r0 = "entity_page_id"
            r2.A9K(r0, r1)
            java.lang.String r0 = "entity_page_name"
            r2.AAP(r0, r3)
            java.lang.String r1 = X.AbstractC25041Ki.A00
            java.lang.String r0 = "canonical_nav_chain"
            r2.AAP(r0, r1)
            r2.Cht()
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1571673v.A0C(X.0iw, com.instagram.common.session.UserSession, X.1tc, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, int):void");
    }

    public final void A0D(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        A02(null, null, interfaceC11380iw, userSession, enumC1571773w, null, null, null, null, null, null, str, str2, null, null, null, null, null, null, null, null, null, null, null, null, str3, str4);
    }

    public final void A0E(UserSession userSession, EnumC1571773w enumC1571773w, String str, String str2, String str3, String str4) {
        C14360o3.A0B(enumC1571773w, 3);
        C14360o3.A0B(str3, 4);
        A04(new C19270xB(str), userSession, enumC1571773w, null, str2, str3, str4, null, null, null);
    }

    public static final EnumC1571773w A01(FollowStatus followStatus) {
        if (followStatus == FollowStatus.A05) {
            return EnumC1571773w.A03;
        }
        return EnumC1571773w.A04;
    }

    public static final void A02(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC1571773w enumC1571773w, Boolean bool, Boolean bool2, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        String str17;
        Long l4;
        int i;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = interfaceC11380iw;
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "ig_profile_action");
        ProfileSession profileSession = (ProfileSession) C3NR.A00(userSession).A00.get(String.valueOf(System.identityHashCode(interfaceC11380iw)));
        C0Zx c0Zx = null;
        if (profileSession == null || (str17 = profileSession.A00) == null) {
            ProfileSession profileSession2 = C55772hI.A00(userSession).A04;
            if (profileSession2 != null) {
                str17 = profileSession2.A00;
            } else {
                str17 = null;
            }
        }
        if (A003.isSampled()) {
            A003.AAP("action", str);
            A003.AAP("follow_status", enumC1571773w.A00);
            if (str2 != null) {
                l4 = AbstractC003100w.A0k(10, str2);
            } else {
                l4 = null;
            }
            A003.A9K("profile_user_id", l4);
            A003.AAP("nav_chain", C1QM.A00.A02.A00);
            Long l5 = null;
            A003.A9K("product_id", null);
            A003.AAP("product_collection_type", null);
            A003.AAP("click_point", str3);
            A003.AAP("media_id_attribution", str4);
            A003.AAP("media_tracking_token_attribution", str5);
            A003.AAP("subscribed_status", str6);
            A003.AAP("starting_clips_media_id", str7);
            A003.AAP("starting_clips_media_ranking_token", str8);
            A003.AAP("ranking_info_token", str13);
            if (str9 != null) {
                l5 = AbstractC003100w.A0k(10, str9);
            }
            A003.A9K("hashtag_id", l5);
            A003.AAP("hashtag_name", str10);
            A003.AAP("direct_thread_id", str11);
            if (num != null) {
                i = 0;
                if (num.intValue() == 1) {
                    i = 1;
                }
            } else {
                i = Integer.MIN_VALUE;
            }
            if (i != Integer.MIN_VALUE) {
                A003.A8p("profile_user_type", Integer.valueOf(i));
            } else {
                A003.AAP("profile_user_type", null);
            }
            A003.AAP(TraceFieldType.RequestID, str12);
            A003.A8R(enumC1579076z, "direct_source");
            A003.A8R(enumC33464Eqz, "direct_source_type");
            A003.A9K("time_on_profile", l);
            A003.A9K("badge_num_notifs", l2);
            A003.AAP("highlight_reel_id_str", str14);
            A003.A7v("seen_state_ring", bool);
            SearchContext searchContext = AnonymousClass729.A00(userSession).A00;
            if (searchContext != null) {
                c0Zx = new C0Zx();
                c0Zx.A06("search_session_id", searchContext.A05);
                c0Zx.A06("rank_token", searchContext.A03);
                c0Zx.A06("query_text", searchContext.A02);
                c0Zx.A06("serp_session_id", searchContext.A06);
                c0Zx.A06("click_id", searchContext.A00);
            }
            A003.AAQ(c0Zx, "search_context");
            A003.A9K("num_profile_banners", l3);
            A003.AAP("h2g_migration_status", str15);
            A003.AAP("h2g_migration_screen_toggle_end_state", str16);
            if (bool2 != null) {
                A003.AAP("highlight_cover_size", bool2.equals(true) ? "CARDS" : "DEFAULT");
            }
            if (str17 != null) {
                A003.AAP("profile_session_id", str17);
            }
            A003.Cht();
        }
    }
}
