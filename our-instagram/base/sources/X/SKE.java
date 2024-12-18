package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SKE {
    public final List A00 = AbstractC166987dD.A1E();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r0 = r1.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.InterfaceC65631Tps A00(java.lang.Class r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 0
            java.util.List r3 = r5.A00     // Catch: java.lang.Throwable -> L21
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L21
        L8:
            if (r4 >= r2) goto L1e
            java.lang.Object r1 = r3.get(r4)     // Catch: java.lang.Throwable -> L21
            X.SDL r1 = (X.SDL) r1     // Catch: java.lang.Throwable -> L21
            java.lang.Class r0 = r1.A01     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1b
            X.Tps r0 = r1.A00     // Catch: java.lang.Throwable -> L21
            goto L1f
        L1b:
            int r4 = r4 + 1
            goto L8
        L1e:
            r0 = 0
        L1f:
            monitor-exit(r5)
            return r0
        L21:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKE.A00(java.lang.Class):X.Tps");
    }
}
