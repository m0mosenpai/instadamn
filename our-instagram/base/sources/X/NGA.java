package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NGA extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGA(UserSession userSession) {
        super(1588914900, 2, false, true);
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1BD c1bd = C1BD.A00;
        UserSession userSession = this.A00;
        if (userSession != null) {
            c1bd.A00(userSession);
        }
    }
}
