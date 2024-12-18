package com.instagram.notifications.badging.impl;

import X.C54572fF;
import X.C54582fG;
import com.instagram.common.session.UserSession;

/* loaded from: classes2.dex */
public final class BadgingApiImpl {
    public final C54572fF A00;
    public final C54582fG A01;
    public final UserSession A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 41
            boolean r0 = X.C9CY.A00(r8, r3)
            if (r0 == 0) goto L5a
            r6 = r8
            X.9CY r6 = (X.C9CY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L3c
            if (r0 != r4) goto L89
            java.lang.Object r1 = r6.A01
            com.instagram.notifications.badging.impl.BadgingApiImpl r1 = (com.instagram.notifications.badging.impl.BadgingApiImpl) r1
            X.AbstractC09560e7.A00(r2)
        L28:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L60
            X.2fG r1 = r1.A01
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.3Im r0 = (X.C71483Im) r0
            r1.A00(r0)
            java.util.HashMap r0 = r0.A00
            return r0
        L3c:
            X.AbstractC09560e7.A00(r2)
            X.2fF r0 = r7.A00
            com.instagram.common.session.UserSession r1 = r7.A02
            r3 = 0
            java.lang.String r0 = r0.A00
            X.1ON r2 = X.AbstractC71463Ik.A00(r1, r0)
            r6.A01 = r7
            r6.A00 = r4
            r1 = 687(0x2af, float:9.63E-43)
            r0 = 3
            java.lang.Object r2 = r2.A02(r6, r1, r0, r3)
            if (r2 != r5) goto L58
            return r5
        L58:
            r1 = r7
            goto L28
        L5a:
            X.9CY r6 = new X.9CY
            r6.<init>(r7, r8, r3)
            goto L16
        L60:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L83
            X.8jk r2 = (X.C194848jk) r2
            java.lang.Object r1 = r2.A00
            X.5If r1 = (X.AbstractC115105If) r1
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 != 0) goto L7d
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto L77
            X.5Ie r1 = (X.C115095Ie) r1
            java.lang.Throwable r0 = r1.A00
            throw r0
        L77:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L7d:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            r0.<init>()
            throw r0
        L83:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L89:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.badging.impl.BadgingApiImpl.A00(X.1Ds):java.lang.Object");
    }

    public BadgingApiImpl(C54572fF c54572fF, UserSession userSession) {
        this.A00 = c54572fF;
        this.A02 = userSession;
        this.A01 = new C54582fG(userSession);
    }
}
