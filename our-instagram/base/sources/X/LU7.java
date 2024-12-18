package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LU7 implements MailboxCallback {
    public final /* synthetic */ C135876Cp A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    public LU7(C135876Cp c135876Cp, NotificationScope notificationScope, String str) {
        this.A00 = c135876Cp;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).getNotificationCenterCallbackManager().F9V(this.A01, this.A02);
    }
}
