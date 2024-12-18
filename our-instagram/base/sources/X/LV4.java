package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* loaded from: classes8.dex */
public final class LV4 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ K3U A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        String A0u = AbstractC43592JPx.A0u(K3U.A00, 9);
        NotificationScope A00 = C43725JVk.A00(standaloneDatabaseHandle.getSessionedNotificationCenterCallbackManager(), this, A0u, 52);
        this.A03.setNotification(A0u, A00);
        MailboxSecureConsentFrameworkStandaloneJNI.dispatchVIIIOOOOOOOO(7, this.A01, this.A00, this.A02, standaloneDatabaseHandle, this.A05, this.A06, this.A07, this.A0A, this.A08, this.A09, A00);
    }

    public LV4(MailboxFutureImpl mailboxFutureImpl, K3U k3u, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, int i, int i2, int i3) {
        this.A04 = k3u;
        this.A03 = mailboxFutureImpl;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A0A = str;
        this.A08 = str2;
        this.A09 = str3;
    }
}
