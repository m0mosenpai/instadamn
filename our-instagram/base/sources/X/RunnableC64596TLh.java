package X;

import com.instagram.direct.notifications.armadillo.service.IgSecureMessageOverWANotificationService;

/* renamed from: X.TLh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64596TLh implements Runnable {
    public final /* synthetic */ IgSecureMessageOverWANotificationService A00;

    public RunnableC64596TLh(IgSecureMessageOverWANotificationService igSecureMessageOverWANotificationService) {
        this.A00 = igSecureMessageOverWANotificationService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgSecureMessageOverWANotificationService igSecureMessageOverWANotificationService = this.A00;
        igSecureMessageOverWANotificationService.A02 = true;
        igSecureMessageOverWANotificationService.stopSelf();
    }
}
