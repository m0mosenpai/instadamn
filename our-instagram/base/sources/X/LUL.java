package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: classes8.dex */
public final class LUL implements MailboxCallback {
    public final /* synthetic */ K3G A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ PrivacyContext A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, false, 0, 1, null, this.A02, "MCAMailboxInstagramPresence", "ReportUserPresenceSetting", JRF.A00(this, 19));
    }

    public LUL(K3G k3g, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, String str, boolean z) {
        this.A00 = k3g;
        this.A01 = mailboxFutureImpl;
        this.A02 = privacyContext;
        this.A03 = str;
        this.A04 = z;
    }
}
