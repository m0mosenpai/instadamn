package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUQ implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                AbstractC1346866s.A04("MailboxInstagramReverb", "expireMessages", this.A01);
                String A0u = AbstractC43592JPx.A0u(K3Y.A00, 5);
                NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 37);
                AbstractC43592JPx.A1P(A00, this.A04, A0u);
                MailboxInstagramReverbJNI.dispatchVOOO(4, accountSession, this.A03, A00);
                return;
            case 1:
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadInstagramUserCutoverStatusArray", this.A01);
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                MailboxNullable A0J = AbstractC43593JPy.A0J();
                JRF A002 = JRF.A00(this, 36);
                AbstractC1345065z abstractC1345065z = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0J, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramUserCutoverStatusArray", A002);
                return;
            default:
                AbstractC1346866s.A04("MailboxTam", "runTamClientSpamMessageFetch", this.A01);
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                MailboxNullable mailboxNullable = new MailboxNullable(null);
                PrivacyContext privacyContext = (PrivacyContext) this.A04;
                JRF A003 = JRF.A00(this, 65);
                AbstractC1345065z abstractC1345065z2 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl2, mailboxNullable, 0, 1, null, privacyContext, "MCAMailboxTam", "TamClientSpamMessageFetch", A003);
                return;
        }
    }

    public LUQ(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A03 = obj3;
    }
}
