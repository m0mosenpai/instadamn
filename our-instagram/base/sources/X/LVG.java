package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.messengerencryptedbackupsmemris.mca.MailboxMessengerEncryptedBackupsMemrisJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LVG implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        Object obj2;
        int i2;
        JRF A00;
        String str;
        String str2;
        Mailbox mailbox2;
        MailboxFutureImpl mailboxFutureImpl2;
        int i3;
        boolean z;
        JRF A002;
        String str3;
        String str4;
        int i4;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                i = 0;
                obj2 = false;
                i2 = 1;
                A00 = JRF.A00(this, 1);
                str = "MCAMailboxAdvancedCryptoTransport";
                str2 = "SecureMessageDeleteICDCAdditionalDevice";
                AbstractC1345065z abstractC1345065z = C125815mW.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, i, i2, str, str2, A00);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                obj2 = AbstractC43593JPy.A0J();
                A00 = JRF.A00(this, 2);
                str = "MCAMailboxAdvancedCryptoTransport";
                str2 = "SecureMessageFetchICDCMetadata";
                i = 0;
                i2 = 1;
                AbstractC1345065z abstractC1345065z2 = C125815mW.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, obj2, i, i2, str, str2, A00);
                return;
            case 2:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z = false;
                A002 = JRF.A00(this, 4);
                str3 = "MCAMailboxAdvancedCryptoTransport";
                str4 = "SecureMessageDeleteICDCMetadata";
                i4 = 1;
                AbstractC1345065z abstractC1345065z3 = C125815mW.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, z, i3, i4, str3, str4, A002);
                return;
            case 3:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z = false;
                A002 = JRF.A00(this, 5);
                str3 = "MCAMailboxAdvancedCryptoTransport";
                str4 = "SecureMessageUpdateICDCAlertTriggerForUser";
                i4 = 1;
                AbstractC1345065z abstractC1345065z32 = C125815mW.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, z, i3, i4, str3, str4, A002);
                return;
            case 4:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z = false;
                A002 = JRF.A00(this, 10);
                str3 = "MCAMailboxCutoverInternal";
                str4 = "CutoverOpenThread";
                i4 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, z, i3, i4, str3, str4, A002);
                return;
            case 5:
                AccountSession accountSession = (AccountSession) obj;
                String A0u = AbstractC43592JPx.A0u(K3X.A00, 0);
                NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 17);
                AbstractC43592JPx.A1P(A01, this.A03, A0u);
                MailboxInstagramMemJNI.dispatchVJOO(16, this.A01, accountSession, A01);
                return;
            case 6:
                AccountSession accountSession2 = (AccountSession) obj;
                String A0u2 = AbstractC43592JPx.A0u(K3Q.A00, 4);
                NotificationScope A012 = LVN.A01(AbstractC43592JPx.A0E(accountSession2), this, A0u2, 26);
                AbstractC43592JPx.A1P(A012, this.A03, A0u2);
                MailboxMessengerEncryptedBackupsDirectJNI.dispatchVIJOO(8, 20, this.A01, accountSession2, A012);
                return;
            case 7:
                AccountSession accountSession3 = (AccountSession) obj;
                String A0u3 = AbstractC43592JPx.A0u(K3R.A00, 2);
                NotificationScope A013 = LVN.A01(AbstractC43592JPx.A0E(accountSession3), this, A0u3, 30);
                AbstractC43592JPx.A1P(A013, this.A03, A0u3);
                MailboxMessengerEncryptedBackupsMemrisJNI.dispatchVJOO(0, this.A01, accountSession3, A013);
                return;
            case 8:
                AccountSession accountSession4 = (AccountSession) obj;
                String A0u4 = AbstractC43592JPx.A0u(K3R.A00, 1);
                NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession4).ED9(new LVN(this, 31), A0u4, 1);
                AbstractC43592JPx.A1P(ED9, this.A03, A0u4);
                MailboxMessengerEncryptedBackupsMemrisJNI.dispatchVJOO(1, this.A01, accountSession4, ED9);
                return;
            case 9:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, AbstractC43593JPy.A0J(), 0, 0, "MCAMailboxProactiveWarningsNonCore", "ProactiveWarningClientThreadReportingContext", JRF.A00(this, 40));
                return;
            case 10:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z = false;
                A002 = JRF.A00(this, 44);
                str3 = "MCAMailboxShim";
                str4 = "SHIMTransportHybridThreadUnmuteMention";
                i4 = 1;
                AbstractC1345065z abstractC1345065z4 = K3Z.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, z, i3, i4, str3, str4, A002);
                return;
            default:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z = false;
                A002 = JRF.A00(this, 45);
                str3 = "MCAMailboxShim";
                str4 = "SHIMTransportHybridThreadMuteMention";
                i4 = 1;
                AbstractC1345065z abstractC1345065z42 = K3Z.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, z, i3, i4, str3, str4, A002);
                return;
        }
    }

    public LVG(long j, Object obj, int i, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    public LVG(C125815mW c125815mW, MailboxFutureImpl mailboxFutureImpl, int i, long j) {
        this.A00 = i;
        this.A02 = c125815mW;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
    }
}
