package X;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import java.net.URLEncoder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes11.dex */
public final class W4R {
    public final C1QT A00;
    public final UserSession A01;
    public final Context A02;
    public final ExecutorService A03;
    public final ExecutorService A04;

    public final void A01(String str, Long l) {
        C1QT c1qt = this.A00;
        long generateNewFlowId = c1qt.generateNewFlowId(635764737);
        c1qt.flowStart(generateNewFlowId, new UserFlowConfig("MeasurementManagerUtil", false));
        if (str != null) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36324896359461455L)) {
                if (Build.VERSION.SDK_INT < 31) {
                    c1qt.flowMarkPoint(generateNewFlowId, "NOT_PASS_LOWEST_VERSION_CHECK");
                } else {
                    try {
                        Class.forName("android.adservices.measurement.MeasurementManager");
                        c1qt.flowMarkPoint(generateNewFlowId, "DEVICE_ELIGIBLE");
                        this.A03.execute(new RunnableC71603Wwz(this, l, str, generateNewFlowId));
                        return;
                    } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                        c1qt.flowMarkPoint(generateNewFlowId, "DEVICE_INELIGIBLE");
                    }
                }
            }
        }
        c1qt.flowEndFail(generateNewFlowId, "CLICK_REGISTRATION_FAILED", null);
    }

    public static final void A00(InputEvent inputEvent, W4R w4r, Long l, String str, long j) {
        C1QT c1qt;
        String message;
        String str2;
        long j2;
        String encode = URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING);
        try {
            Context context = w4r.A02;
            MeasurementManager measurementManager = (MeasurementManager) context.getApplicationContext().getSystemService(MeasurementManager.class);
            if (measurementManager == null && (measurementManager = MeasurementManager.get(context.getApplicationContext())) == null) {
                w4r.A00.flowEndFail(j, "MEASUREMENT_MANAGER_NULL", null);
                return;
            }
            C70219WIc c70219WIc = new C70219WIc(w4r, j);
            StringBuilder sb = new StringBuilder();
            sb.append("https://www.facebook.com/privacy_sandbox/mobile/register/source?tracking_token=");
            sb.append(encode);
            sb.append("&event_time=");
            if (l == null) {
                j2 = -1;
            } else {
                j2 = l.longValue();
            }
            sb.append(j2);
            measurementManager.registerSource(AbstractC08820cl.A03(AbstractC166997dE.A0x("&platform=ig", sb)), inputEvent, w4r.A04, c70219WIc);
        } catch (Exception e) {
            c1qt = w4r.A00;
            message = e.getMessage();
            str2 = "REGISTRATION_INTERNAL_EXCEPTION";
            c1qt.flowEndFail(j, str2, message);
        } catch (NoClassDefFoundError e2) {
            c1qt = w4r.A00;
            message = e2.getMessage();
            str2 = "REGISTRATION_NO_CLASS_FOUND";
            c1qt.flowEndFail(j, str2, message);
        } catch (NoSuchMethodError e3) {
            c1qt = w4r.A00;
            message = e3.getMessage();
            str2 = "REGISTRATION_NO_METHOD_FOUND";
            c1qt.flowEndFail(j, str2, message);
        }
    }

    public W4R(UserSession userSession, Context context) {
        AbstractC167017dG.A1P(userSession, context);
        this.A01 = userSession;
        this.A02 = context;
        this.A00 = C1QS.A00(userSession);
        this.A04 = Executors.newSingleThreadExecutor();
        this.A03 = Executors.newSingleThreadExecutor();
    }
}
