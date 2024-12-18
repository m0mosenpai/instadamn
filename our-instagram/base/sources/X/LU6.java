package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LU6 implements MailboxCallback {
    public final /* synthetic */ C135856Cn A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    public LU6(C135856Cn c135856Cn, NotificationScope notificationScope, String str) {
        this.A00 = c135856Cn;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).getNotificationCenterCallbackManager().F9V(this.A01, this.A02);
    }
}
