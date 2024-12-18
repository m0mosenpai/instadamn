package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* renamed from: X.LUo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48190LUo implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        if (this.A00 != 0) {
            String A0u = AbstractC43592JPx.A0u(K3U.A00, 16);
            NotificationScope A00 = C43725JVk.A00(standaloneDatabaseHandle.getSessionedNotificationCenterCallbackManager(), this, A0u, 51);
            AbstractC43592JPx.A1P(A00, this.A02, A0u);
            MailboxSecureConsentFrameworkStandaloneJNI.dispatchVOOOOOO(17, standaloneDatabaseHandle, this.A03, this.A06, this.A04, this.A05, A00);
            return;
        }
        String A0u2 = AbstractC43592JPx.A0u(K3U.A00, 15);
        NotificationScope A002 = C43725JVk.A00(standaloneDatabaseHandle.getSessionedNotificationCenterCallbackManager(), this, A0u2, 49);
        AbstractC43592JPx.A1P(A002, this.A02, A0u2);
        MailboxSecureConsentFrameworkStandaloneJNI.dispatchVOOOOOO(15, standaloneDatabaseHandle, this.A03, this.A06, this.A04, this.A05, A002);
    }

    public C48190LUo(MailboxFutureImpl mailboxFutureImpl, K3U k3u, Boolean bool, Boolean bool2, Boolean bool3, String str, int i) {
        this.A00 = i;
        this.A01 = k3u;
        this.A02 = mailboxFutureImpl;
        this.A03 = bool;
        this.A06 = str;
        this.A04 = bool2;
        this.A05 = bool3;
    }
}
