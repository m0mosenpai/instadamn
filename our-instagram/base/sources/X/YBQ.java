package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes12.dex */
public final class YBQ implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C125815mW A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        C73393YBd c73393YBd = new C73393YBd(this, 0);
        String A00 = AbstractC43591JPw.A00(656);
        AbstractC1345065z abstractC1345065z = C125815mW.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, A00, "ActParticipantDeviceChangeShared", c73393YBd);
    }

    public YBQ(C125815mW c125815mW, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j, long j2, boolean z, boolean z2) {
        this.A03 = c125815mW;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = str;
        this.A07 = z;
        this.A06 = z2;
    }
}
