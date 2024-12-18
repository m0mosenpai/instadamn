package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes10.dex */
public final class TQQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Notification A02;
    public final /* synthetic */ SystemForegroundService A03;

    public TQQ(final Notification this$0, final SystemForegroundService val$notificationId, final int val$notification, final int val$notificationType) {
        this.A03 = val$notificationId;
        this.A00 = val$notification;
        this.A02 = this$0;
        this.A01 = val$notificationType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            AbstractC61648RrK.A00(this.A02, this.A03, this.A00, this.A01);
            return;
        }
        SystemForegroundService systemForegroundService = this.A03;
        int i2 = this.A00;
        Notification notification = this.A02;
        if (i >= 29) {
            AbstractC61647RrJ.A00(notification, systemForegroundService, i2, this.A01);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
