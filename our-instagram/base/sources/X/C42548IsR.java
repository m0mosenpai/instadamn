package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IsR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42548IsR implements C5H9 {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ User A03;

    public C42548IsR(C120985dq c120985dq, UserSession userSession, C75113Zb c75113Zb, User user) {
        this.A00 = c120985dq;
        this.A01 = userSession;
        this.A02 = c75113Zb;
        this.A03 = user;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1O(str, c82713mZ);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A01;
            C75113Zb c75113Zb = this.A02;
            User user = this.A03;
            new C5SE(userSession, c38321qM, c75113Zb.A06()).A8X(c82713mZ, interfaceC60442pS, str);
            if (user != null) {
                C11520jB A0B = AbstractC37300Gc1.A0B();
                AbstractC37440GeK.A00(A0B, user);
                c82713mZ.A0E(A0B);
            }
            if (c120985dq.CdW()) {
                c82713mZ.A0K(userSession, c120985dq.A06());
            }
        }
    }
}
