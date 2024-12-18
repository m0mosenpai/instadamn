package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.8w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201798w9 extends AbstractRunnableC94874Os {
    public final /* synthetic */ ACD A00;
    public final /* synthetic */ MailboxCallback A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C201798w9(ACD acd, MailboxCallback mailboxCallback) {
        super("LazyMessageSyncService.cleanUp");
        this.A00 = acd;
        this.A01 = mailboxCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final NotificationScope notificationScope = new NotificationScope();
        ACD acd = this.A00;
        SessionedNotificationCenter sessionedNotificationCenter = acd.A03.A00.A02.getSessionedNotificationCenter();
        sessionedNotificationCenter.addObserver(new C23377AYb(this, sessionedNotificationCenter), AbstractC111324zv.A00(654), 1, notificationScope);
        final MessageSyncService messageSyncService = acd.A01;
        messageSyncService.getClass();
        Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.8wB
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("shutdown");
            }

            @Override // java.lang.Runnable
            public final void run() {
                MessageSyncService.this.shutdownNative(notificationScope);
            }
        }, messageSyncService.mAccountSession, 1);
    }
}
