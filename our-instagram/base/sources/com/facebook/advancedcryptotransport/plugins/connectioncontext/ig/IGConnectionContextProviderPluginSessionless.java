package com.facebook.advancedcryptotransport.plugins.connectioncontext.ig;

/* loaded from: classes3.dex */
public final class IGConnectionContextProviderPluginSessionless extends Sessionless {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r7.A00) >= 30000) goto L11;
     */
    @Override // com.facebook.advancedcryptotransport.plugins.connectioncontext.ig.Sessionless
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean IGConnectionContextProviderImpl_MEMConnectionContextProviderIsPushTriggered() {
        /*
            r8 = this;
            X.5k5 r1 = X.C124465k4.A02
            monitor-enter(r1)
            X.5k4 r7 = X.C124465k4.A03     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)
            monitor-enter(r7)
            boolean r0 = r7.A01     // Catch: java.lang.Throwable -> L1f
            r6 = 0
            if (r0 == 0) goto L1a
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f
            long r0 = r7.A00     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 - r0
            r2 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            r7.A01 = r6     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r7)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L22:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.advancedcryptotransport.plugins.connectioncontext.ig.IGConnectionContextProviderPluginSessionless.IGConnectionContextProviderImpl_MEMConnectionContextProviderIsPushTriggered():boolean");
    }
}
