package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GfJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37501GfJ implements InterfaceC28041Xi {
    public final UserSession A00;

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        if (c38321qM != null && !c38321qM.A66()) {
            UserSession userSession = this.A00;
            if (!C28071Xl.A00(userSession.deviceSession.A06(), userSession).A03(c38321qM.getId())) {
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    C57782kr A00 = C57782kr.A00(userSession);
                    if (!A00.A0L().contains(A2u) && !A00.A04.contains(A2u)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public C37501GfJ(UserSession userSession) {
        this.A00 = userSession;
    }
}
