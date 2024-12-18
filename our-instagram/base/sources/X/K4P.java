package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class K4P extends AbstractRunnableC94874Os {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationScope A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4P(Mailbox mailbox, NotificationScope notificationScope) {
        super("delete");
        this.A00 = mailbox;
        this.A01 = notificationScope;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.logoutAndDeleteNative(this.A01);
    }
}
