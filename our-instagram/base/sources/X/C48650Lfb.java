package X;

import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;

/* renamed from: X.Lfb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48650Lfb implements InterfaceC50453MPh {
    public static final C48650Lfb A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    @Override // X.InterfaceC50453MPh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A8H(com.instagram.common.session.UserSession r10, X.L5O r11, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r12, X.C83403nh r13, X.C7OH r14) {
        /*
            r9 = this;
            r6 = 2
            int r5 = X.AbstractC25230BEn.A07(r6, r13, r12)
            int r1 = r12.addMessageContentCase_
            r0 = 8
            if (r1 != r0) goto L79
            java.lang.Object r4 = r12.addMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.AdminMessage r4 = (com.instagram.direct.armadilloexpress.transportpayload.AdminMessage) r4
        Lf:
            X.C14360o3.A07(r4)
            int r3 = r4.adminMessageSubtypeCase_
            boolean r0 = X.AbstractC43593JPy.A1Y(r3)
            java.lang.String r2 = "need_update"
            if (r0 == 0) goto L71
            r1 = 1
            if (r3 != r1) goto L6e
            java.lang.Object r0 = r4.adminMessageSubtype_
            com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage r0 = (com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage) r0
        L23:
            X.C14360o3.A07(r0)
            int r0 = r0.deviceAdminMessageType_
            if (r0 == 0) goto L6b
            if (r0 == r1) goto L68
            if (r0 == r6) goto L65
            if (r0 != r5) goto L6b
            X.Kei r0 = X.EnumC46312Kei.DEVICE_ADMIN_MESSAGE_TYPE_SECURITY_ALERT_PARTICIPANT_NEW_LOGIN
        L32:
            int r0 = r0.ordinal()
            if (r0 == r6) goto L62
            if (r0 != r5) goto L71
            java.lang.Integer r0 = X.C05F.A1I
        L3c:
            int r0 = r0.intValue()
            int r0 = 9 - r0
            if (r0 == 0) goto L5f
            java.lang.String r1 = "security_alert_key_change"
        L46:
            r0 = 21
            X.Dnj r2 = new X.Dnj
            r2.<init>(r1, r0)
            X.2EY r0 = X.C2EY.A0G
            r4 = 0
            r8 = 0
            java.lang.String r3 = ""
            X.3nw r1 = new X.3nw
            r5 = r4
            r6 = r4
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L5b:
            r13.A18(r0, r1)
            return
        L5f:
            java.lang.String r1 = "security_alert_new_login"
            goto L46
        L62:
            java.lang.Integer r0 = X.C05F.A02
            goto L3c
        L65:
            X.Kei r0 = X.EnumC46312Kei.DEVICE_ADMIN_MESSAGE_TYPE_SECURITY_ALERT_PARTICIPANT_KEY_CHANGE
            goto L32
        L68:
            X.Kei r0 = X.EnumC46312Kei.DEVICE_ADMIN_MESSAGE_TYPE_LOCAL_USER_CHANGED_IDENTITY_KEY_NAMED_DEVICE
            goto L32
        L6b:
            X.Kei r0 = X.EnumC46312Kei.DEVICE_ADMIN_MESSAGE_TYPE_NONE
            goto L32
        L6e:
            com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage r0 = com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage.DEFAULT_INSTANCE
            goto L23
        L71:
            X.2EY r0 = X.C2EY.A1O
            X.570 r1 = new X.570
            r1.<init>(r2)
            goto L5b
        L79:
            com.instagram.direct.armadilloexpress.transportpayload.AdminMessage r4 = com.instagram.direct.armadilloexpress.transportpayload.AdminMessage.DEFAULT_INSTANCE
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48650Lfb.A8H(com.instagram.common.session.UserSession, X.L5O, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent, X.3nh, X.7OH):void");
    }

    @Override // X.InterfaceC50453MPh
    public final boolean FDU(AddMessageContent addMessageContent) {
        C14360o3.A0B(addMessageContent, 0);
        return AbstractC167007dF.A1P(addMessageContent.addMessageContentCase_, 8);
    }
}
