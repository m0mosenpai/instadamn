package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.NotificationCenter;

/* loaded from: classes8.dex */
public final class K4V extends AbstractRunnableC94874Os {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ C48524LdM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4V(Mailbox mailbox, C48524LdM c48524LdM) {
        super("Integrator Start");
        this.A01 = c48524LdM;
        this.A00 = mailbox;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Database database;
        C48524LdM c48524LdM = this.A01;
        C47659L2s c47659L2s = c48524LdM.A03;
        MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider = c48524LdM.A00;
        C14360o3.A0B(mSGNotificationEngineValueProvider, 0);
        NotificationEngineValueType notificationEngineValueType = NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
        mSGNotificationEngineValueProvider.registerGetter("isNotificationMuted", notificationEngineValueType, new C48153LTc(c47659L2s));
        mSGNotificationEngineValueProvider.registerSetter("suppressNotification", notificationEngineValueType, C48161LTk.A00);
        mSGNotificationEngineValueProvider.registerGetter("context.enableEngineAnnotation", notificationEngineValueType, new C48154LTd(c47659L2s));
        mSGNotificationEngineValueProvider.registerSetter("handleNotificationUnsend", NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_STRING, c47659L2s.A02);
        LAX lax = MSGNotificationEngineIntegrator.Companion;
        Mailbox mailbox = this.A00;
        NotificationCenter notificationCenter = mailbox.getSlimMailbox().getNotificationCenter();
        if (notificationCenter != null) {
            synchronized (mailbox) {
                database = mailbox.mDatabase;
                String A00 = AbstractC111324zv.A00(4856);
                if (database == null) {
                    throw AbstractC166987dD.A15(A00);
                }
            }
            DatabaseConnection databaseConnection = database.mReadWriteConnection;
            if (databaseConnection != null) {
                K38 k38 = c48524LdM.A02;
                C14360o3.A0B(k38, 5);
                ?? obj = new Object();
                obj.mNativeHolder = MSGNotificationEngineIntegrator.initNativeHolder(mSGNotificationEngineValueProvider, notificationCenter, databaseConnection, mailbox, k38);
                c48524LdM.integrator = obj;
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
