package X;

/* renamed from: X.9Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208979Mf {
    public final C208969Me A00 = new C208969Me();
    public final C1814082s A01 = new C1814082s();
    public final C1814082s A02 = new C1814082s();
    public volatile C176347sr A03;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r1 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.hardware.Camera r6) {
        /*
            r5 = this;
            X.9Me r2 = r5.A00
            java.util.concurrent.locks.ReentrantLock r4 = r2.A01
            r4.lock()
            if (r6 == 0) goto L72
            r4.lock()     // Catch: java.lang.Throwable -> L66
            r4.lock()     // Catch: java.lang.Throwable -> L61
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L5c
            r1 = 2
            r0 = r0 & 2
            boolean r0 = X.AbstractC167007dF.A1P(r0, r1)
            r4.unlock()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L2f
            r4.lock()     // Catch: java.lang.Throwable -> L61
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L5c
            r1 = 4
            r0 = r0 & 4
            boolean r1 = X.AbstractC167007dF.A1P(r0, r1)
            r4.unlock()     // Catch: java.lang.Throwable -> L61
            r0 = 0
            if (r1 == 0) goto L30
        L2f:
            r0 = 1
        L30:
            r4.unlock()     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L72
            boolean r0 = r2.A00()     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L72
            r4.lock()     // Catch: java.lang.Throwable -> L66
            boolean r0 = r2.A01()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L55
            r0 = 1
            r2.A00 = r0     // Catch: java.lang.Throwable -> L61
            r4.unlock()     // Catch: java.lang.Throwable -> L66
            r2 = 32
            r1 = 0
            r0 = 0
            X.AbstractC175037qd.A00(r2, r1, r0)     // Catch: java.lang.Throwable -> L66
            X.C0fE.A01(r6)     // Catch: java.lang.Throwable -> L66
            goto L72
        L55:
            java.lang.String r0 = "Cannot progress to STARTING, not in STOPPED state"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.Throwable -> L61
            goto L60
        L5c:
            r0 = move-exception
            r4.unlock()     // Catch: java.lang.Throwable -> L61
        L60:
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            r4.unlock()     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L66:
            r3 = move-exception
            r2 = 33
            r1 = 0
            r0 = 0
            X.AbstractC175037qd.A00(r2, r1, r0)
            r4.unlock()
            throw r3
        L72:
            r2 = 33
            r1 = 0
            r0 = 0
            X.AbstractC175037qd.A00(r2, r1, r0)
            r4.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208979Mf.A00(android.hardware.Camera):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(boolean r4, android.hardware.Camera r5) {
        /*
            r3 = this;
            X.9Me r1 = r3.A00
            java.util.concurrent.locks.ReentrantLock r2 = r1.A01
            r2.lock()
            if (r5 == 0) goto L50
            boolean r0 = r1.A01()     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L50
            X.C0fE.A02(r5)     // Catch: java.lang.Throwable -> L4b
            r2.lock()     // Catch: java.lang.Throwable -> L4b
            r0 = 0
            r1.A00 = r0     // Catch: java.lang.Throwable -> L46
            r2.unlock()     // Catch: java.lang.Throwable -> L4b
            X.7sr r1 = r3.A03     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L2f
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.A00     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L2f
            X.8po r0 = new X.8po     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            X.C176567tE.A00(r0)     // Catch: java.lang.Throwable -> L4b
        L2f:
            if (r4 == 0) goto L50
            X.82s r1 = r3.A02     // Catch: java.lang.Throwable -> L4b
            java.util.List r0 = r1.A00     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L50
            java.util.List r1 = r1.A00     // Catch: java.lang.Throwable -> L4b
            X.AuP r0 = new X.AuP     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4b
            X.C176567tE.A00(r0)     // Catch: java.lang.Throwable -> L4b
            goto L50
        L46:
            r0 = move-exception
            r2.unlock()     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            r2.unlock()
            throw r0
        L50:
            r2.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208979Mf.A01(boolean, android.hardware.Camera):void");
    }
}
