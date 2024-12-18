package X;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.SXl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62929SXl {
    public final ExecutorService A00 = Executors.newFixedThreadPool(1);

    public static final void A00(Context context, UserSession userSession, Integer num) {
        String[] strArr;
        String str;
        String packageName;
        if (Build.VERSION.SDK_INT >= 34) {
            strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.FOREGROUND_SERVICE_LOCATION"};
        } else {
            strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION"};
        }
        if (AbstractC23451Ch.A08(context, strArr)) {
            if (num == C05F.A00) {
                Object systemService = context.getSystemService("activity");
                C14360o3.A0C(systemService, MSV.A00(236));
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null && (packageName = context.getPackageName()) != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (!packageName.equals(runningAppProcessInfo.processName) || runningAppProcessInfo.importance != 100) {
                        }
                    }
                }
                C18950wb.A01.AEp("DirectLiveLocationServiceLauncher - not in foreground when location service started", 20134884).report();
                return;
            }
            NotificationChannel notificationChannel = new NotificationChannel("ig_location_sharing_channel_id", "ig_location_sharing_channel_name", 3);
            Object systemService2 = context.getSystemService("notification");
            C14360o3.A0C(systemService2, MSV.A00(15));
            ((NotificationManager) systemService2).createNotificationChannel(notificationChannel);
            Intent A08 = MSW.A08(context, DirectLiveLocationService.class);
            if (num.intValue() != 0) {
                str = "STOP_SHARING";
            } else {
                str = "START_SHARING";
            }
            A08.putExtra("action", str);
            A08.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            C06090Tz c06090Tz = C06090Tz.A05;
            A08.putExtra("location_update_time_interval_ms", C18U.A01(c06090Tz, userSession, 36602561700172477L));
            A08.putExtra("location_update_min_distance_meters", C18U.A01(c06090Tz, userSession, 36602561700238014L));
            C12260kU.A00.A07().A0B(context, A08);
        }
    }

    public final void A01(Context context, UserSession userSession, Integer num) {
        this.A00.submit(new RunnableC64710TQr(context, userSession, this, num));
    }
}
