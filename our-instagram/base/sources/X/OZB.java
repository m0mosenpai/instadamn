package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OZB {
    public static final OZB A00 = new Object();

    public static final boolean A00(Context context, UserSession userSession) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        Object systemService = context.getSystemService("notification");
        if ((systemService instanceof NotificationManager) && (notificationManager = (NotificationManager) systemService) != null && (notificationChannel = notificationManager.getNotificationChannel("ig_direct")) != null && notificationChannel.getImportance() == 0) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36325961511220770L);
    }
}
