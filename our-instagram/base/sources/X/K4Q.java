package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class K4Q extends AbstractRunnableC94874Os {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationScope A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4Q(Mailbox mailbox, NotificationScope notificationScope) {
        super("logoutAndEncrypt");
        this.A00 = mailbox;
        this.A01 = notificationScope;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.logoutAndEncryptNative(this.A01);
    }
}
