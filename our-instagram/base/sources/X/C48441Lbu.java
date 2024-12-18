package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.Lbu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48441Lbu implements InterfaceC1345866i {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C48441Lbu(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(final C1346766r c1346766r) {
        if (this.A00 != 0) {
            C14360o3.A0B(c1346766r, 0);
            LL3.A03((UserSession) this.A01, ThreadFetchReason.DJANGO_SIDE_EFFECT, new C36453G6d(c1346766r, 1), 20, this.A02, false);
            return;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) this.A01;
        String str = this.A02;
        C137766Ly c137766Ly = C137766Ly.A0L;
        MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.LTr
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                C1346766r c1346766r2 = C1346766r.this;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                Object obj2 = ((MailboxNullable) obj).value;
                if (obj2 != null) {
                    c1346766r2.A02(obj2);
                }
                c1346766r2.A00();
            }
        };
        InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, mailboxCallback);
        AbstractC25231BEo.A1C(ASj, new LUF(mailboxFeature, A0I, str, 6), A0I);
    }
}
