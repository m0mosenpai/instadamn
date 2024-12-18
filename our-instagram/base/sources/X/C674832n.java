package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C674832n {
    public final int A00;
    public final long A01;
    public final UserSession A02;
    public final C674932o A03;

    public C674832n(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        C674932o c674932o = new C674932o(userSession);
        this.A03 = c674932o;
        UserSession userSession2 = c674932o.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A01 = ((int) C18U.A01(c06090Tz, userSession2, 36606251077932430L)) * 1000;
        this.A00 = (int) C18U.A01(c06090Tz, userSession2, 36606251079701905L);
    }

    public final void A00() {
        UserSession userSession = this.A03.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36324776102801871L) || C18U.A06(c06090Tz, userSession, 36324776103326162L) || C18U.A06(c06090Tz, userSession, 36324776103260625L)) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(this.A02).A01.ARD();
            ARD.E77(AbstractC111324zv.A00(2235), false);
            ARD.apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r6 > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r6 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r6) < r8.A01) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01() {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r3 = r8.A02
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36324776104636888(0x810d31004331d8, double:3.0352729044808886E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            X.1Ai r0 = X.AbstractC23021Ah.A00(r3)
            X.0xq r3 = r0.A01
            if (r1 == 0) goto L2f
            java.lang.String r0 = "delayed_skip_display_time_stamp"
            r1 = 0
            long r6 = r3.getLong(r0, r1)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
        L21:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            long r2 = r8.A01
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            r0 = 463(0x1cf, float:6.49E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1 = 0
            long r6 = r3.getLong(r0, r1)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2d
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C674832n.A01():boolean");
    }
}
