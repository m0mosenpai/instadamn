package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* loaded from: classes8.dex */
public final class LUU implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ K3U A03;
    public final /* synthetic */ String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        String A0u = AbstractC43592JPx.A0u(K3U.A00, 17);
        NotificationScope A00 = C43725JVk.A00(standaloneDatabaseHandle.getSessionedNotificationCenterCallbackManager(), this, A0u, 50);
        this.A02.setNotification(A0u, A00);
        MailboxSecureConsentFrameworkStandaloneJNI.dispatchVIIOOO(16, this.A00, this.A01, standaloneDatabaseHandle, this.A04, A00);
    }

    public LUU(MailboxFutureImpl mailboxFutureImpl, K3U k3u, String str, int i, int i2) {
        this.A03 = k3u;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
    }
}
