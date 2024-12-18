package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7O1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7O1 {
    public C51740MtP A00;
    public final C7O2 A01;
    public final UserSession A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7O2, java.lang.Object] */
    public C7O1(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r5.A01.compare(X.AbstractC12880la.A04(r4.deviceSession.A06()), r3) >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A00(X.C81613kW r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.instagram.common.session.UserSession r4 = r5.A02     // Catch: java.lang.Throwable -> L53
            boolean r0 = X.C6X6.A0U(r6)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L26
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L53
            r0 = 36888542097703729(0x830def00040331, double:3.391800788599801E-306)
        L10:
            java.lang.String r3 = X.C18U.A04(r2, r4, r0)     // Catch: java.lang.Throwable -> L53
            X.C14360o3.A0A(r3)     // Catch: java.lang.Throwable -> L53
            X.MtP r1 = r5.A00     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L2e
            java.lang.String r0 = r1.A00     // Catch: java.lang.Throwable -> L53
            boolean r0 = X.C14360o3.A0K(r0, r3)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L2e
            boolean r2 = r1.A01     // Catch: java.lang.Throwable -> L53
            goto L51
        L26:
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L53
            r0 = 36883233518911986(0x83091b001001f2, double:3.388443621995972E-306)
            goto L10
        L2e:
            r2 = 0
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L47
            X.0vz r0 = r4.deviceSession     // Catch: java.lang.Throwable -> L53
            android.content.Context r0 = r0.A06()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = X.AbstractC12880la.A04(r0)     // Catch: java.lang.Throwable -> L53
            X.7O2 r0 = r5.A01     // Catch: java.lang.Throwable -> L53
            int r0 = r0.compare(r1, r3)     // Catch: java.lang.Throwable -> L53
            if (r0 < 0) goto L48
        L47:
            r2 = 1
        L48:
            r1 = 9
            X.MtP r0 = new X.MtP     // Catch: java.lang.Throwable -> L53
            r0.<init>(r3, r2, r1)     // Catch: java.lang.Throwable -> L53
            r5.A00 = r0     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r5)
            return r2
        L53:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7O1.A00(X.3kW):boolean");
    }
}
