package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.66c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1345366c {
    public TimerTask A00;
    public final LruCache A01;
    public final UserSession A02;
    public final List A03;
    public final ConcurrentMap A04;
    public final ConcurrentMap A05;
    public final InterfaceC09390do A06;

    public C1345366c(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A05 = new ConcurrentHashMap();
        this.A04 = new ConcurrentHashMap();
        this.A03 = new ArrayList();
        this.A06 = AbstractC09440dt.A01(C66d.A00);
        this.A01 = new LruCache(20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.booleanValue() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.C83403nh r8, com.instagram.model.direct.DirectThreadKey r9, boolean r10) {
        /*
            r7 = this;
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            java.lang.String r2 = r8.A0g()
            boolean r4 = r8.A1S()
            java.lang.Boolean r0 = r8.A19
            if (r0 == 0) goto L17
            boolean r0 = r0.booleanValue()
            r5 = 1
            if (r0 != 0) goto L18
        L17:
            r5 = 0
        L18:
            java.lang.String r3 = r8.A1u
            r0 = r7
            r1 = r9
            r6 = r10
            boolean r0 = r0.A03(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345366c.A02(X.3nh, com.instagram.model.direct.DirectThreadKey, boolean):boolean");
    }

    public final boolean A03(DirectThreadKey directThreadKey, String str, String str2, boolean z, boolean z2, boolean z3) {
        ConcurrentMap concurrentMap;
        ConcurrentMap concurrentMap2;
        Map map;
        L43 l43;
        L4J l4j;
        if (!z2) {
            return false;
        }
        if (z3) {
            if (str != null) {
                UserSession userSession = this.A02;
                String str3 = null;
                if (C14360o3.A0K(str2, userSession.userId) && (l4j = (L4J) ((C48502Lct) userSession.A01(C48502Lct.class, C50222MGd.A00)).A00.get(str)) != null) {
                    str3 = l4j.A05;
                }
                String str4 = directThreadKey.A00;
                if (str4 != null) {
                    if (z) {
                        concurrentMap = this.A04;
                        concurrentMap2 = this.A05;
                    } else {
                        concurrentMap = this.A05;
                        concurrentMap2 = this.A04;
                    }
                    if (concurrentMap.get(str4) == null) {
                        concurrentMap.putIfAbsent(str4, new ConcurrentHashMap());
                    }
                    if (this.A01.get(str) == null && ((map = (Map) concurrentMap.get(str4)) == null || !map.containsKey(str))) {
                        L43 l432 = new L43(str4, str, str3, System.currentTimeMillis(), z, C14360o3.A0K(str2, userSession.userId));
                        Map map2 = (Map) concurrentMap2.get(str4);
                        if (map2 != null && (l43 = (L43) map2.get(str)) != null) {
                            long j = l432.A00 - l43.A00;
                            if (!z) {
                                j = -j;
                            }
                            String str5 = l432.A03;
                            String str6 = l432.A01;
                            boolean z4 = !l432.A05;
                            String str7 = l432.A02;
                            if (str7 == null) {
                                str7 = l43.A02;
                            }
                            A01(this, str5, str6, str7, j, true, true, z4);
                            List list = this.A03;
                            synchronized (list) {
                                int indexOf = list.indexOf(l43);
                                if (indexOf >= 0) {
                                    list.remove(indexOf);
                                    if (indexOf == 0) {
                                        A00(this);
                                    }
                                }
                            }
                            Map map3 = (Map) concurrentMap2.get(str4);
                            if (map3 != null) {
                                map3.remove(str);
                                return z;
                            }
                        } else {
                            List list2 = this.A03;
                            synchronized (list2) {
                                int A1L = AbstractC16960so.A1L(list2, new MM0(l432, 5), list2.size());
                                if (A1L < 0) {
                                    int i = (-A1L) - 1;
                                    list2.add(i, l432);
                                    if (i == 0) {
                                        A00(this);
                                    }
                                }
                            }
                            Map map4 = (Map) concurrentMap.get(str4);
                            if (map4 != null) {
                                map4.put(str, l432);
                                return z;
                            }
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return z;
    }

    public static final void A00(C1345366c c1345366c) {
        List list = c1345366c.A03;
        synchronized (list) {
            TimerTask timerTask = c1345366c.A00;
            if (timerTask != null) {
                timerTask.cancel();
            }
            c1345366c.A00 = null;
            if (!list.isEmpty()) {
                long currentTimeMillis = (((L43) list.get(0)).A00 + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) - System.currentTimeMillis();
                Timer timer = (Timer) c1345366c.A06.getValue();
                if (currentTimeMillis <= 0) {
                    currentTimeMillis = 0;
                }
                M9w m9w = new M9w(c1345366c);
                timer.schedule(m9w, currentTimeMillis);
                c1345366c.A00 = m9w;
            }
        }
    }

    public static final void A01(C1345366c c1345366c, String str, String str2, String str3, long j, boolean z, boolean z2, boolean z3) {
        long j2;
        UserSession userSession = c1345366c.A02;
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("armadillo_express"), userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "armadillo_express_dual_send");
        if (A00.isSampled()) {
            String str4 = "";
            A00.AAP("ig_user_id", userSession.userId);
            A00.A7v("is_sender_only_dual_send", false);
            if (str3 != null) {
                str4 = str3;
            }
            A00.AAP("ig_other_user_id", str4);
            A00.AAP("e2ee_send_error", "");
            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A00.AAP("open_send_error", "");
            A00.A9K("e2ee_latency_ms", Long.valueOf(j));
            A00.A7v("is_receive", Boolean.valueOf(z3));
            A00.A7v("is_e2ee_successful", Boolean.valueOf(z2));
            A00.A7v("is_open_successful", Boolean.valueOf(z));
            A00.AAP("client_context", str2);
            Long BTC = C08730cb.A00(userSession).A00().BTC();
            if (BTC != null) {
                j2 = BTC.longValue();
            } else {
                j2 = 0;
            }
            A00.A9K("pk", Long.valueOf(j2));
            A00.Cht();
        }
        c1345366c.A01.put(str2, 0);
    }
}
