package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KLO extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLO(UserSession userSession) {
        super(2005773668, 4, false, false);
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A00;
        userSession.A01(C47620L1f.class, new C37056GUm(userSession, 42));
    }
}
