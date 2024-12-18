package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class CU7 {
    public final UserSession A00;
    public final InterfaceC686036x A01;
    public final C57532kS A02;
    public final C57602kZ A03;

    public final AnonymousClass414 A00(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C1M1 c1m1) {
        String str;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C14360o3.A0B(interfaceC60442pS, 2);
        User A2E = c38321qM.A2E(this.A00);
        if (A2E != null) {
            str = A2E.getUsername();
        } else {
            str = null;
        }
        return new AnonymousClass414(new C51755Mte(new BWE(2, c75113Zb, this, c38321qM, c1m1, interfaceC60442pS), 19), str, c75113Zb.getPosition(), c75113Zb.A03);
    }

    public CU7(UserSession userSession, InterfaceC686036x interfaceC686036x) {
        this.A00 = userSession;
        this.A01 = interfaceC686036x;
        this.A03 = C57602kZ.A00(userSession);
        this.A02 = C57532kS.A00(userSession);
    }
}
