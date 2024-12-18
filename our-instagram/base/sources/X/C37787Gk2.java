package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.Gk2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37787Gk2 {
    public static java.util.Set A00;
    public static final C37787Gk2 A01 = new Object();

    public final boolean A0A(UserSession userSession) {
        C1IB A002;
        C14360o3.A0B(userSession, 0);
        if (C1LE.A0B(userSession)) {
            A002 = C1I9.A00(userSession);
        } else {
            A002 = C1P2.A00(userSession);
        }
        return A002.A03("clips_discover_prefetch", A00(userSession), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (X.C23061Al.A00(r3).A00(X.EnumC23071Am.A0a) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.AbstractC40774I5c.A00(r3, X.AbstractC23021Ah.A00(r3)) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r0 = 36609626921703356L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(com.instagram.common.session.UserSession r3) {
        /*
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328774715064091(0x8110d400043f1b, double:3.0378016418161636E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L34
            r0 = 36328774715195165(0x8110d400063f1d, double:3.0378016418990554E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2c
            X.1Ai r0 = X.AbstractC23021Ah.A00(r3)
            boolean r0 = X.AbstractC40774I5c.A00(r3, r0)
            if (r0 == 0) goto L34
        L22:
            r0 = 36609626921703356(0x821043000717bc, double:3.215413708195898E-306)
        L27:
            long r0 = X.C18U.A01(r2, r3, r0)
            return r0
        L2c:
            r0 = 36609626921703356(0x821043000717bc, double:3.215413708195898E-306)
            X.C18U.A01(r2, r3, r0)
        L34:
            r0 = 36328151945067768(0x81104300083cf8, double:3.0374077995627955E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4e
            boolean r0 = X.C23051Ak.A05
            X.1Ak r1 = X.C23061Al.A00(r3)
            X.1Am r0 = X.EnumC23071Am.A0a
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L4e
            goto L22
        L4e:
            r0 = 36609626921375674(0x821043000217ba, double:3.215413707988671E-306)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37787Gk2.A00(com.instagram.common.session.UserSession):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r39 != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r29, X.AbstractC23721Ec r30, com.instagram.common.session.UserSession r31, X.AbstractC39459Hbl r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.Map r36, X.InterfaceC16820sZ r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37787Gk2.A01(android.content.Context, X.1Ec, com.instagram.common.session.UserSession, X.Hbl, java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.0sZ, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r33 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(X.AbstractC23721Ec r23, X.InterfaceC116925Qy r24, com.instagram.common.session.UserSession r25, X.AbstractC39459Hbl r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, double r30, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            r22 = this;
            r3 = r24
            r4 = r27
            java.util.Map r0 = r3.AUT(r4)
            java.util.Map r1 = X.AbstractC85703rz.A00(r0)
            java.util.LinkedHashSet r2 = X.AbstractC31171DnF.A0l()
            java.util.Set r0 = X.AbstractC85703rz.A01(r0)
            if (r0 == 0) goto L19
            r2.addAll(r0)
        L19:
            r7 = 0
            r10 = 1
            r13 = r33
            if (r34 != 0) goto L22
            r11 = 0
            if (r33 == 0) goto L23
        L22:
            r11 = 1
        L23:
            r14 = 0
            r12 = r36
            r5 = r25
            r6 = r28
            r8 = r29
            r9 = r32
            boolean r0 = X.AbstractC37761Gja.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L49
            java.util.Map r4 = r3.AUS(r4)
            java.util.Map r0 = X.AbstractC85703rz.A00(r4)
            java.util.LinkedHashMap r1 = X.AbstractC06930Yk.A04(r1, r0)
            java.util.Set r0 = X.AbstractC85703rz.A01(r4)
            if (r0 == 0) goto L49
            r2.addAll(r0)
        L49:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L52
            r2 = 0
        L52:
            X.C37787Gk2.A00 = r2
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r2 = r23
            if (r0 == 0) goto L7e
            java.util.Iterator r4 = X.AbstractC166997dE.A15(r1)
        L62:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.A9s(r1, r0)
            goto L62
        L7e:
            X.3Ws r0 = X.EnumC74603Ws.A06
            A05(r3, r0, r14)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321748148299565(0x810a700000272d, double:3.033358012700564E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 == 0) goto Ld7
            if (r32 != 0) goto Ld9
            if (r33 != 0) goto Ld6
            if (r35 != 0) goto Ld6
            r0 = r26
            if (r26 == 0) goto Ld6
            X.GiJ r4 = new X.GiJ
            r4.<init>(r5, r0)
            java.lang.String r3 = r4.A00()
            X.GiW r5 = X.AbstractC37654Ghn.A01(r5)
            if (r5 == 0) goto Lcb
            boolean r0 = r5.A00
            if (r0 != 0) goto Lcb
            X.0XJ r1 = new X.0XJ
            r1.<init>()
            java.lang.String r0 = "view_state_json"
            X.02i r12 = X.C37695GiW.A00(r1, r5, r0, r3, r10)
            r13 = 976032351(0x3a2d125f, float:6.602164E-4)
            r15 = 7
            long r18 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r20 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r16 = "set_view_state_list"
            r17 = r1
            r21 = r14
            r12.markerPoint(r13, r14, r15, r16, r17, r18, r20, r21)
        Lcb:
            java.lang.String r0 = r4.A00()
            if (r0 == 0) goto Ld6
            java.lang.String r0 = "client_view_state_media_list"
            r2.A9s(r0, r3)
        Ld6:
            return
        Ld7:
            if (r32 == 0) goto Ld6
        Ld9:
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r30 > r3 ? 1 : (r30 == r3 ? 0 : -1))
            if (r0 <= 0) goto Ld6
            java.lang.String r3 = "client_p_impression"
            X.1Ee r1 = r2.A0W
            java.lang.String r0 = java.lang.String.valueOf(r30)
            r1.A05(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37787Gk2.A02(X.1Ec, X.5Qy, com.instagram.common.session.UserSession, X.Hbl, java.lang.String, java.lang.String, java.lang.String, double, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static final void A03(AbstractC23721Ec abstractC23721Ec, UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        String str8;
        String str9;
        abstractC23721Ec.A0E = str3;
        abstractC23721Ec.A05();
        abstractC23721Ec.A08(num);
        if (num == C05F.A0Y) {
            abstractC23721Ec.A00 = 10000L;
        }
        boolean z3 = false;
        if (str2 != null && str2.length() != 0) {
            str8 = AnonymousClass001.A0R("?max_id=", str2);
        } else {
            str8 = "";
        }
        if (A06(userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36319746693537418L);
            Boolean A0c = AbstractC166997dE.A0c(c06090Tz, userSession, 36319746693602955L);
            Boolean A0c2 = AbstractC166997dE.A0c(c06090Tz, userSession, 36319746693668492L);
            Boolean A0c3 = AbstractC166997dE.A0c(c06090Tz, userSession, 36319746693734029L);
            Boolean A0c4 = AbstractC166997dE.A0c(c06090Tz, userSession, 36319746693799566L);
            Boolean A0c5 = AbstractC166997dE.A0c(c06090Tz, userSession, 36319746693865103L);
            if (A06) {
                str9 = new JSONObject(AbstractC06930Yk.A06(AbstractC166987dD.A1L("carousel_with_photo_in_first_position", A0c), AbstractC166987dD.A1L("carousel_with_video_in_first_position", A0c2), AbstractC166987dD.A1L("carousel_with_music", A0c3), AbstractC166987dD.A1L("photo_without_music", A0c4), AbstractC166987dD.A1L("photo_with_music", A0c5))).toString();
            } else {
                str9 = null;
            }
            abstractC23721Ec.A0H("mixed_media_types", str9);
            abstractC23721Ec.A0I("use_mmd_service", C18U.A06(c06090Tz, userSession, 36319746693996177L));
        }
        StringBuilder A11 = AbstractC166997dE.A11(str3);
        if (str4 != null) {
            A11.append(str4);
        }
        abstractC23721Ec.A0A = AbstractC166997dE.A0x(str8, A11);
        AbstractC37300Gc1.A0y(abstractC23721Ec, str);
        if (num2 != null) {
            abstractC23721Ec.A0D("netego_subtype", num2.intValue());
        }
        abstractC23721Ec.A0I("should_refetch_chaining_media", z);
        if (z2) {
            abstractC23721Ec.A9s("reason", "pull_to_refresh");
        }
        if (str5 != null) {
            abstractC23721Ec.A9s("viewer_session_id", str5);
        }
        abstractC23721Ec.A0H("interest_id", str6);
        abstractC23721Ec.A0G = str;
        C06090Tz c06090Tz2 = C06090Tz.A05;
        if (C18U.A06(c06090Tz2, userSession, 36319746693537418L) && !C18U.A06(c06090Tz2, userSession, 36319746693930640L) && !A06(userSession)) {
            z3 = true;
        }
        abstractC23721Ec.A0I("enable_mixed_media_chaining", z3);
        abstractC23721Ec.A9s("prefetch_trigger_type", str7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.AbstractC23721Ec r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List r11, boolean r12, boolean r13, boolean r14) {
        /*
            java.lang.String r0 = "chaining_media_id"
            r5.A0H(r0, r6)
            if (r14 == 0) goto Le
            java.lang.String r1 = "include_bio_for_user"
            java.lang.String r0 = "1"
            r5.A0H(r1, r0)
        Le:
            java.lang.String r0 = "max_id"
            r5.A0H(r0, r7)
            java.lang.String r0 = "session_info"
            r5.A0H(r0, r8)
            java.lang.String r0 = "seen_reels"
            r5.A0H(r0, r9)
            java.lang.String r0 = "server_driven_cache_config"
            r5.A0H(r0, r10)
            if (r13 == 0) goto L2f
            java.lang.Integer r0 = X.C05F.A00
        L26:
            r5.A09 = r0
        L28:
            boolean r0 = X.AbstractC166987dD.A1b(r11)
            if (r0 == 0) goto L71
            goto L34
        L2f:
            if (r12 == 0) goto L28
            java.lang.Integer r0 = X.C05F.A01
            goto L26
        L34:
            java.io.StringWriter r4 = X.AbstractC37300Gc1.A0O()     // Catch: java.io.IOException -> L63
            X.17z r3 = X.AbstractC37301Gc2.A06(r4)     // Catch: java.io.IOException -> L63
            java.util.Iterator r2 = r11.iterator()     // Catch: java.io.IOException -> L63
        L40:
            boolean r0 = r2.hasNext()     // Catch: java.io.IOException -> L63
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()     // Catch: java.io.IOException -> L63
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L63
            r3.A0d()     // Catch: java.io.IOException -> L63
            java.lang.String r0 = "id"
            r3.A0S(r0, r1)     // Catch: java.io.IOException -> L63
            r3.A0a()     // Catch: java.io.IOException -> L63
            goto L40
        L58:
            r3.A0Z()     // Catch: java.io.IOException -> L63
            r3.close()     // Catch: java.io.IOException -> L63
            java.lang.String r1 = r4.toString()     // Catch: java.io.IOException -> L63
            goto L6c
        L63:
            r2 = move-exception
            java.lang.String r1 = "DiscoverApiUtil"
            java.lang.String r0 = "getDroppedMediaListJSON() Failed building JSON: "
            X.C0K8.A0F(r1, r0, r2)
            r1 = 0
        L6c:
            java.lang.String r0 = "dropped_media_ids"
            r5.A0H(r0, r1)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37787Gk2.A04(X.1Ec, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }

    public static final void A05(InterfaceC116925Qy interfaceC116925Qy, EnumC74603Ws enumC74603Ws, boolean z) {
        java.util.Set set = A00;
        if (set != null) {
            interfaceC116925Qy.FCF(enumC74603Ws, set);
            if (z) {
                A00 = null;
            }
        }
    }

    public static final boolean A06(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319746693537418L) && !C18U.A06(c06090Tz, userSession, 36319746693930640L) && !C18U.A06(c06090Tz, userSession, 36328521311731290L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0007 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(com.instagram.common.session.UserSession r3, java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            switch(r0) {
                case -1782849828: goto L6c;
                case -1605077561: goto L5c;
                case -1173934446: goto L4f;
                case -893240619: goto L4c;
                case -464728503: goto L42;
                case -245756598: goto L3f;
                case -39744821: goto L2f;
                case 132014642: goto L2c;
                case 1310132869: goto L1c;
                case 1794301627: goto Lc;
                case 1978956600: goto L9;
                default: goto L7;
            }
        L7:
            r0 = 0
        L8:
            return r0
        L9:
            java.lang.String r0 = "clips_viewer_feed_sa_multi_ads_watch_and_browse"
            goto L51
        Lc:
            java.lang.String r0 = "clips_viewer_feed_timeline_feed_of_ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321937127450530(0x810a9c000927a2, double:3.033477523876592E-306)
            goto L7b
        L1c:
            java.lang.String r0 = "clips_viewer_feed_timeline_tall_video_watch_and_browse_with_chaining"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321937127581604(0x810a9c000b27a4, double:3.033477523959484E-306)
            goto L7b
        L2c:
            java.lang.String r0 = "clips_viewer_direct_ad_feed_of_ads"
            goto L44
        L2f:
            java.lang.String r0 = "clips_viewer_feed_timeline_watch_and_browse_with_chaining"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321937127516067(0x810a9c000a27a3, double:3.033477523918038E-306)
            goto L7b
        L3f:
            java.lang.String r0 = "clips_viewer_feed_multi_ads_ad_chain"
            goto L51
        L42:
            java.lang.String r0 = "clips_viewer_explore_grid_ad_feed_of_ads"
        L44:
            boolean r1 = r4.equals(r0)
            r0 = 1
            if (r1 != 0) goto L8
            goto L7
        L4c:
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_ad_chain"
            goto L51
        L4f:
            java.lang.String r0 = "clips_viewer_feed_pae_multi_ads_watch_and_browse"
        L51:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            boolean r0 = X.C1LE.A0A(r3)
            return r0
        L5c:
            java.lang.String r0 = "clips_viewer_clips_multi_ads_feed_of_ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36319209826557006(0x810821003c1c4e, double:3.0317527678095685E-306)
            goto L7b
        L6c:
            java.lang.String r0 = "clips_viewer_clips_pae_multi_ads_feed_of_ads"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36319209826622543(0x810821003d1c4f, double:3.0317527678510143E-306)
        L7b:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37787Gk2.A07(com.instagram.common.session.UserSession, java.lang.String):boolean");
    }

    public final C1ON A08(Context context, C9CJ c9cj, InterfaceC116925Qy interfaceC116925Qy, UserSession userSession, InterfaceC120815dY interfaceC120815dY, AbstractC39459Hbl abstractC39459Hbl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InterfaceC16820sZ interfaceC16820sZ, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C25621Ms A002;
        String str10;
        Map map;
        boolean z6;
        String str11;
        String str12;
        boolean A1W = AbstractC167007dF.A1W(str8);
        boolean A06 = A06(userSession);
        boolean A07 = A07(userSession, str5);
        if (!A06) {
            A002 = AbstractC37797GkC.A00(userSession);
        } else {
            A002 = AbstractC25228BEl.A0q(userSession);
            A002.A0R(C38858H9g.class, C41307IPw.class);
        }
        if (A1W) {
            str10 = "discover/interest_grid/clips/";
        } else {
            str10 = A07 ? "clips/ads_discover_sync_flow/" : A06 ? "mixed_media/discover/" : "clips/discover/";
        }
        C25621Ms c25621Ms = A002;
        A03(c25621Ms, userSession, C05F.A01, num, str5, str2, str10, null, str7, str8, str9, z3, z4);
        C06090Tz c06090Tz = C06090Tz.A05;
        A04(c25621Ms, str, str2, str3, str4, str6, C16930sl.A00, z, z2, C18U.A06(c06090Tz, userSession, 36323745308290635L));
        if (interfaceC120815dY != null) {
            map = interfaceC120815dY.Bkt();
        } else {
            map = null;
        }
        A01(context, A002, userSession, abstractC39459Hbl, str5, str, str2, map, interfaceC16820sZ, z, z4, z5, false, false);
        if (interfaceC120815dY != null) {
            z6 = interfaceC120815dY.CKw();
        } else {
            z6 = false;
        }
        A02(A002, interfaceC116925Qy, userSession, abstractC39459Hbl, str10, str5, str2, d, z, z4, z5, false, z6);
        if (C18U.A06(c06090Tz, userSession, 36324608596521227L)) {
            A002.A9s("device_status", MU5.A00(userSession));
        }
        if (A07(userSession, str5)) {
            if (c9cj != null) {
                str11 = c9cj.A00;
            } else {
                str11 = null;
            }
            A002.A0H("seed_ad_id", str11);
            if (c9cj != null) {
                str12 = c9cj.A02;
            } else {
                str12 = null;
            }
            A002.A0H("seed_ad_token", str12);
            A002.A0H("post_trigger_eligibility_flags", c9cj != null ? c9cj.A01 : null);
        }
        return A002.A0N();
    }

    public final C24531Hw A09(Context context, InterfaceC116925Qy interfaceC116925Qy, UserSession userSession, InterfaceC120815dY interfaceC120815dY, AbstractC39459Hbl abstractC39459Hbl, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, InterfaceC16820sZ interfaceC16820sZ, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C23711Eb A02;
        String str12;
        Integer num2;
        Map map;
        boolean z8;
        long longValue;
        boolean A1W = AbstractC167007dF.A1W(str9);
        boolean A06 = A06(userSession);
        if (!A06) {
            A02 = AbstractC37797GkC.A02(userSession, 1617547344);
        } else {
            A02 = AbstractC37797GkC.A01(userSession);
        }
        if (A1W) {
            str12 = "discover/interest_grid/clips/";
        } else {
            str12 = A06 ? "mixed_media/discover/stream/" : "clips/discover/stream/";
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318479678970026L) && !z4) {
            num2 = C05F.A0Y;
        } else {
            num2 = C05F.A01;
        }
        if (z7 && !C18U.A06(c06090Tz, userSession, 36325845547824572L)) {
            num2 = C05F.A0N;
            if (l == null) {
                longValue = TimeUnit.MINUTES.toMillis(180L);
            } else {
                longValue = l.longValue();
            }
            ((AbstractC23721Ec) A02).A01 = longValue;
        }
        if (z5 && C18U.A06(c06090Tz, userSession, 36325845547824572L)) {
            A02.A0H("client_cache_media_list", str10);
        }
        C23711Eb c23711Eb = A02;
        A03(c23711Eb, userSession, num2, num, str5, str2, str12, str7, str8, str9, str11, z3, z4);
        A04(c23711Eb, str, str2, str3, str4, str6, list, z, z2, C18U.A06(c06090Tz, userSession, 36323745308290635L));
        if (interfaceC120815dY != null) {
            map = interfaceC120815dY.Bkt();
        } else {
            map = null;
        }
        A01(context, A02, userSession, abstractC39459Hbl, str5, str, str2, map, interfaceC16820sZ, z, z4, z5, true, z7);
        if (interfaceC120815dY != null) {
            z8 = interfaceC120815dY.CKw();
        } else {
            z8 = false;
        }
        A02(A02, interfaceC116925Qy, userSession, abstractC39459Hbl, str12, str5, str2, d, z, z4, z5, z6, z8);
        if (C18U.A06(c06090Tz, userSession, 36324608596521227L)) {
            A02.A9s("device_status", MU5.A00(userSession));
        }
        return A02.A0N();
    }
}
