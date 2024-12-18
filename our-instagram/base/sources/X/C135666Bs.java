package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.6Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135666Bs implements InterfaceExecutorC135866Co {
    public final /* synthetic */ C135656Br A00;

    public C135666Bs(C135656Br c135656Br) {
        this.A00 = c135656Br;
    }

    @Override // X.InterfaceExecutorC135866Co
    public final void AGa(NotificationScope notificationScope, String str) {
        Execution.executeAsync(new K4Y(this, notificationScope, str), this.A00.A01, 1);
    }

    @Override // X.InterfaceExecutorC135866Co
    public final boolean ELJ(final MailboxCallback mailboxCallback) {
        int executionContext = Execution.getExecutionContext();
        if (executionContext == 0) {
            executionContext = this.A00.A00;
        }
        Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.6Bw
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("AccountSessionMailboxApiHandleMetaProvider.runWithHandle");
            }

            @Override // java.lang.Runnable
            public final void run() {
                mailboxCallback.onCompletion(C135666Bs.this.A00.A01);
            }
        }, this.A00.A01, executionContext);
        return true;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
