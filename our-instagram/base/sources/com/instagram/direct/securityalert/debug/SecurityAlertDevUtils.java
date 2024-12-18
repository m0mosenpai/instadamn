package com.instagram.direct.securityalert.debug;

import X.AbstractC003100w;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31177DnL;
import X.AbstractC50712Us;
import X.C25978BeS;
import X.C45108Jxc;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class SecurityAlertDevUtils {
    public static int A00 = 100;
    public static final SecurityAlertDevUtils A01 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r9, com.instagram.direct.securityalert.debug.SecurityAlertDevUtils r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 38
            boolean r0 = X.MAF.A01(r11, r3)
            if (r0 == 0) goto L6c
            r5 = r11
            X.MAF r5 = (X.MAF) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto L46
            if (r0 != r1) goto L72
            X.AbstractC09560e7.A00(r2)
        L24:
            java.util.Collection r2 = (java.util.Collection) r2
            X.2Ut r0 = X.AbstractC50712Us.A00
            java.lang.Object r6 = X.AbstractC001800i.A0H(r2, r0)
            if (r6 != 0) goto L45
            int r1 = com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A00
            int r0 = r1 + 1
            com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A00 = r0
            java.lang.String r9 = java.lang.String.valueOf(r1)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = "00 11 22 33 44 55 66 77 88 99 AA BB CC DD EE FF 00 11 22 33 44 55 66 77 88 99 AA BB CC DD EE FF 00"
            java.lang.String r11 = "mock device"
            X.BeS r6 = new X.BeS
            r6.<init>(r7, r9, r10, r11)
        L45:
            return r6
        L46:
            X.AbstractC09560e7.A00(r2)
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            X.Jfl r0 = com.instagram.direct.securityalert.data.SecurityAlertRepository.A04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r4 = r0.A00(r9)
            r5.A01 = r10
            r5.A00 = r1
            X.19L r0 = r4.A01
            X.12W r3 = r0.Arv()
            r2 = 0
            r1 = 41
            X.MCO r0 = new X.MCO
            r0.<init>(r4, r2, r1)
            java.lang.Object r2 = X.AbstractC23641Du.A00(r5, r3, r0)
            if (r2 != r6) goto L24
            return r6
        L6c:
            X.MAF r5 = new X.MAF
            r5.<init>(r10, r11, r3)
            goto L16
        L72:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A02(com.instagram.common.session.UserSession, com.instagram.direct.securityalert.debug.SecurityAlertDevUtils, X.1Ds):java.lang.Object");
    }

    public static final C45108Jxc A00(C25978BeS c25978BeS) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("mock/");
        String A0v = AbstractC166997dE.A0v(UUID.randomUUID(), A1C);
        long currentTimeMillis = System.currentTimeMillis();
        int A03 = AbstractC31177DnL.A03(AbstractC003100w.A0i(c25978BeS.A01));
        AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
        return new C45108Jxc(Double.valueOf(abstractC50712Us.A01(-90.0d, 90.0d)), Double.valueOf(abstractC50712Us.A01(-180.0d, 180.0d)), null, null, A0v, "Menlo Park, CA", "Meta Mock Device", "iOS", 3, 1, A03, currentTimeMillis, false);
    }

    public static final C45108Jxc A01(C25978BeS c25978BeS) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("mock/");
        String A0v = AbstractC166997dE.A0v(UUID.randomUUID(), A1C);
        long currentTimeMillis = System.currentTimeMillis();
        int A03 = AbstractC31177DnL.A03(AbstractC003100w.A0i(c25978BeS.A01));
        AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
        return new C45108Jxc(Double.valueOf(abstractC50712Us.A01(-90.0d, 90.0d)), Double.valueOf(abstractC50712Us.A01(-180.0d, 180.0d)), null, null, A0v, "Menlo Park, CA", "Meta Mock Device", "iOS", 3, 2, A03, currentTimeMillis, false);
    }
}
