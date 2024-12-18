package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.91Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91Q implements InterfaceExecutorC135866Co {
    public final /* synthetic */ StandaloneDatabaseHandle A00;
    public final /* synthetic */ C91P A01;

    public C91Q(StandaloneDatabaseHandle standaloneDatabaseHandle, C91P c91p) {
        this.A01 = c91p;
        this.A00 = standaloneDatabaseHandle;
    }

    @Override // X.InterfaceExecutorC135866Co
    public final void AGa(final NotificationScope notificationScope, final String str) {
        Execution.executeAsync(new AbstractRunnableC94874Os() { // from class: X.9au
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("StandaloneDatabaseHandle.cancelNotificationCallback");
            }

            @Override // java.lang.Runnable
            public final void run() {
                C91Q.this.A00.getNotificationCenterCallbackManager().F9V(notificationScope, str);
            }
        }, null, 1);
    }

    @Override // X.InterfaceExecutorC135866Co
    public final boolean ELJ(final MailboxCallback mailboxCallback) {
        int executionContext = Execution.getExecutionContext();
        if (executionContext == 0) {
            executionContext = 1;
        }
        Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.91W
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("StandaloneDatabaseHandle.runWithHandle");
            }

            @Override // java.lang.Runnable
            public final void run() {
                mailboxCallback.onCompletion(this.A00);
            }
        }, null, executionContext);
        return true;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
