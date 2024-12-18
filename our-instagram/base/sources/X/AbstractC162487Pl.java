package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162487Pl {
    public static final List A00;
    public static final List A01;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 500
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static final X.C7P3 A00(com.instagram.common.session.UserSession r18, X.AnonymousClass988 r19, X.C160787Im r20, X.C7VF r21) {
        /*
            Method dump skipped, instructions count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162487Pl.A00(com.instagram.common.session.UserSession, X.988, X.7Im, X.7VF):X.7P3");
    }

    public static final boolean A01(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        String str;
        if (System.currentTimeMillis() - AbstractC2056298m.A00(userSession).A00.getLong("preference_direct_tap_and_hold_to_reply_meta_ai_message_last_time_seen", 0L) > TimeUnit.DAYS.toMillis(1L) && AbstractC2056298m.A00(userSession).A00.getInt("preference_direct_tap_and_hold_to_reply_meta_ai_message_nux_count", 0) < ((int) C18U.A01(C06090Tz.A05, userSession, 36600843719610408L)) && ((Boolean) anonymousClass988.A13.getValue()).booleanValue() && !c160787Im.A0G.A0o) {
            C83403nh c83403nh = c160787Im.A0e;
            if (c83403nh.A0Q != null && c160787Im.A0W && (str = c83403nh.A1q) != null && str.contains("?")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C160787Im c160787Im) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36326953648666831L) && C18U.A06(c06090Tz, userSession, 36326953648797905L) && AbstractC2056298m.A00(userSession).A00.getInt("preference_direct_regenerate_ai_message_nux_count", 0) < ((int) C18U.A01(c06090Tz, userSession, 36608428625565412L)) && c160787Im.A06()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r8.A1F != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(com.instagram.common.session.UserSession r7, X.C7TT r8, X.C83403nh r9) {
        /*
            r3 = 0
            java.lang.String r1 = r8.A0T
            java.lang.String r0 = r7.userId
            boolean r6 = X.C14360o3.A0K(r1, r0)
            X.3oI r0 = r8.A0P
            r5 = 0
            if (r0 == 0) goto L63
            X.3oE r0 = X.AbstractC1345466e.A02(r0)
            if (r0 == 0) goto L63
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L63
            boolean r0 = r8.A12
            if (r0 == 0) goto L25
            boolean r0 = r8.A0l
            if (r0 != 0) goto L25
            boolean r0 = r8.A1F
            r2 = 1
            if (r0 == 0) goto L26
        L25:
            r2 = 0
        L26:
            int r1 = r8.A08
            r0 = 29
            if (r1 != r0) goto L63
            if (r6 == 0) goto L63
            java.lang.String r1 = r7.userId
            java.lang.String r0 = r9.BtE()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L63
            if (r2 == 0) goto L63
            X.1Ai r0 = X.AbstractC23021Ah.A00(r7)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "has_seen_xposting_creation_upsell_mustache_nux"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r4)
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L63
            boolean r0 = X.C7HD.A04(r7, r3)
            if (r0 == 0) goto L63
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323079588293563(0x810ba600022bbb, double:3.034200020714047E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L63
            r5 = 1
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162487Pl.A04(com.instagram.common.session.UserSession, X.7TT, X.3nh):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r8.A1F != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(com.instagram.common.session.UserSession r7, X.C7TT r8, X.C83403nh r9) {
        /*
            r3 = 0
            java.lang.String r1 = r8.A0T
            java.lang.String r0 = r7.userId
            boolean r6 = X.C14360o3.A0K(r1, r0)
            X.3oI r0 = r8.A0P
            r5 = 0
            if (r0 == 0) goto L56
            X.3oE r0 = X.AbstractC1345466e.A02(r0)
            if (r0 == 0) goto L56
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L56
            boolean r0 = r8.A1E
            if (r0 == 0) goto L25
            boolean r0 = r8.A0l
            if (r0 == 0) goto L25
            boolean r0 = r8.A1F
            r2 = 1
            if (r0 == 0) goto L26
        L25:
            r2 = 0
        L26:
            int r1 = r8.A08
            r0 = 29
            if (r1 != r0) goto L56
            if (r6 == 0) goto L56
            java.lang.String r1 = r7.userId
            java.lang.String r0 = r9.BtE()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L56
            if (r2 == 0) goto L56
            boolean r0 = X.C7HD.A04(r7, r3)
            if (r0 == 0) goto L56
            X.1Ai r0 = X.AbstractC23021Ah.A00(r7)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "has_seen_xposting_upsell_mustache_nux"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r4)
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L56
            r5 = 1
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162487Pl.A05(com.instagram.common.session.UserSession, X.7TT, X.3nh):boolean");
    }

    public static final boolean A06(UserSession userSession, C7TT c7tt, C83403nh c83403nh, C7P8 c7p8) {
        InterfaceC83733oI interfaceC83733oI;
        String A07;
        C14360o3.A0B(c7p8, 3);
        String str = userSession.userId;
        if (c83403nh.A1u.equals(str) && C14360o3.A0K(str, c7tt.A0T)) {
            if (C7QS.A00(userSession, c83403nh, c7p8, Integer.valueOf(c7tt.A01), c7tt.A0b, c7tt.A08, c7tt.A0n) && (interfaceC83733oI = c7tt.A0P) != null && (A07 = AbstractC1345466e.A07(interfaceC83733oI)) != null) {
                InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(userSession).A00;
                long j = interfaceC19630xq.getLong(AnonymousClass001.A0R("direct_share_message_nux_first_timestamp_", A07), 0L);
                if (interfaceC19630xq.getInt("direct_share_message_nux_count", 0) < 3 && j != 0 && System.currentTimeMillis() > j + 86400000) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0.intValue() != 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(com.instagram.common.session.UserSession r6, X.C83403nh r7) {
        /*
            r3 = 0
            r2 = 1
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            r5 = 1
            if (r0 == 0) goto L1c
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            X.43t r0 = (X.C910143t) r0
            if (r0 == 0) goto L1c
            java.lang.Integer r0 = r0.A0l
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r2) goto L1d
        L1c:
            r1 = 0
        L1d:
            X.0vz r0 = r6.deviceSession
            android.content.Context r0 = r0.A06()
            boolean r0 = X.AbstractC14490oL.A0A(r0)
            if (r0 != 0) goto L53
            if (r1 == 0) goto L53
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320128945692757(0x8108f700012055, double:3.032334022452013E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L53
            X.98n r0 = X.AbstractC2056298m.A00(r6)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "direct_threads_upsell_nux_count"
            int r0 = r1.getInt(r0, r3)
            long r3 = (long) r0
            r0 = 36601603922465027(0x8208f700021103, double:3.210339931171554E-306)
            long r1 = X.C18U.A01(r2, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            return r5
        L53:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162487Pl.A07(com.instagram.common.session.UserSession, X.3nh):boolean");
    }

    public static final boolean A08(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ((C160787Im) it.next()).A0C = C7P3.A0S;
            z = true;
        }
        return z;
    }

    static {
        C7P3[] c7p3Arr = new C7P3[31];
        C7P3 c7p3 = C7P3.A0O;
        C7P3 c7p32 = C7P3.A0Q;
        C7P3 c7p33 = C7P3.A03;
        C7P3 c7p34 = C7P3.A0e;
        C7P3 c7p35 = C7P3.A0c;
        C7P3 c7p36 = C7P3.A0J;
        C7P3 c7p37 = C7P3.A0d;
        C7P3 c7p38 = C7P3.A0N;
        C7P3 c7p39 = C7P3.A0b;
        C7P3 c7p310 = C7P3.A0K;
        C7P3 c7p311 = C7P3.A06;
        C7P3 c7p312 = C7P3.A04;
        C7P3 c7p313 = C7P3.A05;
        C7P3 c7p314 = C7P3.A0M;
        C7P3 c7p315 = C7P3.A08;
        C7P3 c7p316 = C7P3.A0Y;
        C7P3 c7p317 = C7P3.A0L;
        C7P3 c7p318 = C7P3.A0H;
        C7P3 c7p319 = C7P3.A0G;
        C7P3 c7p320 = C7P3.A0P;
        C7P3 c7p321 = C7P3.A0D;
        C7P3 c7p322 = C7P3.A0a;
        C7P3 c7p323 = C7P3.A0U;
        C7P3 c7p324 = C7P3.A07;
        C7P3 c7p325 = C7P3.A0C;
        C7P3 c7p326 = C7P3.A09;
        C7P3 c7p327 = C7P3.A0F;
        System.arraycopy(new C7P3[]{c7p3, c7p32, c7p33, c7p34, c7p35, c7p36, c7p37, c7p38, c7p39, c7p310, c7p311, c7p312, c7p313, c7p314, c7p315, c7p316, c7p317, c7p318, c7p319, c7p320, c7p321, c7p322, c7p323, c7p324, c7p325, c7p326, c7p327}, 0, c7p3Arr, 0, 27);
        C7P3 c7p328 = C7P3.A02;
        C7P3 c7p329 = C7P3.A0I;
        C7P3 c7p330 = C7P3.A0V;
        C7P3 c7p331 = C7P3.A0B;
        System.arraycopy(new C7P3[]{c7p328, c7p329, c7p330, c7p331}, 0, c7p3Arr, 27, 4);
        A00 = AbstractC16960so.A1Q(c7p3Arr);
        C7P3[] c7p3Arr2 = new C7P3[31];
        System.arraycopy(new C7P3[]{c7p3, c7p32, c7p33, c7p34, c7p35, c7p36, c7p37, c7p38, c7p39, c7p310, c7p330, c7p329, c7p311, c7p312, c7p313, c7p314, c7p315, c7p316, c7p317, c7p318, c7p320, c7p319, c7p321, c7p322, c7p323, c7p324, c7p325}, 0, c7p3Arr2, 0, 27);
        System.arraycopy(new C7P3[]{c7p326, c7p327, c7p328, c7p331}, 0, c7p3Arr2, 27, 4);
        A01 = AbstractC16960so.A1Q(c7p3Arr2);
    }

    public static final boolean A03(UserSession userSession, C7TT c7tt, C83403nh c83403nh) {
        String str;
        C83693oE c83693oE;
        C2056398n A002 = AbstractC2056298m.A00(userSession);
        InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
        if (!(interfaceC83733oI instanceof C83693oE) || (c83693oE = (C83693oE) interfaceC83733oI) == null || (str = c83693oE.A00) == null) {
            str = "";
        }
        InterfaceC19630xq interfaceC19630xq = A002.A00;
        if (interfaceC19630xq.getBoolean(AnonymousClass001.A0R("broadcast_channel_replies_nudge_has_displayed_", str), false) && interfaceC19630xq.getInt("direct_channel_member_reply_nux_count", 0) < 3 && !c7tt.A1A && c7tt.A07 != 8 && c7tt.A0n && C98Q.A00(userSession).A00(interfaceC83733oI, 46) && C77X.A01(userSession, c83403nh)) {
            return true;
        }
        return false;
    }
}
