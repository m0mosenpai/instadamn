package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.1W1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1W1 {
    public Map A04;
    public Object A02 = null;
    public Throwable A03 = null;
    public float A00 = 0.0f;
    public boolean A05 = false;
    public Integer A01 = C05F.A00;
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();

    private void A00() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A01 == C05F.A0C) {
                z = true;
            }
        }
        boolean A01 = A01();
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new C3QH(this, (InterfaceC58722mV) pair.first, z, A01));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        if (A08() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean A01() {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            boolean r0 = r3.A05     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r1 = r3.A08()     // Catch: java.lang.Throwable -> L12
            r0 = 1
            if (r1 == 0) goto Le
        Ld:
            r0 = 0
        Le:
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L12
        L12:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1W1.A01():boolean");
    }

    public synchronized Object A02() {
        return this.A02;
    }

    public final synchronized Throwable A03() {
        return this.A03;
    }

    public final void A04() {
        synchronized (this) {
            if (this.A05) {
                return;
            }
            this.A05 = true;
            Object obj = this.A02;
            this.A02 = null;
            if (obj != null) {
                A07(obj);
            }
            if (!A08()) {
                A00();
            }
            synchronized (this) {
                this.A06.clear();
            }
        }
    }

    public final void A05(float f) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.A05 && this.A01 == C05F.A00 && f >= this.A00) {
                this.A00 = f;
                z = true;
            }
        }
        if (z) {
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                final InterfaceC58722mV interfaceC58722mV = (InterfaceC58722mV) pair.first;
                ((Executor) pair.second).execute(new Runnable() { // from class: X.3Q6
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC58722mV.Dbx(C1W1.this);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (A01() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A06(X.InterfaceC58722mV r5, java.util.concurrent.Executor r6) {
        /*
            r4 = this;
            r3 = r4
            r5.getClass()
            r6.getClass()
            monitor-enter(r3)
            boolean r0 = r4.A05     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto Le
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            return
        Le:
            java.lang.Integer r1 = r4.A01     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L4f
            if (r1 != r0) goto L1d
            java.util.concurrent.ConcurrentLinkedQueue r1 = r4.A06     // Catch: java.lang.Throwable -> L4f
            android.util.Pair r0 = android.util.Pair.create(r5, r6)     // Catch: java.lang.Throwable -> L4f
            r1.add(r0)     // Catch: java.lang.Throwable -> L4f
        L1d:
            java.lang.Object r0 = r4.A02     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L2e
            boolean r0 = r4.A08()     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L2e
            boolean r1 = r4.A01()     // Catch: java.lang.Throwable -> L4f
            r0 = 0
            if (r1 == 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4c
            monitor-enter(r3)
            java.lang.Integer r1 = r4.A01     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r1 != r0) goto L3f
            goto L3e
        L3b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L3e:
            r2 = 1
        L3f:
            monitor-exit(r3)
            boolean r1 = r4.A01()
            X.3QH r0 = new X.3QH
            r0.<init>(r4, r5, r2, r1)
            r6.execute(r0)
        L4c:
            return
        L4d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1W1.A06(X.2mV, java.util.concurrent.Executor):void");
    }

    public void A07(Object obj) {
    }

    public final synchronized boolean A08() {
        boolean z;
        z = false;
        if (this.A01 != C05F.A00) {
            z = true;
        }
        return z;
    }

    public boolean A0A(Throwable th) {
        boolean z;
        synchronized (this) {
            if (!this.A05 && this.A01 == C05F.A00) {
                this.A01 = C05F.A0C;
                this.A03 = th;
                this.A04 = null;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            A00();
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x0038
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public boolean A09(java.lang.Object r5, java.util.Map r6, boolean r7) {
        /*
            r4 = this;
            r4.A04 = r6
            r3 = r4
            r2 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r4.A05     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L28
            java.lang.Integer r1 = r4.A01     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L38
            if (r1 != r0) goto L28
            if (r7 == 0) goto L19
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L38
            r4.A01 = r0     // Catch: java.lang.Throwable -> L38
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A00 = r0     // Catch: java.lang.Throwable -> L38
        L19:
            java.lang.Object r1 = r4.A02     // Catch: java.lang.Throwable -> L38
            if (r1 == r5) goto L23
            r4.A02 = r5     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            r0 = move-exception
            r2 = r1
            goto L39
        L23:
            r5 = r2
            goto L26
        L25:
            r5 = r1
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L2f
            r4.A07(r5)
        L2f:
            if (r0 == 0) goto L34
            r4.A00()
        L34:
            return r0
        L35:
            r0 = move-exception
            r2 = r5
            goto L39
        L38:
            r0 = move-exception
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            if (r2 == 0) goto L41
            r4.A07(r2)
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1W1.A09(java.lang.Object, java.util.Map, boolean):boolean");
    }
}
