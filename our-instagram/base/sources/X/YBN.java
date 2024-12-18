package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: classes12.dex */
public final class YBN implements MailboxCallback {
    public final /* synthetic */ C132465yV A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ List A03;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxClientNotifications", "NotPresentedClientNotifications", new C73393YBd(this, 1));
    }

    public YBN(C132465yV c132465yV, MailboxFutureImpl mailboxFutureImpl, Number number, List list) {
        this.A00 = c132465yV;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A03 = list;
    }
}
