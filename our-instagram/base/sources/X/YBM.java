package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes12.dex */
public final class YBM implements MailboxCallback {
    public final /* synthetic */ C132465yV A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxClientNotifications", "RemoveClientNotifications", new C73393YBd(this, 2));
    }

    public YBM(C132465yV c132465yV, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = c132465yV;
        this.A01 = mailboxFutureImpl;
    }
}
