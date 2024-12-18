package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61862rn implements InterfaceC13000lm {
    public static final C61852rm A09 = new Object();
    public static final HashMap A0A = new HashMap();
    public static final Map A0B = new LinkedHashMap();
    public static final Map A0C = new LinkedHashMap();
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;
    public final C1QT A04;
    public final UserSession A05;
    public final ArrayList A06;
    public final Handler A07;
    public final AtomicBoolean A08;

    public C61862rn(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A04 = C1QS.A00(userSession);
        this.A07 = new Handler(Looper.getMainLooper());
        this.A08 = new AtomicBoolean(false);
        this.A06 = new ArrayList();
    }

    public static final synchronized void A01(C1QT c1qt, final C1EU c1eu, final C61862rn c61862rn, String str) {
        synchronized (c61862rn) {
            long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
            if (!c1qt.isOngoingFlow(generateFlowId)) {
                c1qt.flowStart(generateFlowId, new UserFlowConfig(c1eu.A04.toString(), false));
                A0A.put(Long.valueOf(generateFlowId), (short) 113);
                c1qt.flowAnnotate(generateFlowId, "CALLING_SOURCE", str);
                c61862rn.A07.postDelayed(new Runnable() { // from class: X.3Wi
                    @Override // java.lang.Runnable
                    public final void run() {
                        C61862rn c61862rn2 = c61862rn;
                        C1EU c1eu2 = c1eu;
                        C1QT c1qt2 = c61862rn2.A04;
                        long generateFlowId2 = c1qt2.generateFlowId(974460658, c1eu2.A01);
                        if (c1qt2.isOngoingFlow(generateFlowId2)) {
                            c1qt2.flowEndTimeout(generateFlowId2);
                        }
                    }
                }, C18U.A01(C06090Tz.A05, c61862rn.A05, 36594727679690570L) * 1000);
            }
        }
    }

    public static final synchronized void A03(C61862rn c61862rn, String str) {
        synchronized (c61862rn) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = A0A;
            for (Object obj : hashMap.keySet()) {
                C14360o3.A07(obj);
                long longValue = ((Number) obj).longValue();
                C1QT c1qt = c61862rn.A04;
                if (c1qt.isOngoingFlow(longValue)) {
                    c1qt.flowMarkPoint(longValue, str);
                } else {
                    arrayList.add(Long.valueOf(longValue));
                }
            }
            if (!arrayList.isEmpty()) {
                hashMap.keySet().removeAll(arrayList);
            }
        }
    }

    public final void A04(AbstractC115105If abstractC115105If, C1I1 c1i1, int i) {
        String str;
        StringBuilder sb;
        C1EU c1eu = c1i1.A00;
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        C1ZX A01 = C1ZV.A00(this.A05).A01(C05F.A01, C05F.A08, false);
        A01.A03("logview_group_by", "NETWORK_FAILURE_REASON");
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        String A00 = AbstractC111324zv.A00(632);
        String str2 = "UNKNOWN";
        if (c40781ul == null) {
            str = "UNKNOWN";
            Throwable A012 = abstractC115105If.A01();
            if (A012 != null) {
                if (A012 instanceof C39527Hct) {
                    A06(c1i1, "Response returned after being cancelled");
                    return;
                }
                str = "CLIENT";
                c1qt.flowAnnotate(generateFlowId, A00, "CLIENT");
                A01.A05(A012);
                String canonicalName = A012.getClass().getCanonicalName();
                if (canonicalName != null) {
                    c1qt.flowAnnotate(generateFlowId, "FAILURE_NAME", canonicalName);
                }
                String message = A012.getMessage();
                if (message != null) {
                    c1qt.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", message);
                    A01.A03("NETWORK_FAILURE_REASON", message);
                    str2 = message;
                }
            }
        } else {
            str2 = "challenge_required";
            if (!C14360o3.A0K(c40781ul.getErrorMessage(), "challenge_required")) {
                if (c40781ul.hasErrorType("feedback_required")) {
                    sb = new StringBuilder();
                    sb.append("feedback_required: ");
                    sb.append(c40781ul.mFeedbackAction);
                } else {
                    sb = new StringBuilder();
                    sb.append("http_status_code: ");
                    sb.append(c40781ul.mStatusCode);
                }
                str2 = sb.toString();
            }
            str = "NETWORK";
            c1qt.flowAnnotate(generateFlowId, A00, "NETWORK");
            c1qt.flowAnnotate(generateFlowId, "FAILURE_NAME", c40781ul.mErrorTitle);
            c1qt.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", str2);
            A01.A03("NETWORK_FAILURE_REASON", str2);
        }
        if (i != -1) {
            c1qt.flowAnnotate(generateFlowId, "RESPONSE_CODE", i);
            A01.A01("RESPONSE_CODE", i);
        }
        String str3 = c1eu.A09;
        c1qt.flowAnnotate(generateFlowId, "REQUEST_ID", str3);
        if (c1eu.A04 != C1EN.A04) {
            A01.A03("REQUEST_ID", str3);
            A01.A00();
        }
        if (c1eu.A00() && (!this.A06.isEmpty())) {
            A02(c1eu);
        }
        c1qt.flowEndFail(generateFlowId, str, str2);
        C61852rm.A01(A09, generateFlowId);
    }

    public final synchronized void A05(C1I1 c1i1, Long l, String str, String str2, String str3, String str4) {
        C14360o3.A0B(c1i1, 0);
        C1EU c1eu = c1i1.A00;
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        if (!c1qt.isOngoingFlow(generateFlowId)) {
            A01(c1qt, c1eu, this, str2);
            this.A02 = Long.valueOf(generateFlowId);
        }
        if (str != null) {
            c1qt.flowAnnotate(generateFlowId, "SOURCE", str);
        }
        A00(c1qt, c1i1, this);
        c1qt.flowMarkPoint(generateFlowId, "FEED_RESPONSE_RECEIVED_CACHE");
        if (c1eu.A00()) {
            UserSession userSession = this.A05;
            if (C18U.A06(C06090Tz.A05, userSession, 36323775372930662L)) {
                this.A03 = AbstractC23021Ah.A00(userSession).A01.getString("last_feed_head_load_fetch_reason", null);
                if (l != null) {
                    this.A00 = Long.valueOf(l.longValue());
                }
            }
        }
        if (c1eu.A04 == C1EN.A06 && this.A08.get()) {
            A0C(c1eu, "network feed already rendered");
        }
        if (str2.equals("feed_pool_delegate")) {
            if (str3 != null) {
                c1qt.flowAnnotate(generateFlowId, "TLI_ITEM_TYPE", str3);
            }
            if (str4 != null) {
                c1qt.flowAnnotate(generateFlowId, "TLI_ITEM_INVENTORY_SOURCE", str4);
            }
        }
    }

    public final void A07(C1I1 c1i1, String str) {
        C1EU c1eu = c1i1.A00;
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        UserSession userSession = this.A05;
        if (C18U.A06(C06090Tz.A05, userSession, 36313252703766372L)) {
            C1ZX A01 = C1ZV.A00(userSession).A01(C05F.A01, C05F.A08, false);
            A01.A03("NETWORK_FAILURE_REASON", str);
            A01.A03("logview_group_by", "NETWORK_FAILURE_REASON");
            A01.A00();
        }
        c1qt.flowAnnotate(generateFlowId, AbstractC111324zv.A00(632), "CLIENT");
        c1qt.flowAnnotate(generateFlowId, "FAILURE_NAME", "CacheFailure");
        c1qt.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", str);
        c1qt.flowEndFail(generateFlowId, "CLIENT", str);
        C61852rm.A01(A09, generateFlowId);
    }

    public final synchronized void A08(C1I1 c1i1, String str, boolean z) {
        int i;
        String str2;
        C1EU c1eu = c1i1.A00;
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        A01(c1qt, c1eu, this, str);
        c1qt.flowMarkPoint(generateFlowId, "FEED_REQUEST_SENT");
        String str3 = (String) c1eu.A0D.get("pagination_source");
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1785238953:
                    if (str3.equals("favorites")) {
                        str2 = "FAVORITES";
                        c1qt.flowAnnotate(generateFlowId, "FEED_TYPE", str2);
                        break;
                    }
                    break;
                case -1643839516:
                    if (str3.equals("feed_recs")) {
                        str2 = "FEED_RECS";
                        c1qt.flowAnnotate(generateFlowId, "FEED_TYPE", str2);
                        break;
                    }
                    break;
                case -80681014:
                    if (str3.equals("developer")) {
                        str2 = "DEVELOPER";
                        c1qt.flowAnnotate(generateFlowId, "FEED_TYPE", str2);
                        break;
                    }
                    break;
                case 765915793:
                    if (str3.equals("following")) {
                        str2 = "FOLLOWING";
                        c1qt.flowAnnotate(generateFlowId, "FEED_TYPE", str2);
                        break;
                    }
                    break;
                case 1493462374:
                    if (str3.equals("past_posts")) {
                        str2 = "OLDER_FEED";
                        c1qt.flowAnnotate(generateFlowId, "FEED_TYPE", str2);
                        break;
                    }
                    break;
            }
        }
        c1qt.flowAnnotate(generateFlowId, "CALLING_SOURCE", str);
        if (str.equals("background_prefetcher")) {
            c1qt.flowAnnotate(generateFlowId, "IS_FROM_BACKGROUND_COLD_START", z);
        }
        if (AbstractC229319v.A00()) {
            C17590tu c17590tu = c1eu.A03;
            if (c17590tu != null) {
                i = c17590tu.A01.size();
            } else {
                i = 0;
            }
            c1qt.flowAnnotate(generateFlowId, "SEEN_STATE_ITEM_COUNT_FOR_E2E", i);
        }
        A00(c1qt, c1i1, this);
    }

    public final synchronized void A09(C1EU c1eu) {
        C14360o3.A0B(c1eu, 0);
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        if (c1qt.isOngoingFlow(generateFlowId)) {
            c1qt.flowMarkPoint(generateFlowId, "FEED_RESPONSE_RECEIVED");
        }
    }

    public final void A0C(C1EU c1eu, String str) {
        C14360o3.A0B(c1eu, 0);
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        if (c1qt.isOngoingFlow(generateFlowId)) {
            c1qt.flowMarkPoint(generateFlowId, "FEED_UPDATE_DROPPED");
            c1qt.flowAnnotate(generateFlowId, "CANCEL_REASON", str);
            c1qt.flowEndCancel(generateFlowId, str);
            C61852rm.A01(A09, generateFlowId);
        }
    }

    public static final void A00(C1QT c1qt, C1I1 c1i1, C61862rn c61862rn) {
        C1EU c1eu = c1i1.A00;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        c1qt.flowAnnotate(generateFlowId, "IS_FIRST_PAGE", c1eu.A02());
        C1EN c1en = c1eu.A04;
        c1qt.flowAnnotate(generateFlowId, "FETCH_REASON", c1en.toString());
        if (c1en != C1EN.A04) {
            c1qt.flowAnnotate(generateFlowId, "IS_STREAMING_REQUEST", c1i1 instanceof C24561Hz);
            c1qt.flowAnnotate(generateFlowId, "CURRENT_NAVIGATION_MODULE", C226218q.A01(AbstractC12960li.A00).A08);
        }
        UserSession userSession = c61862rn.A05;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36313252703504226L)) {
            c1qt.flowAnnotate(generateFlowId, "REQUEST_ID", c1eu.A09);
        }
        if (C18U.A06(c06090Tz, userSession, 36313252704028518L)) {
            for (Map.Entry entry : c1eu.A0D.entrySet()) {
                c1qt.flowAnnotate(generateFlowId, (String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private final void A02(C1EU c1eu) {
        C1CA c1ca;
        C77383dO c77383dO = C77383dO.A00;
        UserSession userSession = this.A05;
        if (C226218q.A01(AbstractC12960li.A00).A0W()) {
            c1ca = C1CA.A05;
        } else if (c1eu.A04 == C1EN.A06) {
            c1ca = C1CA.A03;
        } else {
            c1ca = C1CA.A06;
        }
        Integer num = C05F.A00;
        ArrayList arrayList = this.A06;
        c77383dO.A01(userSession, c1ca, num, this.A00, this.A03, arrayList);
    }

    public final void A06(C1I1 c1i1, String str) {
        C1EU c1eu = c1i1.A00;
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        c1qt.flowAnnotate(generateFlowId, "CANCEL_REASON", str);
        c1qt.flowEndCancel(generateFlowId, str);
        C61852rm.A01(A09, generateFlowId);
    }

    public final synchronized void A0A(C1EU c1eu, C74283Vj c74283Vj, EnumC73363Qm enumC73363Qm) {
        String name;
        C38321qM A02;
        String id;
        String BPW;
        Object obj;
        Object obj2;
        C38321qM A022;
        String id2;
        C38321qM A023;
        String id3;
        C14360o3.A0B(c1eu, 0);
        C14360o3.A0B(enumC73363Qm, 1);
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        if (c1qt.isOngoingFlow(generateFlowId)) {
            UserSession userSession = this.A05;
            c1qt.flowAnnotate(generateFlowId, "PARSED_ITEMS_BEFORE_DEDUPE_COUNT", c74283Vj.A00().size());
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (C3XG c3xg : c74283Vj.A00()) {
                InterfaceC38381qS interfaceC38381qS = c3xg.A05;
                if (C3XH.A02(interfaceC38381qS) != null) {
                    if (C3YR.A00(userSession, c3xg)) {
                        C38321qM A024 = C3XH.A02(interfaceC38381qS);
                        if (A024 != null) {
                            if (C3YV.A09(A024)) {
                                i3++;
                            } else if (C3YV.A08(A024)) {
                                i4++;
                            } else if (A024.CdW()) {
                                i5++;
                            } else if (C3YW.A04(c3xg)) {
                                i7++;
                                if (A024.A5M()) {
                                    i8++;
                                }
                                if (A024.A5l()) {
                                    i++;
                                }
                            } else {
                                i6++;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (c1eu.A02()) {
                Iterator it = c74283Vj.A00().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C3YW.A00((C3XG) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C3XG c3xg2 = (C3XG) obj;
                if (c3xg2 != null && (A023 = C3XH.A02(c3xg2.A05)) != null && (id3 = A023.getId()) != null) {
                    boolean A03 = C28071Xl.A00(userSession.deviceSession.A06(), userSession).A03(id3);
                    Map map = A0B;
                    Long valueOf = Long.valueOf(generateFlowId);
                    if (map.get(valueOf) == null) {
                        map.put(valueOf, Boolean.valueOf(A03));
                        c1qt.flowAnnotate(generateFlowId, "TOP_AD_SEEN", A03);
                    }
                }
                Iterator it2 = c74283Vj.A00().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (C3YW.A04((C3XG) obj2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C3XG c3xg3 = (C3XG) obj2;
                if (c3xg3 != null && (A022 = C3XH.A02(c3xg3.A05)) != null && (id2 = A022.getId()) != null) {
                    boolean A032 = C28071Xl.A00(userSession.deviceSession.A06(), userSession).A03(id2);
                    Map map2 = A0C;
                    Long valueOf2 = Long.valueOf(generateFlowId);
                    if (map2.get(valueOf2) == null) {
                        map2.put(valueOf2, Boolean.valueOf(A032));
                        c1qt.flowAnnotate(generateFlowId, "TOP_ORGANIC_SEEN", A032);
                    }
                }
            }
            int i9 = 0;
            for (C3XG c3xg4 : c74283Vj.A00()) {
                if (C3YW.A04(c3xg4) && (A02 = C3XH.A02(c3xg4.A05)) != null) {
                    if (A02.A5M() && (BPW = A02.A0C.BPW()) != null && BPW.length() != 0) {
                        id = A02.A0C.BPW();
                    } else {
                        id = A02.getId();
                    }
                    if (id != null && C28071Xl.A00(userSession.deviceSession.A06(), userSession).A03(id)) {
                        i9++;
                    }
                }
            }
            int ordinal = enumC73363Qm.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    name = null;
                } else {
                    name = enumC73363Qm.name();
                }
            } else {
                name = enumC73363Qm.name();
            }
            if (enumC73363Qm == EnumC73363Qm.A05) {
                c1qt.flowAnnotate(generateFlowId, "FILTERED_ITEMS_COUNT", i2);
                c1qt.flowAnnotate(generateFlowId, "NETWORK_ORGANIC_SEEN_ITEMS_COUNT", i9);
                c1qt.flowAnnotate(generateFlowId, "NETWORK_ORGANIC_LIKED_ITEMS_COUNT", i);
                c1qt.flowMarkPoint(generateFlowId, "FEED_RESPONSE_PARSED");
            } else {
                c1qt.flowMarkPoint(generateFlowId, "FEED_RESPONSE_PARSED_CACHE");
            }
            c1qt.flowAnnotate(generateFlowId, "PARSED_IN_FEED_REC_COUNT", i3);
            c1qt.flowAnnotate(generateFlowId, "PARSED_END_OF_FEED_REC_COUNT", i4);
            c1qt.flowAnnotate(generateFlowId, "PARSED_ADS_COUNT", i5);
            c1qt.flowAnnotate(generateFlowId, "PARSED_ORGANIC_ITEMS_COUNT", i7);
            c1qt.flowAnnotate(generateFlowId, "PARSED_ORGANIC_CAROUSEL_ITEMS_COUNT", i8);
            c1qt.flowAnnotate(generateFlowId, "PARSED_UNKNOWN_ITEMS_COUNT", i6);
            c1qt.flowAnnotate(generateFlowId, "LOGGER_VERSION", 1);
            int i10 = i5 + i7 + i3 + i4 + i6;
            c1qt.flowAnnotate(generateFlowId, "PARSED_ITEMS_COUNT", i10);
            if (name != null) {
                c1qt.flowAnnotate(generateFlowId, "SOURCE", name);
            }
            c1qt.flowAnnotate(generateFlowId, "RESPONSE_CODE", c74283Vj.mStatusCode);
            long currentTimeMillis = System.currentTimeMillis();
            c1qt.flowAnnotate(generateFlowId, "PARSE_LOCAL_TIME_MS", currentTimeMillis);
            c1qt.flowAnnotate(generateFlowId, "RESPONSE_AGE_MS", currentTimeMillis - c74283Vj.mResponseTimestamp);
            Boolean bool = c74283Vj.A0C;
            if (bool != null) {
                c1qt.flowAnnotate(generateFlowId, "TOP_ORGANIC_CHANGED_BY_RANK_AND_MERGE", bool.booleanValue());
            }
            if (c1eu.A04 == C1EN.A04) {
                c1qt.flowEndSuccess(generateFlowId);
                C61852rm.A01(A09, generateFlowId);
            }
            if (((C74293Vk) c74283Vj).A08 && i10 == 0) {
                c1qt.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", "0 feed items parsed");
                c1qt.flowAnnotate(generateFlowId, "REQUEST_ID", c1eu.A09);
                c1qt.flowEndFail(generateFlowId, "NO_ITEMS_DELIVERED", "0 feed items parsed");
                C61852rm.A01(A09, generateFlowId);
            }
        }
    }

    public final void A0B(C1EU c1eu, EnumC73363Qm enumC73363Qm, Boolean bool, C09530e4 c09530e4, int i, int i2, boolean z, boolean z2) {
        String str;
        String str2;
        C1QT c1qt = this.A04;
        long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
        if (c1qt.isOngoingFlow(generateFlowId)) {
            c1qt.flowAnnotate(generateFlowId, "INITIAL_FEED_ITEM_COUNT", i);
            c1qt.flowAnnotate(generateFlowId, "FINAL_FEED_ITEM_COUNT", i2);
            Long l = this.A02;
            String str3 = null;
            if (c1eu.A00()) {
                if (enumC73363Qm != null) {
                    this.A06.add(enumC73363Qm);
                }
                if (c1eu.A04 == C1EN.A06) {
                    if (enumC73363Qm == EnumC73363Qm.A05) {
                        this.A08.set(true);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (c1qt.isOngoingFlow(longValue)) {
                                c1qt.flowEndCancel(longValue, CancelReason.ACTION_ALREADY_COMPLETED);
                                C61852rm.A01(A09, longValue);
                                this.A02 = null;
                            }
                        }
                        A02(c1eu);
                    }
                } else {
                    A02(c1eu);
                }
            }
            if (z2 && i2 != 0) {
                c1qt.flowAnnotate(generateFlowId, "FIRST_ITEM_CHANGED", z);
                long currentTimeMillis = System.currentTimeMillis();
                Long l2 = this.A01;
                if (l2 != null) {
                    c1qt.flowAnnotate(generateFlowId, "TIME_SINCE_LAST_RENDER_MS", currentTimeMillis - l2.longValue());
                }
                this.A01 = Long.valueOf(currentTimeMillis);
            }
            c1qt.flowMarkPoint(generateFlowId, "FEED_RENDERED");
            if (enumC73363Qm != null) {
                if (enumC73363Qm != EnumC73363Qm.A05) {
                    str3 = enumC73363Qm.name();
                }
                c1qt.flowAnnotate(generateFlowId, "SOURCE", str3);
            }
            if (c09530e4 != null && bool != null) {
                boolean booleanValue = bool.booleanValue();
                Number number = (Number) c09530e4.A00;
                if (number != null) {
                    int intValue = number.intValue();
                    if (booleanValue) {
                        str2 = "IFR_ITEM_REMOVED_BY_IFR_GAP_RULE_DISTANCE";
                    } else {
                        str2 = "IFR_ITEM_VIOLATE_IFR_GAP_RULE_DISTANCE";
                    }
                    c1qt.flowAnnotate(generateFlowId, str2, intValue);
                }
                Number number2 = (Number) c09530e4.A01;
                if (number2 != null) {
                    int intValue2 = number2.intValue();
                    if (booleanValue) {
                        str = "IFR_ITEM_REMOVED_BY_HP_GAP_RULE_DISTANCE";
                    } else {
                        str = "IFR_ITEM_VIOLATE_HP_GAP_RULE_DISTANCE";
                    }
                    c1qt.flowAnnotate(generateFlowId, str, intValue2);
                }
            }
            c1qt.flowEndSuccess(generateFlowId);
            C61852rm.A01(A09, generateFlowId);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            HashMap hashMap = A0A;
            for (Object obj : hashMap.keySet()) {
                C14360o3.A07(obj);
                long longValue = ((Number) obj).longValue();
                C1QT c1qt = this.A04;
                c1qt.flowAnnotate(longValue, "CANCEL_REASON", "Session Ending");
                c1qt.flowEndCancel(longValue, "Session Ending");
            }
            hashMap.clear();
        }
    }
}
