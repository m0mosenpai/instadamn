package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.0TF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TF extends Thread {
    public ReferenceQueue A00;
    public volatile boolean A01;
    public final /* synthetic */ C18120uw A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TF(C18120uw c18120uw, ReferenceQueue referenceQueue, int i) {
        super(AnonymousClass001.A0O("RefQThread-", i));
        this.A02 = c18120uw;
        this.A01 = true;
        this.A00 = referenceQueue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0028, code lost:
    
        if (r8 > 0) goto L16;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            X.0uw r7 = r9.A02
            r6 = 32
            r5 = 0
            long[] r4 = new long[r6]
            java.lang.ref.Reference[] r3 = new java.lang.ref.Reference[r6]
        L9:
            r8 = 0
        La:
            java.lang.ref.ReferenceQueue r2 = r9.A00     // Catch: java.lang.InterruptedException -> L28
            java.lang.ref.Reference r0 = r2.poll()     // Catch: java.lang.InterruptedException -> L28
            if (r0 == 0) goto L1a
            int r1 = r8 + 1
            r3[r8] = r0     // Catch: java.lang.InterruptedException -> L27
            r8 = r1
            if (r1 < r6) goto La
            goto L2a
        L1a:
            if (r8 != 0) goto L28
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.ref.Reference r0 = r2.remove(r0)     // Catch: java.lang.InterruptedException -> L28
            if (r0 == 0) goto L54
            r1 = 1
            r3[r8] = r0     // Catch: java.lang.InterruptedException -> L27
        L27:
            r8 = r1
        L28:
            if (r8 <= 0) goto L54
        L2a:
            r2 = 0
        L2b:
            r0 = r3[r2]
            X.0TD r0 = (X.C0TD) r0
            java.lang.Object r0 = r0.BFE()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 < r8) goto L2b
            X.0TC r0 = r7.A03
            r0.onDeallocation(r4, r5, r8)
            java.util.Set r2 = r7.A05
            monitor-enter(r2)
            r1 = 0
        L48:
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L59
            r2.remove(r0)     // Catch: java.lang.Throwable -> L59
            r3[r1] = r5     // Catch: java.lang.Throwable -> L59
            int r1 = r1 + 1
            if (r1 < r8) goto L48
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
        L54:
            boolean r0 = r9.A01
            if (r0 != 0) goto L9
            return
        L59:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TF.run():void");
    }
}
