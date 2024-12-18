package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LUc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48178LUc implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
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
        int i2;
        int i3 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i4 = this.A02;
        switch (i3) {
            case 0:
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateBlockStatus", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                i = 0;
                z = false;
                c73393YBd = new C73393YBd(this, 17);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecureParticipantsUpdateBlockStatus";
                i2 = 1;
                AbstractC1345065z abstractC1345065z = C1345666g.A00;
                break;
            case 1:
                AbstractC1346866s.A04("MailboxInstagramSecureMessage", "runUpdateThreadEphemeralSettings", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                i = 0;
                z = false;
                c73393YBd = new C73393YBd(this, 20);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "UpdateThreadEphemeralSettings";
                i2 = 1;
                AbstractC1345065z abstractC1345065z2 = C1345666g.A00;
                break;
            default:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadUpdateGroupMemberAddMode", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                i = 0;
                z = false;
                c73393YBd = new C73393YBd(this, 23);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadUpdateGroupMemberAddMode";
                i2 = 1;
                AbstractC1345065z abstractC1345065z3 = K3a.A00;
                break;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, i2, str, str2, c73393YBd);
    }

    public C48178LUc(int i, int i2, int i3, long j, Object obj, Object obj2) {
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A05 = obj2;
        this.A01 = i2;
        this.A03 = j;
    }
}
