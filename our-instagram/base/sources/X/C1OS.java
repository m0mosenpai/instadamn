package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1OS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OS implements InterfaceC13000lm {
    public static final HashMap A09 = new HashMap();
    public C70873Fz A00;
    public boolean A01;
    public C1OP A02;
    public Long A03;
    public boolean A04;
    public final Handler A05;
    public final UserSession A06;
    public final Map A07;
    public final C18920wW A08;

    public C1OS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "reel_feed_timeline";
        this.A08 = c12210kP.A00();
        this.A07 = new HashMap();
        this.A05 = new Handler(Looper.getMainLooper());
    }

    public static final synchronized void A01(C006802i c006802i, C1OS c1os, int i, short s) {
        synchronized (c1os) {
            HashMap hashMap = A09;
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.get(valueOf) != null && c006802i.isMarkerOn(974456048, i, false)) {
                c006802i.markerEnd(974456048, i, s);
            }
            hashMap.remove(valueOf);
        }
    }

    public static final synchronized void A04(C1OS c1os, String str) {
        synchronized (c1os) {
            C006802i c006802i = C006802i.A0p;
            HashMap hashMap = A09;
            for (Object obj : hashMap.keySet()) {
                C14360o3.A07(obj);
                int intValue = ((Number) obj).intValue();
                C14360o3.A0A(c006802i);
                A03(c006802i, "CANCEL_REASON", str, intValue);
            }
            c006802i.endAllInstancesOfMarker(974456048, (short) 4);
            hashMap.clear();
        }
    }

    public static final synchronized void A05(C1OS c1os, String str) {
        synchronized (c1os) {
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            HashSet hashSet = new HashSet();
            HashMap hashMap = A09;
            for (Object obj : hashMap.keySet()) {
                C14360o3.A07(obj);
                int intValue = ((Number) obj).intValue();
                if (c006802i.isMarkerOn(974456048, intValue, false)) {
                    c006802i.markerPoint(974456048, intValue, str);
                } else {
                    hashSet.add(Integer.valueOf(intValue));
                }
            }
            if (!hashSet.isEmpty()) {
                hashMap.keySet().removeAll(hashSet);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0100 A[Catch: all -> 0x010c, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000c, B:8:0x0034, B:10:0x003a, B:11:0x004a, B:13:0x0056, B:15:0x005f, B:16:0x007d, B:17:0x0068, B:19:0x00e8, B:20:0x00f3, B:22:0x0100, B:23:0x0106, B:24:0x0087, B:26:0x008d, B:28:0x0091, B:29:0x0097, B:31:0x009d, B:33:0x00a5, B:35:0x00ad, B:36:0x00b3, B:38:0x00b7, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00d7, B:46:0x00dd), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A06(X.AbstractC115105If r12, X.C1OP r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1OS.A06(X.5If, X.1OP):void");
    }

    public final synchronized void A07(C1OP c1op) {
        C14360o3.A0B(c1op, 0);
        Integer A00 = A00(c1op);
        if (A00 != null && (A09.get(A00) != null || !C50K.A00(this.A06).booleanValue())) {
            UserSession userSession = this.A06;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            if (c1op.A03 != C05F.A0C) {
                C18920wW c18920wW = this.A08;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_stories_request_completed");
                if (A002.isSampled()) {
                    A002.AAP("tray_session_id", c1op.A07);
                    A002.AAP("request_type", AbstractC25631Mt.A00(c1op.A04));
                    A002.AAP("app_session_id", AbstractC11060iN.A00(userSession).BdA());
                    A002.Cht();
                }
            }
            A02(c006802i, c1op, "REEL_TRAY_RESPONSE_RECEIVED");
        }
    }

    public final synchronized void A08(C1OP c1op, int i) {
        String str;
        Integer A00 = A00(c1op);
        if (A00 != null) {
            int intValue = A00.intValue();
            if (A09.get(A00) != null || !C50K.A00(this.A06).booleanValue()) {
                int size = C1OU.A04(this.A06).A0U(false).size();
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                if (i == 2) {
                    str = "REEL_STORE_2ND_CHUNK_POPULATED";
                } else {
                    str = "REEL_STORE_POPULATED";
                }
                A02(c006802i, c1op, str);
                if (i != 2) {
                    size--;
                }
                c006802i.markerAnnotate(974456048, intValue, "STORED_REELS_COUNT", size);
            }
        }
    }

    public final synchronized void A09(C1OP c1op, int i, int i2, boolean z) {
        String str;
        Integer A00 = A00(c1op);
        if (A00 != null) {
            int intValue = A00.intValue();
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            if (((Short) A09.get(A00)) != null) {
                if (i2 == 2) {
                    str = "REEL_TRAY_2ND_CHUNK_RENDERED";
                } else {
                    str = "REEL_TRAY_RENDERED";
                }
                A02(c006802i, c1op, str);
                c006802i.markerAnnotate(974456048, intValue, "FINAL_TRAY_SIZE", Math.max(i - 1, 0));
                if (c1op.A03 != C05F.A0C && z) {
                    A03(c006802i, "SOURCE", "CACHED", intValue);
                }
                if (i2 != 1) {
                    A01(c006802i, this, intValue, (short) 2);
                }
            }
        }
    }

    public final void A0B(C1OP c1op, String str) {
        C14360o3.A0B(c1op, 0);
        C006802i c006802i = C006802i.A0p;
        Integer A00 = A00(c1op);
        if (A00 != null) {
            int intValue = A00.intValue();
            C14360o3.A0A(c006802i);
            A03(c006802i, "CANCEL_REASON", str, intValue);
            A01(c006802i, this, intValue, (short) 4);
        }
    }

    public final synchronized void A0D(Integer num) {
        String A00;
        String str;
        String str2;
        String str3;
        if (this.A01) {
            this.A01 = false;
            C18920wW c18920wW = this.A08;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_fresh_stories_tray");
            C70873Fz c70873Fz = this.A00;
            C1OP c1op = this.A02;
            Long l = this.A03;
            boolean z = this.A04;
            if (A002.isSampled() && c1op != null) {
                A002.AAP(TraceFieldType.RequestID, c1op.A06);
                A002.AAP("tray_session_id", c1op.A07);
                Integer num2 = C05F.A00;
                Integer num3 = c1op.A04;
                if (num2 == num3) {
                    A00 = "cold_start";
                } else if (C05F.A01 == num3) {
                    A00 = "warm_start";
                } else if (c1op.A00()) {
                    A00 = "refresh";
                } else {
                    A00 = AbstractC25631Mt.A00(num3);
                }
                A002.AAP("request_type", A00);
                switch (num.intValue()) {
                    case 0:
                        str = "scroll_on_tray";
                        break;
                    case 1:
                        str = "scroll_on_feed";
                        break;
                    case 2:
                        str = "open_story_viewer";
                        break;
                    case 3:
                        str = "exited_home";
                        break;
                    case 4:
                        str = "session_ending";
                        break;
                    default:
                        str = "tray_refreshed";
                        break;
                }
                A002.AAP("action_taken", str);
                if (!z) {
                    str2 = "network";
                } else {
                    str2 = "cache";
                }
                A002.AAP("content_source", str2);
                if (c70873Fz != null) {
                    C3G0 c3g0 = c70873Fz.A01;
                    C3G1 c3g1 = c3g0.A01;
                    int i = c3g1.A01;
                    C3G1 c3g12 = c3g0.A00;
                    int i2 = i + c3g12.A01;
                    int i3 = c3g1.A03 + i2 + c3g1.A00 + c3g12.A00;
                    A002.A9K("unseen_pog_count", Long.valueOf(i2));
                    A002.A9K("total_pog_count", Long.valueOf(i3));
                }
                if (l != null) {
                    long longValue = l.longValue();
                    if (z) {
                        if (System.currentTimeMillis() - longValue >= C18U.A01(C06090Tz.A05, AbstractC25351Lp.A00(this.A06).A00, 36605250349896956L) * 1000) {
                            str3 = "stale";
                            A002.AAP("tray_state", str3);
                        }
                    }
                    str3 = "fresh";
                    A002.AAP("tray_state", str3);
                }
                A002.Cht();
            }
        }
    }

    public static final Integer A00(C1OP c1op) {
        if (c1op.A03 == C05F.A0C) {
            return null;
        }
        return Integer.valueOf(c1op.A01);
    }

    public final synchronized void A0A(C1OP c1op, C3LZ c3lz, int i) {
        String str;
        int i2;
        long currentTimeMillis;
        C14360o3.A0B(c1op, 0);
        Integer A00 = A00(c1op);
        if (A00 != null) {
            int intValue = A00.intValue();
            HashMap hashMap = A09;
            if (hashMap.get(A00) != null || !C50K.A00(this.A06).booleanValue()) {
                UserSession userSession = this.A06;
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                if (i == 2) {
                    str = "REEL_TRAY_RESPONSE_2ND_CHUNK_PARSED";
                } else {
                    str = "REEL_TRAY_RESPONSE_PARSED";
                }
                A02(c006802i, c1op, str);
                C3NO F7f = c3lz.F7f();
                int size = AbstractC73333Qj.A01(userSession, F7f).size();
                int size2 = AbstractC73333Qj.A00(userSession, F7f).size();
                List list = F7f.A0H;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                Integer num = c1op.A04;
                if (num != C05F.A0u) {
                    boolean CR4 = c3lz.CR4();
                    this.A04 = CR4;
                    if (CR4) {
                        currentTimeMillis = c3lz.A00;
                    } else {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    this.A03 = Long.valueOf(currentTimeMillis);
                    this.A02 = c1op;
                }
                c006802i.markerAnnotate(974456048, intValue, "PARSED_USER_REELS_COUNT", size);
                c006802i.markerAnnotate(974456048, intValue, "PARSED_BROADCAST_REELS_COUNT", size2);
                c006802i.markerAnnotate(974456048, intValue, "PARSED_REELS_TO_FETCH_COUNT", i2);
                c006802i.markerAnnotate(974456048, intValue, "PARSED_REELS_COUNT", size + size2);
                List list2 = F7f.A0I;
                if (list2 != null) {
                    c006802i.markerAnnotate(974456048, intValue, "LOCAL_SOURCED_REELS_COUNT", list2.size());
                }
                c006802i.markerAnnotate(974456048, intValue, "RESPONSE_CODE", c3lz.mStatusCode);
                long j = c3lz.A00;
                if (j != -1) {
                    c006802i.markerAnnotate(974456048, intValue, "RESPONSE_AGE_MS", System.currentTimeMillis() - j);
                }
                if (C14360o3.A0K(c3lz.getStatus(), RealtimeConstants.SEND_FAIL)) {
                    if (num == C05F.A00) {
                        int intValue2 = A00.intValue();
                        Short sh = (Short) hashMap.get(A00);
                        if (sh == null || sh.shortValue() != 3 || c1op.A03 != C05F.A0C) {
                            A03(c006802i, "FAILURE_TYPE", "SERVER", intValue2);
                            A03(c006802i, "FAILURE_NAME", "Bad 200", intValue2);
                            A03(c006802i, "NETWORK_FAILURE_REASON", "Client received a 200 response with a fail", intValue2);
                        }
                    } else {
                        A03(c006802i, "FAILURE_TYPE", "SERVER", intValue);
                        A03(c006802i, "FAILURE_NAME", "Bad 200", intValue);
                        A03(c006802i, "NETWORK_FAILURE_REASON", "Client received a 200 response with a fail", intValue);
                    }
                    A01(c006802i, this, intValue, (short) 3);
                }
            }
        }
    }

    public final synchronized void A0C(C1OP c1op, String str) {
        String str2;
        C14360o3.A0B(c1op, 0);
        Integer A00 = A00(c1op);
        if (A00 != null) {
            final int intValue = A00.intValue();
            UserSession userSession = this.A06;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            HashMap hashMap = A09;
            if (hashMap.get(A00) == null) {
                c006802i.markerStart(974456048, intValue);
                this.A05.postDelayed(new Runnable() { // from class: X.1OT
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1OS c1os = C1OS.this;
                        int i = intValue;
                        C006802i c006802i2 = C006802i.A0p;
                        C14360o3.A07(c006802i2);
                        C1OS.A01(c006802i2, c1os, i, (short) 113);
                    }
                }, C18U.A01(C06090Tz.A05, userSession, 36594727679690570L) * 1000);
                hashMap.put(A00, (short) 113);
            }
            if (this.A01 && c1op.A00()) {
                A0D(C05F.A0j);
            }
            switch (c1op.A05.intValue()) {
                case 0:
                    str2 = "MAIN_FEED";
                    break;
                case 1:
                    str2 = "FOLLOWING_FEED";
                    break;
                default:
                    str2 = "HIGHLIGHTS";
                    break;
            }
            A03(c006802i, "TRAY_TYPE", str2, intValue);
            c006802i.markerAnnotate(974456048, intValue, "DEBUG_INSTANCE_NUMBER", intValue);
            int size = C1OU.A04(userSession).A0U(false).size();
            A02(c006802i, c1op, "REEL_TRAY_REQUEST_SENT");
            int intValue2 = A00.intValue();
            int intValue3 = A00.intValue();
            if (C18U.A06(C06090Tz.A06, userSession, 36313252703504226L)) {
                A03(c006802i, "REQUEST_ID", c1op.A06, intValue3);
                A03(c006802i, "TRAY_SESSION_ID", c1op.A07, intValue3);
            }
            int i = 0;
            c006802i.markerAnnotate(974456048, intValue2, "INITIAL_TRAY_SIZE", Math.max(size - 1, 0));
            Integer num = c1op.A04;
            boolean z = false;
            if (num != C05F.A0u) {
                z = true;
            }
            c006802i.markerAnnotate(974456048, intValue2, "IS_FIRST_PAGE", z);
            A03(c006802i, "FETCH_REASON", AbstractC25631Mt.A00(num), intValue2);
            if (intValue2 != -100) {
                A03(c006802i, "CACHE_POLICY", AbstractC26181Oz.A00(c1op.A03), intValue2);
            }
            c006802i.markerAnnotate(974456048, intValue2, "TIMESTAMP_UTC", System.currentTimeMillis() / 1000);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.A07.entrySet()) {
                Object key = entry.getKey();
                if (((Number) entry.getValue()).longValue() >= currentTimeMillis - 600000) {
                    arrayList.add(key);
                }
            }
            String A05 = AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList);
            if (A05 != null) {
                A03(c006802i, "RATE_LIMITED", A05, intValue2);
            }
            List list = c1op.A08;
            if (list != null) {
                i = list.size();
            }
            c006802i.markerAnnotate(974456048, intValue2, "REELS_TO_FETCH_COUNT", i);
            if (str != null) {
                A03(c006802i, "CALLING_SOURCE", str, intValue2);
            }
            if (c1op.A03 != C05F.A0C) {
                C18920wW c18920wW = this.A08;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_stories_request_sent");
                if (A002.isSampled()) {
                    A002.AAP("tray_session_id", c1op.A07);
                    A002.AAP(TraceFieldType.RequestID, c1op.A06);
                    A002.AAP("request_type", AbstractC25631Mt.A00(num));
                    A002.AAP("app_session_id", AbstractC11060iN.A00(userSession).BdA());
                    A002.Cht();
                }
            } else {
                A03(c006802i, "SOURCE", "CACHED", intValue);
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A0D(C05F.A0Y);
        A04(this, "Session Ending");
    }

    private final void A02(C006802i c006802i, C1OP c1op, String str) {
        Integer A00 = A00(c1op);
        if (A00 != null) {
            c006802i.markerPoint(974456048, A00.intValue(), str);
        }
    }

    public static final void A03(C006802i c006802i, String str, String str2, int i) {
        c006802i.markerAnnotate(974456048, i, str, str2);
    }
}
