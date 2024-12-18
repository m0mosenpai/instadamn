package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3dC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77263dC {
    public final UserSession A00;
    public final InterfaceC63362uJ A01;

    public C77263dC(UserSession userSession, InterfaceC63362uJ interfaceC63362uJ) {
        C14360o3.A0B(interfaceC63362uJ, 2);
        this.A00 = userSession;
        this.A01 = interfaceC63362uJ;
    }

    public final C9C3 A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        String id = c38321qM.getId();
        if (id != null) {
            return new C9C3(new C206259Bi(new C9G2(this, c75113Zb, id, 18), new C9FO(21, this, c38321qM, c75113Zb), new C206849Dp(c75113Zb, 20), C89603z0.A00), c75113Zb, id, c75113Zb.A3D);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
