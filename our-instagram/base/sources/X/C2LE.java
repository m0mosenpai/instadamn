package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.2LE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LE implements Executor {
    public Runnable A00;
    public final Executor A03;
    public final ArrayDeque A02 = new ArrayDeque();
    public final Object A01 = new Object();

    public final void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable command) {
        synchronized (this.A01) {
            this.A02.add(new Runnable(this, command) { // from class: X.2NT
                public final C2LE A00;
                public final Runnable A01;

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x001d
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r3 = this;
                        java.lang.Runnable r0 = r3.A01     // Catch: java.lang.Throwable -> L12
                        r0.run()     // Catch: java.lang.Throwable -> L12
                        X.2LE r1 = r3.A00
                        java.lang.Object r0 = r1.A01
                        monitor-enter(r0)
                        r1.A00()     // Catch: java.lang.Throwable -> Lf
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                        return
                    Lf:
                        r2 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                        throw r2
                    L12:
                        r2 = move-exception
                        X.2LE r1 = r3.A00
                        java.lang.Object r0 = r1.A01
                        monitor-enter(r0)
                        r1.A00()     // Catch: java.lang.Throwable -> L1d
                    L1b:
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                        goto L1f
                    L1d:
                        r2 = move-exception
                        goto L1b
                    L1f:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2NT.run():void");
                }

                {
                    this.A00 = this;
                    this.A01 = command;
                }
            });
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public C2LE(Executor executor) {
        this.A03 = executor;
    }
}
