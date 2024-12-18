package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class C09 extends AbstractC63592ug {
    public final C675432t A00;
    public final C63452uS A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09(C675432t c675432t, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, C63452uS c63452uS) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, "inline_clips_viewer_comment_impression")), userSession, null, interfaceC60442pS, interfaceC63482uV, 1008, 0L, false);
        AbstractC167007dF.A1G(c675432t, 1, interfaceC63482uV);
        this.A00 = c675432t;
        this.A01 = c63452uS;
    }

    @Override // X.AbstractC63592ug
    public final String A02() {
        return null;
    }

    @Override // X.AbstractC63592ug
    public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj, Object obj2) {
        List A3n;
        C84923qg c84923qg;
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || (A3n = c38321qM.A3n()) == null || (c84923qg = (C84923qg) AbstractC001800i.A0J(A3n)) == null) {
            return null;
        }
        c84923qg.A01(c120985dq.A02);
        c84923qg.A0N = true;
        return this.A00.A01(c84923qg, true);
    }

    @Override // X.AbstractC63592ug
    public final String A04() {
        return "feed_comment";
    }
}
