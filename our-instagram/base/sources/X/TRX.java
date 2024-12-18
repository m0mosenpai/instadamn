package X;

/* loaded from: classes10.dex */
public final class TRX implements Runnable {
    public Runnable A00;
    public final /* synthetic */ ExecutorC64805TUt A01;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:53:0x0075
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r9 = this;
            r8 = 0
            r7 = 0
        L2:
            X.TUt r6 = r9.A01     // Catch: java.lang.Throwable -> L62
            java.util.Deque r5 = r6.A02     // Catch: java.lang.Throwable -> L62
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L19
            java.lang.Integer r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            java.lang.Integer r4 = X.C05F.A0N     // Catch: java.lang.Throwable -> L5c
            if (r0 == r4) goto L53
            long r2 = r6.A00     // Catch: java.lang.Throwable -> L5c
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0     // Catch: java.lang.Throwable -> L5c
            r6.A01 = r4     // Catch: java.lang.Throwable -> L5c
            r8 = 1
        L19:
            java.lang.Object r0 = r5.poll()     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L5c
            r9.A00 = r0     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L24
            goto L4f
        L24:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L62
            r7 = r7 | r0
            r5 = 0
            java.lang.Runnable r0 = r9.A00     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L5a
            r0.run()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L5a
            goto L4c
        L31:
            r4 = move-exception
            X.1Kj r0 = X.ExecutorC64805TUt.A05     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Logger r3 = r0.A00()     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "Exception while executing runnable "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r0 = r9.A00     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = X.AbstractC166997dE.A0v(r0, r1)     // Catch: java.lang.Throwable -> L5a
            r3.log(r2, r0, r4)     // Catch: java.lang.Throwable -> L5a
        L4c:
            r9.A00 = r5     // Catch: java.lang.Throwable -> L62
            goto L2
        L4f:
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L5c
            r6.A01 = r0     // Catch: java.lang.Throwable -> L5c
        L53:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L59
            X.AbstractC58318PtA.A18()     // Catch: java.lang.Error -> L69
        L59:
            return
        L5a:
            r0 = move-exception
            goto L5f
        L5c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5f:
            r9.A00 = r5     // Catch: java.lang.Throwable -> L62
        L61:
            throw r0     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            if (r7 == 0) goto L68
            X.AbstractC58318PtA.A18()     // Catch: java.lang.Error -> L69
        L68:
            throw r0     // Catch: java.lang.Error -> L69
        L69:
            r3 = move-exception
            X.TUt r2 = r9.A01
            java.util.Deque r1 = r2.A02
            monitor-enter(r1)
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L75
            r2.A01 = r0     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            r3 = move-exception
            goto L73
        L77:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TRX.run():void");
    }

    public TRX(final ExecutorC64805TUt this$0) {
        this.A01 = this$0;
    }

    public final String toString() {
        String str;
        Runnable runnable = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (runnable != null) {
            A1C.append("SequentialExecutorWorker{running=");
            A1C.append(runnable);
        } else {
            A1C.append("SequentialExecutorWorker{state=");
            switch (this.A01.A01.intValue()) {
                case 0:
                    str = "IDLE";
                    break;
                case 1:
                    str = "QUEUING";
                    break;
                case 2:
                    str = "QUEUED";
                    break;
                default:
                    str = "RUNNING";
                    break;
            }
            A1C.append(str);
        }
        return AbstractC166997dE.A0x("}", A1C);
    }
}
