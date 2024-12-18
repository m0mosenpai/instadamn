package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1MY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MY implements C1MZ {
    public static C1MY A07;
    public C62266S4l A00;
    public AtomicLong A01;
    public AtomicLong A02;
    public final C0Gd A03;
    public final C0JK A04;
    public final LightweightQuickPerformanceLogger A05;
    public final WeakHashMap A06;

    public final void A03(java.util.Set set) {
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A05;
            lightweightQuickPerformanceLogger.markerStart(43253765);
            Iterator it = set.iterator();
            boolean z = true;
            while (it.hasNext()) {
                try {
                    try {
                        ((C1MT) it.next()).F8g();
                        z = false;
                    } catch (Exception e) {
                        this.A03.EmQ("DiskTrimmableManager", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        r7 = 2;
                    }
                    this.A05.markerEnd(43253765, r7);
                    throw th;
                }
            }
            lightweightQuickPerformanceLogger.markerEnd(43253765, z ? (short) 3 : (short) 2);
            this.A01.set(System.nanoTime() / 1000000);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void A04(java.util.Set set) {
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A05;
            lightweightQuickPerformanceLogger.markerStart(43253766);
            Iterator it = set.iterator();
            boolean z = true;
            while (it.hasNext()) {
                try {
                    try {
                        ((C1MT) it.next()).F8h();
                        z = false;
                    } catch (Exception e) {
                        this.A03.EmQ("DiskTrimmableManager", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        r7 = 2;
                    }
                    this.A05.markerEnd(43253766, r7);
                    throw th;
                }
            }
            lightweightQuickPerformanceLogger.markerEnd(43253766, z ? (short) 3 : (short) 2);
            long nanoTime = System.nanoTime() / 1000000;
            this.A01.set(nanoTime);
            this.A02.set(nanoTime);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.C1MZ
    public final void EDD(C1MT c1mt) {
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A05;
            lightweightQuickPerformanceLogger.markerStart(43253763);
            WeakHashMap weakHashMap = this.A06;
            synchronized (weakHashMap) {
                weakHashMap.put(c1mt, true);
            }
            lightweightQuickPerformanceLogger.markerEnd(43253763, (short) 2);
        } catch (Throwable th) {
            this.A05.markerEnd(43253763, (short) 2);
            throw th;
        }
    }

    public static synchronized C1MY A00() {
        C1MY c1my;
        synchronized (C1MY.class) {
            c1my = A07;
            if (c1my == null) {
                throw new IllegalStateException("getInstance() called before initialize()");
            }
        }
        return c1my;
    }

    public static synchronized boolean A01() {
        boolean z;
        synchronized (C1MY.class) {
            z = false;
            if (A07 != null) {
                z = true;
            }
        }
        return z;
    }

    public final HashSet A02() {
        HashSet hashSet;
        WeakHashMap weakHashMap = this.A06;
        synchronized (weakHashMap) {
            hashSet = new HashSet(weakHashMap.keySet());
        }
        return hashSet;
    }

    public C1MY(QuickPerformanceLogger quickPerformanceLogger) {
        C0JK A01 = C0JK.A01();
        C0w9 c0w9 = C0w9.A01;
        synchronized (C124265jg.class) {
            if (C124265jg.A0A == null) {
                throw new IllegalStateException("getInstance() called before initialize()");
            }
        }
        this.A06 = new WeakHashMap();
        this.A02 = new AtomicLong(0L);
        this.A01 = new AtomicLong(0L);
        this.A04 = A01;
        this.A03 = c0w9;
        this.A05 = quickPerformanceLogger;
    }
}
