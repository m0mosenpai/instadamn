package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SKD {
    public final List A00 = AbstractC166987dD.A1E();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r7.isAssignableFrom(r2.A02) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList A00(java.lang.Class r6, java.lang.Class r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto Lf
            r4.add(r7)     // Catch: java.lang.Throwable -> L3d
            goto L3b
        Lf:
            java.util.List r0 = r5.A00     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L15:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L3d
            X.SFX r2 = (X.SFX) r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r0 = r2.A01     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r0.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L32
            java.lang.Class r0 = r2.A02     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r7.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L3d
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            if (r0 == 0) goto L15
            java.lang.Class r0 = r2.A02     // Catch: java.lang.Throwable -> L3d
            X.MSZ.A1P(r0, r4)     // Catch: java.lang.Throwable -> L3d
            goto L15
        L3b:
            monitor-exit(r5)
            return r4
        L3d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKD.A00(java.lang.Class, java.lang.Class):java.util.ArrayList");
    }
}
