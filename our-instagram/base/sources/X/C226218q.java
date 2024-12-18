package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.18q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C226218q {
    public static final C226418s A01(C18720vz c18720vz) {
        C14360o3.A0B(c18720vz, 0);
        return (C226418s) c18720vz.A01(C226418s.class, C226318r.A00);
    }

    public static final C09530e4 A02(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = context.getSystemService("activity");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(context.getPackageName(), 0, Integer.MAX_VALUE);
            C14360o3.A07(historicalProcessExitReasons);
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) AbstractC001800i.A0J(historicalProcessExitReasons);
            if (applicationExitInfo != null) {
                switch (applicationExitInfo.getReason()) {
                    case 1:
                        str = "EXIT_SELF";
                        break;
                    case 2:
                        str = "SIGNALED";
                        break;
                    case 3:
                        str = "LOW_MEMORY";
                        break;
                    case 4:
                        str = "APP CRASH(EXCEPTION)";
                        break;
                    case 5:
                        str = "APP CRASH(NATIVE)";
                        break;
                    case 6:
                        str = "ANR";
                        break;
                    case 7:
                        str = "INITIALIZATION FAILURE";
                        break;
                    case 8:
                        str = "PERMISSION CHANGE";
                        break;
                    case 9:
                        str = "EXCESSIVE RESOURCE USAGE";
                        break;
                    case 10:
                        str = "USER REQUESTED";
                        break;
                    case 11:
                        str = "USER STOPPED";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str = "DEPENDENCY DIED";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str = "OTHER KILLS BY SYSTEM";
                        break;
                    case 14:
                        str = "FREEZER";
                        break;
                    case Process.SIGTERM /* 15 */:
                        str = "STATE CHANGE";
                        break;
                    case 16:
                        str = "PACKAGE UPDATED";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                return new C09530e4(str, Long.valueOf(applicationExitInfo.getTimestamp()));
            }
            return null;
        }
        return null;
    }

    public static final C17320tT A00(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C14360o3.A07(defaultSharedPreferences);
        return new C17320tT(defaultSharedPreferences, "AppStartupTracker");
    }
}
