package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Y7a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73317Y7a {
    public static Double A00(InterfaceC02590Ai interfaceC02590Ai, Long l, String str) {
        Long A01;
        interfaceC02590Ai.A9K("client_position", l);
        if (str == null || (A01 = C4q7.A01(str)) == null) {
            return null;
        }
        return Double.valueOf(A01.longValue());
    }

    public static final String A01(AbstractC12990ll abstractC12990ll, String str) {
        UserSession userSession;
        C38321qM A02;
        if (str == null || !(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null || (A02 = C1DW.A00(userSession).A02(str)) == null) {
            return null;
        }
        return A02.A0C.BJN();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.InterfaceC02590Ai r2, java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73317Y7a.A04(X.0Ai, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.InterfaceC11380iw r4, X.AbstractC12990ll r5, java.lang.Long r6, java.lang.Long r7, java.lang.Long r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r3 = 0
            r2 = 0
            X.AbstractC167017dG.A1N(r5, r4)
            X.0wW r1 = X.AbstractC12220kQ.A01(r4, r5)
            r0 = 65
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto Lb7
            X.AbstractC31175DnJ.A14(r1, r4)
            if (r9 == 0) goto Lbc
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r9)
            if (r0 == 0) goto Lbc
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
        L2a:
            X.AbstractC37300Gc1.A0h(r1, r0)
            java.lang.Long r4 = X.AbstractC37302Gc3.A0W(r10)
            java.lang.String r0 = "media_author_id"
            r1.A9K(r0, r4)
            A04(r1, r11)
            java.lang.String r4 = A02(r12)
            java.lang.String r0 = "share_option"
            X.AbstractC25233BEq.A17(r1, r0, r4)
            java.lang.String r0 = "barcelona_source_reply_id"
            r1.A9K(r0, r6)
            r0 = 32
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.A9K(r0, r7)
            if (r13 == 0) goto Lba
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r13)
            if (r0 == 0) goto Lba
            java.lang.Long r4 = X.AbstractC166997dE.A0j(r0)
        L5e:
            r0 = 76
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.A9K(r0, r4)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.AAP(r0, r14)
            if (r9 == 0) goto Lb8
            java.lang.Integer r0 = X.C4q7.A00(r9)
            if (r0 == 0) goto Lb8
            java.lang.Long r0 = X.AbstractC25229BEm.A0n(r0)
        L7c:
            java.lang.Double r4 = A00(r1, r0, r9)
            java.lang.String r0 = "vpv_duration"
            r1.A8I(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r16)
            r0 = 2603(0xa2b, float:3.648E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.A7v(r0, r4)
            java.lang.String r0 = "bottom_sheet_session_id"
            r1.AAP(r0, r3)
            java.lang.String r3 = A01(r5, r9)
            java.lang.String r0 = "inventory_source"
            r1.AAP(r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r1.AAP(r0, r15)
            java.lang.String r0 = "share_option_position"
            r1.A9K(r0, r8)
            java.lang.String r0 = "carousel_media_id_int"
            r1.A9K(r0, r2)
            java.lang.String r0 = "carousel_index"
            r1.A9K(r0, r2)
            r1.Cht()
        Lb7:
            return
        Lb8:
            r0 = r3
            goto L7c
        Lba:
            r4 = r3
            goto L5e
        Lbc:
            r0 = r3
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73317Y7a.A08(X.0iw, X.0ll, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A09(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Long l, String str, String str2, String str3) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        A08(interfaceC11380iw, abstractC12990ll, null, null, l, str, null, str2, str3, null, null, null, false);
    }

    public static final void A0D(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(str2, 3);
        A09(interfaceC11380iw, abstractC12990ll, null, str, str2, str3);
    }

    public static final void A0E(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C14360o3.A0B(interfaceC11380iw, 1);
        A0A(interfaceC11380iw, abstractC12990ll, null, str, null, str2, str3);
    }

    public static final void A0F(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        String A02;
        Long A0j;
        C14360o3.A0B(str3, 4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "external_share_failed");
        if (A0f.isSampled() && (A02 = A02(str3)) != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            String A06 = C38801rC.A06(str);
            if (A06 != null && (A0j = AbstractC166997dE.A0j(A06)) != null) {
                AbstractC37300Gc1.A0h(A0f, A0j);
                AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                A0f.AAP("share_option", A02);
                A0f.AAP("error", str4);
                A04(A0f, str2);
                A03(A0f, abstractC12990ll, str);
                A0f.Cht();
            }
        }
    }

    public static final void A0G(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        A07(interfaceC11380iw, abstractC12990ll, null, null, null, str, str2, str3, str4, null, null, null, null, null);
    }

    public static final void A0H(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, Throwable th) {
        String A02;
        Long A0j;
        String str4;
        C14360o3.A0B(abstractC12990ll, 0);
        AbstractC167027dH.A0a(1, interfaceC11380iw, str, str2, str3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "external_share_failed");
        if (A0f.isSampled() && (A02 = A02(str3)) != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            String A06 = C38801rC.A06(str);
            if (A06 != null && (A0j = AbstractC166997dE.A0j(A06)) != null) {
                AbstractC37300Gc1.A0h(A0f, A0j);
                AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                A0f.AAP("share_option", A02);
                if (th != null) {
                    str4 = th.getMessage();
                } else {
                    str4 = null;
                }
                A0f.AAP("error", str4);
                A04(A0f, str2);
                A03(A0f, abstractC12990ll, str);
                A0f.Cht();
            }
        }
    }

    public static final void A0I(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Long l2;
        Integer A00;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "external_share_succeeded");
        if (A0f.isSampled()) {
            Long l3 = null;
            if (str != null) {
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                String A06 = C38801rC.A06(str);
                if (A06 != null) {
                    l2 = AbstractC166997dE.A0j(A06);
                    AbstractC37300Gc1.A0h(A0f, l2);
                    AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
                    A0f.AAP("ranking_info_token", str6);
                    A04(A0f, str2);
                    AbstractC25233BEq.A17(A0f, "share_option", A02(str3));
                    A0f.AAP("url", str4);
                    A0f.AAP("raw_system_share_option", str5);
                    if (str != null && (A00 = C4q7.A00(str)) != null) {
                        l3 = AbstractC25229BEm.A0n(A00);
                    }
                    A0f.A8I("vpv_duration", A00(A0f, l3, str));
                    A0f.AAP("bottom_sheet_session_id", str7);
                    A03(A0f, userSession, str);
                    if (l != null && l.longValue() != -1) {
                        A0f.A9K("carousel_media_id_int", AbstractC82733mb.A00(str8));
                        A0f.A9K("carousel_index", l);
                    }
                    A0f.Cht();
                }
            }
            l2 = null;
            AbstractC37300Gc1.A0h(A0f, l2);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.AAP("ranking_info_token", str6);
            A04(A0f, str2);
            AbstractC25233BEq.A17(A0f, "share_option", A02(str3));
            A0f.AAP("url", str4);
            A0f.AAP("raw_system_share_option", str5);
            if (str != null) {
                l3 = AbstractC25229BEm.A0n(A00);
            }
            A0f.A8I("vpv_duration", A00(A0f, l3, str));
            A0f.AAP("bottom_sheet_session_id", str7);
            A03(A0f, userSession, str);
            if (l != null) {
                A0f.A9K("carousel_media_id_int", AbstractC82733mb.A00(str8));
                A0f.A9K("carousel_index", l);
            }
            A0f.Cht();
        }
    }

    public static final void A0K(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        A0I(interfaceC11380iw, userSession, null, str, str2, str3, str4, null, null, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73317Y7a.A02(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A03(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll, String str) {
        EnumC72421XdR enumC72421XdR;
        String A01 = A01(abstractC12990ll, str);
        if (A01 != null) {
            switch (A01.hashCode()) {
                case -2043315917:
                    if (A01.equals("connected_group_profile")) {
                        enumC72421XdR = EnumC72421XdR.CONNECTED_GROUP_PROFILE;
                        break;
                    }
                    break;
                case -1745635341:
                    if (A01.equals("connected_following_favorites")) {
                        enumC72421XdR = EnumC72421XdR.CONNECTED_FOLLOWING_FAVORITES;
                        break;
                    }
                    break;
                case -950052266:
                    if (A01.equals("hashtag_connected")) {
                        enumC72421XdR = EnumC72421XdR.HASHTAG_CONNECTED;
                        break;
                    }
                    break;
                case -843741651:
                    if (A01.equals("user_connected_favorites")) {
                        enumC72421XdR = EnumC72421XdR.USER_CONNECTED_FAVORITES;
                        break;
                    }
                    break;
                case -793778648:
                    if (A01.equals("connected_hashtag_following")) {
                        enumC72421XdR = EnumC72421XdR.CONNECTED_HASHTAG_FOLLOWING;
                        break;
                    }
                    break;
                case -532026940:
                    if (A01.equals("recommended_end_of_feed_recs")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_END_OF_FEED_RECS;
                        break;
                    }
                    break;
                case -461981510:
                    if (A01.equals("coauthored_post_unconnected")) {
                        enumC72421XdR = EnumC72421XdR.COAUTHORED_POST_UNCONNECTED;
                        break;
                    }
                    break;
                case -445618946:
                    if (A01.equals("recommended_feed_reels_cover_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_FEED_REELS_COVER_MODEL;
                        break;
                    }
                    break;
                case -258197527:
                    if (A01.equals("group_profile")) {
                        enumC72421XdR = EnumC72421XdR.GROUP_PROFILE;
                        break;
                    }
                    break;
                case -142932429:
                    if (A01.equals("connected_coauthored_post")) {
                        enumC72421XdR = EnumC72421XdR.CONNECTED_COAUTHORED_POST;
                        break;
                    }
                    break;
                case -76555191:
                    if (A01.equals("explore_story")) {
                        enumC72421XdR = EnumC72421XdR.EXPLORE_STORY;
                        break;
                    }
                    break;
                case -51403029:
                    if (A01.equals("recommended_clips_chaining_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_CLIPS_CHAINING_MODEL;
                        break;
                    }
                    break;
                case 1756132:
                    if (A01.equals("media_or_ad")) {
                        enumC72421XdR = EnumC72421XdR.MEDIA_OR_AD;
                        break;
                    }
                    break;
                case 2820684:
                    if (A01.equals("mixed_unconnected")) {
                        enumC72421XdR = EnumC72421XdR.MIXED_UNCONNECTED;
                        break;
                    }
                    break;
                case 394368174:
                    if (A01.equals("recommended_in_feed_recs")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_IN_FEED_RECS;
                        break;
                    }
                    break;
                case 452339563:
                    if (A01.equals("recommended_explore_reels_cover_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_EXPLORE_REELS_COVER_MODEL;
                        break;
                    }
                    break;
                case 495473892:
                    if (A01.equals("explore_unconnected")) {
                        enumC72421XdR = EnumC72421XdR.EXPLORE_UNCONNECTED;
                        break;
                    }
                    break;
                case 521854075:
                    if (A01.equals("recommended_explore_chaining_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_EXPLORE_CHAINING_MODEL;
                        break;
                    }
                    break;
                case 987879317:
                    if (A01.equals("user_connected")) {
                        enumC72421XdR = EnumC72421XdR.USER_CONNECTED;
                        break;
                    }
                    break;
                case 1037456052:
                    if (A01.equals("follow_hashtag_story")) {
                        enumC72421XdR = EnumC72421XdR.FOLLOW_HASHTAG_STORY;
                        break;
                    }
                    break;
                case 1087924443:
                    if (A01.equals("connected_following")) {
                        enumC72421XdR = EnumC72421XdR.CONNECTED_FOLLOWING;
                        break;
                    }
                    break;
                case 1133608632:
                    if (A01.equals("recommended_explore_grid_cover_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_EXPLORE_GRID_COVER_MODEL;
                        break;
                    }
                    break;
                case 1796276480:
                    if (A01.equals("connected_content_note_following")) {
                        enumC72421XdR = EnumC72421XdR.CONNECTED_CONTENT_NOTE_FOLLOWING;
                        break;
                    }
                    break;
                case 1929944363:
                    if (A01.equals("recommended_stories_reels_cover_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_STORIES_REELS_COVER_MODEL;
                        break;
                    }
                    break;
                case 2028921176:
                    if (A01.equals("recommended_music_feed_reels_cover_model")) {
                        enumC72421XdR = EnumC72421XdR.RECOMMENDED_MUSIC_FEED_REELS_COVER_MODEL;
                        break;
                    }
                    break;
            }
            interfaceC02590Ai.A8R(enumC72421XdR, "inventory_source");
        }
        enumC72421XdR = null;
        interfaceC02590Ai.A8R(enumC72421XdR, "inventory_source");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.E4T r4, X.InterfaceC11380iw r5, X.AbstractC12990ll r6, java.lang.Long r7, java.lang.Long r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            X.AbstractC167017dG.A1N(r6, r5)
            X.0wW r1 = X.AbstractC12220kQ.A01(r5, r6)
            r0 = 65
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto La6
            X.AbstractC31175DnJ.A14(r2, r5)
            r1 = 0
            if (r11 == 0) goto La9
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r11)
            if (r0 == 0) goto La9
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
        L29:
            X.AbstractC37300Gc1.A0h(r2, r0)
            java.lang.Long r3 = X.AbstractC37302Gc3.A0W(r12)
            java.lang.String r0 = "media_author_id"
            r2.A9K(r0, r3)
            A04(r2, r9)
            java.lang.String r3 = A02(r10)
            java.lang.String r0 = "share_option"
            r2.AAP(r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r2.AAP(r0, r13)
            java.lang.String r0 = "xpost_extras"
            r2.AAQ(r4, r0)
            if (r15 == 0) goto La7
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r15)
            if (r0 == 0) goto La7
            java.lang.Long r3 = X.AbstractC166997dE.A0j(r0)
        L59:
            r0 = 76
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A9K(r0, r3)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r3 = r16
            r2.AAP(r0, r3)
            if (r11 == 0) goto L79
            java.lang.Integer r0 = X.C4q7.A00(r11)
            if (r0 == 0) goto L79
            java.lang.Long r1 = X.AbstractC25229BEm.A0n(r0)
        L79:
            java.lang.Double r1 = A00(r2, r1, r11)
            java.lang.String r0 = "vpv_duration"
            r2.A8I(r0, r1)
            java.lang.String r0 = "bottom_sheet_session_id"
            r2.AAP(r0, r14)
            java.lang.String r1 = A01(r6, r11)
            java.lang.String r0 = "inventory_source"
            r2.AAP(r0, r1)
            java.lang.String r0 = "share_option_position"
            r2.A9K(r0, r7)
            java.lang.Long r1 = X.AbstractC82733mb.A00(r17)
            java.lang.String r0 = "carousel_media_id_int"
            r2.A9K(r0, r1)
            java.lang.String r0 = "carousel_index"
            r2.A9K(r0, r8)
            r2.Cht()
        La6:
            return
        La7:
            r3 = r1
            goto L59
        La9:
            r0 = r1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73317Y7a.A05(X.E4T, X.0iw, X.0ll, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A06(E4T e4t, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "external_share_option_impression");
        if (A0f.isSampled()) {
            Long l = null;
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0W(str2));
            if (str3 != null) {
                l = AbstractC166997dE.A0j(str3);
            }
            A0f.A9K("media_author_id", l);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.A8R(EnumC72436Xdg.A0A, "share_location");
            A0f.AAP("share_option", A02(str));
            A0f.AAQ(e4t, "xpost_extras");
            A0f.Cht();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.InterfaceC11380iw r3, X.AbstractC12990ll r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            X.AbstractC167017dG.A1N(r4, r3)
            r0 = 4
            X.C14360o3.A0B(r10, r0)
            X.0wW r1 = X.AbstractC12220kQ.A01(r3, r4)
            r0 = 65
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto La4
            X.AbstractC31175DnJ.A14(r1, r3)
            r2 = 0
            if (r8 == 0) goto La7
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r8)
            if (r0 == 0) goto La7
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
        L2d:
            X.AbstractC37300Gc1.A0h(r1, r0)
            A04(r1, r9)
            java.lang.String r3 = A02(r10)
            java.lang.String r0 = "share_option"
            X.AbstractC25233BEq.A17(r1, r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r1.AAP(r0, r11)
            if (r13 == 0) goto La5
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r13)
            if (r0 == 0) goto La5
            java.lang.Long r3 = X.AbstractC166997dE.A0j(r0)
        L4f:
            r0 = 76
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.A9K(r0, r3)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.AAP(r0, r14)
            if (r8 == 0) goto L6d
            java.lang.Integer r0 = X.C4q7.A00(r8)
            if (r0 == 0) goto L6d
            java.lang.Long r2 = X.AbstractC25229BEm.A0n(r0)
        L6d:
            java.lang.Double r2 = A00(r1, r2, r8)
            java.lang.String r0 = "vpv_duration"
            r1.A8I(r0, r2)
            java.lang.String r0 = "bottom_sheet_session_id"
            r1.AAP(r0, r12)
            java.lang.String r2 = A01(r4, r8)
            java.lang.String r0 = "inventory_source"
            r1.AAP(r0, r2)
            java.lang.String r0 = "url"
            r1.AAP(r0, r15)
            java.lang.String r0 = "ify_media_id"
            r1.A9K(r0, r5)
            java.lang.String r0 = "share_option_position"
            r1.A9K(r0, r6)
            java.lang.Long r2 = X.AbstractC82733mb.A00(r16)
            java.lang.String r0 = "carousel_media_id_int"
            r1.A9K(r0, r2)
            java.lang.String r0 = "carousel_index"
            r1.A9K(r0, r7)
            r1.Cht()
        La4:
            return
        La5:
            r3 = r2
            goto L4f
        La7:
            r0 = r2
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73317Y7a.A07(X.0iw, X.0ll, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(X.InterfaceC11380iw r3, X.AbstractC12990ll r4, java.lang.Long r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            X.0wW r1 = X.AbstractC12220kQ.A01(r3, r4)
            java.lang.String r0 = "external_share_option_impression"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L47
            r1 = 0
            if (r6 == 0) goto L48
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r6)
            if (r0 == 0) goto L48
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
        L1f:
            X.AbstractC37300Gc1.A0h(r2, r0)
            if (r7 == 0) goto L28
            java.lang.Long r1 = X.AbstractC166997dE.A0j(r7)
        L28:
            java.lang.String r0 = "media_author_id"
            r2.A9K(r0, r1)
            X.AbstractC31175DnJ.A14(r2, r3)
            A04(r2, r8)
            java.lang.String r1 = A02(r9)
            java.lang.String r0 = "share_option"
            r2.AAP(r0, r1)
            A03(r2, r4, r6)
            java.lang.String r0 = "ify_media_id"
            r2.A9K(r0, r5)
            r2.Cht()
        L47:
            return
        L48:
            r0 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC73317Y7a.A0A(X.0iw, X.0ll, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A0B(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "external_share_overflow_menu_user_education_dismissed");
        if (A0f.isSampled()) {
            A0f.AAP("media_id", str);
            A0f.A9K("media_owner_id", AbstractC25233BEq.A0n(str2));
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            AbstractC25233BEq.A17(A0f, "share_location", str3);
            A0f.Cht();
        }
    }

    public static final void A0C(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "external_share_media_ufi_tooltip_impression");
        if (A0f.isSampled()) {
            A0f.AAP("media_id", str);
            A0f.A9K("media_owner_id", AbstractC25233BEq.A0n(str2));
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            AbstractC25233BEq.A17(A0f, "share_location", str3);
            A0f.Cht();
        }
    }

    public static final void A0J(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        AbstractC25233BEq.A0x(3, str2, str3, str4);
        A0K(interfaceC11380iw, userSession, str, str2, str3, str4);
    }
}
