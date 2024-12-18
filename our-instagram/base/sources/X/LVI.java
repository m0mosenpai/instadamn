package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: classes8.dex */
public final class LVI implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public LVI(K3D k3d, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j) {
        this.A00 = 0;
        this.A03 = k3d;
        this.A04 = mailboxFutureImpl;
        this.A01 = i;
        this.A02 = j;
        this.A05 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        boolean z;
        MailboxFeature.DbConnectionResolutionCallback A00;
        String str;
        String str2;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A04, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxFTS", "MessengerFTSACTQueryMessagesOfAllThreads", JRF.A00(this, 12));
                return;
            case 1:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadSaveDraftMessage", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                A00 = JRF.A00(this, 56);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadSaveDraftMessage";
                break;
            case 2:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadSessionInsert", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                A00 = JRF.A00(this, 57);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadSessionInsert";
                break;
            case 3:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadSessionActivate", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                A00 = JRF.A00(this, 70);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadSessionActivate";
                break;
            case 4:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadSessionDeactivate", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                A00 = new LVK(this, 0);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadSessionDeactivate";
                break;
            case 5:
                AbstractC1346866s.A04("MailboxTam", "runTamClientThreadUpdateName", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                A00 = new LVK(this, 2);
                str = "MCAMailboxTam";
                str2 = "TamClientThreadUpdateName";
                break;
            default:
                AbstractC1346866s.A04("MailboxTam", "mCATamAttachmentManagerResolveContentToken", this.A01);
                String A0u = AbstractC43592JPx.A0u(K3a.A00, 37);
                NotificationScope A002 = C43725JVk.A00((C124935ky) mailbox.getAccountSession().getNotificationCenterCallbackManager(), this, A0u, 54);
                AbstractC43592JPx.A1P(A002, this.A04, A0u);
                MailboxTamJNI.dispatchVIJOOOOZZ(6, 2, this.A02, mailbox, this.A05, null, A002, true, false);
                return;
        }
        AbstractC1345065z abstractC1345065z = K3a.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, 1, str, str2, A00);
    }

    public LVI(MailboxFutureImpl mailboxFutureImpl, K3a k3a, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = k3a;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A05 = str;
    }
}
