package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43723JVi implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "recipient id is not the same as the user session id";
    }

    public C43723JVi(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        C43732JVr c43732JVr = (C43732JVr) obj;
        AbstractC167017dG.A1N(c43732JVr, userSession);
        return AbstractC31171DnF.A1W(userSession, c43732JVr.A04);
    }
}
