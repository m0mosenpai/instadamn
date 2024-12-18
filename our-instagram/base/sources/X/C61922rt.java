package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61922rt {
    public long A00;
    public long A01;
    public long A02;
    public C1I1 A03;
    public C1I1 A04;
    public C1I1 A05;
    public MainFeedLocalDataSource A06;
    public C77413dR A07;
    public C54420O3a A08;
    public C1Y7 A09;
    public C61842rl A0A;
    public String A0B;
    public String A0C;
    public java.util.Set A0D;
    public boolean A0E;
    public long A0F;
    public C71303Hr A0G;
    public final Context A0H;
    public final Handler A0I;
    public final AbstractC018607g A0J;
    public final UserSession A0K;
    public final InterfaceC17600tv A0L;
    public final C61912rs A0M;
    public final C61442r7 A0N;
    public final C61552rI A0O;
    public final C61962rx A0P;
    public final C61982rz A0Q;
    public final C61942rv A0R;
    public final C1X6 A0S;
    public final C61932ru A0T;
    public final C61562rJ A0U;
    public final C61992s0 A0V;
    public final C61742rb A0W;
    public final InterfaceC61432r6 A0X;
    public final C1M1 A0Y;
    public final Object A0Z;
    public final Map A0a;
    public final AtomicBoolean A0b;
    public final InterfaceC09390do A0c;
    public final boolean A0d;
    public final boolean A0e;
    public volatile Runnable A0f;
    public volatile boolean A0g;

    public final void A06(InterfaceC28041Xi interfaceC28041Xi, InterfaceC674632l interfaceC674632l, C4QH c4qh, List list, int i, boolean z) {
        C14360o3.A0B(interfaceC674632l, 0);
        if (!this.A0d) {
            C61982rz c61982rz = this.A0Q;
            c61982rz.A01.ATO(new C4QJ(interfaceC28041Xi, this.A0K, c61982rz, interfaceC674632l, c4qh, list, i, z));
            return;
        }
        synchronized (this.A0Z) {
            MainFeedLocalDataSource mainFeedLocalDataSource = this.A06;
            if (mainFeedLocalDataSource == null) {
                C14360o3.A0F("mainFeedLocalDataSource");
                throw C00O.createAndThrow();
            }
            C61982rz c61982rz2 = mainFeedLocalDataSource.A0A;
            c61982rz2.A01.ATO(new C4QJ(interfaceC28041Xi, mainFeedLocalDataSource.A09, c61982rz2, interfaceC674632l, c4qh, list, i, false));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        if (r12 >= java.util.concurrent.TimeUnit.SECONDS.toMillis(X.C18U.A01(r7, X.C3GD.A00(r4).A02, 36599069891890596L))) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c0, code lost:
    
        if (X.C3GE.A00(X.C18U.A04(r7, r4, 36880544873251156L)) != false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x007a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(final X.C74283Vj r21, final X.EnumC73363Qm r22, java.util.List r23, long r24) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61922rt.A07(X.3Vj, X.3Qm, java.util.List, long):void");
    }

    public final void A08(EnumC73363Qm enumC73363Qm, String str) {
        C1I1 c1i1;
        if (this.A0E) {
            C1I1 c1i12 = this.A03;
            if (c1i12 != null) {
                C61852rm.A00(this.A0K).A06(c1i12, "Prevent DeadLock on mLock");
                return;
            }
            return;
        }
        synchronized (this.A0Z) {
            C61842rl c61842rl = this.A0A;
            if (c61842rl != null) {
                UserSession userSession = this.A0K;
                if (C18U.A06(C06090Tz.A05, userSession, 36313252703700835L) && (c1i1 = this.A03) != null) {
                    C61852rm.A00(userSession).A07(c1i1, str);
                }
                C1I1 c1i13 = this.A03;
                if (c1i13 == null) {
                    c1i13 = A00(this);
                    this.A03 = c1i13;
                }
                c61842rl.A06(new C9BW(enumC73363Qm, C05F.A01), C7J2.A00(), c1i13, str, true);
            }
            this.A03 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x008c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A02, 36329242866237660L) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0092, code lost:
    
        r12 = r4.A02;
        r10 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009f, code lost:
    
        if (X.C18U.A06(r10, r12, 36329242866303197L) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00aa, code lost:
    
        if (X.C18U.A06(r10, r12, 36328057456049229L) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fe, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ae, code lost:
    
        r10 = r4.A02;
        r19 = X.C18U.A01(X.C06090Tz.A05, r10, 36596441371642356L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00bf, code lost:
    
        if ((r5 instanceof X.C62272sS) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c1, code lost:
    
        r0 = X.C1P2.A00(r10).A05(new X.C128245qt(r8), r4.A00, "main_feed", r19, true, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d6, code lost:
    
        if (r0 != r14) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        if (r6 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e8, code lost:
    
        r0 = X.C1I9.A00(r10).A05(new X.C62282sT(r8), r4.A00, "main_feed", r19, true, r22, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021c, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ac, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0090, code lost:
    
        if (r6 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.C61842rl r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61922rt.A09(X.2rl, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2sk, X.1I1] */
    public static final C62452sk A00(C61922rt c61922rt) {
        C1EN c1en = C1EN.A06;
        String sessionId = c61922rt.A0Y.getSessionId();
        C1ES A00 = C1ER.A00(c61922rt.A0K, c1en, null, null, false);
        C16920sk A0E = AbstractC06930Yk.A0E();
        C16920sk A0E2 = AbstractC06930Yk.A0E();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        return new C1I1(new C1EU(null, null, c1en, A00, null, sessionId, null, null, null, obj, null, A0E, A0E2, C1EU.A0G.incrementAndGet(), false, false));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.3Hr] */
    public static final C71303Hr A01(C61922rt c61922rt) {
        C71303Hr c71303Hr;
        synchronized (c61922rt.A0Z) {
            C71303Hr c71303Hr2 = c61922rt.A0G;
            c71303Hr = c71303Hr2;
            if (c71303Hr2 == null) {
                ?? obj = new Object();
                c61922rt.A0G = obj;
                c71303Hr = obj;
            }
        }
        return c71303Hr;
    }

    public static final void A03(C61922rt c61922rt) {
        String str = c61922rt.A0C;
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("pagination_source", str);
            String str2 = c61922rt.A0B;
            if (str2 != null) {
                c61922rt.A0B(C1EN.A0H, str2, hashMap);
            }
        }
        if (C18U.A06(C06090Tz.A05, c61922rt.A0K, 36317594919572886L)) {
            c61922rt.A0C = null;
            c61922rt.A0B = null;
        }
    }

    public static final boolean A04(C74283Vj c74283Vj, C61922rt c61922rt) {
        if (C18U.A06(C06090Tz.A05, c61922rt.A0K, 2342154105844007347L) && C3XH.A04(c74283Vj.A00()) && !c61922rt.A0b.getAndSet(true)) {
            return true;
        }
        return false;
    }

    public final Long A05() {
        Long l;
        synchronized (this.A0Z) {
            C77413dR c77413dR = this.A07;
            l = null;
            if (c77413dR != null) {
                long j = c77413dR.A01;
                Long valueOf = Long.valueOf(j);
                boolean z = false;
                if (j > 0) {
                    z = true;
                }
                if (z) {
                    l = valueOf;
                }
            }
        }
        return l;
    }

    public final void A0A(List list) {
        UserSession userSession = this.A0K;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342154105843155377L)) {
            C61982rz c61982rz = this.A0Q;
            c61982rz.A01(userSession, list);
            this.A0R.A00(c61982rz, new C4QH(Integer.MAX_VALUE, (int) C18U.A01(c06090Tz, userSession, 36592571606237809L)), (int) C18U.A01(c06090Tz, userSession, 36592571606106736L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0091, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r37.A0K, 36317594915247477L) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00b6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r37.A0K, 36317594915247477L) == false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0B(X.C1EN r38, java.lang.String r39, java.util.Map r40) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61922rt.A0B(X.1EN, java.lang.String, java.util.Map):boolean");
    }

    public /* synthetic */ C61922rt(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C61912rs c61912rs, C61602rN c61602rN, C61442r7 c61442r7, C61552rI c61552rI, C61562rJ c61562rJ, C61582rL c61582rL, C61742rb c61742rb, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1) {
        C1Y7 c1y7;
        Handler handler = new Handler(Looper.getMainLooper());
        C61932ru c61932ru = new C61932ru(userSession);
        C1X6 A00 = C1X5.A00(userSession);
        C17790uH A002 = AbstractC17610tw.A00(userSession);
        C61942rv c61942rv = new C61942rv(userSession, c1m1);
        C61962rx c61962rx = new C61962rx(abstractC018607g, userSession);
        C28091Xn A003 = C28071Xl.A00(context.getApplicationContext(), userSession);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C28061Xk(userSession));
        arrayList.add(new C28141Xs(A003));
        C61982rz c61982rz = new C61982rz(arrayList);
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        C61992s0 c61992s0 = new C61992s0(applicationContext, abstractC018607g, userSession, interfaceC60442pS, c61602rN, c61582rL, true);
        C14360o3.A0B(A00, 15);
        this.A0K = userSession;
        this.A0J = abstractC018607g;
        this.A0Y = c1m1;
        this.A0U = c61562rJ;
        this.A0X = interfaceC61432r6;
        this.A0N = c61442r7;
        this.A0O = c61552rI;
        this.A0W = c61742rb;
        this.A0I = handler;
        this.A0T = c61932ru;
        this.A0S = A00;
        this.A0L = A002;
        this.A0R = c61942rv;
        this.A0P = c61962rx;
        this.A0Q = c61982rz;
        this.A0V = c61992s0;
        this.A0M = c61912rs;
        Context applicationContext2 = context.getApplicationContext();
        C14360o3.A07(applicationContext2);
        this.A0H = applicationContext2;
        this.A0b = new AtomicBoolean(false);
        this.A0c = AbstractC09440dt.A01(new C9EA(this, 13));
        this.A0e = C18U.A06(C06090Tz.A05, userSession, 36320601392292550L);
        boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36321249932092671L));
        this.A0d = A07;
        this.A0Z = new Object();
        this.A0a = new LinkedHashMap();
        if (A07) {
            MainFeedLocalDataSource mainFeedLocalDataSource = this.A06;
            if (mainFeedLocalDataSource == null) {
                mainFeedLocalDataSource = Nv3.A00(userSession);
                mainFeedLocalDataSource.A03 = c1m1;
                mainFeedLocalDataSource.A02 = new C61942rv(mainFeedLocalDataSource.A09, c1m1);
                this.A06 = mainFeedLocalDataSource;
            }
            if (this.A08 == null) {
                this.A08 = new C54420O3a(this);
            }
            if (mainFeedLocalDataSource == null) {
                C14360o3.A0F("mainFeedLocalDataSource");
                throw C00O.createAndThrow();
            }
            c1y7 = mainFeedLocalDataSource.A0B;
        } else {
            c1y7 = ((FeedCacheCoordinator) ((C1Y3) A00.A06.getValue())).A08;
        }
        this.A09 = c1y7;
    }

    public static final void A02(C74283Vj c74283Vj, C61922rt c61922rt, Runnable runnable, String str, long j) {
        long A00;
        C38321qM A02;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - c61922rt.A02;
        UserSession userSession = c61922rt.A0K;
        long max = currentTimeMillis - Math.max(C1CH.A00(userSession).A00, c61922rt.A01);
        if (C0L6.A04 == null) {
            A00 = 0;
        } else {
            A00 = C0L6.A04.A01.A00();
        }
        if (C1CC.A09 == C1CA.A03) {
            A00 = C1CC.A02();
        }
        Boolean bool = null;
        Boolean bool2 = null;
        for (C3XG c3xg : c74283Vj.A00()) {
            if (bool == null && C3YW.A00(c3xg)) {
                if (C3XH.A02(c3xg.A05) != null) {
                    bool = Boolean.valueOf(!C28071Xl.A00(c61922rt.A0H, userSession).A03(r9.getId()));
                }
            } else if (bool2 == null && C3YW.A04(c3xg) && (A02 = C3XH.A02(c3xg.A05)) != null) {
                bool2 = Boolean.valueOf(!C28071Xl.A00(c61922rt.A0H, userSession).A03(A02.getId()));
            }
        }
        C61552rI c61552rI = c61922rt.A0O;
        Boolean bool3 = c74283Vj.A0C;
        C006802i c006802i = c61552rI.A07;
        c006802i.markerStart(974462634);
        c006802i.markerAnnotate(974462634, "CACHE_DELAY_TYPE", str);
        c006802i.markerAnnotate(974462634, "TIME_SINCE_SHIMMER", j2);
        c006802i.markerAnnotate(974462634, "TIME_SINCE_FEED_REQUEST", max);
        c006802i.markerAnnotate(974462634, "TIME_SINCE_START_UP", A00);
        if (bool != null) {
            c006802i.markerAnnotate(974462634, "TOP_AD_UNSEEN", bool.booleanValue());
        }
        if (bool2 != null) {
            c006802i.markerAnnotate(974462634, "TOP_ORGANIC_UNSEEN", bool2.booleanValue());
        }
        if (bool3 != null) {
            c006802i.markerAnnotate(974462634, "TOP_ORGANIC_CHANGED_BY_RANK_AND_MERGE", bool3.booleanValue());
        }
        if (j <= 0) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36317594917410185L);
            Handler handler = c61922rt.A0I;
            if (A06) {
                handler.postAtFrontOfQueue(runnable);
                return;
            } else {
                handler.post(runnable);
                return;
            }
        }
        c61922rt.A0I.postDelayed(runnable, j);
    }
}
