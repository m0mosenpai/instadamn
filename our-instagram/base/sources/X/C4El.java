package X;

import android.os.HandlerThread;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4El, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4El implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A00;
    public long A01;
    public long A02;
    public C1ON A03;
    public boolean A04;
    public final HandlerC25861Nt A05;
    public final C41761wQ A06;
    public final UserSession A07;
    public final Map A08;
    public final boolean A09;
    public final HandlerThread A0A;
    public final C13920nI A0B;
    public final C41981wo A0C;
    public final Runnable A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004d, code lost:
    
        if (X.C18U.A06(r2, r6, 36314021502912891L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4El(com.instagram.common.session.UserSession r6, X.C13920nI r7, X.C41981wo r8) {
        /*
            r5 = this;
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r0 = 3
            X.C14360o3.A0B(r7, r0)
            r5.<init>()
            r5.A07 = r6
            r5.A0C = r8
            r5.A0B = r7
            java.lang.Class r0 = r5.getClass()
            java.lang.String r1 = r0.getSimpleName()
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            X.AbstractC09770fa.A00(r0)
            r0.start()
            r5.A0A = r0
            android.os.Looper r1 = r0.getLooper()
            X.C14360o3.A07(r1)
            X.1Nt r0 = new X.1Nt
            r0.<init>(r1)
            r5.A05 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314021502191992(0x81036900010978, double:3.028471650589428E-306)
            boolean r4 = X.C18U.A06(r2, r6, r0)
            r5.A09 = r4
            if (r4 == 0) goto L4f
            r0 = 36314021502912891(0x810369000c097b, double:3.028471651045328E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r3 = 1
            if (r0 == 0) goto L50
        L4f:
            r3 = 0
        L50:
            r5.A0F = r3
            r0 = 36314021502781818(0x810369000a097a, double:3.0284716509624366E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r5.A0E = r0
            X.4Em r0 = new X.4Em
            r0.<init>()
            r5.A0D = r0
            r1 = 0
            X.1wQ r0 = new X.1wQ
            r0.<init>(r1)
            r5.A06 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.A08 = r0
            if (r4 == 0) goto L80
            r0 = 36595496479099031(0x82036900040897, double:3.206477559394198E-306)
            long r0 = X.C18U.A01(r2, r6, r0)
            r5.A01 = r0
        L80:
            if (r3 == 0) goto L98
            r0 = 180000(0x2bf20, double:8.8932E-319)
            r5.A02 = r0
            r0 = 36609532432357269(0x82102d00061795, double:3.215353952752955E-306)
            long r3 = X.C18U.A01(r2, r6, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L98
            r5.A02 = r3
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4El.<init>(com.instagram.common.session.UserSession, X.0nI, X.1wo):void");
    }

    public static final C1ON A00(UserSession userSession, String... strArr) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("direct_v2/fetch_and_subscribe_presence/");
        c25621Ms.A0A = "direct_v2/fetch_and_subscribe_presence/";
        c25621Ms.A08(C05F.A0Y);
        ((AbstractC23721Ec) c25621Ms).A01 = 900000L;
        c25621Ms.A0P(null, AnonymousClass932.class, AnonymousClass933.class, false);
        c25621Ms.A9s("request_data", StringFormatUtil.formatStrLocaleSafe("[%s]", AbstractC009903n.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", null, strArr)));
        c25621Ms.A0I("subscriptions_off", C18U.A06(C06090Tz.A05, userSession, 36313261293045609L));
        return c25621Ms.A0N();
    }

    private final synchronized void A01() {
        C1ON c1on = this.A03;
        if (c1on != null) {
            c1on.cancel();
            this.A03 = null;
        }
        this.A06.A01();
    }

    public static final synchronized void A02(C1ON c1on, final C4El c4El, final InterfaceC16820sZ interfaceC16820sZ, final boolean z, final boolean z2) {
        synchronized (c4El) {
            final UserSession userSession = c4El.A07;
            c1on.A00 = new AnonymousClass935(userSession) { // from class: X.934
                @Override // X.AnonymousClass935
                public final /* bridge */ /* synthetic */ void A06(UserSession userSession2, Object obj) {
                    Map A0E;
                    int A03 = C0f9.A03(1705568151);
                    AnonymousClass932 anonymousClass932 = (AnonymousClass932) obj;
                    int A032 = C0f9.A03(2007799883);
                    C14360o3.A0B(userSession2, 0);
                    C14360o3.A0B(anonymousClass932, 1);
                    HashMap hashMap = anonymousClass932.A00;
                    if (hashMap != null && !hashMap.isEmpty()) {
                        HashMap hashMap2 = anonymousClass932.A00;
                        if (hashMap2 != null) {
                            A0E = new LinkedHashMap(AbstractC16850sd.A0L(hashMap2.size()));
                            for (Map.Entry entry : hashMap2.entrySet()) {
                                Object key = entry.getKey();
                                C130725vK c130725vK = (C130725vK) entry.getValue();
                                String str = (String) entry.getKey();
                                C14360o3.A0B(c130725vK, 0);
                                C14360o3.A0B(str, 1);
                                long j = c130725vK.A01;
                                boolean z3 = c130725vK.A08;
                                A0E.put(key, new C42321xM(str, c130725vK.A02, c130725vK.A03, j, c130725vK.A00, z3, c130725vK.A09));
                            }
                        } else {
                            A0E = AbstractC06930Yk.A0E();
                        }
                        hashMap.size();
                        A0E.size();
                        C4El.A03(c4El, A0E, z, z2);
                    } else if (z2) {
                        Iterator it = anonymousClass932.A01.iterator();
                        while (it.hasNext()) {
                            ((C9Q0) userSession2.A01(C9Q0.class, new C209889Pz(userSession2))).A00.add(it.next());
                        }
                    }
                    C0f9.A0A(-1984785255, A032);
                    C0f9.A0A(726325626, A03);
                }

                @Override // X.AnonymousClass935
                public final void A01(UserSession userSession2) {
                    int A03 = C0f9.A03(702630684);
                    c4El.A03 = null;
                    C0f9.A0A(-994781322, A03);
                }

                @Override // X.AnonymousClass935
                public final void A04(AbstractC115105If abstractC115105If, UserSession userSession2) {
                    int A03 = C0f9.A03(1571717165);
                    C14360o3.A0B(abstractC115105If, 1);
                    Throwable A01 = abstractC115105If.A01();
                    C0K8.A0F("ApiFetchPresenceDataProvider", "failed to fetch presence", A01);
                    if (A01 instanceof C90173zy) {
                        C0w9.A06("ApiFetchPresenceDataProvider", AbstractC111324zv.A00(1564), A01);
                    }
                    InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
                    if (interfaceC16820sZ2 != null) {
                        interfaceC16820sZ2.invoke();
                    }
                    C0f9.A0A(1315619851, A03);
                }
            };
            C1GJ.A03(c1on);
            c4El.A03 = c1on;
        }
    }

    public static final synchronized void A04(C4El c4El, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ;
        boolean z2;
        C1ON A0N;
        boolean z3;
        synchronized (c4El) {
            if (c4El.A03 == null) {
                UserSession userSession = c4El.A07;
                if (AbstractC23021Ah.A00(userSession).A22()) {
                    if (C4MG.A00(userSession)) {
                        if (!c4El.A04) {
                            C14120nc.A00().ATO(new KM5(c4El, z));
                            c4El.A04 = true;
                        }
                    } else {
                        if (z) {
                            interfaceC16820sZ = null;
                            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                            c25621Ms.A09(C05F.A0N);
                            c25621Ms.A0B("direct_v2/get_presence_active_now/");
                            c25621Ms.A0A = "direct_v2/get_presence_active_now/";
                            c25621Ms.A08(C05F.A0Y);
                            ((AbstractC23721Ec) c25621Ms).A01 = 900000L;
                            z2 = false;
                            c25621Ms.A0P(null, AnonymousClass932.class, AnonymousClass933.class, false);
                            c25621Ms.A9s("suggested_followers_limit", String.valueOf(c4El.A01));
                            c25621Ms.A9s("recent_thread_limit", "0");
                            A0N = c25621Ms.A0N();
                            z3 = false;
                        } else {
                            interfaceC16820sZ = null;
                            C25621Ms c25621Ms2 = new C25621Ms(userSession, -2);
                            c25621Ms2.A09(C05F.A0N);
                            c25621Ms2.A0B("direct_v2/get_presence/");
                            c25621Ms2.A0A = "direct_v2/get_presence/";
                            c25621Ms2.A08(C05F.A0Y);
                            ((AbstractC23721Ec) c25621Ms2).A01 = 900000L;
                            z2 = false;
                            c25621Ms2.A0P(null, AnonymousClass932.class, AnonymousClass933.class, false);
                            if (c4El.A09) {
                                c25621Ms2.A9s("suggested_followers_limit", String.valueOf(c4El.A01));
                            }
                            A0N = c25621Ms2.A0N();
                            z3 = true;
                        }
                        A02(A0N, c4El, interfaceC16820sZ, z3, z2);
                    }
                    if (z || C18U.A06(C06090Tz.A05, userSession, 36328186304675124L)) {
                        c4El.A00 = System.currentTimeMillis();
                    }
                }
            }
        }
    }

    public static final void A03(C4El c4El, Map map, boolean z, boolean z2) {
        if (z) {
            C41981wo c41981wo = c4El.A0C;
            Lock lock = c41981wo.A05;
            lock.lock();
            try {
                c41981wo.A00 = map;
                c41981wo.A03.accept(new HashMap(map));
                lock.unlock();
                AbstractC130745vN.A00(c4El.A07).A02(map);
                return;
            } finally {
            }
        }
        if (z2) {
            AbstractC130745vN.A00(c4El.A07).A02(map);
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                c4El.A0C.A02((C42321xM) it.next());
            }
            return;
        }
        C41981wo c41981wo2 = c4El.A0C;
        c41981wo2.A05.lock();
        try {
            if (!c41981wo2.A01) {
                c41981wo2.A00.putAll(map);
                c41981wo2.A03.accept(new HashMap(c41981wo2.A00));
            }
        } finally {
        }
    }

    public final void A05() {
        if (this.A0F) {
            UserSession userSession = this.A07;
            if (AbstractC23021Ah.A00(userSession).A22() && this.A00 == 0 && !C4MG.A00(userSession)) {
                A01();
                HandlerC25861Nt handlerC25861Nt = this.A05;
                handlerC25861Nt.removeCallbacksAndMessages(null);
                handlerC25861Nt.A01(2032156175, this.A0D);
            }
        }
    }

    public final void A06(Integer num) {
        Integer num2;
        if (this.A0E) {
            num2 = C05F.A00;
        } else {
            num2 = C05F.A01;
        }
        if (num == num2 || num == C05F.A0C) {
            if (!C218914p.A08()) {
                onAppForegrounded();
            }
            C218914p.A03(EnumC220415e.A03, this);
            UserSession userSession = this.A07;
            if (AbstractC1570673l.A01(userSession)) {
                C1570773m A00 = AbstractC1570673l.A00(userSession);
                C10190gb A002 = C10190gb.A00();
                Object value = A00.A04.getValue();
                if (value != null) {
                    A002.A00.add(value);
                }
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1296165127);
        this.A05.removeCallbacksAndMessages(null);
        A01();
        C0f9.A0A(1545798174, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-309433543);
        A04(this, false);
        if (this.A0F && !C4MG.A00(this.A07)) {
            this.A05.A02(this.A0D, 2032156175, this.A02);
        }
        C0f9.A0A(1599335000, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        A01();
    }
}
