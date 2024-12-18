package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* loaded from: classes12.dex */
public final class YBR implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1345666g A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC111324zv.A00(4845), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        MailboxNullable A0J = AbstractC43593JPy.A0J();
        C73393YBd c73393YBd = new C73393YBd(this, 16);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0J, 0, 0, "MCAMailboxInstagramSecureMessage", "InstagramSecureMessagesForNotifications", c73393YBd);
    }

    public YBR(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, List list, List list2, List list3, List list4, List list5, int i, boolean z) {
        this.A01 = c1345666g;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A07 = list;
        this.A04 = list2;
        this.A06 = list3;
        this.A05 = list4;
        this.A03 = list5;
        this.A08 = z;
    }
}
