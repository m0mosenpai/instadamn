package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NGF extends AbstractRunnableC14200nk {
    public final /* synthetic */ C62092sA A00;

    @Override // java.lang.Runnable
    public final void run() {
        C62092sA c62092sA = this.A00;
        UserSession userSession = c62092sA.A01;
        AbstractC2044993i.A00(userSession).A09(c62092sA.A00, userSession.userId, false, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGF(C62092sA c62092sA) {
        super(1791138859, 2, true, true);
        this.A00 = c62092sA;
    }
}
