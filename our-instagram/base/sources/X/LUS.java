package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: classes8.dex */
public final class LUS implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        MailboxNullable A0J;
        JRF A00;
        String str;
        String str2;
        int i;
        int i2;
        Mailbox mailbox = (Mailbox) obj;
        if (this.A00 != 0) {
            mailboxFutureImpl = (MailboxFutureImpl) this.A03;
            A0J = AbstractC43593JPy.A0J();
            A00 = JRF.A00(this, 38);
            str = "MCAMailboxNotificationEngineInstagramIntegrator";
            str2 = "InsertPushPathNotificationData";
            i = 0;
            i2 = 1;
            AbstractC1345065z abstractC1345065z = K3S.A00;
        } else {
            AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadInstagramSecureThreadKeyFromIgThreadId", this.A01);
            mailboxFutureImpl = (MailboxFutureImpl) this.A03;
            A0J = AbstractC43593JPy.A0J();
            A00 = JRF.A00(this, 33);
            str = "MCAMailboxInstagramSecureMessage";
            str2 = "InstagramSecureThreadKeyFromIgThreadId";
            i = 0;
            AbstractC1345065z abstractC1345065z2 = C1345666g.A00;
            i2 = 0;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i, i2, str, str2, A00);
    }

    public LUS(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A04 = str;
    }
}
