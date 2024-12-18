package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class ILT {
    public final C37502GfK A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r1.AiJ() != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (X.AbstractC41774Ieq.A06(r4) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC40988IDj A00(X.C38321qM r6) {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r0 = r5.A01
            com.instagram.user.model.UpcomingEvent r4 = r6.A2B(r0)
            if (r4 == 0) goto L7e
            java.lang.String r1 = r0.userId
            java.lang.String r0 = X.AbstractC37303Gc4.A0T(r0, r6)
            boolean r3 = X.C14360o3.A0K(r1, r0)
            com.instagram.user.model.UpcomingEventLiveMetadata r1 = r4.BNx()
            if (r1 == 0) goto L4c
            boolean r0 = X.AbstractC41774Ieq.A08(r4)
            if (r0 == 0) goto L25
            boolean r0 = X.AbstractC41774Ieq.A06(r4)
            r2 = 1
            if (r0 == 0) goto L26
        L25:
            r2 = 0
        L26:
            boolean r0 = X.AbstractC41774Ieq.A06(r4)
            if (r0 == 0) goto L33
            java.lang.String r1 = r1.AiJ()
            r0 = 1
            if (r1 == 0) goto L34
        L33:
            r0 = 0
        L34:
            if (r2 != 0) goto L38
            if (r0 == 0) goto L4c
        L38:
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.AbstractC41774Ieq.A0D(r4, r0)
            if (r0 != 0) goto L4c
            if (r3 == 0) goto L7e
            X.GfK r0 = r5.A00
            X.Hb8 r1 = new X.Hb8
            r1.<init>(r0)
            return r1
        L4c:
            boolean r0 = X.AbstractC41774Ieq.A09(r4)
            if (r0 == 0) goto L66
            boolean r1 = X.AbstractC41774Ieq.A07(r4)
            X.GfK r0 = r5.A00
            if (r1 == 0) goto L60
            X.HbA r1 = new X.HbA
            r1.<init>(r0)
            return r1
        L60:
            X.HbB r1 = new X.HbB
            r1.<init>(r0)
            return r1
        L66:
            if (r3 == 0) goto L70
            X.GfK r0 = r5.A00
            X.Hb6 r1 = new X.Hb6
            r1.<init>(r0)
            return r1
        L70:
            boolean r0 = r4.getReminderEnabled()
            if (r0 != 0) goto L7e
            X.GfK r0 = r5.A00
            X.Hb7 r1 = new X.Hb7
            r1.<init>(r0)
            return r1
        L7e:
            X.GfK r0 = r5.A00
            X.Hb9 r1 = new X.Hb9
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ILT.A00(X.1qM):X.IDj");
    }

    public ILT(UserSession userSession, C37502GfK c37502GfK) {
        this.A01 = userSession;
        this.A00 = c37502GfK;
    }
}
