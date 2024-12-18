package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1KG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KG extends C1KH implements InterfaceC18130ux {
    public static final long A0K = TimeUnit.SECONDS.toMillis(30);
    public static final Map A0L = AbstractC06930Yk.A06(new C09530e4(C1KJ.A02, 0), new C09530e4(C1KJ.A05, 1), new C09530e4(C1KJ.A04, 2), new C09530e4(C1KJ.A0A, 3), new C09530e4(C1KJ.A09, 4), new C09530e4(C1KJ.A03, 5), new C09530e4(C1KJ.A07, 6), new C09530e4(C1KJ.A08, 7), new C09530e4(C1KJ.A06, 8));
    public static volatile boolean A0M;
    public static volatile C1KJ A0N;
    public long A00;
    public C0TY A01;
    public C0TY A02;
    public AbstractRunnableC14200nk A03;
    public long A04;
    public final double A05;
    public final ActivityManager.MemoryInfo A06;
    public final ActivityManager A07;
    public final Debug.MemoryInfo A08;
    public final Handler A09;
    public final QuickPerformanceLogger A0A;
    public final C1KF A0B;
    public final C13920nI A0C;
    public final Runtime A0D;
    public final SortedSet A0E;
    public final AtomicBoolean A0F;
    public volatile double A0G;
    public volatile boolean A0H;
    public volatile C1KJ A0I;
    public volatile boolean A0J;

    @Override // X.C1KH
    public final void A08(C1KJ c1kj) {
        C14360o3.A0B(c1kj, 0);
        A03(c1kj, this);
    }

    @Override // X.C1KH
    public final void A09(InterfaceC220315d interfaceC220315d) {
        C14360o3.A0B(interfaceC220315d, 0);
        SortedSet sortedSet = this.A0E;
        C14360o3.A06(sortedSet);
        synchronized (sortedSet) {
            Iterator it = sortedSet.iterator();
            while (it.hasNext()) {
                InterfaceC220315d interfaceC220315d2 = (InterfaceC220315d) ((C1NN) it.next()).A02.get();
                if (interfaceC220315d2 == null || interfaceC220315d2 == interfaceC220315d) {
                    it.remove();
                }
            }
        }
    }

    @Override // X.C1KH
    public final void A0A(InterfaceC220315d interfaceC220315d, int i) {
        A0B(interfaceC220315d, i, -1);
    }

    @Override // X.C1KH
    public final void A0B(InterfaceC220315d interfaceC220315d, int i, int i2) {
        C14360o3.A0B(interfaceC220315d, 0);
        this.A0E.add(new C1NN(interfaceC220315d, i, i2));
    }

    @Override // X.InterfaceC18130ux
    public final void Cvs(C0TY c0ty) {
        C14360o3.A0B(c0ty, 0);
        A04(c0ty, "address_space");
    }

    @Override // X.InterfaceC18490vb
    public final void DO4(C0TY c0ty) {
        C1KJ c1kj;
        C14360o3.A0B(c0ty, 0);
        int ordinal = c0ty.ordinal();
        if (ordinal != 2) {
            if (ordinal == 1 && this.A01 == C0TY.GREEN) {
                c1kj = C1KJ.A05;
            }
            this.A01 = c0ty;
        }
        A04(c0ty, "java");
        c1kj = C1KJ.A04;
        A02(c1kj, this);
        this.A01 = c0ty;
    }

    @Override // X.InterfaceC18530vf
    public final void Drh(C0TY c0ty) {
        C1KJ c1kj;
        C14360o3.A0B(c0ty, 0);
        int ordinal = c0ty.ordinal();
        if (ordinal != 2) {
            if (ordinal == 1 && this.A02 == C0TY.GREEN) {
                c1kj = C1KJ.A0A;
            }
            this.A02 = c0ty;
        }
        A04(c0ty, "system");
        c1kj = C1KJ.A09;
        A02(c1kj, this);
        this.A02 = c0ty;
    }

    @Override // X.C1KH, X.C1KI
    public final void EDS(InterfaceC220315d interfaceC220315d) {
        C14360o3.A0B(interfaceC220315d, 0);
        A0B(interfaceC220315d, 0, -1);
    }

    public C1KG(QuickPerformanceLogger quickPerformanceLogger, C1KF c1kf) {
        ActivityManager activityManager;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        C13920nI c13920nI = C13920nI.A00;
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        Runtime runtime = Runtime.getRuntime();
        C14360o3.A07(runtime);
        C14360o3.A0B(c13920nI, 3);
        this.A0B = c1kf;
        this.A0C = c13920nI;
        this.A08 = memoryInfo;
        this.A06 = memoryInfo2;
        this.A0D = runtime;
        this.A0A = quickPerformanceLogger;
        this.A0E = Collections.synchronizedSortedSet(new TreeSet());
        this.A09 = new Handler(C1CG.A00());
        this.A05 = 20.0d / 100.0d;
        if (c1kf.A09) {
            Object systemService = context.getSystemService("activity");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        this.A07 = activityManager;
        this.A0G = -1.0d;
        C0TY c0ty = C0TY.GREEN;
        this.A01 = c0ty;
        this.A02 = c0ty;
        this.A0F = new AtomicBoolean(false);
        this.A03 = c1kf.A08 ? new AbstractRunnableC14200nk() { // from class: X.1KK
            {
                super(305, 5, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractRunnableC14200nk abstractRunnableC14200nk;
                if (C218914p.A08() && C1KG.this.A0B.A07) {
                    return;
                }
                C1KG c1kg = C1KG.this;
                C1KF c1kf2 = c1kg.A0B;
                if (!c1kf2.A0D || !C1KG.A0M) {
                    Debug.getMemoryInfo(c1kg.A08);
                    Runtime runtime2 = c1kg.A0D;
                    C14360o3.A0B(runtime2, 0);
                    long freeMemory = runtime2.totalMemory() - runtime2.freeMemory();
                    double maxMemory = (r2 - freeMemory) / runtime2.maxMemory();
                    c1kg.A0G = maxMemory;
                    boolean z = false;
                    if (maxMemory < c1kg.A05) {
                        z = true;
                    }
                    c1kg.A0H = z;
                    if (c1kg.A0H) {
                        C1KG.A02(C1KJ.A03, c1kg);
                    }
                }
                if ((C218914p.A08() && c1kf2.A07) || (abstractRunnableC14200nk = c1kg.A03) == null) {
                    return;
                }
                C14270nr.A00().A01(abstractRunnableC14200nk, c1kf2.A03);
            }
        } : null;
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.1KL
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
            
                if ((((r5 - r3) / r5.maxMemory()) * 100.0d) < r2) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
            
                if (r0 < r8) goto L13;
             */
            @Override // X.InterfaceC12870lZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onAppBackgrounded() {
                /*
                    r11 = this;
                    r0 = -693571221(0xffffffffd6a8f16b, float:-9.287742E13)
                    int r10 = X.C0f9.A03(r0)
                    X.1KG r9 = X.C1KG.this
                    X.1KF r7 = r9.A0B
                    boolean r0 = r7.A0E
                    if (r0 == 0) goto L15
                    android.os.Handler r1 = r9.A09
                    r0 = 0
                    r1.removeCallbacksAndMessages(r0)
                L15:
                    boolean r0 = r7.A0C
                    if (r0 != 0) goto L41
                    boolean r0 = r7.A0B
                    if (r0 == 0) goto L49
                    int r2 = r7.A01
                    if (r2 <= 0) goto L50
                    java.lang.Runtime r5 = r9.A0D
                    r0 = 0
                    X.C14360o3.A0B(r5, r0)
                    long r3 = r5.totalMemory()
                    long r0 = r5.freeMemory()
                    long r3 = r3 - r0
                    long r5 = r5.maxMemory()
                    long r0 = r5 - r3
                    double r3 = (double) r0
                    double r0 = (double) r5
                    double r3 = r3 / r0
                    r0 = 4636737291354636288(0x4059000000000000, double:100.0)
                    double r3 = r3 * r0
                    double r1 = (double) r2
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L50
                L41:
                    X.1KJ r0 = X.C1KJ.A02
                    X.C1KG.A02(r0, r9)
                    X.C1KG.A01(r0, r9)
                L49:
                    r0 = 1965889000(0x752d15e8, float:2.1941203E32)
                    X.C0f9.A0A(r0, r10)
                    return
                L50:
                    int r8 = r7.A00
                    if (r8 <= 0) goto L49
                    android.app.ActivityManager r1 = r9.A07
                    r0 = 100
                    if (r1 == 0) goto L6a
                    android.app.ActivityManager$MemoryInfo r2 = r9.A06
                    r1.getMemoryInfo(r2)
                    r6 = 4636737291354636288(0x4059000000000000, double:100.0)
                    long r0 = r2.availMem
                    double r4 = (double) r0
                    long r2 = r2.totalMem
                    double r0 = (double) r2
                    double r4 = r4 / r0
                    double r6 = r6 * r4
                    int r0 = (int) r6
                L6a:
                    if (r0 >= r8) goto L49
                    goto L41
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1KL.onAppBackgrounded():void");
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int i;
                int A03 = C0f9.A03(-1231399299);
                C1KG c1kg = C1KG.this;
                if (!c1kg.A0B.A07 && !c1kg.A0F.compareAndSet(false, true)) {
                    i = 226551151;
                } else {
                    AbstractRunnableC14200nk abstractRunnableC14200nk = c1kg.A03;
                    if (abstractRunnableC14200nk != null) {
                        C14270nr.A00().A01(abstractRunnableC14200nk, 10000L);
                    }
                    i = 4492002;
                }
                C0f9.A0A(i, A03);
            }
        };
        if (c1kf.A0F) {
            C218914p.A04(EnumC220415e.A02, interfaceC12870lZ, true, false);
        } else {
            C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
        }
    }

    private final void A00(C1KJ c1kj) {
        if (A0M && this.A0B.A0D) {
            C1KJ c1kj2 = A0N;
            if (c1kj2 == null || c1kj2.A00 < c1kj.A00) {
                A0N = c1kj;
                return;
            }
            return;
        }
        int i = this.A0B.A06;
        if (C11T.A08()) {
            if (i < 1) {
                A03(c1kj, this);
                return;
            }
        } else if (i < 1) {
            C11T.A02(new RunnableC71485Wul(c1kj, this));
            return;
        }
        C14120nc.A00().ATO(new V6N(c1kj, this, i));
    }

    public static final void A01(C1KJ c1kj, C1KG c1kg) {
        Number number = (Number) A0L.get(c1kj);
        if (number != null) {
            int intValue = number.intValue();
            if (intValue >= 0 && ((1 << intValue) & c1kg.A0B.A02) > 0) {
                System.gc();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Unexpected memory trim type ", c1kj.name()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 > (r4 + r1.A04)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C1KJ r8, X.C1KG r9) {
        /*
            X.1KF r1 = r9.A0B
            int r3 = r1.A05
            r2 = 1
            int r0 = r8.ordinal()
            int r2 = r2 << r0
            r3 = r3 & r2
            if (r3 <= 0) goto L54
            r9.A0I = r8
            boolean r0 = r1.A0A
            if (r0 == 0) goto L30
            monitor-enter(r9)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2d
            long r4 = r9.A00     // Catch: java.lang.Throwable -> L2d
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L29
            int r0 = r1.A04     // Catch: java.lang.Throwable -> L2d
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 + r0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L2a
        L29:
            r0 = 1
        L2a:
            r9.A00 = r2     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L30:
            long r2 = r9.A00
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r0 = r1.A04
            long r0 = (long) r0
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L54
        L44:
            r9.A00(r8)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r9.A00 = r0
            return
        L4e:
            monitor-exit(r9)
            if (r0 == 0) goto L54
            r9.A00(r8)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KG.A02(X.1KJ, X.1KG):void");
    }

    private final void A04(C0TY c0ty, String str) {
        this.A0A.markEventBuilder(694565055, "memory_status_change").annotate("metric", str).annotate(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c0ty.name()).annotate("asl_session_id", C0L6.A01()).annotate("app_in_foreground_v2", C0L6.A07()).report();
    }

    @Override // X.C1KH
    public final double A05() {
        return this.A0G;
    }

    @Override // X.C1KH
    public final C1KJ A06() {
        return this.A0I;
    }

    @Override // X.C1KH
    public final void A07(int i) {
        C1KJ c1kj;
        if (i != 10) {
            if (i != 15) {
                if (i == 80 && this.A0B.A0G) {
                    c1kj = C1KJ.A06;
                } else {
                    return;
                }
            } else if (!this.A0B.A0H) {
                return;
            } else {
                c1kj = C1KJ.A08;
            }
        } else if (!this.A0B.A0I) {
            return;
        } else {
            c1kj = C1KJ.A07;
        }
        A02(c1kj, this);
    }

    @Override // X.C1KH
    public final void A0C(boolean z) {
        C1KJ c1kj = A0N;
        A0M = z;
        if (!z && c1kj != null) {
            A02(c1kj, this);
            A0N = null;
        }
    }

    @Override // X.C1KH
    public final boolean A0D() {
        boolean z;
        C1KF c1kf = this.A0B;
        if (!c1kf.A09) {
            return false;
        }
        if (c1kf.A0J) {
            if (this.A02 != C0TY.RED) {
                return false;
            }
            return true;
        }
        long j = this.A04;
        if (j == 0 || SystemClock.elapsedRealtime() > j + A0K) {
            ActivityManager activityManager = this.A07;
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = this.A06;
                activityManager.getMemoryInfo(memoryInfo);
                z = memoryInfo.lowMemory;
            } else {
                z = false;
            }
            this.A0J = z;
            this.A04 = SystemClock.elapsedRealtime();
        }
        return this.A0J;
    }

    @Override // X.C1KH
    public final boolean A0E() {
        if (this.A0B.A0K) {
            if (this.A01 != C0TY.RED) {
                return false;
            }
            return true;
        }
        return this.A0H;
    }

    public static final void A03(C1KJ c1kj, C1KG c1kg) {
        int i;
        int random = (int) (Math.random() * 2.147483647E9d);
        QuickPerformanceLogger quickPerformanceLogger = c1kg.A0A;
        quickPerformanceLogger.markerStart(25048645, random, "trim_type", c1kj.name());
        quickPerformanceLogger.markerAnnotate(25048645, random, "asl_session_id", C0L6.A01());
        SortedSet sortedSet = c1kg.A0E;
        C14360o3.A06(sortedSet);
        synchronized (sortedSet) {
            Iterator it = sortedSet.iterator();
            i = 0;
            while (it.hasNext()) {
                C1NN c1nn = (C1NN) it.next();
                InterfaceC220315d interfaceC220315d = (InterfaceC220315d) c1nn.A02.get();
                if (interfaceC220315d == null) {
                    it.remove();
                } else {
                    if ((c1nn.A00 & (1 << c1kj.ordinal())) > 0) {
                        interfaceC220315d.F8d(c1kj);
                    }
                    i++;
                }
            }
        }
        A01(c1kj, c1kg);
        quickPerformanceLogger.markerAnnotate(25048645, random, "trimmables_count", i);
        quickPerformanceLogger.markerEnd(25048645, random, (short) 2);
    }
}
