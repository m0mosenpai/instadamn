package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LTo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48164LTo implements InterfaceExecutorC135866Co {
    public final InterfaceExecutorC135866Co A00;
    public final C6Ee A01;

    public C48164LTo(InterfaceExecutorC135866Co interfaceExecutorC135866Co, C6Ee c6Ee) {
        C14360o3.A0B(c6Ee, 1);
        this.A01 = c6Ee;
        this.A00 = interfaceExecutorC135866Co;
    }

    @Override // X.InterfaceExecutorC135866Co
    public final boolean ELJ(MailboxCallback mailboxCallback) {
        C14360o3.A0B(mailboxCallback, 0);
        C2OD.A03(new C44244Jgo(3, mailboxCallback, this), this.A01.A02, C1M8.A01);
        return !r2.isCancelled();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C2OD.A03(new C44244Jgo(2, runnable, this), this.A01.A02, C1M8.A01);
    }

    @Override // X.InterfaceExecutorC135866Co
    public final void AGa(NotificationScope notificationScope, String str) {
        AbstractC167017dG.A1N(str, notificationScope);
        this.A00.AGa(notificationScope, str);
    }
}
