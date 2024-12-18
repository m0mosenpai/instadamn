package X;

import android.content.pm.PackageManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TP4 implements Runnable {
    public final /* synthetic */ AnonymousClass435 A00;
    public final /* synthetic */ C64479TFp A01;

    public TP4(AnonymousClass435 anonymousClass435, C64479TFp c64479TFp) {
        this.A01 = c64479TFp;
        this.A00 = anonymousClass435;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2JS optionalTreeField;
        C2JS optionalTreeField2;
        long j;
        C64479TFp c64479TFp = this.A01;
        C2JS c2js = (C2JS) this.A00.A01;
        if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "ig_on_device_app_history_privacy", C5NY.class, 2076880744)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "data", C5S0.class, -2128759826)) != null && optionalTreeField2.hasFieldValue("is_eligible") && optionalTreeField2.getCoercedBooleanField(0, "is_eligible")) {
            InterfaceC19610xo ARD = c64479TFp.A04.ARD();
            ARD.E7G("last_query_time_in_sec", AbstractC31177DnL.A06());
            ARD.apply();
            Iterator it = AbstractC167007dF.A0m(c64479TFp.A05, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B != null && !AbstractC001900j.A0T(A1B)) {
                    boolean z = false;
                    try {
                        c64479TFp.A00.getPackageManager().getPackageInfo(A1B, 128);
                        z = true;
                    } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c64479TFp.A01, "on_device_app_history_top_spend_apps");
                    if (z) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    if (A0f.isSampled()) {
                        A0f.AAP("package_name", A1B);
                        A0f.A9K("install_status", Long.valueOf(j));
                        A0f.Cht();
                    }
                }
            }
        }
    }
}
