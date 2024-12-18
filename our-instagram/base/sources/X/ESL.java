package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ESL extends C1P1 {
    public UserSession A00;
    public User A01;
    public Integer A02;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(942000989);
        int A032 = C0f9.A03(-1284177850);
        Integer num = this.A02;
        if (num == C05F.A0C) {
            throw AbstractC166987dD.A15("onBusinessMegaphoneDismissed");
        }
        if (num == C05F.A05) {
            User user = this.A01;
            Boolean A0a = AbstractC166997dE.A0a();
            user.A03.EeD(A0a);
            user.A03.EeF(A0a);
            UserSession userSession = this.A00;
            user.A0c(userSession);
            AbstractC31172DnG.A1R(userSession, user);
        }
        C0f9.A0A(1865576430, A032);
        C0f9.A0A(306640816, A03);
    }
}
