package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: classes8.dex */
public final class LUK implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K3G A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ PrivacyContext A03;
    public final /* synthetic */ String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, false, 0, 1, null, this.A03, "MCAMailboxInstagramPresence", "ReportAppState", JRF.A00(this, 18));
    }

    public LUK(K3G k3g, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, String str, int i) {
        this.A01 = k3g;
        this.A02 = mailboxFutureImpl;
        this.A03 = privacyContext;
        this.A00 = i;
        this.A04 = str;
    }
}
