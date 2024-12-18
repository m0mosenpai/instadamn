package X;

import com.instagram.registration.ui.NotificationBar;

/* loaded from: classes6.dex */
public final class GMU implements Runnable {
    public final /* synthetic */ NotificationBar A00;

    public GMU(NotificationBar notificationBar) {
        this.A00 = notificationBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NotificationBar.A01(this.A00);
    }
}
