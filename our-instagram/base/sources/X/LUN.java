package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUN implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        Object A0J;
        C73393YBd c73393YBd;
        String str;
        String str2;
        int i;
        int i2;
        int i3 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i4 = this.A01;
        switch (i3) {
            case 0:
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadInstagramVisualMessageActionStatus", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                A0J = AbstractC43593JPy.A0J();
                c73393YBd = new C73393YBd(this, 21);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramVisualMessageActionStatus";
                i = 0;
                AbstractC1345065z abstractC1345065z = C1345666g.A00;
                i2 = 0;
                break;
            case 1:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadDelete", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                A0J = false;
                c73393YBd = new C73393YBd(this, 24);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadDelete";
                i2 = 1;
                AbstractC1345065z abstractC1345065z2 = K3a.A00;
                break;
            default:
                AbstractC1346866s.A04("MailboxTam", "runTamClientVisualMessageScreenshotted", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                A0J = false;
                c73393YBd = new C73393YBd(this, 25);
                str = "MCAMailboxTam";
                str2 = "TamClientVisualMessageScreenshotted";
                i2 = 1;
                AbstractC1345065z abstractC1345065z22 = K3a.A00;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, A0J, i, i2, str, str2, c73393YBd);
    }

    public LUN(int i, int i2, long j, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A02 = j;
    }
}
