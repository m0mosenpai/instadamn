package com.instagram.direct.securityalert.data;

import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C05A;
import X.C46083Kah;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.room.SecurityAlertDatabase;

/* loaded from: classes8.dex */
public final class SecurityAlertLocalDataSource {
    public final UserSession A00;
    public final C46083Kah A01;
    public final SecurityAlertDatabase A02;
    public final C05A A03;

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 35
            boolean r0 = X.MAT.A03(r9, r3)
            if (r0 == 0) goto L53
            r6 = r9
            X.MAT r6 = (X.MAT) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r0 = r6.A01
            X.1JX r7 = X.C1JX.A02
            int r2 = r6.A00
            r1 = 1
            if (r2 == 0) goto L29
            if (r2 != r1) goto L58
            X.AbstractC09560e7.A00(r0)
        L24:
            if (r0 != 0) goto L28
        L26:
            X.0sl r0 = X.C16930sl.A00
        L28:
            return r0
        L29:
            X.AbstractC09560e7.A00(r0)
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r5 = r8.A00
            com.instagram.user.model.User r0 = r0.A01(r5)
            java.lang.Long r0 = r0.BTC()
            if (r0 == 0) goto L26
            long r3 = r0.longValue()
            r6.A00 = r1
            X.12L r0 = X.C12L.A00
            r2 = 0
            X.0nZ r1 = X.AbstractC25231BEo.A0e(r0)
            X.MBx r0 = new X.MBx
            r0.<init>(r5, r2, r3)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r1, r0)
            if (r0 != r7) goto L24
            return r7
        L53:
            X.MAT r6 = X.MAT.A00(r8, r9, r3)
            goto L16
        L58:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource.A00(X.1Ds):java.lang.Object");
    }

    public SecurityAlertLocalDataSource(UserSession userSession, C46083Kah c46083Kah, SecurityAlertDatabase securityAlertDatabase) {
        AbstractC167027dH.A13(userSession, securityAlertDatabase, c46083Kah);
        this.A00 = userSession;
        this.A02 = securityAlertDatabase;
        this.A01 = c46083Kah;
        this.A03 = AbstractC25225BEi.A1H("");
    }
}
