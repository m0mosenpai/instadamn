package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTq {
    public final UserSession A00;
    public final InterfaceC19630xq A01;

    public CTq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C1AT.A01(userSession).A03(C1AV.A0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if ((r6 - r4.getLong("KEY_FIRST_NUDGE_TIMESTAMP_MS", 0)) <= r8) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A00(X.C120985dq r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r5 = 0
            boolean r0 = r11.CdW()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L4e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L50
            com.instagram.common.session.UserSession r3 = r10.A00     // Catch: java.lang.Throwable -> L50
            X.0Tz r2 = X.C06090Tz.A06     // Catch: java.lang.Throwable -> L50
            r0 = 36598992585756018(0x82069700360d72, double:3.208688511321768E-306)
            long r0 = X.C18U.A01(r2, r3, r0)     // Catch: java.lang.Throwable -> L50
            long r8 = r4.toMillis(r0)     // Catch: java.lang.Throwable -> L50
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L50
            r0 = 36598992585690481(0x82069700350d71, double:3.208688511280322E-306)
            int r1 = X.AbstractC25225BEi.A07(r2, r3, r0)     // Catch: java.lang.Throwable -> L50
            X.0xq r4 = r10.A01     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "KEY_NUDGE_SHOWN_COUNT"
            int r0 = r4.getInt(r0, r5)     // Catch: java.lang.Throwable -> L50
            boolean r3 = X.AbstractC167007dF.A1Q(r0, r1)
            java.lang.String r2 = "KEY_FIRST_NUDGE_TIMESTAMP_MS"
            boolean r0 = r4.contains(r2)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L48
            r0 = 0
            long r0 = r4.getLong(r2, r0)     // Catch: java.lang.Throwable -> L50
            long r6 = r6 - r0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L49
        L48:
            r0 = 0
        L49:
            if (r3 != 0) goto L4d
            if (r0 == 0) goto L4e
        L4d:
            r5 = 1
        L4e:
            monitor-exit(r10)
            return r5
        L50:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CTq.A00(X.5dq):boolean");
    }
}
