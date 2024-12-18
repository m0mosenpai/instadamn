package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Hzt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40635Hzt {
    public static final void A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        String str;
        AbstractC167017dG.A1N(userSession, interfaceC60442pS);
        C14360o3.A0B(c75113Zb, 3);
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AbstractC111324zv.A00(4688));
        c82713mZ.A0G(userSession, c38321qM);
        c82713mZ.A5R = C2Fb.A3F.toString();
        User A14 = AbstractC25226BEj.A14(c38321qM);
        if (A14 != null) {
            str = A14.A03.B4q();
        } else {
            str = null;
        }
        c82713mZ.A4f = str;
        c82713mZ.A54 = AbstractC75103Za.A0A(c75113Zb);
        String A09 = AbstractC75103Za.A09(c38321qM, c75113Zb);
        if (A09 != null) {
            c82713mZ.A5B = A09;
        }
        C32U.A0C(userSession, c82713mZ, c38321qM, interfaceC60442pS, null);
    }
}
