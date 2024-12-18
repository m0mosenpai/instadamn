package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LUP implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        boolean z;
        JRF A00;
        String str;
        String str2;
        int i2;
        MailboxFutureImpl mailboxFutureImpl2;
        int i3;
        boolean z2;
        PrivacyContext privacyContext;
        JRF A002;
        NotificationScope notificationScope;
        String str3;
        String str4;
        int i4;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                A00 = JRF.A00(this, 0);
                str = "MCAMailboxAdvancedCryptoTransport";
                str2 = "InsertOrReplaceSecureMessageICDCAdditionalDevice";
                i2 = 1;
                AbstractC1345065z abstractC1345065z = C125815mW.A00;
                break;
            case 1:
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z2 = false;
                privacyContext = (PrivacyContext) this.A04;
                A002 = JRF.A00(this, 39);
                notificationScope = null;
                str3 = "MCAMailboxProactiveWarnings";
                str4 = "FetchClientThreadProactiveWarningContactLevelIfNeeded";
                i4 = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, z2, i3, i4, notificationScope, privacyContext, str3, str4, A002);
                return;
            case 2:
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                i = 0;
                z = false;
                A00 = JRF.A00(this, 46);
                str = "MCAMailboxShim";
                str2 = "SHIMTransportHybridAcceptMessageRequest";
                i2 = 1;
                AbstractC1345065z abstractC1345065z2 = K3Z.A00;
                break;
            default:
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                i3 = 0;
                z2 = false;
                privacyContext = (PrivacyContext) this.A04;
                A002 = JRF.A00(this, 49);
                notificationScope = null;
                str3 = "MCAMailboxShim";
                str4 = "SHIMClientHybridThreadRemoveThreadImageOptimistic";
                i4 = 1;
                AbstractC1345065z abstractC1345065z3 = K3Z.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl2, z2, i3, i4, notificationScope, privacyContext, str3, str4, A002);
                return;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, i2, str, str2, A00);
    }

    public LUP(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = j;
        this.A03 = obj3;
    }
}
