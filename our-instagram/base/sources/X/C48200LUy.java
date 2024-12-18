package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LUy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48200LUy implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ K3M A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A03, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxTamReportingShim", "TamSendImpersonationReportShim", new LVK(this, 8));
    }

    public C48200LUy(MailboxFutureImpl mailboxFutureImpl, K3M k3m, Object obj, String str, String str2, int i, long j, long j2) {
        this.A04 = k3m;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = str;
        this.A05 = obj;
        this.A07 = str2;
    }
}
