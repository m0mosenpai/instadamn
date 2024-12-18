package X;

import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SO9 {
    public final /* synthetic */ SmartCaptureLogger A00;
    public final /* synthetic */ InterfaceC65374Tj6 A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C6FQ A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ InterfaceC103384lE A05;
    public final /* synthetic */ String A06;

    public SO9(SmartCaptureLogger smartCaptureLogger, InterfaceC65374Tj6 interfaceC65374Tj6, C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, String str) {
        this.A00 = smartCaptureLogger;
        this.A06 = str;
        this.A02 = c6fg;
        this.A05 = interfaceC103384lE;
        this.A03 = c6fq;
        this.A01 = interfaceC65374Tj6;
        this.A04 = interfaceC103384lE2;
    }

    public final void A00() {
        LinkedHashMap A07;
        SmartCaptureLogger smartCaptureLogger = this.A00;
        String str = this.A06;
        C60561R7c c60561R7c = C60561R7c.A01;
        if (str == null) {
            A07 = null;
        } else {
            A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("upload_infra", str));
        }
        smartCaptureLogger.logEvent("upload_failed", A07);
        InterfaceC103384lE interfaceC103384lE = this.A04;
        C131845xK.A00(this.A03, new C6FW(AbstractC166987dD.A1J(this.A02)), interfaceC103384lE);
    }

    public final void A01(Map map) {
        LinkedHashMap A07;
        SmartCaptureLogger smartCaptureLogger = this.A00;
        String str = this.A06;
        C60561R7c c60561R7c = C60561R7c.A01;
        if (str == null) {
            A07 = null;
        } else {
            A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("upload_infra", str));
        }
        smartCaptureLogger.logEvent("upload_success", A07);
        C131845xK.A00(this.A03, new C6FW(AbstractC16960so.A1Q(this.A02, map)), this.A05);
        this.A01.D3C();
    }
}
