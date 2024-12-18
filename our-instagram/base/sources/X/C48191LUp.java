package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* renamed from: X.LUp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48191LUp implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        if (this.A00 != 0) {
            String A0u = AbstractC43592JPx.A0u(K3T.A00, 6);
            NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 47);
            AbstractC43592JPx.A1P(A00, this.A03, A0u);
            MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOOOO(4, accountSession, this.A02, this.A04, this.A06, this.A05, null, A00);
            return;
        }
        String A0u2 = AbstractC43592JPx.A0u(K3W.A00, 322);
        NotificationScope A002 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u2, 6);
        AbstractC43592JPx.A1P(A002, this.A02, A0u2);
        MailboxEncryptedBackupsJNI.dispatchVOOOOOO(23, accountSession, this.A06, this.A05, this.A04, this.A03, A002);
    }

    public C48191LUp(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = obj3;
        this.A03 = obj4;
    }
}
