package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46922Dg {
    public C46952Dj A00;
    public K8K A01;
    public String A02;
    public C81663kb A03;
    public final Context A04;
    public final C25671My A05;
    public final C42201xA A06;
    public final C42201xA A07;
    public final C42201xA A08;
    public final UserSession A09;
    public final C2DU A0A;
    public final C28741aC A0B;
    public final C46882Dc A0C;
    public final Object A0D;
    public final Map A0E;
    public final Map A0F;
    public final ReentrantReadWriteLock A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final boolean A0L;
    public final C42201xA A0M;
    public final Map A0N;
    public final ReentrantReadWriteLock A0O;

    public C46922Dg(Context context, C25671My c25671My, UserSession userSession, C2DU c2du, C28741aC c28741aC, Object obj) {
        Map hashMap;
        Map hashMap2;
        C14360o3.A0B(c25671My, 2);
        this.A09 = userSession;
        this.A05 = c25671My;
        this.A04 = context;
        this.A0B = c28741aC;
        this.A0A = c2du;
        this.A0D = obj;
        this.A0J = AbstractC09440dt.A01(new C9E1(this, 11));
        this.A0H = AbstractC09440dt.A01(new C9E1(this, 9));
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327752512650073L);
        this.A0L = A06;
        this.A0G = new ReentrantReadWriteLock();
        this.A0O = new ReentrantReadWriteLock();
        this.A00 = new C46952Dj(AbstractC46932Dh.A00(userSession));
        if (A06) {
            hashMap = new ConcurrentHashMap();
        } else {
            hashMap = new HashMap();
        }
        this.A0N = hashMap;
        HashMap hashMap3 = new HashMap();
        for (EnumC46982Dm enumC46982Dm : EnumC46982Dm.values()) {
            if (enumC46982Dm.A01) {
                hashMap3.put(enumC46982Dm, AbstractC42021ws.A00());
            }
        }
        this.A0F = hashMap3;
        this.A0K = AbstractC09440dt.A01(new C9E1(this, 12));
        this.A06 = AbstractC42021ws.A00();
        this.A0I = AbstractC09440dt.A01(new C9E1(this, 10));
        this.A0M = AbstractC42021ws.A00();
        this.A08 = AbstractC42021ws.A00();
        this.A07 = AbstractC42021ws.A01(new HashMap());
        if (this.A0L) {
            hashMap2 = new ConcurrentHashMap();
        } else {
            hashMap2 = new HashMap();
        }
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession2 = this.A09;
        if (C2E7.A01(c08730cb.A01(userSession2)) || C2E8.A04(userSession2)) {
            hashMap2.put(C47062Du.A00, false);
        }
        if (C2E8.A0A(userSession2, false)) {
            hashMap2.put(C47092Dx.A00, false);
        }
        this.A0E = hashMap2;
        this.A0C = AbstractC46872Db.A00(C006802i.A0p, userSession);
        this.A02 = "";
    }

    public final C42221xC A09(EnumC46982Dm enumC46982Dm) {
        C14360o3.A0B(enumC46982Dm, 0);
        if (enumC46982Dm.A01) {
            Object obj = this.A0F.get(enumC46982Dm);
            if (obj != null) {
                boolean z = false;
                if (((C42201xA) obj).A0W() == null) {
                    z = true;
                }
                C46882Dc c46882Dc = this.A0C;
                String name = enumC46982Dm.name();
                C14360o3.A0B(name, 0);
                final C9BQ A00 = C46882Dc.A00(c46882Dc, C05F.A00);
                QuickPerformanceLogger quickPerformanceLogger = c46882Dc.A00;
                int i = A00.A02;
                quickPerformanceLogger.markerAnnotate(78266157, i, "request_data_type", "THREAD_LIST");
                quickPerformanceLogger.markerAnnotate(78266157, i, "system_folder", name);
                String valueOf = String.valueOf(z);
                C14360o3.A0B(valueOf, 3);
                quickPerformanceLogger.markerAnnotate(78266157, i, "is_cache_warmup_finished", valueOf);
                if (z) {
                    A0R(enumC46982Dm);
                }
                Object obj2 = ((Map) this.A0K.getValue()).get(enumC46982Dm);
                if (obj2 != null) {
                    return ((C42221xC) obj2).A0K(new C6D2() { // from class: X.9HX
                        @Override // X.C6D2
                        public final /* bridge */ /* synthetic */ Object apply(Object obj3) {
                            List list = (List) obj3;
                            C46922Dg c46922Dg = this;
                            C28741aC c28741aC = c46922Dg.A0A.A0H;
                            if (c28741aC.A0F || c28741aC.A0I) {
                                C46882Dc c46882Dc2 = c46922Dg.A0C;
                                C9BQ c9bq = A00;
                                c46882Dc2.A00.markerAnnotate(78266157, c9bq.A02, "response_data_size", list.size());
                                c46882Dc2.A02(c9bq, (short) 2);
                            }
                            return list;
                        }
                    });
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final C50092Rx A0A(String str) {
        C50092Rx A02;
        C14360o3.A0B(str, 0);
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                return this.A00.A02(str);
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A0D) {
            A02 = this.A00.A02(str);
        }
        return A02;
    }

    public final String A0C(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        String A05;
        C14360o3.A0B(abstractC46972Dl, 0);
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getInboxOldestCursor");
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
            if (this.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    A05 = this.A00.A05(abstractC46972Dl, C99P.A00(this.A09, abstractC46972Dl, c4i3));
                    readLock.unlock();
                    A00.close();
                    return A05;
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
            synchronized (this.A0D) {
                try {
                    A05 = this.A00.A05(abstractC46972Dl, C99P.A00(this.A09, abstractC46972Dl, c4i3));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            A00.close();
            return A05;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C20I.A00(A00, th3);
                throw th4;
            }
        }
    }

    public final List A0G(AbstractC46972Dl abstractC46972Dl, C2EB c2eb, C4I3 c4i3) {
        C14360o3.A0B(abstractC46972Dl, 0);
        C14360o3.A0B(c4i3, 1);
        C14360o3.A0B(c2eb, 2);
        C2DU c2du = this.A0A;
        List singletonList = Collections.singletonList(abstractC46972Dl);
        C14360o3.A07(singletonList);
        List unmodifiableList = Collections.unmodifiableList(c2du.A0Q(c2eb, c4i3, c2eb.A01, singletonList));
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0251, code lost:
    
        if (X.C2E8.A00(r10) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (X.C14360o3.A0K(X.C99P.A00(r30.A09, r31, r34), "all") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02fc, code lost:
    
        if (X.C2E8.A00(r8) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r31.equals(X.C132705yt.A00) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r12.A00 != true) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.AbstractC46972Dl r31, X.C99Z r32, X.C2EB r33, X.C4I3 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46922Dg.A0O(X.2Dl, X.99Z, X.2EB, X.4I3, boolean):void");
    }

    public final void A0P(AbstractC46972Dl abstractC46972Dl, boolean z) {
        C14360o3.A0B(abstractC46972Dl, 0);
        if (this.A0L) {
            this.A0E.put(abstractC46972Dl, Boolean.valueOf(z));
            return;
        }
        synchronized (this.A0D) {
            this.A0E.put(abstractC46972Dl, Boolean.valueOf(z));
        }
    }

    public final void A0R(final EnumC46982Dm enumC46982Dm) {
        Object remove;
        C14360o3.A0B(enumC46982Dm, 0);
        if (!enumC46982Dm.A01) {
            A0R(EnumC46982Dm.A05);
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.4HB
            @Override // java.lang.Runnable
            public final void run() {
                EnumC46982Dm enumC46982Dm2;
                List A1Q;
                C46922Dg c46922Dg = this;
                UserSession userSession = c46922Dg.A09;
                if ((C2E9.A0E(userSession) || C2E8.A00(userSession)) && (enumC46982Dm2 = enumC46982Dm) == EnumC46982Dm.A05) {
                    A1Q = AbstractC16960so.A1Q(enumC46982Dm2, EnumC46982Dm.A06);
                } else {
                    enumC46982Dm2 = enumC46982Dm;
                    A1Q = Collections.singletonList(enumC46982Dm2);
                    C14360o3.A07(A1Q);
                }
                ArrayList A0R = c46922Dg.A0A.A0R(A1Q);
                if (enumC46982Dm2.A01) {
                    Object obj = c46922Dg.A0F.get(enumC46982Dm2);
                    if (obj != null) {
                        ((AbstractC42211xB) obj).accept(A0R);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Check failed.");
            }
        };
        if (this.A0L) {
            Map map = this.A0N;
            remove = map.remove(enumC46982Dm);
            map.put(enumC46982Dm, runnable);
        } else {
            synchronized (this.A0D) {
                Map map2 = this.A0N;
                remove = map2.remove(enumC46982Dm);
                map2.put(enumC46982Dm, runnable);
            }
        }
        if (remove != null) {
            ((Handler) this.A0J.getValue()).removeCallbacks((Runnable) remove);
        }
        ((Handler) this.A0J.getValue()).post(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[DONT_GENERATE, LOOP:1: B:26:0x0060->B:27:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[FINALLY_INSNS, LOOP:2: B:36:0x006d->B:37:0x006f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(X.C99Z r12) {
        /*
            r11 = this;
            r7 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r11.A0O
            boolean r0 = r11.A0L
            r5 = 1
            r6 = 0
            r9 = 0
            if (r0 == 0) goto L79
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L21
            int r8 = r1.getReadHoldCount()
            r0 = 0
        L19:
            if (r0 >= r8) goto L22
            r10.unlock()
            int r0 = r0 + 1
            goto L19
        L21:
            r8 = 0
        L22:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r1.writeLock()
            r4.lock()
            X.MYx r0 = r12.A04     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L4b
            java.lang.String r3 = r0.A01     // Catch: java.lang.Throwable -> L6c
        L2f:
            X.3kb r2 = r11.A03     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L55
            X.2DU r0 = r11.A0A     // Catch: java.lang.Throwable -> L6c
            X.3kb r1 = r0.A0N(r3)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L4d
            boolean r0 = r2.equals(r1)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L4d
            r2.A0K(r7)     // Catch: java.lang.Throwable -> L6c
            r11.A03 = r6     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = ""
            r11.A02 = r0     // Catch: java.lang.Throwable -> L6c
            goto L4d
        L4b:
            r3 = r6
            goto L2f
        L4d:
            if (r1 == 0) goto L60
            r1.A0K(r5)     // Catch: java.lang.Throwable -> L6c
            r11.A03 = r1     // Catch: java.lang.Throwable -> L6c
            goto L5e
        L55:
            if (r2 == 0) goto L60
            r2.A0K(r7)     // Catch: java.lang.Throwable -> L6c
            r11.A03 = r6     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = ""
        L5e:
            r11.A02 = r3     // Catch: java.lang.Throwable -> L6c
        L60:
            if (r9 >= r8) goto L68
            r10.lock()
            int r9 = r9 + 1
            goto L60
        L68:
            r4.unlock()
            return
        L6c:
            r0 = move-exception
        L6d:
            if (r9 >= r8) goto L75
            r10.lock()
            int r9 = r9 + 1
            goto L6d
        L75:
            r4.unlock()
            throw r0
        L79:
            java.lang.Object r4 = r11.A0D
            monitor-enter(r4)
            X.MYx r0 = r12.A04     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L9e
            java.lang.String r3 = r0.A01     // Catch: java.lang.Throwable -> Lb5
        L82:
            X.3kb r2 = r11.A03     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto La8
            X.2DU r0 = r11.A0A     // Catch: java.lang.Throwable -> Lb5
            X.3kb r1 = r0.A0N(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto La0
            boolean r0 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto La0
            r2.A0K(r7)     // Catch: java.lang.Throwable -> Lb5
            r11.A03 = r6     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = ""
            r11.A02 = r0     // Catch: java.lang.Throwable -> Lb5
            goto La0
        L9e:
            r3 = r6
            goto L82
        La0:
            if (r1 == 0) goto Lb3
            r1.A0K(r5)     // Catch: java.lang.Throwable -> Lb5
            r11.A03 = r1     // Catch: java.lang.Throwable -> Lb5
            goto Lb1
        La8:
            if (r2 == 0) goto Lb3
            r2.A0K(r7)     // Catch: java.lang.Throwable -> Lb5
            r11.A03 = r6     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = ""
        Lb1:
            r11.A02 = r3     // Catch: java.lang.Throwable -> Lb5
        Lb3:
            monitor-exit(r4)
            return
        Lb5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46922Dg.A0S(X.99Z):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.HashSet, java.util.AbstractCollection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Set] */
    public final void A0U(java.util.Set set, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (!set.isEmpty()) {
            ?? hashSet = new HashSet();
            C2DU c2du = this.A0A;
            List singletonList = Collections.singletonList(C4I1.A00);
            C14360o3.A07(singletonList);
            ArrayList A0Q = c2du.A0Q(C2EB.A04, C4I3.A03, null, singletonList);
            if (z) {
                hashSet = AbstractC001800i.A0j(set);
            } else if (z2) {
                Iterator it = A0Q.iterator();
                while (it.hasNext()) {
                    hashSet.addAll(AbstractC1121354g.A01((C81663kb) it.next(), set, false));
                    if (hashSet.size() >= set.size()) {
                        break;
                    }
                }
            }
            if (this.A0L) {
                Iterator it2 = set.iterator();
                z3 = false;
                z4 = false;
                while (it2.hasNext()) {
                    AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) it2.next();
                    Boolean bool = (Boolean) this.A0E.get(abstractC46972Dl);
                    boolean contains = hashSet.contains(abstractC46972Dl);
                    if (bool != null && !bool.equals(Boolean.valueOf(contains))) {
                        A0P(abstractC46972Dl, contains);
                        if (z3 || (bool.booleanValue() && !contains)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = true;
                    }
                }
            } else {
                synchronized (this.A0D) {
                    Iterator it3 = set.iterator();
                    z3 = false;
                    z4 = false;
                    while (it3.hasNext()) {
                        AbstractC46972Dl abstractC46972Dl2 = (AbstractC46972Dl) it3.next();
                        Boolean bool2 = (Boolean) this.A0E.get(abstractC46972Dl2);
                        boolean contains2 = hashSet.contains(abstractC46972Dl2);
                        if (bool2 != null && !bool2.equals(Boolean.valueOf(contains2))) {
                            A0P(abstractC46972Dl2, contains2);
                            if (z3 || (bool2.booleanValue() && !contains2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = true;
                        }
                    }
                }
            }
            if (z4) {
                AbstractC25651Mw.A00(this.A09).E4s(new C48022Ip(null, z3, true, false));
            }
        }
    }

    public final boolean A0V(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        boolean A09;
        C14360o3.A0B(abstractC46972Dl, 0);
        C14360o3.A0B(c4i3, 1);
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.isInboxHasOlder");
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
            if (this.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    A09 = this.A00.A09(abstractC46972Dl, C99P.A00(this.A09, abstractC46972Dl, c4i3));
                    readLock.unlock();
                    A00.close();
                    return A09;
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
            synchronized (this.A0D) {
                try {
                    A09 = this.A00.A09(abstractC46972Dl, C99P.A00(this.A09, abstractC46972Dl, c4i3));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            A00.close();
            return A09;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C20I.A00(A00, th3);
                throw th4;
            }
        }
    }

    private final ArrayList A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50092Rx c50092Rx = (C50092Rx) it.next();
            if (AbstractC43796JYj.A02(c50092Rx)) {
                arrayList.add(c50092Rx);
            } else {
                String A04 = AbstractC12880la.A04(this.A04);
                C14360o3.A0B(c50092Rx, 1);
                C0f5 AEp = C18950wb.A00.AEp("FolderError", 20134884);
                AEp.ABW(DialogModule.KEY_MESSAGE, "CRITICAL: Folder(s) dropped during validation");
                AEp.ABW("trigger", "SNAPSHOT_OR_DELTA");
                AEp.ABW(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, A04);
                AEp.ABW("dropped_folder", c50092Rx.A06);
                AEp.report();
            }
        }
        return arrayList;
    }

    private final void A01(int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i3 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.A00.A01 = i;
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            this.A00.A01 = i;
        }
    }

    private final void A02(long j) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
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
                this.A00.A06 = j;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            this.A00.A06 = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r10 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(X.AbstractC46972Dl r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            X.1xA r4 = r6.A07
            java.lang.Object r3 = r4.A0W()
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto Lf
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        Lf:
            X.5m3 r2 = X.C125575m3.A00
            boolean r0 = r7.equals(r2)
            r5 = 0
            if (r0 == 0) goto L20
            com.instagram.common.session.UserSession r0 = r6.A09
            boolean r0 = X.AbstractC1337462f.A0B(r0, r5)
            if (r0 != 0) goto L2a
        L20:
            X.5m4 r0 = X.C125585m4.A00
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L2a
            if (r10 == 0) goto L50
        L2a:
            if (r9 <= 0) goto L4e
            if (r10 == 0) goto L63
            X.98y r1 = X.C2057398y.A00
        L30:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r3.getOrDefault(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r10 == 0) goto L42
            X.98y r7 = X.C2057398y.A00
        L42:
            int r0 = r0 - r9
            int r0 = java.lang.Math.max(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r7, r0)
        L4e:
            if (r10 != 0) goto L5f
        L50:
            com.instagram.common.session.UserSession r0 = r6.A09
            boolean r0 = X.AbstractC1337462f.A0B(r0, r5)
            if (r0 != 0) goto L5f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.put(r2, r0)
        L5f:
            r4.accept(r3)
            return
        L63:
            r1 = r7
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46922Dg.A03(X.2Dl, int, int, boolean):void");
    }

    private final void A04(String str) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
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
                this.A00.A09 = str;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            this.A00.A09 = str;
        }
    }

    public final int A05() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                return this.A00.A00;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A0D) {
            i = this.A00.A00;
        }
        return i;
    }

    public final int A06() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                return this.A00.A01;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A0D) {
            i = this.A00.A01;
        }
        return i;
    }

    public final int A07() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                return this.A00.A02;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A0D) {
            i = this.A00.A02;
        }
        return i;
    }

    public final long A08() {
        long j;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                return this.A00.A04;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A0D) {
            j = this.A00.A04;
        }
        return j;
    }

    public final C2E4 A0B(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        C2E4 A04;
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.getInboxPreviousCursor");
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
            if (this.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    A04 = this.A00.A04(abstractC46972Dl, C99P.A00(this.A09, abstractC46972Dl, c4i3));
                    readLock.unlock();
                    A00.close();
                    return A04;
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
            synchronized (this.A0D) {
                try {
                    A04 = this.A00.A04(abstractC46972Dl, C99P.A00(this.A09, abstractC46972Dl, c4i3));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            A00.close();
            return A04;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C20I.A00(A00, th3);
                throw th4;
            }
        }
    }

    public final HashSet A0D(AbstractC46972Dl abstractC46972Dl) {
        List A0G = A0G(abstractC46972Dl, C2EB.A04, C4I3.A03);
        HashSet hashSet = new HashSet();
        Iterator it = A0G.iterator();
        while (it.hasNext()) {
            String C7I = ((C2ED) it.next()).C7I();
            if (C7I != null) {
                hashSet.add(C7I);
            }
        }
        return hashSet;
    }

    public final List A0E() {
        ArrayList arrayList;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                List A06 = this.A00.A06();
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A06, 10));
                Iterator it = A06.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C50092Rx) it.next()).A00());
                }
                return arrayList2;
            } finally {
                readLock.unlock();
            }
        }
        synchronized (this.A0D) {
            List A062 = this.A00.A06();
            arrayList = new ArrayList(AbstractC06950Ym.A1E(A062, 10));
            Iterator it2 = A062.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C50092Rx) it2.next()).A00());
            }
        }
        return arrayList;
    }

    public final List A0F(AbstractC46972Dl abstractC46972Dl) {
        return A0G(abstractC46972Dl, C2EB.A04, C4I3.A03);
    }

    public final void A0H() {
        ArrayList arrayList;
        C13080lu A00 = AbstractC13090lv.A00("DirectThreadStoreImpl.notifyFolderChange");
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
            if (this.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    arrayList = new ArrayList(this.A00.A06());
                    readLock.unlock();
                    final GWM gwm = GWM.A00;
                    C01T.A1D(arrayList, new Comparator(gwm) { // from class: X.B0S
                        public final /* synthetic */ InterfaceC16620sF A00;

                        {
                            C14360o3.A0B(gwm, 1);
                            this.A00 = gwm;
                        }

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                            return AbstractC166987dD.A0H(this.A00.invoke(obj, obj2));
                        }
                    });
                    this.A06.accept(arrayList);
                    A00.close();
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
            synchronized (this.A0D) {
                try {
                    arrayList = new ArrayList(this.A00.A06());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final InterfaceC16620sF gwm2 = GWM.A00;
            C01T.A1D(arrayList, new Comparator(gwm2) { // from class: X.B0S
                public final /* synthetic */ InterfaceC16620sF A00;

                {
                    C14360o3.A0B(gwm2, 1);
                    this.A00 = gwm2;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return AbstractC166987dD.A0H(this.A00.invoke(obj, obj2));
                }
            });
            this.A06.accept(arrayList);
            A00.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C20I.A00(A00, th3);
                throw th4;
            }
        }
    }

    public final void A0I(int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        int i3 = 0;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                A0K(Math.max(0, this.A00.A00 - i));
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            A0K(Math.max(0, this.A00.A00 - i));
        }
    }

    public final void A0J(int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        int i3 = 0;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                A01(Math.max(0, this.A00.A01 - i));
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            A01(Math.max(0, this.A00.A01 - i));
        }
    }

    public final void A0K(int i) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i3 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.A00.A00 = i;
                this.A0M.accept(Integer.valueOf(i));
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            this.A00.A00 = i;
            this.A0M.accept(Integer.valueOf(i));
        }
    }

    public final void A0L(long j) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
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
                this.A00.A04 = j;
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            this.A00.A04 = j;
        }
    }

    public final void A0M(AbstractC46972Dl abstractC46972Dl, int i, int i2, boolean z) {
        int i3;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i4 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i3 = reentrantReadWriteLock.getReadHoldCount();
                for (int i5 = 0; i5 < i3; i5++) {
                    readLock.unlock();
                }
            } else {
                i3 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            if (!z) {
                try {
                    this.A00.A02 = i;
                    this.A08.accept(Integer.valueOf(i));
                } finally {
                    while (i4 < i3) {
                        readLock.lock();
                        i4++;
                    }
                    writeLock.unlock();
                }
            }
            A03(abstractC46972Dl, i, i2, z);
            return;
        }
        synchronized (this.A0D) {
            if (!z) {
                this.A00.A02 = i;
                this.A08.accept(Integer.valueOf(i));
            }
            A03(abstractC46972Dl, i, i2, z);
        }
    }

    public final void A0N(AbstractC46972Dl abstractC46972Dl, int i, boolean z) {
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        int i3 = 0;
        if (this.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                A0M(abstractC46972Dl, Math.max(0, this.A00.A02 - i), i, z);
                return;
            } finally {
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            A0M(abstractC46972Dl, Math.max(0, this.A00.A02 - i), i, z);
        }
    }

    public final void A0Q(C2EC c2ec, boolean z, boolean z2, boolean z3) {
        java.util.Set keySet;
        if (this.A0L) {
            keySet = this.A0E.keySet();
        } else {
            synchronized (this.A0D) {
                keySet = this.A0E.keySet();
            }
        }
        A0U(AbstractC1121354g.A01(c2ec, keySet, z), z2, z3);
    }

    public final void A0T(List list, boolean z) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0G;
        if (this.A0L) {
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
                if (C2E8.A02(this.A09)) {
                    if (list != null && !list.isEmpty()) {
                        this.A00.A08(A00(list));
                        if (z) {
                            A0H();
                        }
                    } else {
                        AbstractC43796JYj.A01(AbstractC12880la.A04(this.A04));
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                    }
                } else {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                }
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        synchronized (this.A0D) {
            if (C2E8.A02(this.A09)) {
                if (list != null && !list.isEmpty()) {
                    this.A00.A08(A00(list));
                    if (z) {
                        A0H();
                    }
                } else {
                    AbstractC43796JYj.A01(AbstractC12880la.A04(this.A04));
                }
            }
        }
    }
}
