package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Map;

/* renamed from: X.5tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129575tM extends MailboxFeature {
    public static AbstractC1345065z A00 = new C45298K3b();

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, Map map) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        mailboxFutureImpl.Ecq(mailboxCallback);
        if (!ASj.ELJ(new LU3(this, mailboxFutureImpl, map))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
