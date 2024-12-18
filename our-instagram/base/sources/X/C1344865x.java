package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.65x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1344865x extends MailboxFeature {
    public static AbstractC1345065z A00 = new AbstractC1345065z() { // from class: X.65y
    };

    public final void A00(MailboxCallback mailboxCallback, String str) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        mailboxFutureImpl.Ecq(mailboxCallback);
        if (!ASj.ELJ(new C44186Jfp(this, mailboxFutureImpl, str))) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public final void A01(MailboxCallback mailboxCallback, String str, boolean z) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        mailboxFutureImpl.Ecq(mailboxCallback);
        if (!ASj.ELJ(new LUD(this, mailboxFutureImpl, str, z))) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public final void A02(String str, boolean z) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        if (!ASj.ELJ(new LUC(this, mailboxFutureImpl, str, z))) {
            mailboxFutureImpl.cancel(false);
        }
    }
}
