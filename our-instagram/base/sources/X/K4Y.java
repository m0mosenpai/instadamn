package X;

import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class K4Y extends AbstractRunnableC94874Os {
    public final /* synthetic */ C135666Bs A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4Y(C135666Bs c135666Bs, NotificationScope notificationScope, String str) {
        super("AccountSessionMailboxApiHandleMetaProvider.cancelNotificationCallback");
        this.A00 = c135666Bs;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.A01.getNotificationCenterCallbackManager().F9V(this.A01, this.A02);
    }
}
