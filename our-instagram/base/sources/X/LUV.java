package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: classes8.dex */
public final class LUV implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ K3Z A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        LEE lee = new LEE(null, null);
        C73393YBd c73393YBd = new C73393YBd(this, 22);
        AbstractC1345065z abstractC1345065z = K3Z.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, lee, 0, 1, "MCAMailboxShim", "SHIMThreadsCalculateTransportKey", c73393YBd);
    }

    public LUV(MailboxFutureImpl mailboxFutureImpl, K3Z k3z, List list, List list2, boolean z) {
        this.A01 = k3z;
        this.A00 = mailboxFutureImpl;
        this.A03 = list;
        this.A02 = list2;
        this.A04 = z;
    }
}
