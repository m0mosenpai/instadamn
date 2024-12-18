package X;

/* renamed from: X.Nwi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC54146Nwi {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((android.telephony.TelephonyManager) r0).getCallState() == 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (((android.telecom.TelecomManager) r1).isInCall() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r2 = X.C57548PgM.A01(r5, 4);
        r1 = X.AbstractC31171DnF.A0I(r3);
        r1.A0A(2131976765);
        r1.A09(2131976764);
        r1.A07();
        r1.A04();
        X.DialogInterfaceOnDismissListenerC55324Ogm.A00(r1, r2, 10);
        X.AbstractC166987dD.A1W(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.InterfaceC58177Pqh r5) {
        /*
            com.instagram.rtc.activity.RtcCallIntentHandlerActivity r3 = r5.Bpn()
            r0 = 224(0xe0, float:3.14E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = X.AbstractC23451Ch.A07(r3, r0)
            if (r0 == 0) goto L70
            boolean r0 = X.AbstractC53742Npu.A00()
            if (r0 == 0) goto L5e
            com.instagram.common.session.UserSession r4 = r5.CE4()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326249274226456(0x810e8800033718, double:3.036204542861309E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L5e
            java.lang.String r0 = "telecom"
            java.lang.Object r1 = r3.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.telecom.TelecomManager"
            X.C14360o3.A0C(r1, r0)
            android.telecom.TelecomManager r1 = (android.telecom.TelecomManager) r1
            boolean r0 = r1.isInCall()
            if (r0 == 0) goto L70
        L3a:
            r0 = 4
            X.PgM r2 = X.C57548PgM.A01(r5, r0)
            X.8hC r1 = X.AbstractC31171DnF.A0I(r3)
            r0 = 2131976765(0x7f13623d, float:1.959066E38)
            r1.A0A(r0)
            r0 = 2131976764(0x7f13623c, float:1.9590658E38)
            r1.A09(r0)
            r1.A07()
            r1.A04()
            r0 = 10
            X.DialogInterfaceOnDismissListenerC55324Ogm.A00(r1, r2, r0)
            X.AbstractC166987dD.A1W(r1)
            return
        L5e:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r3.getSystemService(r0)
            if (r0 == 0) goto L70
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r1 = r0.getCallState()
            r0 = 2
            if (r1 != r0) goto L70
            goto L3a
        L70:
            r5.EoJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54146Nwi.A00(X.Pqh):void");
    }
}
