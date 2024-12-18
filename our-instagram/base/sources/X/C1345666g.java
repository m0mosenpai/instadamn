package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import java.util.List;

/* renamed from: X.66g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1345666g extends MailboxFeature {
    public static AbstractC1345065z A00 = new AbstractC1345065z() { // from class: X.66B
    };

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, Number number, Number number2, Number number3, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, long j, boolean z) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        int A002 = AbstractC1346866s.A00(mailboxFutureImpl);
        TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "runInstagramAttachmentClientSend");
        if (mailboxCallback != null) {
            mailboxFutureImpl.Ecq(mailboxCallback);
        }
        if (!ASj.ELJ(new YBZ(this, mailboxFutureImpl, number, number2, number3, str, str2, str3, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, A002, j, z))) {
            mailboxFutureImpl.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "runInstagramAttachmentClientSend");
        }
        PlatformLogger.platformEventLog(5);
        return mailboxFutureImpl;
    }

    public final void A01(MailboxCallback mailboxCallback) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        int A002 = AbstractC1346866s.A00(mailboxFutureImpl);
        TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "loadInstagramSecureContactList");
        mailboxFutureImpl.Ecq(mailboxCallback);
        if (!ASj.ELJ(new LU4(this, mailboxFutureImpl, A002))) {
            mailboxFutureImpl.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "loadInstagramSecureContactList");
        }
        PlatformLogger.platformEventLog(5);
    }

    public final void A02(MailboxCallback mailboxCallback, Number number, Number number2, String str, String str2, String str3, String str4, String str5, List list, long j, boolean z) {
        InterfaceExecutorC135866Co ASj = this.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        int A002 = AbstractC1346866s.A00(mailboxFutureImpl);
        TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "runInstagramMessageInsertOptimistic");
        if (mailboxCallback != null) {
            mailboxFutureImpl.Ecq(mailboxCallback);
        }
        if (!ASj.ELJ(new YBT(this, mailboxFutureImpl, number, number2, str, str2, str3, str4, str5, list, A002, j, z))) {
            mailboxFutureImpl.cancel(false);
            AbstractC1346866s.A02(A002);
            AbstractC1346866s.A03(A01, "MailboxInstagramSecureMessage", "runInstagramMessageInsertOptimistic");
        }
        PlatformLogger.platformEventLog(5);
    }
}
