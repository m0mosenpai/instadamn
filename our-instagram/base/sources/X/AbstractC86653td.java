package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86653td {
    public static final C9C3 A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(interfaceC60442pS, 3);
        boolean A53 = c38321qM.A53();
        ImageUrl A1S = c38321qM.A1S();
        String id = c38321qM.getId();
        if (id != null) {
            return new C9C3(new C206209Bd(new C9FY(28, c75113Zb, userSession, c38321qM, interfaceC60442pS), new C207179Ew(13, c38321qM, c75113Zb), new C207179Ew(14, c38321qM, c75113Zb), 13), A1S, id, A53);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
