package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148126li {
    public final UserSession A00;
    public final InterfaceC60442pS A01;

    public C148126li(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }

    public final void A00(C41181vS c41181vS, Integer num, String str, int i, boolean z) {
        if (c41181vS != null && z) {
            InterfaceC60442pS interfaceC60442pS = this.A01;
            UserSession userSession = this.A00;
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            AbstractC40575Hyv.A00(userSession, c38321qM, interfaceC60442pS, num, str, i);
        }
    }
}
