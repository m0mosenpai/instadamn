package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LUq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48192LUq implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ K3M A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ String A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxTamReportingShim", "TamSendReportShim", new LVK(this, 9));
    }

    public C48192LUq(MailboxFutureImpl mailboxFutureImpl, K3M k3m, Number number, Object obj, String str, long j, long j2) {
        this.A03 = k3m;
        this.A02 = mailboxFutureImpl;
        this.A01 = j;
        this.A00 = j2;
        this.A06 = str;
        this.A04 = number;
        this.A05 = obj;
    }
}
