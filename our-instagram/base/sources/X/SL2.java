package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SL2 {
    public final List A00 = AbstractC166987dD.A1E();
    public final Map A01 = AbstractC166987dD.A1G();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r8.isAssignableFrom(r2.A02) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList A00(java.lang.Class r7, java.lang.Class r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = r6.A00     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L49
        Lb:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L47
            java.lang.String r1 = X.AbstractC166987dD.A1B(r5)     // Catch: java.lang.Throwable -> L49
            java.util.Map r0 = r6.A01     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = X.AbstractC43592JPx.A12(r1, r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto Lb
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L49
        L21:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L49
            X.SFY r2 = (X.SFY) r2     // Catch: java.lang.Throwable -> L49
            java.lang.Class r0 = r2.A01     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L3e
            java.lang.Class r0 = r2.A02     // Catch: java.lang.Throwable -> L49
            boolean r1 = r8.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 1
            if (r1 != 0) goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L21
            java.lang.Class r0 = r2.A02     // Catch: java.lang.Throwable -> L49
            X.MSZ.A1P(r0, r4)     // Catch: java.lang.Throwable -> L49
            goto L21
        L47:
            monitor-exit(r6)
            return r4
        L49:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SL2.A00(java.lang.Class, java.lang.Class):java.util.ArrayList");
    }
}
