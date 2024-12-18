package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LE3 {
    public final UserSession A00;

    public LE3(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.InterfaceC37261GbE r13, X.C1OW r14, X.LE3 r15, com.instagram.model.direct.DirectThreadKey r16, java.lang.String r17, boolean r18) {
        /*
            com.instagram.common.session.UserSession r4 = r15.A00
            X.LIp r6 = X.AbstractC46925Kp6.A00(r4)
            r11 = 0
            r12 = 1
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r0 = com.instagram.direct.armadilloexpress.transportpayload.ContentView.DEFAULT_INSTANCE
            X.RXa r5 = r0.A0I()
            X.C14360o3.A07(r5)
            r9 = r14
            boolean r0 = r14 instanceof X.C31701fD
            if (r0 == 0) goto Laa
            X.RYn r1 = X.AbstractC43592JPx.A0K(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.seen_ = r12
            r3 = r9
            X.1fD r3 = (X.C31701fD) r3
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L39
            X.RYn r1 = X.AbstractC43592JPx.A0K(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        L39:
            java.lang.String r2 = r3.A03
        L3b:
            if (r2 == 0) goto L4b
            X.RYn r1 = X.AbstractC43592JPx.A0K(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.objectId_ = r2
        L4b:
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r0 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload.DEFAULT_INSTANCE
            X.RXa r2 = r0.A0I()
            X.K6s r2 = (X.C45385K6s) r2
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r0 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE
            X.RXa r3 = r0.A0I()
            X.K6d r3 = (X.C45370K6d) r3
            X.RYn r1 = X.AbstractC43592JPx.A0K(r3)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r1 = (com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent) r1
            X.RYn r0 = r5.A02()
            r0.getClass()
            r1.supplementMessageContent_ = r0
            r0 = 2
            r1.supplementMessageContentCase_ = r0
            r2.A06(r3)
            java.lang.String r0 = r4.userId
            com.instagram.user.model.User r0 = X.AbstractC31174DnI.A0k(r4, r0)
            if (r0 == 0) goto L85
            java.lang.Long r0 = r0.BTC()
            if (r0 == 0) goto L85
            java.lang.String r0 = X.AbstractC43592JPx.A0y(r0)
            r2.A09(r0)
        L85:
            r0 = r17
            if (r17 == 0) goto L8c
            r2.A07(r0)
        L8c:
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = com.instagram.direct.armadilloexpress.transportpayload.TransportPayload.DEFAULT_INSTANCE
            X.RXa r0 = r0.A0I()
            X.K6q r0 = (X.C45383K6q) r0
            r0.A07(r2)
            if (r18 == 0) goto L9c
            r0.A08(r12)
        L9c:
            X.RYn r7 = X.AbstractC43592JPx.A0L(r0)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r7 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r7
            r8 = r13
            r10 = r16
            r13 = r11
            r6.A03(r7, r8, r9, r10, r11, r12, r13)
            return
        Laa:
            boolean r0 = r14 instanceof X.C33061hU
            if (r0 == 0) goto Lbd
            X.RYn r1 = X.AbstractC43592JPx.A0K(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.screenshotted_ = r12
            goto L4b
        Lbd:
            boolean r0 = r14 instanceof X.C35181kx
            if (r0 == 0) goto L4b
            X.RYn r1 = X.AbstractC43592JPx.A0K(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.replayed_ = r12
            r3 = r9
            X.1kx r3 = (X.C35181kx) r3
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto Le4
            X.RYn r1 = X.AbstractC43592JPx.A0K(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        Le4:
            java.lang.String r2 = r3.A04
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE3.A00(X.GbE, X.1OW, X.LE3, com.instagram.model.direct.DirectThreadKey, java.lang.String, boolean):void");
    }
}
