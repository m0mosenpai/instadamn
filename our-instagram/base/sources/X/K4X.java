package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.msys.mca.Mailbox;
import com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator;

/* loaded from: classes8.dex */
public final class K4X extends AbstractRunnableC94874Os {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationEngineInstagramSyncIntegrator A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4X(Mailbox mailbox, NotificationEngineInstagramSyncIntegrator notificationEngineInstagramSyncIntegrator) {
        super("Instagram Integrator Start");
        this.A01 = notificationEngineInstagramSyncIntegrator;
        this.A00 = mailbox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NotificationEngineInstagramSyncIntegrator notificationEngineInstagramSyncIntegrator = this.A01;
        notificationEngineInstagramSyncIntegrator.valueProviderRegister.A00(notificationEngineInstagramSyncIntegrator.valueProvider);
        C47960LGy c47960LGy = MSGNotificationEngineInstagramSyncPathIntegrator.Companion;
        notificationEngineInstagramSyncIntegrator.integrator = new MSGNotificationEngineInstagramSyncPathIntegrator(notificationEngineInstagramSyncIntegrator.valueProvider, this.A00, notificationEngineInstagramSyncIntegrator.notificationEngineInstagramIntegratorCallback, true, AbstractC31178DnM.A1X(C06090Tz.A05, notificationEngineInstagramSyncIntegrator.userSession, 36314841841994602L));
    }
}
