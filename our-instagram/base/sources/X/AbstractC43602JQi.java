package X;

/* renamed from: X.JQi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43602JQi {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r7.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r8.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.notifications.push.intf.PushChannelType r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            X.0f6 r4 = X.C18950wb.A00
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1 = 216072193(0xce10001, float:3.4666741E-31)
            java.lang.String r0 = "notification_received"
            X.0f5 r2 = r4.AEr(r2, r0, r1, r3)
            if (r7 == 0) goto L1d
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_recipient_id"
            r2.ABX(r0, r1)
            if (r8 == 0) goto L2e
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_mi_trace_id"
            r2.ABX(r0, r1)
            if (r5 == 0) goto L73
            java.lang.String r1 = r5.A01
        L3a:
            java.lang.String r0 = "push_channel_type"
            r2.ABW(r0, r1)
            java.lang.String r0 = "usl_logged"
            r2.ABX(r0, r10)
            java.lang.Integer r1 = X.C05F.A00
            if (r6 != r1) goto L49
            r3 = 1
        L49:
            java.lang.String r0 = "qpl_logged"
            r2.ABX(r0, r3)
            java.lang.String r0 = "log_point"
            r2.ABW(r0, r9)
            if (r6 == r1) goto L63
            int r0 = r6.intValue()
            switch(r0) {
                case 0: goto L67;
                case 1: goto L70;
                case 2: goto L6d;
                case 3: goto L6a;
                default: goto L5c;
            }
        L5c:
            java.lang.String r1 = "NONE_IS_IN_APP_PATH"
        L5e:
            java.lang.String r0 = "qpl_failure_reason"
            r2.ABW(r0, r1)
        L63:
            r2.report()
            return
        L67:
            java.lang.String r1 = "SUCCESS"
            goto L5e
        L6a:
            java.lang.String r1 = "FAIL_NO_ONGOING_FLOW"
            goto L5e
        L6d:
            java.lang.String r1 = "FAIL_INVALID_JOURNEY_ID"
            goto L5e
        L70:
            java.lang.String r1 = "FAIL_USING_DROP_FLOW_LOGGER"
            goto L5e
        L73:
            r1 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43602JQi.A01(com.instagram.common.notifications.push.intf.PushChannelType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C116155Nu r3, long r4) {
        /*
            android.content.Context r0 = X.AbstractC12290kX.A00
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC14490oL.A09(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = r3.A0j
            X.MRU r2 = X.JQX.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A0K = r0
            X.5f9 r0 = r3.A0A
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L22
            r2.Ebw(r0, r4)
        L22:
            java.lang.String r0 = r3.A12
            if (r0 == 0) goto L29
            r2.Ebx(r0, r4)
        L29:
            java.lang.String r0 = r3.A0x
            if (r0 == 0) goto L30
            r2.EZ8(r0, r4)
        L30:
            java.lang.String r0 = r3.A0z
            if (r0 == 0) goto L37
            r2.EPq(r0, r4)
        L37:
            java.lang.String r0 = r3.A0j
            if (r0 == 0) goto L3e
            r2.EcB(r0, r4)
        L3e:
            java.lang.String r0 = r3.A11
            java.lang.String r1 = "secure_message_over_wa"
            if (r0 != 0) goto L4d
            java.lang.String r0 = r3.A0X
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
            r0 = r1
        L4d:
            r2.EZj(r0, r4)
        L50:
            java.lang.String r0 = r3.A1G
            if (r0 != 0) goto L58
            java.lang.String r0 = r3.A1F
            if (r0 == 0) goto L5b
        L58:
            r2.ES0(r0, r4)
        L5b:
            X.MOG r0 = r3.A03()
            if (r0 == 0) goto L68
            boolean r0 = r0.CVQ()
            r2.Efm(r4, r0)
        L68:
            java.lang.String r0 = r3.A0u
            if (r0 == 0) goto L79
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            if (r0 == 0) goto L79
            long r0 = r0.longValue()
            r2.EZ7(r4, r0)
        L79:
            java.lang.String r1 = r3.A1G
            if (r1 != 0) goto L7f
            java.lang.String r1 = r3.A1F
        L7f:
            if (r1 != 0) goto L8d
            java.lang.String r0 = r3.A0g
            if (r0 == 0) goto Lb7
            android.net.Uri r0 = X.AbstractC25227BEk.A0B(r0)
            java.lang.String r1 = X.AbstractC43609JQq.A01(r0)
        L8d:
            java.lang.String r0 = r3.A0j
            if (r0 != 0) goto L93
            java.lang.String r0 = ""
        L93:
            com.instagram.common.session.UserSession r0 = X.AbstractC117345St.A00(r0)
            if (r0 == 0) goto Lb6
            if (r1 == 0) goto Lb6
            r2.ES0(r1, r4)
            X.3kb r1 = X.AbstractC43594JPz.A0d(r0, r1)
            if (r1 == 0) goto Lb6
            boolean r0 = r1.CVQ()
            r2.Efm(r4, r0)
            int r0 = r1.C7g()
            java.lang.String r0 = X.C4GR.A00(r0)
            r2.Efl(r0, r4)
        Lb6:
            return
        Lb7:
            r1 = 0
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43602JQi.A00(X.5Nu, long):void");
    }
}
