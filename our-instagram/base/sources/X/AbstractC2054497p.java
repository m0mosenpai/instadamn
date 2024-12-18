package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* renamed from: X.97p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2054497p {
    public static final long A00(Context context, long j) {
        String description;
        C0f6 c0f6 = AbstractC106244qe.A00;
        long j2 = 0;
        if (c0f6 != null && Build.VERSION.SDK_INT >= 30) {
            Object systemService = context.getSystemService("activity");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(context.getPackageName(), 0, 0);
            C14360o3.A07(historicalProcessExitReasons);
            for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                if (applicationExitInfo.getTimestamp() <= j) {
                    break;
                }
                if (applicationExitInfo.getRealUid() != applicationExitInfo.getDefiningUid() && applicationExitInfo.getReason() != 13 && applicationExitInfo.getReason() != 10 && ((description = applicationExitInfo.getDescription()) == null || !AbstractC001900j.A0a(description, "isolated not needed", false))) {
                    C0f5 AEp = c0f6.AEp("helium_renderer_crash", 47654222);
                    AEp.ABW("exit_process_name", applicationExitInfo.getProcessName());
                    AEp.ABW("exit_description", applicationExitInfo.getDescription());
                    AEp.ABU(MSV.A00(204), applicationExitInfo.getReason());
                    AEp.ABU("exit_pid", applicationExitInfo.getPid());
                    AEp.ABV("exit_rss", applicationExitInfo.getRss());
                    AEp.ABV("exit_pss", applicationExitInfo.getPss());
                    AEp.ABU("exit_importance", applicationExitInfo.getImportance());
                    AEp.ABU("exit_status", applicationExitInfo.getStatus());
                    AEp.ABV("exit_timestamp", applicationExitInfo.getTimestamp());
                    AEp.report();
                    j2 = applicationExitInfo.getTimestamp();
                }
            }
        }
        return j2;
    }
}
