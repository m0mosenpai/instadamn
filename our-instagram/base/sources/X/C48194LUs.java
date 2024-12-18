package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48194LUs implements MailboxCallback {
    public final /* synthetic */ K3F A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        MailboxFutureImpl mailboxFutureImpl = this.A02;
        NotificationScope ED9 = ((C124935ky) mailbox.getAccountSession().getNotificationCenterCallbackManager()).ED9(new LVN(mailboxFutureImpl, 33), "MCATaskCompletionNotification", 1);
        mailboxFutureImpl.setNotification("MCATaskCompletionNotification", ED9);
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A01, false, 0, 1, ED9, null, "MCAMailboxInstagramOpenXmaReceiverFetch", "IgdXMADispatchBatchedReceiverFetchBase", JRF.A00(this, 15));
    }

    public C48194LUs(K3F k3f, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = k3f;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A07 = z;
    }
}
