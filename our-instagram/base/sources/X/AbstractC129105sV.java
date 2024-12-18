package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.direct.notifications.armadillo.service.IgSecureMessageOverWANotificationService;

/* renamed from: X.5sV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129105sV {
    public static volatile long A00 = -1;
    public static final Handler A01 = new Handler(Looper.getMainLooper());
    public static final RealtimeSinceBootClock A02;

    public static final void A00(Context context, C116155Nu c116155Nu) {
        A00 = A02.now();
        Intent putExtra = new Intent(context, (Class<?>) IgSecureMessageOverWANotificationService.class).putExtra("wa_push_id", c116155Nu.A0U).putExtra("push_notif_id", c116155Nu.A12);
        C14360o3.A07(putExtra);
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C12260kU.A00.A07().A0B(context, putExtra);
                return;
            } catch (ForegroundServiceStartNotAllowedException e) {
                C0K8.A0F("IgSecureMessageOverWANotificationServiceLauncher", "Not allowed to run foreground service", e);
                C0f5 AEp = C18950wb.A01.AEp("not_allowed_to_run_foreground_service", 817904991);
                AEp.ABW("thread", Thread.currentThread().getName());
                AEp.ABW("channel", c116155Nu.A0B.A01);
                Integer num = c116155Nu.A0I;
                AEp.ABU("priority", num != null ? num.intValue() : -1);
                AEp.report();
                return;
            }
        }
        C12260kU.A00.A07().A0B(context, putExtra);
    }

    static {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C14360o3.A07(realtimeSinceBootClock);
        A02 = realtimeSinceBootClock;
    }
}
