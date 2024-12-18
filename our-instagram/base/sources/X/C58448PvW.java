package X;

/* renamed from: X.PvW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58448PvW {
    public static final C58448PvW A00 = new Object();

    public final void A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        C18950wb.A01.EH8(216072193, AnonymousClass001.A11("IgPushSdkPushDispatcher", ": Push  notifications lost. source=", str, ", reason=", str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: IOException -> 0x00aa, TryCatch #0 {IOException -> 0x00aa, blocks: (B:11:0x001c, B:13:0x0026, B:15:0x002c, B:17:0x0032, B:19:0x003f, B:21:0x0047, B:22:0x0049, B:27:0x006f, B:28:0x0072, B:29:0x0074, B:31:0x007a, B:33:0x0089, B:35:0x0091, B:39:0x005e, B:41:0x0066, B:44:0x0099), top: B:10:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C31200Dnj r9, X.C45127Jxw r10) {
        /*
            r8 = this;
            java.lang.String r2 = r9.A00
            java.lang.String r3 = "FBNS"
            boolean r0 = X.C14360o3.A0K(r2, r3)
            if (r0 == 0) goto L11
            com.instagram.common.notifications.push.intf.PushChannelType r5 = com.instagram.common.notifications.push.intf.PushChannelType.A05
        Lc:
            java.lang.String r1 = r10.A01
            if (r1 == 0) goto Lc0
            goto L1c
        L11:
            java.lang.String r0 = "FCM"
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto Lcc
            com.instagram.common.notifications.push.intf.PushChannelType r5 = com.instagram.common.notifications.push.intf.PushChannelType.A06
            goto Lc
        L1c:
            java.lang.String r0 = X.C3JG.A00(r5)     // Catch: java.io.IOException -> Laa
            X.5Nu r4 = X.C116155Nu.A01(r1, r0)     // Catch: java.io.IOException -> Laa
            if (r4 == 0) goto L2a
            java.lang.String r0 = r4.A0j     // Catch: java.io.IOException -> Laa
            if (r0 != 0) goto L2c
        L2a:
            java.lang.String r0 = ""
        L2c:
            com.instagram.common.session.UserSession r6 = X.AbstractC117345St.A00(r0)     // Catch: java.io.IOException -> Laa
            if (r6 == 0) goto L99
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.io.IOException -> Laa
            r0 = 36321292882289964(0x810a060008252c, double:3.033070100642883E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)     // Catch: java.io.IOException -> Laa
            if (r0 == 0) goto Le6
            java.lang.String r1 = r9.A00     // Catch: java.io.IOException -> Laa
            boolean r0 = X.C14360o3.A0K(r1, r3)     // Catch: java.io.IOException -> Laa
            if (r0 == 0) goto L5e
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.io.IOException -> Laa
        L49:
            r3 = 0
            X.JQZ r7 = X.JQZ.A01     // Catch: java.io.IOException -> Laa
            long r1 = r7.Enf(r0)     // Catch: java.io.IOException -> Laa
            java.lang.String r0 = "IgPushSdkPushDispatcher"
            r7.EWo(r0, r1)     // Catch: java.io.IOException -> Laa
            android.content.Context r0 = X.AbstractC12290kX.A00     // Catch: java.io.IOException -> Laa
            boolean r0 = X.AbstractC14490oL.A09(r0)     // Catch: java.io.IOException -> Laa
            if (r0 != 0) goto L6c
            goto L69
        L5e:
            java.lang.String r0 = "FCM"
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.io.IOException -> Laa
            if (r0 == 0) goto Le6
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.io.IOException -> Laa
            goto L49
        L69:
            if (r4 == 0) goto L74
            goto L6f
        L6c:
            if (r4 == 0) goto L74
            goto L72
        L6f:
            X.AbstractC43602JQi.A00(r4, r1)     // Catch: java.io.IOException -> Laa
        L72:
            java.lang.String r3 = r4.A0N     // Catch: java.io.IOException -> Laa
        L74:
            boolean r0 = X.AbstractC117345St.A01(r6)     // Catch: java.io.IOException -> Laa
            if (r0 == 0) goto L91
            X.0do r0 = X.AbstractC43605JQl.A00     // Catch: java.io.IOException -> Laa
            X.0Tz r2 = X.C06090Tz.A06     // Catch: java.io.IOException -> Laa
            r0 = 36320326514385264(0x81092500042170, double:3.0324589656887E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)     // Catch: java.io.IOException -> Laa
            if (r0 != 0) goto L91
            X.L9c r0 = X.S57.A00(r6)     // Catch: java.io.IOException -> Laa
            r0.A01(r4, r5, r3)     // Catch: java.io.IOException -> Laa
            return
        L91:
            X.1WZ r0 = X.C3J1.A00()     // Catch: java.io.IOException -> Laa
            r0.A08(r4, r5, r3)     // Catch: java.io.IOException -> Laa
            return
        L99:
            java.lang.String r1 = "IgPushSdkPushDispatcher"
            java.lang.String r0 = ": Not dispatching via push sdk dispatcher because no user session found"
            java.lang.String r2 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.io.IOException -> Laa
            X.0wb r1 = X.C18950wb.A01     // Catch: java.io.IOException -> Laa
            r0 = 216072193(0xce10001, float:3.4666741E-31)
            r1.EH8(r0, r2)     // Catch: java.io.IOException -> Laa
            return
        Laa:
            r0 = move-exception
            java.lang.String r2 = "IgPushSdkPushDispatcher"
            java.lang.String r1 = ": Failed to parse IgNotification. "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = X.AnonymousClass001.A0g(r2, r1, r0)
            X.0wb r1 = X.C18950wb.A01
            r0 = 216072193(0xce10001, float:3.4666741E-31)
            r1.EH8(r0, r2)
            return
        Lc0:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "IgPushSdkPushDispatcher"
            r1.append(r0)
            java.lang.String r2 = ": Null notif content data"
            goto Lda
        Lcc:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "IgPushSdkPushDispatcher"
            r1.append(r0)
            java.lang.String r0 = ": Invalid  notif source. "
            r1.append(r0)
        Lda:
            java.lang.String r2 = X.AbstractC166997dE.A0x(r2, r1)
            X.0wb r1 = X.C18950wb.A01
            r0 = 216072193(0xce10001, float:3.4666741E-31)
            r1.EH8(r0, r2)
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58448PvW.A00(X.Dnj, X.Jxw):void");
    }
}
