package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.LUx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48199LUx implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ K3a A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxTam", "runTamClientPollUpdate", this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        JRF A00 = JRF.A00(this, 54);
        AbstractC1345065z abstractC1345065z = K3a.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxTam", "TamClientPollUpdate", A00);
    }

    public C48199LUx(MailboxFutureImpl mailboxFutureImpl, K3a k3a, List list, List list2, List list3, int i, long j, long j2) {
        this.A04 = k3a;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = list;
        this.A06 = list2;
        this.A07 = list3;
    }
}
