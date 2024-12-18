package X;

/* loaded from: classes8.dex */
public final class LSC implements InterfaceC50417MNt {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public LSC(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        KPU kpu;
        String str;
        String str2;
        int i;
        int i2;
        boolean z = obj instanceof C44826Jt0;
        if (this.A00 != 0) {
            if (z) {
                C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications sending notifications success");
                C44457JlP c44457JlP = (C44457JlP) this.A01;
                boolean z2 = this.A02;
                KPU kpu2 = c44457JlP.A07;
                kpu2.A07("SOURCE", "OTC_RESTORE_WAIT");
                kpu2.A05("OTC_PIN_CODE_API_SEND_SUCCESS");
                Object[] objArr = new Object[0];
                if (z2) {
                    i2 = 2131961788;
                } else {
                    i2 = 2131961790;
                }
                GSS.A02(new C51760Mtj(BHS.A00(objArr, i2), BHS.A00(new Object[0], 2131961789), (Integer) null, 4), c44457JlP, AbstractC141776au.A00(c44457JlP), 6);
                return;
            }
            C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications sending notifications failure");
            kpu = ((C44457JlP) this.A01).A07;
            str = "SOURCE";
            str2 = "OTC_RESTORE_WAIT";
        } else {
            if (z) {
                C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications sending notifications success");
                C44458JlQ c44458JlQ = (C44458JlQ) this.A01;
                boolean z3 = this.A02;
                KPU kpu3 = c44458JlQ.A06;
                kpu3.A07("SOURCE", "OTC_ENTER_PIN");
                kpu3.A05("OTC_PIN_CODE_API_SEND_SUCCESS");
                Object[] objArr2 = new Object[0];
                if (z3) {
                    i = 2131961788;
                } else {
                    i = 2131961790;
                }
                GSS.A02(new C51760Mtj(BHS.A00(objArr2, i), BHS.A00(new Object[0], 2131961789), (Integer) null, 4), c44458JlQ, AbstractC141776au.A00(c44458JlQ), 5);
                return;
            }
            C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications sending notifications failure");
            kpu = ((C44458JlQ) this.A01).A06;
            str = "SOURCE";
            str2 = "OTC_ENTER_PIN";
        }
        kpu.A07(str, str2);
        kpu.A05("OTC_PIN_CODE_API_SEND_FAILED");
    }
}
