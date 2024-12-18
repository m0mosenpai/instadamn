package X;

/* renamed from: X.TKy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64587TKy implements Runnable {
    public final /* synthetic */ C63367SiS A00;

    public RunnableC64587TKy(C63367SiS c63367SiS) {
        this.A00 = c63367SiS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3 != X.C05F.A0C) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            X.SiS r2 = r5.A00
            X.TnO r0 = r2.A0M
            boolean r0 = r0.EiB()
            java.lang.String r4 = "keep_alive"
            if (r0 == 0) goto L71
            X.SiN r0 = r2.A0w
            if (r0 == 0) goto L17
            java.lang.Integer r3 = r0.A0Y
            java.lang.Integer r1 = X.C05F.A0C
            r0 = 1
            if (r3 == r1) goto L18
        L17:
            r0 = 0
        L18:
            X.To9 r1 = r2.A08
            if (r0 == 0) goto L28
            if (r1 == 0) goto L23
            java.lang.String r0 = "send ping"
            r1.Chx(r4, r0)
        L23:
            r0 = 0
            r2.A0F(r0)
        L27:
            return
        L28:
            if (r1 == 0) goto L2f
            java.lang.String r0 = "not connected"
            r1.Chx(r4, r0)
        L2f:
            X.SiN r0 = r2.A0w
            if (r0 == 0) goto L3a
            boolean r0 = r0.A04()
            if (r0 == 0) goto L3a
            return
        L3a:
            r2.A0C()
            X.SZK r1 = r2.A0V
            monitor-enter(r1)
            java.util.concurrent.Future r0 = r1.A09     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L4b
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L4b
            goto L61
        L4b:
            X.TmL r0 = r1.A06     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L5c
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + 1
            r1.A00 = r0     // Catch: java.lang.Throwable -> L6c
            X.SZK.A00(r1)     // Catch: java.lang.Throwable -> L6c
            r1.A01()     // Catch: java.lang.Throwable -> L6c
            goto L5f
        L5c:
            r1.A01()     // Catch: java.lang.Throwable -> L6e
        L5f:
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            monitor-exit(r1)
            if (r0 == 0) goto L27
            X.SiM r1 = r2.A0D
            java.lang.Integer r0 = X.C05F.A1F
            r1.A0F = r0
            return
        L6c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L71:
            X.To9 r1 = r2.A08
            if (r1 == 0) goto L7b
            java.lang.String r0 = "should_not_be_connected"
            r1.Chx(r4, r0)
        L7b:
            X.RhR r0 = X.RhR.A05
            r2.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC64587TKy.run():void");
    }
}
