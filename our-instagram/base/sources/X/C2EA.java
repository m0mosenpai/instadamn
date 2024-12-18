package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2EA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EA {
    public static final List A06 = AbstractC16960so.A1Q(C2EB.A04, C2EB.A0B);
    public final UserSession A00;
    public final ReentrantReadWriteLock A02;
    public final Map A04;
    public final Map A01 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final Map A05 = new LinkedHashMap();

    public final C4GV A04(DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A02.readLock();
        readLock.lock();
        try {
            return (C4GV) this.A01.get(directThreadKey);
        } finally {
            readLock.unlock();
        }
    }

    public final C4GV A06(DirectThreadKey directThreadKey) {
        int i;
        C14360o3.A0B(directThreadKey, 0);
        ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
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
            Iterator it = this.A05.values().iterator();
            while (it.hasNext()) {
                ((TreeSet) it.next()).remove(directThreadKey);
            }
            for (C2EB c2eb : C2EB.values()) {
                A00(this, c2eb).A00.remove(directThreadKey);
            }
            if (AbstractC1337462f.A0A(this.A00, false)) {
                Iterator it2 = A06.iterator();
                while (it2.hasNext()) {
                    A01(this, (C2EB) it2.next()).A00.remove(directThreadKey);
                }
            }
            return A02(this, directThreadKey);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A07(X.EnumC46982Dm r10, X.C2EB r11) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r0.readLock()
            r8.lock()
            java.util.Set r0 = r9.A09(r10, r11)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r5.<init>()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L71
        L1a:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L6d
            java.lang.Object r6 = r7.next()     // Catch: java.lang.Throwable -> L71
            com.instagram.model.direct.DirectThreadKey r6 = (com.instagram.model.direct.DirectThreadKey) r6     // Catch: java.lang.Throwable -> L71
            X.4GV r0 = r9.A04(r6)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L69
            java.lang.String r4 = "DirectThreadStoreImpl_missingEntryForKey"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r3.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "Missing thread entry for thread in SystemFolder: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L71
            r3.append(r10)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = " keyHasThreadId: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r6.A00     // Catch: java.lang.Throwable -> L71
            r2 = 1
            r0 = 0
            if (r1 == 0) goto L47
            r0 = 1
        L47:
            r3.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = " keyHasRecipients: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L71
            java.util.List r0 = r6.A02     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L5a
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            r0 = 0
            if (r1 == 0) goto L5b
        L5a:
            r0 = 1
        L5b:
            if (r0 == 0) goto L5e
            r2 = 0
        L5e:
            r3.append(r2)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L71
            X.C0w9.A03(r4, r0)     // Catch: java.lang.Throwable -> L71
            goto L1a
        L69:
            r5.add(r0)     // Catch: java.lang.Throwable -> L71
            goto L1a
        L6d:
            r8.unlock()
            return r5
        L71:
            r0 = move-exception
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2EA.A07(X.2Dm, X.2EB):java.util.ArrayList");
    }

    public final java.util.Set A09(EnumC46982Dm enumC46982Dm, C2EB c2eb) {
        java.util.Set set;
        C2EB c2eb2;
        ReentrantReadWriteLock.ReadLock readLock = this.A02.readLock();
        readLock.lock();
        try {
            if (enumC46982Dm == EnumC46982Dm.A06) {
                set = A00(this, c2eb).A00;
            } else if (enumC46982Dm == EnumC46982Dm.A07 && AbstractC1337462f.A0A(this.A00, false)) {
                int ordinal = c2eb.ordinal();
                if (ordinal != 7 && ordinal != 6) {
                    c2eb2 = C2EB.A04;
                } else {
                    c2eb2 = C2EB.A0B;
                }
                set = A01(this, c2eb2).A00;
            } else {
                Object obj = this.A05.get(enumC46982Dm);
                if (obj != null) {
                    set = (java.util.Set) obj;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return set;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:18:0x0065, B:19:0x006f, B:21:0x0075, B:23:0x0081, B:26:0x0092, B:31:0x009e, B:32:0x00a6), top: B:17:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[DONT_GENERATE, LOOP:2: B:36:0x00a7->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.AbstractC46972Dl r11, X.C2EV r12, X.C2EB r13, X.InterfaceC09390do r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2EA.A0B(X.2Dl, X.2EV, X.2EB, X.0do):void");
    }

    public final void A0C(EnumC46982Dm enumC46982Dm, C4GV c4gv, C2EB c2eb, DirectThreadKey directThreadKey) {
        int i;
        C14360o3.A0B(enumC46982Dm, 2);
        ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
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
            A09(enumC46982Dm, c2eb).add(directThreadKey);
            A03(this, c4gv, directThreadKey);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0E(X.C2EC r6) {
        /*
            r5 = this;
            r3 = 1
            int r1 = r6.C7C()
            r0 = 6
            if (r1 == r0) goto L1b
            com.instagram.common.session.UserSession r4 = r5.A00
            int r1 = r6.C7g()
            r0 = 29
            if (r1 == r0) goto L21
            r0 = 32
            if (r1 == r0) goto L1c
            r0 = 62
            if (r1 == r0) goto L1c
        L1a:
            r3 = 0
        L1b:
            return r3
        L1c:
            boolean r0 = r6.CPZ()
            goto L61
        L21:
            r2 = r6
            X.3kb r2 = (X.C81663kb) r2
            X.0do r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L40
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            X.3iy r0 = r2.A01     // Catch: java.lang.Throwable -> L64
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r0.A1P     // Catch: java.lang.Throwable -> L64
            goto L47
        L40:
            X.3iy r1 = r2.A01
            monitor-enter(r1)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r1.A1P     // Catch: java.lang.Throwable -> L69
            monitor-exit(r1)
            goto L4a
        L47:
            r1.unlock()
        L4a:
            if (r0 == 0) goto L51
            boolean r0 = r0.A07
            if (r0 != r3) goto L51
            goto L1a
        L51:
            boolean r0 = r6.CPZ()
            if (r0 != 0) goto L1a
            java.lang.String r1 = r4.userId
            java.lang.String r0 = r6.Asv()
            boolean r0 = X.C14360o3.A0K(r1, r0)
        L61:
            if (r0 != 0) goto L1a
            return r3
        L64:
            r0 = move-exception
            r1.unlock()
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2EA.A0E(X.2EC):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0F(com.instagram.model.direct.DirectThreadKey r7) {
        /*
            r6 = this;
            r4 = 0
            java.util.Map r0 = r6.A05
            java.util.Collection r1 = r0.values()
            r5 = 1
            if (r1 == 0) goto L29
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L29
        L10:
            X.2EB[] r3 = X.C2EB.values()
            int r2 = r3.length
            r1 = 0
        L16:
            if (r1 >= r2) goto L40
            r0 = r3[r1]
            X.2EL r0 = A00(r6, r0)
            java.util.Set r0 = r0.A00
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L72
            int r1 = r1 + 1
            goto L16
        L29:
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L10
            java.lang.Object r0 = r1.next()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L2d
            return r5
        L40:
            com.instagram.common.session.UserSession r0 = r6.A00
            boolean r0 = X.AbstractC1337462f.A0A(r0, r4)
            if (r0 == 0) goto L54
            java.util.List r1 = X.C2EA.A06
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L56
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L56
        L54:
            r5 = 0
            return r5
        L56:
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.next()
            X.2EB r0 = (X.C2EB) r0
            X.2EL r0 = A01(r6, r0)
            java.util.Set r0 = r0.A00
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L5a
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2EA.A0F(com.instagram.model.direct.DirectThreadKey):boolean");
    }

    public static final C2EL A00(C2EA c2ea, C2EB c2eb) {
        Object obj = c2ea.A03.get(c2eb);
        if (obj != null) {
            return (C2EL) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C2EL A01(C2EA c2ea, C2EB c2eb) {
        Object obj = c2ea.A04.get(c2eb);
        if (obj != null) {
            return (C2EL) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C4GV A02(C2EA c2ea, DirectThreadKey directThreadKey) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = c2ea.A02;
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
            return (C4GV) c2ea.A01.remove(directThreadKey);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public static final void A03(C2EA c2ea, C4GV c4gv, DirectThreadKey directThreadKey) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = c2ea.A02;
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
            c2ea.A01.put(directThreadKey, c4gv);
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public final C4GV A05(DirectThreadKey directThreadKey) {
        ReentrantReadWriteLock.ReadLock readLock = this.A02.readLock();
        readLock.lock();
        try {
            C4GV A04 = A04(directThreadKey);
            if (A04 == null && A0F(directThreadKey)) {
                C0w9.A03("ThreadEntry not found", "ThreadEntry not found in non-empty map");
            }
            return A04;
        } finally {
            readLock.unlock();
        }
    }

    public final java.util.Set A08() {
        ReentrantReadWriteLock.ReadLock readLock = this.A02.readLock();
        readLock.lock();
        try {
            return this.A01.entrySet();
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void A0A() {
        int i;
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i3 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i4 = 0; i4 < i; i4++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i5 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i6 = 0; i6 < i2; i6++) {
                    readLock2.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                this.A01.clear();
                while (i5 < i2) {
                    readLock2.lock();
                    i5++;
                }
                writeLock2.unlock();
                Iterator it = this.A05.values().iterator();
                while (it.hasNext()) {
                    ((TreeSet) it.next()).clear();
                }
                for (C2EB c2eb : C2EB.values()) {
                    A00(this, c2eb).A00.clear();
                }
                if (AbstractC1337462f.A0A(this.A00, false)) {
                    Iterator it2 = A06.iterator();
                    while (it2.hasNext()) {
                        A01(this, (C2EB) it2.next()).A00.clear();
                    }
                }
                while (i3 < i) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                while (i5 < i2) {
                    readLock2.lock();
                    i5++;
                }
                writeLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            while (i3 < i) {
                readLock.lock();
                i3++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void A0D(List list, Comparator comparator) {
        if (comparator != null) {
            try {
                C01T.A1D(list, comparator);
            } catch (IllegalArgumentException e) {
                if (C18U.A06(C06090Tz.A05, this.A00, 36322516949149990L)) {
                    C0w9.A07("PartitionedThreadEntries::getSortedThreadSummaries::sort", e);
                    return;
                }
                throw e;
            }
        }
    }

    public C2EA(UserSession userSession) {
        int i;
        this.A00 = userSession;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A02 = reentrantReadWriteLock;
        this.A04 = new LinkedHashMap();
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
            for (EnumC46982Dm enumC46982Dm : EnumC46982Dm.values()) {
                if (enumC46982Dm == EnumC46982Dm.A06) {
                    for (C2EB c2eb : C2EB.values()) {
                        this.A03.put(c2eb, new C2EL());
                    }
                } else {
                    this.A05.put(enumC46982Dm, new TreeSet());
                }
            }
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                this.A04.put((C2EB) it.next(), new C2EL());
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
