package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUF implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession;
        NotificationScope A00;
        String str;
        int i;
        AccountSession accountSession2;
        NotificationScope A002;
        String str2;
        int i2;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Object A0J;
        JRF A003;
        String str3;
        String str4;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                AccountSession accountSession3 = (AccountSession) obj;
                String A0u = AbstractC43592JPx.A0u(C125815mW.A00, 2);
                NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession3), this, A0u, 2);
                AbstractC43592JPx.A1P(A01, this.A02, A0u);
                MailboxAdvancedCryptoTransportJNI.dispatchVOOO(9, accountSession3, this.A03, A01);
                return;
            case 1:
                accountSession = (AccountSession) obj;
                String A0u2 = AbstractC43592JPx.A0u(K3W.A00, 326);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u2, 11);
                AbstractC43592JPx.A1P(A00, this.A02, A0u2);
                str = this.A03;
                i = 34;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, str, A00);
                return;
            case 2:
                accountSession = (AccountSession) obj;
                String A0u3 = AbstractC43592JPx.A0u(K3W.A00, 325);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u3, 12);
                AbstractC43592JPx.A1P(A00, this.A02, A0u3);
                str = this.A03;
                i = 35;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i, accountSession, str, A00);
                return;
            case 3:
                accountSession2 = (AccountSession) obj;
                String A0u4 = AbstractC43592JPx.A0u(K3W.A00, 351);
                A002 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession2), this, A0u4, 13);
                AbstractC43592JPx.A1P(A002, this.A02, A0u4);
                str2 = this.A03;
                i2 = 37;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i2, accountSession2, A002, str2);
                return;
            case 4:
                accountSession2 = (AccountSession) obj;
                String A0u5 = AbstractC43592JPx.A0u(K3W.A00, 328);
                A002 = LVN.A01(AbstractC43592JPx.A0E(accountSession2), this, A0u5, 12);
                AbstractC43592JPx.A1P(A002, this.A02, A0u5);
                str2 = this.A03;
                i2 = 44;
                MailboxEncryptedBackupsJNI.dispatchVOOO(i2, accountSession2, A002, str2);
                return;
            case 5:
                AccountSession accountSession4 = (AccountSession) obj;
                String A0u6 = AbstractC43592JPx.A0u(K3X.A00, 27);
                NotificationScope A012 = LVN.A01(AbstractC43592JPx.A0E(accountSession4), this, A0u6, 15);
                AbstractC43592JPx.A1P(A012, this.A02, A0u6);
                MailboxInstagramMemJNI.dispatchVOOO(8, accountSession4, this.A03, A012);
                return;
            case 6:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                A0J = AbstractC43593JPy.A0J();
                A003 = JRF.A00(this, 20);
                str3 = "MCAMailboxInstagramSearch";
                str4 = "IgSearchResults";
                i3 = 0;
                i4 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i3, i4, str3, str4, A003);
                return;
            case 7:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                i3 = 0;
                A0J = false;
                A003 = JRF.A00(this, 43);
                str3 = "MCAMailboxSecureConsentFramework";
                str4 = "SecureConsentFrameworkUpsertStringValue";
                i4 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i3, i4, str3, str4, A003);
                return;
            default:
                if (AbstractC31177DnL.A1b(obj)) {
                    ((C132065xh) this.A01).A01.A01.put(4, this.A03);
                }
                C1346766r c1346766r = (C1346766r) this.A02;
                c1346766r.A02(obj);
                c1346766r.A00();
                return;
        }
    }

    public LUF(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }
}
