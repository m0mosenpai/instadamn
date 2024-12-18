package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C111344zx {
    public MainFeedLocalDataSource A00;
    public List A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final C80553ik A05;
    public final C1CK A06;
    public final C1Y3 A07;
    public final List A08;
    public final List A09;
    public final AtomicBoolean A0A;
    public final boolean A0B;

    public static final synchronized void A02(InterfaceC1116050z interfaceC1116050z, C111344zx c111344zx) {
        synchronized (c111344zx) {
            if (c111344zx.A08.isEmpty() && c111344zx.A09.isEmpty()) {
                interfaceC1116050z.AVi("feed_timeline_background_prefetch");
            }
        }
    }

    public static final void A04(InterfaceC1116050z interfaceC1116050z, C111344zx c111344zx, boolean z) {
        if (!c111344zx.A0B) {
            ((FeedCacheCoordinator) c111344zx.A07).Emk(new C42715IvA(interfaceC1116050z, c111344zx, z), true);
        } else {
            if (c111344zx.A00 == null) {
                c111344zx.A00 = Nv3.A00(c111344zx.A04);
            }
            C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(739, 3));
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZO(interfaceC1116050z, c111344zx, null, 20, z), A02);
        }
    }

    public /* synthetic */ C111344zx(Context context, UserSession userSession) {
        C1CK c1ck = new C1CK(userSession);
        this.A03 = context;
        this.A04 = userSession;
        this.A06 = c1ck;
        this.A08 = Collections.synchronizedList(new ArrayList());
        this.A09 = Collections.synchronizedList(new ArrayList());
        int A00 = C1EW.A00(userSession);
        Context context2 = AbstractC12290kX.A00;
        C14360o3.A07(context2);
        this.A07 = new FeedCacheCoordinator(context2, userSession, C1EW.A03(userSession), A00, 50, 0L, Long.MAX_VALUE);
        this.A0A = new AtomicBoolean(false);
        this.A05 = AbstractC80543ij.A00(userSession);
        this.A0B = C20150ym.A07(AbstractC20100yh.A00(36321249932092671L));
        this.A02 = (int) C18U.A01(C06090Tz.A05, userSession, 36606324091786680L);
    }

    private final long A00() {
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        long j = 36609983403988990L;
        if (C18U.A01(c06090Tz, userSession, 36609983403988990L) < 0) {
            j = 36596763494582910L;
        }
        long A01 = C18U.A01(c06090Tz, userSession, j);
        C14360o3.A0A(Long.valueOf(A01));
        long A012 = C18U.A01(c06090Tz, userSession, 36596763496352383L);
        long A013 = C18U.A01(c06090Tz, userSession, 36596763496417920L);
        if (A012 != -1 && A013 != -1) {
            long j2 = C23051Ak.A02;
            A01 = (!C23061Al.A00(userSession).A00(EnumC23071Am.A0N) || (C18U.A06(c06090Tz, userSession, 36328774714998554L) && (!C18U.A06(c06090Tz, userSession, 36328774715195165L) || AbstractC40774I5c.A00(userSession, AbstractC23021Ah.A00(userSession))))) ? A013 : A012;
        }
        return TimeUnit.MINUTES.toMillis(A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r0 > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC1116050z r11, X.C74283Vj r12, X.C111344zx r13, java.util.List r14, long r15, boolean r17) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r12.A00()
            r6.addAll(r0)
            java.util.List r0 = r12.A00()
            java.util.Iterator r2 = r0.iterator()
        L14:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3XG r0 = (X.C3XG) r0
            boolean r0 = X.C3YW.A00(r0)
            if (r0 == 0) goto L14
        L28:
            X.3XG r1 = (X.C3XG) r1
            if (r1 == 0) goto L49
            X.1qS r0 = r1.A05
            X.1qM r0 = X.C3XH.A02(r0)
            if (r0 == 0) goto L49
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L49
            com.instagram.common.session.UserSession r1 = r13.A04
            X.0vz r0 = r1.deviceSession
            android.content.Context r0 = r0.A06()
            X.1Xn r0 = X.C28071Xl.A00(r0, r1)
            r0.A03(r2)
        L49:
            com.instagram.common.session.UserSession r5 = r13.A04
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36315288517938310(0x81049000070c86, double:3.029272916449263E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 != 0) goto L63
            r0 = 36328508427419218(0x81109600093e52, double:3.0376332404372917E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L81
        L63:
            r1 = -1
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 == 0) goto L81
            long r3 = r13.A00()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r15
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
        L74:
            if (r0 <= 0) goto Ld8
        L76:
            X.J5L r0 = new X.J5L
            r1 = r17
            r0.<init>(r11, r13, r1)
            X.C11T.A02(r0)
            return
        L81:
            r0 = 36328508427157071(0x81109600053e4f, double:3.037633240271509E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto Ld8
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r15
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            X.L9P r7 = new X.L9P
            r7.<init>(r0)
            r0 = 36328508427025998(0x81109600033e4e, double:3.037633240188618E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r0 = 36609983403661308(0x821096000217fc, double:3.215639148821545E-306)
            long r2 = X.C18U.A01(r4, r5, r0)
            r0 = 36609983403792381(0x821096000417fd, double:3.215639148904436E-306)
            long r0 = X.C18U.A01(r4, r5, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            long r3 = r5.toMillis(r2)
            long r1 = r5.toMillis(r0)
            java.lang.Boolean r0 = r7.A00()
            if (r0 == 0) goto Ld6
            java.lang.Boolean r0 = r7.A00()
            boolean r0 = X.C14360o3.A0K(r8, r0)
            if (r0 == 0) goto Ld6
        Ld3:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            goto L74
        Ld6:
            r3 = r1
            goto Ld3
        Ld8:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L76
            A03(r11, r13, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111344zx.A01(X.50z, X.3Vj, X.4zx, java.util.List, long, boolean):void");
    }

    public static final void A05(InterfaceC1116050z interfaceC1116050z, C111344zx c111344zx, boolean z) {
        long j = AbstractC23021Ah.A00(c111344zx.A04).A01.getLong("last_feed_background_prefetch_timestamp", 0L);
        if (System.currentTimeMillis() - j >= c111344zx.A00()) {
            C11T.A02(new J5L(interfaceC1116050z, c111344zx, z));
        }
    }

    private final void A06(InterfaceC1116050z interfaceC1116050z, ExtendedImageUrl extendedImageUrl, String str, List list) {
        C42223In9 c42223In9 = new C42223In9(interfaceC1116050z, this);
        this.A08.add(c42223In9);
        C1OG A0J = C25821No.A00().A0J(extendedImageUrl, "feed_timeline_background_prefetch");
        A0J.A0I = true;
        A0J.A09 = str;
        A0J.A0F = false;
        A0J.A02(c42223In9);
        list.add(A0J.A00());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r0 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C111344zx r6) {
        /*
            com.instagram.common.session.UserSession r3 = r6.A04
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315288517610629(0x81049000020c85, double:3.029272916242036E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L1a
            r0 = 36328508427484755(0x811096000a3e53, double:3.0376332404787375E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4b
        L1a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A0A
            boolean r0 = r5.get()
            if (r0 == 0) goto L4b
            java.util.List r0 = r6.A01
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            java.util.List r2 = r6.A01
            java.lang.String r1 = "mainFeedLocalDataSource"
            if (r2 == 0) goto L3f
            boolean r0 = r6.A0B
            if (r0 != 0) goto L54
            X.1Y3 r0 = r6.A07
            com.instagram.mainfeed.network.FeedCacheCoordinator r0 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r0
        L3c:
            r0.A8s(r2, r3)
        L3f:
            boolean r0 = r6.A0B
            if (r0 != 0) goto L4c
            X.1Y3 r0 = r6.A07
            r0.stop()
        L48:
            r5.set(r4)
        L4b:
            return
        L4c:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r6.A00
            if (r0 == 0) goto L58
            r0.A06()
            goto L48
        L54:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r6.A00
            if (r0 != 0) goto L3c
        L58:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111344zx.A07(X.4zx):void");
    }

    public static final void A03(InterfaceC1116050z interfaceC1116050z, C111344zx c111344zx, List list) {
        C38321qM A02;
        C38321qM A1e;
        ExtendedImageUrl A1q;
        C38321qM A1e2;
        if (list.isEmpty()) {
            interfaceC1116050z.AVi("feed_timeline_background_prefetch");
        }
        int i = 6;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c111344zx.A08.clear();
        List list2 = c111344zx.A09;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3XG c3xg = (C3XG) it.next();
            if (c3xg.A06 == C1XV.A0Y && (A02 = C3XH.A02(c3xg.A05)) != null && A02.A55()) {
                C80553ik c80553ik = c111344zx.A05;
                Context context = c111344zx.A03;
                if (!c80553ik.A00(context, A02)) {
                    try {
                        if (A02.Cff() || (A02.A5M() && (A1e2 = A02.A1e(A02.A0x())) != null && A1e2.Cff())) {
                            int i2 = i;
                            i--;
                            if (i2 > 0) {
                            }
                        }
                    } catch (Exception unused) {
                    }
                    A02.A3D(context);
                    ExtendedImageUrl A1q2 = A02.A1q(context);
                    if (A1q2 != null) {
                        c111344zx.A06(interfaceC1116050z, A1q2, A02.BU6(), arrayList);
                    }
                    if (A02.A5M()) {
                        int A0x = A02.A0x();
                        int min = Math.min(A02.A0p(), A0x + 2);
                        while (A0x < min) {
                            C38321qM A1e3 = A02.A1e(A0x);
                            if (A1e3 != null && (A1q = A1e3.A1q(context)) != null) {
                                c111344zx.A06(interfaceC1116050z, A1q, A1e3.BU6(), arrayList);
                            }
                            A0x++;
                        }
                    }
                    try {
                        if (A02.Cff() || (A02.A5M() && (A1e = A02.A1e(A02.A0x())) != null && A1e.Cff())) {
                            if (!A02.A5M() || (A02 = A02.A1e(A02.A0x())) != null) {
                                C4AD c4ad = new C4AD(A02.CFR(), "feed_timeline_background_prefetch");
                                C43058J1y c43058J1y = new C43058J1y(interfaceC1116050z, c111344zx);
                                c4ad.A01(c43058J1y, c111344zx.A02);
                                list2.add(c43058J1y);
                                arrayList2.add(c4ad);
                                A02.A2a();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            interfaceC1116050z.AVi("feed_timeline_background_prefetch");
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C25821No.A00().A0N((InterfaceC59502nt) it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C4AG.A00(c111344zx.A04).A01((C4AD) it3.next());
        }
    }
}
