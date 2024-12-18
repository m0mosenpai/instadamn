package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class JRT implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession;
        NotificationScope A00;
        int i;
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0J;
        JRF A002;
        String str;
        String str2;
        int i2;
        int i3;
        AccountSession accountSession2;
        NotificationScope A003;
        int i4;
        switch (this.A00) {
            case 0:
                accountSession = (AccountSession) obj;
                AbstractC1346866s.A04("MailboxInstagramReverb", "getNextExpirationTimestamp", this.A01);
                String A0u = AbstractC43592JPx.A0u(K3Y.A00, 7);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 38);
                AbstractC43592JPx.A1P(A00, this.A03, A0u);
                i = 5;
                MailboxInstagramReverbJNI.dispatchVOO(i, accountSession, A00);
                return;
            case 1:
                accountSession = (AccountSession) obj;
                AbstractC1346866s.A04("MailboxInstagramReverb", "purgeDeletedMessages", this.A01);
                String A0u2 = AbstractC43592JPx.A0u(K3Y.A00, 15);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u2, 39);
                AbstractC43592JPx.A1P(A00, this.A03, A0u2);
                i = 6;
                MailboxInstagramReverbJNI.dispatchVOO(i, accountSession, A00);
                return;
            case 2:
                accountSession = (AccountSession) obj;
                AbstractC1346866s.A04("MailboxInstagramReverb", "getNextDeletedMessagePurgeTimestamp", this.A01);
                String A0u3 = AbstractC43592JPx.A0u(K3Y.A00, 6);
                A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u3, 40);
                AbstractC43592JPx.A1P(A00, this.A03, A0u3);
                i = 7;
                MailboxInstagramReverbJNI.dispatchVOO(i, accountSession, A00);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadInstagramSecureCutoverThreadList", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 26);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecureCutoverThreadList";
                i2 = 0;
                AbstractC1345065z abstractC1345065z = C1345666g.A00;
                i3 = 0;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i2, i3, str, str2, A002);
                return;
            case 4:
                mailbox = (Mailbox) obj;
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecurePendingThreadCount", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 31);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecurePendingThreadCount";
                i2 = 0;
                i3 = 1;
                AbstractC1345065z abstractC1345065z2 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i2, i3, str, str2, A002);
                return;
            case 5:
                mailbox = (Mailbox) obj;
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecurePendingThreadUnreadCount", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 32);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecurePendingThreadUnreadCount";
                i2 = 0;
                i3 = 1;
                AbstractC1345065z abstractC1345065z22 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i2, i3, str, str2, A002);
                return;
            case 6:
                accountSession2 = (AccountSession) obj;
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "insertRTCE2eeAdminMessages", this.A01);
                String A0u4 = AbstractC43592JPx.A0u(C1345666g.A00, 11);
                A003 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession2), this, A0u4, 42);
                AbstractC43592JPx.A1P(A003, this.A03, A0u4);
                i4 = 5;
                MailboxInstagramSecureMessageJNI.dispatchVOO(i4, accountSession2, A003);
                return;
            case 7:
                accountSession2 = (AccountSession) obj;
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "insertRTCE2eeXma", this.A01);
                String A0u5 = AbstractC43592JPx.A0u(C1345666g.A00, 13);
                A003 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession2), this, A0u5, 43);
                AbstractC43592JPx.A1P(A003, this.A03, A0u5);
                i4 = 6;
                MailboxInstagramSecureMessageJNI.dispatchVOO(i4, accountSession2, A003);
                return;
            default:
                ACD acd = (ACD) this.A02;
                Execution.executeAsync(new C201798w9(acd, (MailboxCallback) this.A03), acd.A03.A00.A02, 1);
                return;
        }
    }

    public JRT(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }
}
