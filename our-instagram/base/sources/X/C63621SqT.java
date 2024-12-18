package X;

import com.fbpay.w3c.security.SecurityProviderEphemeral;

/* renamed from: X.SqT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63621SqT implements InterfaceC58362lv {
    public final /* synthetic */ C58444PvN A00;
    public final /* synthetic */ SNN A01;
    public final /* synthetic */ C49352Or A02;
    public final /* synthetic */ C64202T3r A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C63621SqT(C58444PvN c58444PvN, SNN snn, C49352Or c49352Or, C64202T3r c64202T3r, String str, String str2) {
        this.A00 = c58444PvN;
        this.A03 = c64202T3r;
        this.A01 = snn;
        this.A04 = str;
        this.A02 = c49352Or;
        this.A05 = str2;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        if (C63406Sjd.A0G(c63406Sjd)) {
            this.A00.A03(SSG.A01(new Rk5(this.A03)));
            this.A01.A00();
            return;
        }
        if (!C63406Sjd.A0J(c63406Sjd)) {
            return;
        }
        String str = (String) C63406Sjd.A08(c63406Sjd);
        C64202T3r c64202T3r = this.A03;
        String str2 = this.A04;
        C58444PvN c58444PvN = this.A00;
        SNN snn = this.A01;
        C49352Or c49352Or = this.A02;
        String str3 = this.A05;
        if (snn == null) {
            snn = (SNN) SecurityProviderEphemeral.A00.invoke();
        }
        snn.A01(new C65029TcF(c58444PvN, snn, c49352Or, c64202T3r, str2, "$e2ee", str3, str));
    }
}
