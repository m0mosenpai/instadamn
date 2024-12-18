package X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25401Lu {
    public static String A00;
    public static final Integer A02 = 80;
    public static final Integer A03 = 20;
    public static final Integer A04 = 50;
    public static final Integer A01 = 1000;

    public static C1ON A00(C1OL c1ol, UserSession userSession, String str) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("media/validate_reel_url/");
        c25621Ms.A00 = c1ol;
        c25621Ms.A9s("url", str);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static C1ON A01(UserSession userSession) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("users/reel_settings/");
        c25621Ms.A0S(C173077nL.class, C173087nM.class);
        return c25621Ms.A0N();
    }

    public static C1ON A02(UserSession userSession, Integer num) {
        String str;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("users/set_reel_settings/");
        switch (num.intValue()) {
            case 0:
                str = "off";
                break;
            case 1:
                str = "anyone";
                break;
            default:
                str = "following";
                break;
        }
        c25621Ms.A9s("message_prefs", str);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static C1ON A04(UserSession userSession, String str, String str2, String str3, int i) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A06();
        c25621Ms.A0L("media/%s/%s/story_poll_voters/", str, str2);
        c25621Ms.A0S(C38842H8q.class, IPB.class);
        if (i != -1) {
            c25621Ms.A9s("vote", Integer.toString(i));
        }
        if (!TextUtils.isEmpty(str3)) {
            c25621Ms.A9s("max_id", str3);
        }
        return c25621Ms.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r19 == X.C05F.A0Y) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1P0 A06(X.C1OL r17, com.instagram.common.session.UserSession r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21) {
        /*
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.Class<X.1Mn> r0 = X.C25571Mn.class
            java.lang.Object r14 = r1.cast(r0)
            java.lang.Class r14 = (java.lang.Class) r14
            r14.getClass()
            X.0aQ r12 = new X.0aQ
            r4 = r18
            r12.<init>(r4)
            java.lang.Integer r0 = X.C05F.A0C
            r10 = 0
            r6 = r19
            if (r6 == r0) goto L21
            java.lang.Integer r0 = X.C05F.A0Y
            r16 = 0
            if (r6 != r0) goto L23
        L21:
            r16 = 1
        L23:
            r0 = 0
            X.1Mr r13 = new X.1Mr
            r13.<init>(r0)
            X.1Eh r11 = new X.1Eh
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r1 = 838639269(0x31fc9ea5, float:7.352201E-9)
            r0 = 1
            X.1Eb r3 = new X.1Eb
            r3.<init>(r4, r1, r0, r10)
            java.lang.Integer r0 = X.C05F.A01
            r3.A09(r0)
            java.lang.String r0 = "feed/reels_tray/"
            r3.A0B(r0)
            java.lang.String r0 = "feed/reels_tray/_v1"
            r3.A0A = r0
            r3.A07 = r6
            java.lang.Integer r13 = X.C05F.A00
            r5 = r20
            if (r5 != r13) goto L84
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317212663747529(0x810650000e13c9, double:3.030489754006926E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L84
            java.lang.String r2 = X.C25401Lu.A00
            if (r2 != 0) goto L77
            android.content.Context r1 = X.AbstractC12290kX.A00
            if (r1 == 0) goto L77
            java.lang.String r0 = "ig_connection_type"
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r0, r10)
            java.lang.String r1 = "last_type"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            X.C25401Lu.A00 = r2
        L77:
            if (r2 == 0) goto L84
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L84
            java.lang.String r0 = "X-Ig-Last-Connection-Type"
            r3.A0G(r0, r2)
        L84:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r7 = r0.toString()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r8 = r0.toString()
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r0 = X.C226218q.A01(r0)
            java.lang.Long r0 = r0.A07
            if (r0 == 0) goto La7
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "X-Ig-App-Start-Time"
            r3.A0G(r0, r1)
        La7:
            r9 = r21
            A09(r3, r4, r5, r6, r7, r8, r9, r10)
            r3.A01 = r11
            X.1Hw r10 = r3.A0N()
            X.1P0 r9 = new X.1P0
            r11 = r6
            r12 = r5
            r14 = r8
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2 = r17
            if (r17 == 0) goto Lc9
            X.3q5 r1 = new X.3q5
            r1.<init>()
            java.util.List r0 = r2.A01
            r0.add(r1)
        Lc9:
            r9.A00 = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25401Lu.A06(X.1OL, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.String):X.1P0");
    }

    public static C1ON A03(UserSession userSession, Integer num, String str) {
        List emptyList;
        String A06 = AbstractC13670mt.A06("feed/user/%s/story/", str);
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B(A06);
        c25621Ms.A08(num);
        c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C154546x4.class);
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36319351556611269L)) {
            Reel A0M = ReelStore.A03(userSession).A0M(str);
            if (A0M != null) {
                emptyList = A08(userSession, Arrays.asList(A0M), Long.valueOf(C18U.A01(c06090Tz, userSession, 36592099159834902L)).intValue());
            } else {
                emptyList = Collections.emptyList();
            }
            if (emptyList != null && !emptyList.isEmpty()) {
                try {
                    c25621Ms.A9s("exclude_media_ids", C5NC.A00.A02(userSession, emptyList));
                } catch (IOException unused) {
                    C0w9.A03("ReelApiUtil.createSingleReelRequestTask", "IOException");
                }
            }
        }
        Pair A002 = AnonymousClass566.A00(userSession);
        c25621Ms.A0H((String) A002.first, (String) A002.second);
        return c25621Ms.A0N();
    }

    public static C98934cD A05(C1OL c1ol, UserSession userSession, Integer num, Integer num2, String str, boolean z) {
        String obj = UUID.randomUUID().toString();
        String obj2 = UUID.randomUUID().toString();
        C25581Mo c25581Mo = new C25581Mo(new C07510aQ(userSession), C25571Mn.class);
        C25621Ms c25621Ms = new C25621Ms(userSession, 197);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("feed/reels_tray/");
        c25621Ms.A02 = c25581Mo;
        c25621Ms.A0A = "feed/reels_tray/_v1";
        c25621Ms.A07 = num;
        if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36323775372865125L)) {
            c25621Ms.A0B = AbstractC25631Mt.A01(num2);
        }
        if (c1ol != null) {
            c25621Ms.A00 = c1ol;
        }
        A09(c25621Ms, userSession, num2, num, obj, obj2, str, z);
        C98934cD c98934cD = new C98934cD(c25621Ms.A0N(), num, num2, C05F.A00, obj2, obj, null);
        ((C1OP) c98934cD).A00 = c1ol;
        return c98934cD;
    }

    public static C85773s6 A07(UserSession userSession, C3G5 c3g5, Boolean bool, String str, Map map, java.util.Set set) {
        boolean booleanValue = bool.booleanValue();
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("feed/reels_media/");
        c25621Ms.A0P(null, C40741uh.class, C85733s2.class, false);
        c25621Ms.A0R = true;
        if (c3g5 != null) {
            c25621Ms.A9s("reason", c3g5.toString());
        }
        C5NA.A00.A00(c25621Ms, userSession, str, map, set, booleanValue);
        C1ON A0N = c25621Ms.A0N();
        C85773s6 c85773s6 = new C85773s6(c3g5, str, set);
        c85773s6.A00 = A0N;
        return c85773s6;
    }

    public static ArrayList A08(UserSession userSession, List list, int i) {
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession2, 36317491840095490L);
        boolean A062 = C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317491839964417L);
        ArrayList arrayList = null;
        if ((!A06 || A062) && list != null && !list.isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                if (arrayList.size() >= i) {
                    break;
                }
                if (!A06 || reel.A1a) {
                    if (reel.A1A(userSession) && reel.A0z(userSession)) {
                        arrayList.add(reel);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void A09(AbstractC23721Ec abstractC23721Ec, UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        long j;
        ArrayList A08;
        abstractC23721Ec.A9s("tray_session_id", str);
        abstractC23721Ec.A9s(TraceFieldType.RequestID, str2);
        abstractC23721Ec.A9s("reason", AbstractC25631Mt.A00(num));
        abstractC23721Ec.A9s("timezone_offset", Long.toString(C23831Eq.A00()));
        String str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        if (z) {
            abstractC23721Ec.A9s("bg", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            abstractC23721Ec.A09 = C05F.A00;
        }
        if (str3 != null) {
            abstractC23721Ec.A9s("reel_tray_impressions", str3);
        }
        abstractC23721Ec.A06 = EnumC23341Bw.CriticalAPI;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36310624182993108L) && ((!C18U.A06(c06090Tz, userSession, 36310624183582936L) || num2 != C05F.A0C) && (A08 = A08(userSession, ReelStore.A03(userSession).A0U(false), Long.valueOf(C18U.A01(c06090Tz, userSession, 36592099159834902L)).intValue())) != null && !A08.isEmpty())) {
            try {
                abstractC23721Ec.A9s("latest_preloaded_reel_ids", C5NC.A00.A02(userSession, A08));
            } catch (IOException unused) {
                C0w9.A03("ReelApiUtil.createReelsTrayRequestTask", "IOException");
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36310624183451863L) && num2 != C05F.A0C) {
            java.util.Set allKeys = C9GZ.A00(userSession).A00.getAllKeys();
            C14360o3.A07(allKeys);
            try {
                abstractC23721Ec.A9s("cached_users", C85743s3.A01(allKeys));
            } catch (IOException e) {
                C0K8.A0G("ReelApiUtil", "Failed to convert cached stories users to json", e);
            }
        }
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36325794008282493L)) {
            List A0U = ReelStore.A03(userSession).A0U(false);
            if (!A0U.isEmpty()) {
                try {
                    abstractC23721Ec.A9s("latest_reel_media_by_id", C85743s3.A00(userSession, A0U));
                } catch (IOException unused2) {
                    C0w9.A03("ReelApiHelper.serializeLatestReelsMedia", "IOException");
                }
            }
        }
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 2342153702116163824L) && (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317491837998313L) || !z)) {
            if (C25371Lr.A00(AbstractC25351Lp.A00(userSession))) {
                j = 36603463643567037L;
            } else {
                j = 36592167879246158L;
            }
            abstractC23721Ec.A9s("page_size", String.valueOf(C18U.A01(c06090Tz, userSession, j)));
        }
        if (!C18U.A06(c06090Tz, userSession, 36317491840292100L) && num != C05F.A00) {
            Pair A002 = AnonymousClass566.A00(userSession);
            abstractC23721Ec.A0H((String) A002.first, (String) A002.second);
        }
        abstractC23721Ec.A0T = true;
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36318707311450537L)) {
            C17280tP A003 = C17280tP.A00();
            if (!((Boolean) A003.A1C.CES(A003, C17280tP.A4G[176])).booleanValue()) {
                str4 = AbstractC13670mt.A06("%.0f", Double.valueOf(C1FP.A00()));
            }
            abstractC23721Ec.A0G("X-IG-Reel-Tray-Bandwidth-KBPS", str4);
        }
    }
}
