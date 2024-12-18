package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUH implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ K3M A02;
    public final /* synthetic */ String A03;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxTamReportingShim", "TamQueryReportShim", new LVK(this, 7));
    }

    public LUH(MailboxFutureImpl mailboxFutureImpl, K3M k3m, String str, long j) {
        this.A02 = k3m;
        this.A01 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
    }
}
