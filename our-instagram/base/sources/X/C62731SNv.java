package X;

@Deprecated
/* renamed from: X.SNv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62731SNv {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public InterfaceC65297ThV A03;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x0028
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void A00() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A02     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            return
        L7:
            r0 = 1
            r3.A02 = r0     // Catch: java.lang.Throwable -> L36
            r3.A01 = r0     // Catch: java.lang.Throwable -> L36
            X.ThV r2 = r3.A03     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r3.A00     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            r1 = 0
            if (r2 == 0) goto L17
            r2.onCancel()     // Catch: java.lang.Throwable -> L1f
        L17:
            if (r0 == 0) goto L2b
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0     // Catch: java.lang.Throwable -> L1f
            r0.cancel()     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L1f:
            r0 = move-exception
            monitor-enter(r3)
            r3.A01 = r1     // Catch: java.lang.Throwable -> L28
            r3.notifyAll()     // Catch: java.lang.Throwable -> L28
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L26
        L2a:
            throw r0
        L2b:
            monitor-enter(r3)
            r3.A01 = r1     // Catch: java.lang.Throwable -> L33
            r3.notifyAll()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r0
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62731SNv.A00():void");
    }

    public final void A01(InterfaceC65297ThV interfaceC65297ThV) {
        synchronized (this) {
            while (this.A01) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.A03 != interfaceC65297ThV) {
                this.A03 = interfaceC65297ThV;
                if (this.A02) {
                    interfaceC65297ThV.onCancel();
                }
            }
        }
    }
}
