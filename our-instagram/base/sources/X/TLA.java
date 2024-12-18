package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class TLA implements Runnable {
    public final /* synthetic */ C124265jg A00;

    public TLA(C124265jg c124265jg) {
        this.A00 = c124265jg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i;
        long A05;
        long j2;
        long j3;
        long j4;
        C124265jg c124265jg = this.A00;
        short s = 2;
        boolean z = false;
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c124265jg.A05;
            lightweightQuickPerformanceLogger.markerStart(43253761);
            C0JK c0jk = c124265jg.A04;
            long A052 = c0jk.A05();
            if (c124265jg.A00 == A052) {
                lightweightQuickPerformanceLogger.markerEnd(43253761, (short) 4);
                return;
            }
            z = true;
            c124265jg.A00 = A052;
            lightweightQuickPerformanceLogger.markerPoint(43253761, "last_available_space_changed");
            long j5 = c124265jg.A00;
            HashSet A1H = AbstractC166987dD.A1H();
            Map map = c124265jg.A07;
            synchronized (map) {
                A1H.addAll(map.keySet());
            }
            lightweightQuickPerformanceLogger.markerPoint(43253761, "notify_updates", AnonymousClass001.A0O("listener_count:", A1H.size()));
            int i2 = 0;
            Iterator it = A1H.iterator();
            while (it.hasNext()) {
                C1MY c1my = (C1MY) it.next();
                try {
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = c1my.A05;
                    lightweightQuickPerformanceLogger2.markerStart(43253764);
                    lightweightQuickPerformanceLogger2.markerAnnotate(43253764, "available_space", j5);
                    WeakHashMap weakHashMap = c1my.A06;
                    synchronized (weakHashMap) {
                        try {
                            lightweightQuickPerformanceLogger2.markerAnnotate(43253764, "listener_count", weakHashMap.size());
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    synchronized (c1my) {
                        try {
                            if (c1my.A00 == null) {
                                j = OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE;
                            } else {
                                j = 100000000;
                            }
                            if (j5 < j) {
                                HashSet A02 = c1my.A02();
                                if (A02.isEmpty()) {
                                    i = 102;
                                } else {
                                    long nanoTime = System.nanoTime() / 1000000;
                                    if (c1my.A00 == null) {
                                        j2 = 5242880;
                                    } else {
                                        j2 = 25000000;
                                    }
                                    if (j5 < j2) {
                                        long j6 = nanoTime - c1my.A02.get();
                                        if (c1my.A00 == null) {
                                            j4 = 300000;
                                        } else {
                                            j4 = 43200000;
                                        }
                                        if (j6 > j4) {
                                            c1my.A04(A02);
                                            i = 1;
                                        }
                                    }
                                    long j7 = nanoTime - c1my.A01.get();
                                    if (c1my.A00 == null) {
                                        j3 = 86400000;
                                    } else {
                                        j3 = 43200000;
                                    }
                                    if (j7 > j3) {
                                        c1my.A03(A02);
                                        i = 2;
                                    } else {
                                        i = 103;
                                    }
                                }
                            } else {
                                i = 101;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                            break;
                        }
                    }
                    lightweightQuickPerformanceLogger2.markerAnnotate(43253764, "trim_action", i);
                    short s2 = 2;
                    if (i > 100) {
                        s2 = 105;
                        A05 = j5;
                    } else {
                        C0JK c0jk2 = c1my.A04;
                        c0jk2.A07();
                        A05 = c0jk2.A05();
                    }
                    lightweightQuickPerformanceLogger2.markerAnnotate(43253764, "available_space_change", A05 - j5);
                    try {
                        lightweightQuickPerformanceLogger2.markerEnd(43253764, s2);
                        i2++;
                    } catch (Exception e) {
                        c124265jg.A03.EmQ("StorageResourceMonitor onAvailableSpaceChanged", e);
                    }
                } catch (Throwable th3) {
                    c1my.A05.markerEnd(43253764, (short) 3);
                    throw th3;
                    break;
                }
            }
            lightweightQuickPerformanceLogger.markerPoint(43253761, "notify_updates_completed", AnonymousClass001.A0O("success_count:", i2));
            if (c124265jg.A01 > 0 && c0jk.A09() && c124265jg.A09.compareAndSet(false, true)) {
                C14120nc.A00().ATO(new Rc5(c124265jg));
            }
            lightweightQuickPerformanceLogger.markerEnd(43253761, (short) 2);
        } catch (Throwable th4) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = c124265jg.A05;
            if (!z) {
                s = 4;
            }
            lightweightQuickPerformanceLogger3.markerEnd(43253761, s);
            throw th4;
        }
    }
}
