package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.5zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133255zr extends MailboxFeature {
    public static AbstractC1345065z A00 = new AbstractC1345065z() { // from class: X.66A
    };

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, long j, boolean z) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        if (mailboxCallback != null) {
            mailboxFutureImpl.Ecq(mailboxCallback);
        }
        if (!ASj.ELJ(new C128155qk(this, mailboxFutureImpl, j, z))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }

    public final MailboxFutureImpl A01(MailboxCallback mailboxCallback, String str, String str2, long j) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        if (mailboxCallback != null) {
            mailboxFutureImpl.Ecq(mailboxCallback);
        }
        if (!ASj.ELJ(new C133265zs(this, mailboxFutureImpl, str, str2, j))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
