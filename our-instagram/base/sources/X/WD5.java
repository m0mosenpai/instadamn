package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class WD5 {
    public static final AtomicBoolean A07 = AbstractC166997dE.A17();
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final QuickPerformanceLogger A04;
    public final InterfaceC02550Ad A05;
    public final C38686GzR A06;

    public static final void A00(VHi vHi, WD5 wd5, Long l, String str, String str2) {
        String str3;
        InterfaceC02590Ai A0H = MSY.A0H(wd5.A05, "application_direct_install_event");
        if (A0H.isSampled()) {
            C38686GzR c38686GzR = wd5.A06;
            A0H.AAP("oxygen_app_manager_id", c38686GzR.A02);
            A0H.A9K("oxygen_update_id", null);
            A0H.AAP("event", str);
            A0H.AAP("uri_intent", c38686GzR.A04);
            A0H.A9K("mai_app_id", (Long) c38686GzR.A00);
            A0H.A8R(vHi, "error_reason");
            A0H.AAP("error_code_oem", str2);
            A0H.AAP(AbstractC58317Pt9.A00(97), null);
            A0H.A9K("download_progress", l);
            A0H.A9K("dso_id", (Long) c38686GzR.A01);
            A0H.AAP("tracking_token", c38686GzR.A03);
            A0H.AAP("fbrpc_url", null);
            A0H.AAP("oem_response_id", wd5.A01);
            A0H.AAP("oem_request_id", wd5.A00);
            A0H.A9M("oxygen_eligibility_data", null);
            A0H.Cht();
        }
        if (str.equals("RUNNING_DOWNLOAD")) {
            if (!wd5.A03) {
                wd5.A03 = true;
            } else {
                return;
            }
        }
        if (str.equals("PAUSED_DOWNLOAD")) {
            if (!wd5.A02) {
                wd5.A02 = true;
            } else {
                return;
            }
        }
        if (str.equals("DOWNLOAD_BUTTON_CLICKED")) {
            wd5.A03 = false;
            wd5.A02 = false;
        }
        QuickPerformanceLogger quickPerformanceLogger = wd5.A04;
        quickPerformanceLogger.markerPoint(279584123, 0, str);
        C38686GzR c38686GzR2 = wd5.A06;
        Number number = (Number) c38686GzR2.A00;
        if (number != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "mai_app_id", number.longValue());
        }
        String str4 = c38686GzR2.A04;
        if (str4 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "uri_intent", str4);
        }
        if (vHi != null) {
            str3 = vHi.A00;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "error_reason", str3);
        }
        if (str2 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "error_reason_extra", str2);
        }
        if (l != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "download_progress", l.longValue());
        }
        Number number2 = (Number) c38686GzR2.A01;
        if (number2 != null) {
            quickPerformanceLogger.markerAnnotate(279584123, 0, "dso_id", number2.longValue());
        }
    }

    public final void A01(String str) {
        A00(null, this, null, str, null);
    }

    public WD5(InterfaceC02550Ad interfaceC02550Ad, C38686GzR c38686GzR, QuickPerformanceLogger quickPerformanceLogger) {
        this.A05 = interfaceC02550Ad;
        this.A06 = c38686GzR;
        this.A04 = quickPerformanceLogger;
    }
}
