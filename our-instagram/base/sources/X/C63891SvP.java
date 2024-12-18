package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SvP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63891SvP implements InterfaceC65331TiC {
    public static final C61685Rrz A0P = new Object();
    public InterfaceC65617To8 A00;
    public RunnableC64732TRo A01;
    public C63789Stj A02;
    public RkJ A03;
    public InterfaceC65558Tme A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C02Q A0D;
    public final C63182Seh A0E;
    public final C63182Seh A0F;
    public final C61685Rrz A0G;
    public final C64532TIm A0H;
    public final ExecutorServiceC64807TUv A0I;
    public final ExecutorServiceC64807TUv A0J;
    public final ExecutorServiceC64807TUv A0K;
    public final ExecutorServiceC64807TUv A0L;
    public final SKF A0M;
    public final AtomicInteger A0N;
    public volatile boolean A0O;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r2.A00 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A00(X.C63891SvP r5) {
        /*
            monitor-enter(r5)
            X.To8 r0 = r5.A00     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L44
            X.TIm r0 = r5.A0H     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = r0.A00     // Catch: java.lang.Throwable -> L49
            r0.clear()     // Catch: java.lang.Throwable -> L49
            r4 = 0
            r5.A00 = r4     // Catch: java.lang.Throwable -> L49
            r5.A02 = r4     // Catch: java.lang.Throwable -> L49
            r5.A04 = r4     // Catch: java.lang.Throwable -> L49
            r0 = 0
            r5.A06 = r0     // Catch: java.lang.Throwable -> L49
            r5.A0O = r0     // Catch: java.lang.Throwable -> L49
            r5.A07 = r0     // Catch: java.lang.Throwable -> L49
            r5.A09 = r0     // Catch: java.lang.Throwable -> L49
            X.TRo r3 = r5.A01     // Catch: java.lang.Throwable -> L49
            X.SFS r2 = r3.A0O     // Catch: java.lang.Throwable -> L49
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
            r0 = 1
            r2.A02 = r0     // Catch: java.lang.Throwable -> L41
            boolean r0 = r2.A01     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L2d
            boolean r1 = r2.A00     // Catch: java.lang.Throwable -> L41
            r0 = 0
            if (r1 == 0) goto L2e
        L2d:
            r0 = 1
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L34
            X.RunnableC64732TRo.A06(r3)     // Catch: java.lang.Throwable -> L49
        L34:
            r5.A01 = r4     // Catch: java.lang.Throwable -> L49
            r5.A03 = r4     // Catch: java.lang.Throwable -> L49
            r5.A05 = r4     // Catch: java.lang.Throwable -> L49
            X.02Q r0 = r5.A0D     // Catch: java.lang.Throwable -> L49
            r0.EE6(r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)
            return
        L41:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            goto L48
        L44:
            java.lang.IllegalArgumentException r0 = X.AbstractC58318PtA.A0Y()     // Catch: java.lang.Throwable -> L49
        L48:
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63891SvP.A00(X.SvP):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r3.A0O != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.SKF r0 = r3.A0M     // Catch: java.lang.Throwable -> L41
            r0.A00()     // Catch: java.lang.Throwable -> L41
            boolean r0 = r3.A06     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L13
            boolean r0 = r3.A07     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L13
            boolean r0 = r3.A0O     // Catch: java.lang.Throwable -> L41
            r1 = 0
            if (r0 == 0) goto L14
        L13:
            r1 = 1
        L14:
            java.lang.String r0 = "Not yet complete!"
            if (r1 == 0) goto L3c
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0N     // Catch: java.lang.Throwable -> L41
            int r2 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L41
            boolean r1 = X.MSY.A1R(r2)
            java.lang.String r0 = "Can't decrement below 0"
            if (r1 == 0) goto L37
            if (r2 != 0) goto L29
            goto L2b
        L29:
            r0 = 0
            goto L30
        L2b:
            X.Stj r0 = r3.A02     // Catch: java.lang.Throwable -> L41
            A00(r3)     // Catch: java.lang.Throwable -> L41
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L36
            r0.A00()
        L36:
            return
        L37:
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L3c:
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63891SvP.A01():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
    
        if (r2.A0O != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A02(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A06     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto Le
            boolean r0 = r2.A07     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto Le
            boolean r0 = r2.A0O     // Catch: java.lang.Throwable -> L29
            r1 = 0
            if (r0 == 0) goto Lf
        Le:
            r1 = 1
        Lf:
            java.lang.String r0 = "Not yet complete!"
            if (r1 == 0) goto L24
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0N     // Catch: java.lang.Throwable -> L29
            int r0 = r0.getAndAdd(r3)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L22
            X.Stj r0 = r2.A02     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L22
            r0.A01()     // Catch: java.lang.Throwable -> L29
        L22:
            monitor-exit(r2)
            return
        L24:
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63891SvP.A02(int):void");
    }

    public final synchronized void A03(C63876SvA c63876SvA) {
        Map map;
        this.A0M.A00();
        List list = this.A0H.A00;
        list.remove(new SNV(c63876SvA, S8T.A00));
        if (list.isEmpty()) {
            if (!this.A06 && !this.A07 && !this.A0O) {
                this.A0O = true;
                RunnableC64732TRo runnableC64732TRo = this.A01;
                runnableC64732TRo.A0U = true;
                InterfaceC65474Tkr interfaceC65474Tkr = runnableC64732TRo.A0T;
                if (interfaceC65474Tkr != null) {
                    interfaceC65474Tkr.cancel();
                }
                C63182Seh c63182Seh = this.A0E;
                InterfaceC65617To8 interfaceC65617To8 = this.A00;
                synchronized (c63182Seh) {
                    SDD sdd = c63182Seh.A04;
                    if (this.A0A) {
                        map = sdd.A01;
                    } else {
                        map = sdd.A00;
                    }
                    if (equals(map.get(interfaceC65617To8))) {
                        map.remove(interfaceC65617To8);
                    }
                }
            }
            if ((this.A07 || this.A06) && this.A0N.get() == 0) {
                A00(this);
            }
        }
    }

    public final synchronized void A04(C63876SvA c63876SvA, Executor executor) {
        Runnable tn0;
        this.A0M.A00();
        this.A0H.A00.add(new SNV(c63876SvA, executor));
        boolean z = true;
        if (this.A07) {
            A02(1);
            tn0 = new TN1(this, c63876SvA);
        } else if (this.A06) {
            A02(1);
            tn0 = new TN0(this, c63876SvA);
        } else {
            if (this.A0O) {
                z = false;
            }
            if (!z) {
                throw AbstractC166987dD.A12("Cannot add callbacks to a cancelled EngineJob");
            }
        }
        executor.execute(tn0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.SKF, java.lang.Object] */
    public C63891SvP(C02Q c02q, C63182Seh c63182Seh, C63182Seh c63182Seh2, ExecutorServiceC64807TUv executorServiceC64807TUv, ExecutorServiceC64807TUv executorServiceC64807TUv2, ExecutorServiceC64807TUv executorServiceC64807TUv3, ExecutorServiceC64807TUv executorServiceC64807TUv4) {
        C61685Rrz c61685Rrz = A0P;
        this.A0H = new C64532TIm();
        this.A0M = new Object();
        this.A0N = new AtomicInteger();
        this.A0J = executorServiceC64807TUv;
        this.A0K = executorServiceC64807TUv2;
        this.A0L = executorServiceC64807TUv3;
        this.A0I = executorServiceC64807TUv4;
        this.A0E = c63182Seh;
        this.A0F = c63182Seh2;
        this.A0D = c02q;
        this.A0G = c61685Rrz;
    }

    @Override // X.InterfaceC65331TiC
    public final SKF CEo() {
        return this.A0M;
    }
}
