package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28741aC {
    public static C0KV A0N;
    public static java.util.Set A0O = new HashSet();
    public C47420KxB A00;
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final C2DX A03;
    public final C2DU A04;
    public final C46892Dd A05;
    public final DirectThreadsParser A06;
    public final C2DY A07;
    public final C25671My A08;
    public final C46902De A09;
    public final C28711a9 A0A;
    public final C46912Df A0B;
    public final C46882Dc A0C;
    public volatile long A0D;
    public volatile java.util.Set A0E;
    public volatile boolean A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile List A0J;
    public volatile List A0K;
    public volatile boolean A0L;
    public volatile boolean A0M;

    public C28741aC(UserSession userSession, InterfaceC14020nS interfaceC14020nS, C28711a9 c28711a9, C2DU c2du) {
        C14360o3.A0B(c28711a9, 4);
        this.A04 = c2du;
        this.A01 = userSession;
        this.A08 = AbstractC25651Mw.A00(userSession);
        this.A02 = interfaceC14020nS;
        this.A0A = c28711a9;
        C2DX c2dx = new C2DX(userSession);
        this.A03 = c2dx;
        this.A07 = new C2DY();
        this.A06 = new DirectThreadsParser(userSession, c2dx);
        this.A0C = AbstractC46872Db.A00(C006802i.A0p, userSession);
        this.A0D = -1L;
        this.A0K = new ArrayList();
        this.A0J = new ArrayList();
        this.A0E = C16910sj.A00;
        this.A05 = new C46892Dd(userSession, c2dx);
        this.A09 = (C46902De) userSession.A01(C46902De.class, new C37017GSy(userSession, 44));
        this.A0B = new C46912Df(userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[LOOP:0: B:12:0x0083->B:14:0x0089, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A03(X.C4GV r7, X.C28741aC r8, java.io.ByteArrayOutputStream r9, int r10) {
        /*
            monitor-enter(r7)
            com.instagram.common.session.UserSession r1 = r7.A0H     // Catch: java.lang.Throwable -> La1
            X.3kb r0 = r7.A0I     // Catch: java.lang.Throwable -> La1
            X.3iy r0 = r0.A02     // Catch: java.lang.Throwable -> La1
            X.3iy r0 = r0.clone()     // Catch: java.lang.Throwable -> La1
            X.3kb r2 = new X.3kb     // Catch: java.lang.Throwable -> La1
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> La1
            java.util.ArrayList r6 = X.C4GV.A02(r2, r7, r10)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r7)
            com.instagram.common.session.UserSession r4 = r8.A01     // Catch: java.lang.NullPointerException -> L97
            X.2S3 r5 = X.C2S2.A00(r4)     // Catch: java.lang.NullPointerException -> L97
            java.lang.String r0 = r2.C7I()     // Catch: java.lang.NullPointerException -> L97
            if (r0 == 0) goto L41
            java.lang.String r3 = "thread_id=='"
            java.lang.String r1 = r2.C7I()     // Catch: java.lang.NullPointerException -> L97
            r0 = 39
            java.lang.String r1 = X.AnonymousClass001.A0S(r3, r1, r0)     // Catch: java.lang.NullPointerException -> L97
            java.lang.String r0 = r5.A04()     // Catch: java.lang.NullPointerException -> L97
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.NullPointerException -> L97
            java.lang.String r0 = X.C2SA.A00(r0)     // Catch: java.lang.NullPointerException -> L97
            int r0 = r5.A02(r9, r2, r0)     // Catch: java.lang.NullPointerException -> L97
            if (r0 <= 0) goto L41
            goto L77
        L41:
            java.lang.String r3 = "(recipient_ids=='"
            java.util.List r1 = r2.BSH()     // Catch: java.lang.NullPointerException -> L97
            boolean r0 = r1.isEmpty()     // Catch: java.lang.NullPointerException -> L97
            if (r0 == 0) goto L4f
            r1 = 0
            goto L5c
        L4f:
            java.util.ArrayList r1 = com.instagram.model.direct.DirectThreadKey.A00(r1)     // Catch: java.lang.NullPointerException -> L97
            java.util.Collections.sort(r1)     // Catch: java.lang.NullPointerException -> L97
            java.lang.String r0 = ","
            java.lang.String r1 = X.AbstractC13670mt.A05(r0, r1)     // Catch: java.lang.NullPointerException -> L97
        L5c:
            java.lang.String r0 = "' AND thread_id IS NULL)"
            java.lang.String r1 = X.AnonymousClass001.A0g(r3, r1, r0)     // Catch: java.lang.NullPointerException -> L97
            java.lang.String r0 = r5.A04()     // Catch: java.lang.NullPointerException -> L97
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.NullPointerException -> L97
            java.lang.String r0 = X.C2SA.A00(r0)     // Catch: java.lang.NullPointerException -> L97
            int r0 = r5.A02(r9, r2, r0)     // Catch: java.lang.NullPointerException -> L97
            if (r0 != 0) goto L77
            r5.A09(r9, r2)     // Catch: java.lang.NullPointerException -> L97
        L77:
            com.instagram.model.direct.DirectThreadKey r3 = r2.BKb()
            X.2SB r2 = X.C2SP.A00(r4)
            java.util.Iterator r1 = r6.iterator()
        L83:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r1.next()
            X.3nh r0 = (X.C83403nh) r0
            r0.A17(r3)
            r2.A09(r9, r0)
            goto L83
        L96:
            return r6
        L97:
            r2 = move-exception
            java.lang.String r1 = "DirectSQLiteDiskIO"
            java.lang.String r0 = "Could not serialize the thread"
            X.C0K8.A0J(r1, r0, r2)
            r0 = 0
            return r0
        La1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28741aC.A03(X.4GV, X.1aC, java.io.ByteArrayOutputStream, int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    private final void A09() {
        C43986JcZ c43986JcZ;
        C69613Av c69613Av;
        this.A0I = true;
        this.A0C.A03(C05F.A0C);
        this.A08.E4s(new Object());
        C2DU c2du = this.A04;
        for (EnumC46982Dm enumC46982Dm : EnumC46982Dm.values()) {
            if (enumC46982Dm.A01) {
                c2du.A0C.A0R(enumC46982Dm);
            }
        }
        C47420KxB c47420KxB = this.A00;
        if (c47420KxB != null && (c43986JcZ = c47420KxB.A00.A02) != null && (c69613Av = c43986JcZ.A00) != null) {
            c69613Av.A05();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    public static final void A0D(C28741aC c28741aC) {
        c28741aC.A0F = true;
        c28741aC.A0L = false;
        c28741aC.A0C.A03(C05F.A01);
        c28741aC.A08.E4s(new Object());
        C2DU c2du = c28741aC.A04;
        for (EnumC46982Dm enumC46982Dm : EnumC46982Dm.values()) {
            if (enumC46982Dm.A01) {
                c2du.A0C.A0R(enumC46982Dm);
            }
        }
    }

    public final void A0I(Map map, Map map2) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36328843434475338L);
        QuickPerformanceLogger quickPerformanceLogger = this.A07.A00;
        int A03 = AbstractC50712Us.A01.A03();
        if (A06) {
            FPZ fpz = new FPZ(quickPerformanceLogger, A03);
            QuickPerformanceLogger quickPerformanceLogger2 = fpz.A01;
            int i = fpz.A00;
            quickPerformanceLogger2.markerStart(20122304, i);
            boolean A0G = A0G(this, fpz, map, map2);
            C2FQ A00 = C2FO.A00(userSession);
            IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession);
            if (A0G) {
                quickPerformanceLogger2.markerEnd(20122304, i, (short) 167);
                A00.A01();
                if (A002 != null) {
                    A002.onOfflineMessageProcessed();
                    return;
                }
                return;
            }
            quickPerformanceLogger2.markerEnd(20122304, i, (short) 168);
            A00.A02();
            if (A002 == null) {
                return;
            }
            A002.onOfflineMessageProcessedFailed();
            return;
        }
        FPZ fpz2 = new FPZ(quickPerformanceLogger, A03);
        fpz2.A01.markerStart(20122304, fpz2.A00);
        this.A02.ATO(new C32667EZr(this, fpz2, map, map2, (int) C18U.A01(c06090Tz, userSession, 36607629764007557L)));
    }

    public static final SQLiteDatabase A00(C28741aC c28741aC) {
        C49682Qb A00 = C49682Qb.A06.A00();
        if (A00 != null) {
            return A00.A02(c28741aC.A0B);
        }
        return null;
    }

    private final Integer A01() {
        long A01 = C18U.A01(C06090Tz.A05, this.A01, 36603991925003268L);
        if (A01 <= 0) {
            return null;
        }
        int i = (int) A01;
        if (A01 == i) {
            return Integer.valueOf(i);
        }
        throw new ArithmeticException();
    }

    private final List A02() {
        C2DX c2dx = this.A03;
        c2dx.A02("thread_list_query_raw_start");
        UserSession userSession = this.A01;
        ArrayList A0H = C2S2.A00(userSession).A0H(ImmutableList.of(), C2E8.A00(userSession));
        c2dx.A02("thread_list_query_raw_end");
        c2dx.A02("thread_list_query_parser_start");
        List list = (List) C2ST.A00(AnonymousClass191.A00, new C9D4(A0H, this, (InterfaceC23621Ds) null, 3));
        c2dx.A02("thread_list_query_parser_end");
        return list;
    }

    public static final List A04(C28741aC c28741aC) {
        C2DX c2dx = c28741aC.A03;
        c2dx.A02("messages_query_raw_start");
        ArrayList A0H = C2SP.A00(c28741aC.A01).A0H();
        c2dx.A02("messages_query_raw_end");
        c2dx.A02("messages_query_parser_start");
        List list = (List) C2ST.A00(AnonymousClass191.A00, new C9D4(A0H, c28741aC, (InterfaceC23621Ds) null, 2));
        c2dx.A02("messages_query_parser_end");
        return list;
    }

    private final List A05(boolean z) {
        C2SB A00;
        ImmutableList of;
        ImmutableList copyOf;
        List list;
        if (z) {
            A00 = C2SP.A00(this.A01);
            list = this.A0J;
        } else if (A01() != null) {
            boolean z2 = this.A0G;
            A00 = C2SP.A00(this.A01);
            if (!z2) {
                list = this.A0K;
            } else {
                of = ImmutableList.of();
                C14360o3.A07(of);
                copyOf = ImmutableList.copyOf((Collection) this.A0K);
                C14360o3.A07(copyOf);
                return A00.A0I(of, copyOf);
            }
        } else {
            return C2SP.A00(this.A01).A0H();
        }
        of = ImmutableList.copyOf((Collection) list);
        C14360o3.A07(of);
        copyOf = ImmutableList.of();
        C14360o3.A07(copyOf);
        return A00.A0I(of, copyOf);
    }

    private final List A06(boolean z) {
        C2S3 A00;
        boolean A002;
        ImmutableList of;
        C09530e4 A0K;
        List list;
        if (z) {
            C2S3 A003 = C2S2.A00(this.A01);
            AbstractC09800fd.A01("DirectThreadSQLiteTable.getRawPendingThreadSummariesWithIds", -1426202680);
            try {
                A0K = A003.A08(null, C2SA.A00(A003.A04(), AnonymousClass001.A0R("is_permitted==", "0")));
                AbstractC09800fd.A00(-253822683);
                this.A0J = (List) A0K.A00;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-211354244);
                throw th;
            }
        } else {
            if (A01() != null) {
                boolean z2 = this.A0G;
                UserSession userSession = this.A01;
                if (!z2) {
                    boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330033140482697L);
                    C2S3 A004 = C2S2.A00(userSession);
                    boolean A005 = C2E8.A00(userSession);
                    Integer A01 = A01();
                    if (A06) {
                        A0K = A004.A0K(A01, AbstractC001800i.A0a(this.A0E), A005);
                        list = AbstractC001800i.A0S(this.A0E, (Collection) A0K.A00);
                    } else {
                        A0K = A004.A0K(A01, C16930sl.A00, A005);
                        list = (List) A0K.A00;
                    }
                    this.A0K = list;
                } else {
                    A00 = C2S2.A00(userSession);
                    A002 = C2E8.A00(userSession);
                    of = ImmutableList.copyOf((Collection) this.A0K);
                }
            } else {
                UserSession userSession2 = this.A01;
                A00 = C2S2.A00(userSession2);
                A002 = C2E8.A00(userSession2);
                of = ImmutableList.of();
            }
            return A00.A0H(of, A002);
        }
        return (List) A0K.A01;
    }

    private final void A08() {
        int i;
        if (!this.A0H) {
            C2DX c2dx = this.A03;
            c2dx.A02("set_user_session_start");
            C2DU c2du = this.A04;
            UserSession userSession = this.A01;
            C46952Dj A0H = C2R7.A00(userSession).A0H();
            ArrayList A00 = AbstractC46932Dh.A00(userSession);
            if (A0H.A03 != 5 || !AbstractC50102Ry.A00(A0H.A0B, A00)) {
                A0H = new C46952Dj(A00);
            }
            C46922Dg c46922Dg = c2du.A0C;
            ReentrantReadWriteLock reentrantReadWriteLock = c46922Dg.A0G;
            if (c46922Dg.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c46922Dg.A00 = A0H.A03();
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                synchronized (c46922Dg.A0D) {
                    c46922Dg.A00 = A0H.A03();
                }
            }
            if (C2E8.A02(c46922Dg.A09)) {
                c46922Dg.A0H();
            }
            c2dx.A02("set_user_session_end");
            C46952Dj A0H2 = C2R7.A00(userSession).A0H();
            ArrayList A002 = AbstractC46932Dh.A00(userSession);
            if (A0H2.A03 != 5 || !AbstractC50102Ry.A00(A0H2.A0B, A002)) {
                A0H2 = new C46952Dj(A002);
            }
            c2dx.A00.markerAnnotate(1060769796, "local_latest_sequence_id", A0H2.A04);
            this.A0H = true;
        }
    }

    public static final void A0A(C28741aC c28741aC) {
        UserSession userSession = c28741aC.A01;
        if (!C2E8.A00(userSession) && AbstractC1337462f.A04(userSession)) {
            C2S3 A00 = C2S2.A00(userSession);
            List A07 = A00.A07(C2SA.A00(A00.A04(), AnonymousClass001.A0R("is_permitted==", RealtimeSubscription.GRAPHQL_MQTT_VERSION)));
            C2S3 A002 = C2S2.A00(userSession);
            A002.A03(C2SA.A00(A002.A04(), AnonymousClass001.A0R("is_permitted==", RealtimeSubscription.GRAPHQL_MQTT_VERSION)));
            C2SP.A00(userSession).A0N(A07);
        } else {
            C2S3 A003 = C2S2.A00(userSession);
            A003.A03(A003.A04());
            C2SB A004 = C2SP.A00(userSession);
            A004.A03(A004.A04());
        }
        C2RA A005 = C2R7.A00(userSession);
        A005.A03(A005.A04());
    }

    public static final void A0B(C28741aC c28741aC) {
        if (!C49682Qb.A06.A03()) {
            A0A(c28741aC);
            UserSession userSession = c28741aC.A01;
            C2RB c2rb = (C2RB) userSession.A01(C4I0.class, new MHI(userSession, 41));
            c2rb.A03(c2rb.A04());
            C220189o4 A00 = AbstractC46999KqI.A00(userSession);
            A00.A03(A00.A04());
            C46912Df c46912Df = c28741aC.A0B;
            InterfaceC19610xo ARD = c46912Df.A01.ARD();
            ARD.E77(c46912Df.A02, false);
            ARD.apply();
        }
    }

    public static final void A0C(C28741aC c28741aC) {
        AbstractC09800fd.A01("RetrieveInboxFromDisk-handlePendingMutationsSync", -1496288183);
        C2DX c2dx = c28741aC.A03;
        c2dx.A02("mutations_query_start");
        UserSession userSession = c28741aC.A01;
        C2RB c2rb = (C2RB) userSession.A01(C4I0.class, new MHI(userSession, 41));
        if (Systrace.A0E(1L)) {
            C0fO.A01("DirectMutationSQLiteTable.getAllMutations", 194830876);
        }
        try {
            ArrayList A05 = c2rb.A05(c2rb.A04());
            if (Systrace.A0E(1L)) {
                C0fO.A00(1493483907);
            }
            c2dx.A02("mutations_query_end");
            c2dx.A03("mutation_count", A05.size());
            c2dx.A02("handle_mutations_start");
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                C1OW c1ow = (C1OW) it.next();
                C28711a9 c28711a9 = c28741aC.A0A;
                C14360o3.A0B(c1ow, 0);
                C26141Ov c26141Ov = (C26141Ov) c28711a9.A00.get();
                synchronized (c26141Ov) {
                    JTV jtv = new JTV(JTU.A00(c1ow));
                    String A02 = c1ow.A02();
                    long currentTimeMillis = System.currentTimeMillis() - c1ow.A01;
                    String str = jtv.A02;
                    C119885bm c119885bm = c26141Ov.A09;
                    if (c119885bm.A00.containsKey(A02) && currentTimeMillis < c119885bm.A00(A02).A00(str)) {
                        C26141Ov.A06(c26141Ov, c1ow, jtv, true);
                    } else {
                        Iterator it2 = c26141Ov.A0E.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC452826l) it2.next()).DCa(c1ow);
                        }
                    }
                }
            }
            c2dx.A02("handle_mutations_end");
            AbstractC09800fd.A00(-1644347170);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1811820960);
            }
            throw th;
        }
    }

    public static final void A0E(C28741aC c28741aC, HashMap hashMap, List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            C2DX c2dx = c28741aC.A03;
            c2dx.A02("iterate_messages_start");
            int size = list.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C83403nh c83403nh = (C83403nh) list.get(i);
                DirectThreadKey directThreadKey = c83403nh.A0y;
                if (directThreadKey != null) {
                    DirectThreadKey directThreadKey2 = null;
                    c83403nh.A17(null);
                    if (c83403nh.A1T()) {
                        z = true;
                    }
                    if (!C4GU.A01(c83403nh.A1F)) {
                        arrayList.add(c83403nh);
                    } else {
                        C18950wb.A00.AEp("Persisted pending message in DirectSQLiteDiskIO", 20134884).report();
                    }
                    if (i < size - 1) {
                        directThreadKey2 = ((C83403nh) list.get(i + 1)).A0y;
                    }
                    if (!directThreadKey.equals(directThreadKey2)) {
                        C81663kb c81663kb = (C81663kb) hashMap.get(directThreadKey);
                        if (c81663kb != null) {
                            UserSession userSession = c28741aC.A01;
                            C4GV c4gv = new C4GV(userSession, c81663kb, arrayList);
                            c4gv.A0V();
                            if (z) {
                                c4gv.A0X(!C6X6.A05(userSession));
                                z = false;
                            }
                            C2DU c2du = c28741aC.A04;
                            c2du.A0T(c4gv, c81663kb.BKb());
                            hashMap.remove(directThreadKey);
                            if ((!A0O.isEmpty()) && (C2E8.A07(userSession) || C2E8.A04(userSession))) {
                                Iterator it = AbstractC1121354g.A01(c81663kb, A0O, true).iterator();
                                while (it.hasNext()) {
                                    AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) it.next();
                                    C46922Dg c46922Dg = c2du.A0C;
                                    if (c46922Dg.A0E.get(abstractC46972Dl) != null) {
                                        C14360o3.A0B(abstractC46972Dl, 0);
                                        c46922Dg.A0P(abstractC46972Dl, true);
                                        A0O.remove(abstractC46972Dl);
                                    }
                                }
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
            c2dx.A02("iterate_messages_end");
        }
        C2DX c2dx2 = c28741aC.A03;
        c2dx2.A02("handle_leftover_threads_start");
        c28741aC.A0F(hashMap);
        c2dx2.A02("handle_leftover_threads_end");
    }

    public final void A0H() {
        SQLiteDatabase A00;
        if (!C49682Qb.A06.A03() && !this.A0M && (A00 = A00(this)) != null) {
            C09530e4 A07 = A07(A00, this, false, true);
            A0E(this, (HashMap) A07.A00, (List) A07.A01);
            this.A0M = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cd, code lost:
    
        if (r0.moveToFirst() == true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cf, code lost:
    
        r15 = r0.getBlob(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d3, code lost:
    
        if (r15 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d5, code lost:
    
        X.C18950wb.A00.AEp("Error reading data.", 20134884).report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e7, code lost:
    
        if (r0.moveToNext() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ea, code lost:
    
        r9 = r10.A0C(X.C07950bF.A04.A02(r10.A00, r15), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f6, code lost:
    
        if (r9 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020b, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0209, code lost:
    
        if (r0 == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0J(boolean r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28741aC.A0J(boolean, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0131 A[LOOP:0: B:13:0x012b->B:15:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0141  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A07(android.database.sqlite.SQLiteDatabase r14, X.C28741aC r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28741aC.A07(android.database.sqlite.SQLiteDatabase, X.1aC, boolean, boolean):X.0e4");
    }

    private final void A0F(HashMap hashMap) {
        for (C81663kb c81663kb : hashMap.values()) {
            this.A04.A0T(new C4GV(this.A01, c81663kb, null), c81663kb.BKb());
        }
    }

    public static final boolean A0G(C28741aC c28741aC, FPZ fpz, Map map, Map map2) {
        int i;
        AbstractC09800fd.A01("DirectSQLiteDiskIO.saveArmadilloExpressMessageToDiskSync", -176678452);
        try {
            fpz.A00("start_sync");
            C49692Qc c49692Qc = C49682Qb.A06;
            boolean z = false;
            if (c49692Qc.A03()) {
                fpz.A00("end_sync_failure_sql_lite");
                i = 522994867;
            } else {
                SystemClock.uptimeMillis();
                SQLiteDatabase A00 = A00(c28741aC);
                if (A00 == null) {
                    fpz.A00("end_sync_failure_open_db");
                    i = 835639090;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ArrayList<C83403nh> arrayList = new ArrayList();
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        AnonymousClass016.A16((List) ((Map.Entry) it.next()).getValue(), arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                    for (C83403nh c83403nh : arrayList) {
                        arrayList2.add(new C09530e4(c83403nh.A0h(), c83403nh.A0g()));
                    }
                    UserSession userSession = c28741aC.A01;
                    AbstractC47001KqK.A00(userSession).A04(arrayList2);
                    C2SB A002 = C2SP.A00(userSession);
                    C0fW.A01(A00, -1285341533);
                    try {
                        try {
                            try {
                                for (DirectThreadKey directThreadKey : AnonymousClass090.A00(map2.keySet(), map.keySet())) {
                                    List<C83403nh> list = (List) map.get(directThreadKey);
                                    if (list == null) {
                                        list = C16930sl.A00;
                                    }
                                    for (C83403nh c83403nh2 : list) {
                                        String A0g = c83403nh2.A0g();
                                        if (A0g != null) {
                                            A002.A0M(directThreadKey, null, A0g);
                                        }
                                        c83403nh2.A17(directThreadKey);
                                        A002.A09(byteArrayOutputStream, c83403nh2);
                                    }
                                    List list2 = (List) map2.get(directThreadKey);
                                    if (list2 == null) {
                                        list2 = C16930sl.A00;
                                    }
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        A002.A0M(directThreadKey, null, (String) it2.next());
                                    }
                                }
                                A00.setTransactionSuccessful();
                            } catch (Throwable th) {
                                C4GN.A00(A00);
                                throw th;
                            }
                        } catch (SQLiteException e) {
                            fpz.A00("failure_sql_lite");
                            c49692Qc.A02(e);
                            AbstractC47001KqK.A00(userSession).A01(e, arrayList2);
                        }
                    } catch (IllegalStateException e2) {
                        fpz.A00("failure_sql_lite");
                        c49692Qc.A02(e2);
                        AbstractC47001KqK.A00(userSession).A01(e2, arrayList2);
                    }
                    C4GN.A00(A00);
                    z = !c49692Qc.A03();
                    if (z) {
                        AbstractC47001KqK.A00(userSession).A03(arrayList2);
                        fpz.A00("end_sync_success");
                    } else {
                        fpz.A00("end_sync_failure");
                    }
                    SystemClock.uptimeMillis();
                    i = 372278675;
                }
            }
            AbstractC09800fd.A00(i);
            return z;
        } catch (Throwable th2) {
            AbstractC09800fd.A00(2062712284);
            throw th2;
        }
    }
}
