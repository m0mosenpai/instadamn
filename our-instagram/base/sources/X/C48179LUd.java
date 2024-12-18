package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.LUd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48179LUd implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        boolean z;
        C73393YBd c73393YBd;
        String str;
        String str2;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        if (i2 != 0) {
            AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsRemove", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            c73393YBd = new C73393YBd(this, 19);
            str = "MCAMailboxInstagramSecureMessage";
            str2 = "InstagramSecureParticipantsRemove";
        } else {
            AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsAdd", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            c73393YBd = new C73393YBd(this, 18);
            str = "MCAMailboxInstagramSecureMessage";
            str2 = "InstagramSecureParticipantsAdd";
        }
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, 1, str, str2, c73393YBd);
    }

    public C48179LUd(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, List list, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = c1345666g;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        this.A02 = j;
        this.A04 = list;
    }
}
