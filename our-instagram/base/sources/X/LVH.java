package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.instagramportabledb.mca.MailboxInstagramPortableDBJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* loaded from: classes8.dex */
public final class LVH implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A0u = AbstractC43592JPx.A0u(K3W.A00, 352);
                NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 15);
                AbstractC43592JPx.A1P(A00, this.A03, A0u);
                MailboxEncryptedBackupsJNI.dispatchVOOOO(46, accountSession, this.A02, this.A04, A00);
                return;
            case 1:
                AccountSession accountSession2 = (AccountSession) obj;
                String A0u2 = AbstractC43592JPx.A0u(K3O.A00, 2);
                NotificationScope A002 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession2), this, A0u2, 29);
                AbstractC43592JPx.A1P(A002, this.A03, A0u2);
                MailboxInstagramPortableDBJNI.dispatchVOOOO(0, accountSession2, this.A04, this.A02, A002);
                return;
            case 2:
                AccountSession accountSession3 = (AccountSession) obj;
                String A0u3 = AbstractC43592JPx.A0u(K3T.A00, 3);
                NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession3), this, A0u3, 36);
                AbstractC43592JPx.A1P(A01, this.A03, A0u3);
                MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOO(2, accountSession3, this.A02, this.A04, null, A01);
                return;
            default:
                MailboxSecureAuthPlatformPakeJNI.dispatchVIOOO(5, 0, obj, this.A02, this.A04);
                ((MailboxObservableImpl) this.A03).setResult(null);
                return;
        }
    }

    public LVH(MailboxFutureImpl mailboxFutureImpl, K3T k3t, Number number, String str, int i) {
        this.A00 = i;
        this.A01 = k3t;
        if (2 - i != 0) {
            this.A02 = number;
            this.A04 = str;
            this.A03 = mailboxFutureImpl;
        } else {
            this.A03 = mailboxFutureImpl;
            this.A02 = number;
            this.A04 = str;
        }
    }

    public LVH(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = str;
    }
}
