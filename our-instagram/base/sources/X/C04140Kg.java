package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.0Kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04140Kg {
    public InterfaceC08830cm A00;
    public C04130Kf A01 = null;
    public boolean A02 = false;
    public final Context A03;

    public final C04130Kf A00(int i) {
        C04130Kf c04130Kf;
        if (this.A02) {
            return this.A01;
        }
        synchronized (this) {
            if (!this.A02) {
                if (Build.VERSION.SDK_INT >= 30) {
                    this.A01 = C04130Kf.A00(this.A03, i);
                    this.A02 = true;
                } else {
                    this.A02 = true;
                    c04130Kf = null;
                }
            }
            c04130Kf = this.A01;
        }
        return c04130Kf;
    }

    public final String A01() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        if (Build.VERSION.SDK_INT >= 30) {
            Context context = this.A03;
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
            if (activityManager != null && (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 16)) != null && !historicalProcessExitReasons.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                    sb.append(applicationExitInfo.getPid());
                    sb.append("::");
                    sb.append(applicationExitInfo.getProcessName());
                    sb.append("::");
                    sb.append(applicationExitInfo.getReason());
                    sb.append("::");
                    sb.append(applicationExitInfo.getTimestamp());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                return sb.toString();
            }
        }
        return null;
    }

    public C04140Kg(Context context, InterfaceC08830cm interfaceC08830cm) {
        this.A03 = context;
        this.A00 = interfaceC08830cm;
    }
}
