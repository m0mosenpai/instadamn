package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.shim.mca.MailboxShimJNI;

/* renamed from: X.LUg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48182LUg implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C48182LUg(int i, long j, long j2, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                PrivacyContext privacyContext = (PrivacyContext) this.A04;
                JRF A00 = JRF.A00(this, 48);
                AbstractC1345065z abstractC1345065z = K3Z.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, false, 0, 1, null, privacyContext, "MCAMailboxShim", "SHIMClientHybridThreadUpdateThreadImage", A00);
                return;
            case 1:
                MailboxFutureImpl mailboxFutureImpl2 = (MailboxFutureImpl) this.A04;
                JRF A002 = JRF.A00(this, 51);
                AbstractC1345065z abstractC1345065z2 = K3Z.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridThreadSetTheme", A002);
                return;
            default:
                String A0u = AbstractC43592JPx.A0u(K3Z.A00, 0);
                NotificationScope A01 = LVN.A01((C124935ky) mailbox.getAccountSession().getNotificationCenterCallbackManager(), this, A0u, 38);
                AbstractC43592JPx.A1P(A01, this.A04, A0u);
                MailboxShimJNI.dispatchVJJOOOOZ(0, this.A01, this.A02, mailbox, this.A05, null, A01, true);
                return;
        }
    }
}
