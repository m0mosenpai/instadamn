package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43722JVh implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "sender is current user";
    }

    public C43722JVh(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        AbstractC167017dG.A1N((C43732JVr) obj, userSession);
        return !AbstractC31171DnF.A1W(userSession, r3.A05);
    }
}
