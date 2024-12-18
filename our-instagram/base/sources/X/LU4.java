package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: classes8.dex */
public final class LU4 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1345666g A01;
    public final /* synthetic */ MailboxFutureImpl A02;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC111324zv.A00(4843), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0J = AbstractC43593JPy.A0J();
        JRF A00 = JRF.A00(this, 21);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0J, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramSecureContactList", A00);
    }

    public LU4(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, int i) {
        this.A01 = c1345666g;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
    }
}
