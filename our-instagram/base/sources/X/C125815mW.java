package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.5mW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125815mW extends MailboxFeature {
    public static AbstractC1345065z A00 = new AbstractC1345065z() { // from class: X.5mX
    };

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, String str, int i, long j, long j2, boolean z, boolean z2) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        mailboxFutureImpl.Ecq(mailboxCallback);
        if (!ASj.ELJ(new YBQ(this, mailboxFutureImpl, str, i, j, j2, z, z2))) {
            mailboxFutureImpl.cancel(false);
        }
        return mailboxFutureImpl;
    }
}
