package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.M5m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49997M5m implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxCallback A01;
    public final /* synthetic */ UserSession A02;

    public RunnableC49997M5m(MailboxCallback mailboxCallback, UserSession userSession, long j) {
        this.A02 = userSession;
        this.A00 = j;
        this.A01 = mailboxCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A02;
        K3C k3c = ((C47393Kwi) AbstractC41851wZ.A00(userSession).A01(C47393Kwi.class, MHJ.A00(userSession, 5))).A00;
        long j = this.A00;
        MailboxCallback mailboxCallback = this.A01;
        InterfaceExecutorC135866Co ASj = k3c.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, mailboxCallback);
        AbstractC25231BEo.A1C(ASj, new LVG(j, k3c, 4, A0I), A0I);
    }
}
