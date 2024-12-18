package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36359G2l implements InterfaceC37156GYt {
    public final UserSession A00;
    public final E70 A01;

    public C36359G2l(UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = e70;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        List list;
        E70 e70 = this.A01;
        if (e70.A09 == 29) {
            UserSession userSession = this.A00;
            if (!e70.A0E(userSession.userId)) {
                String str = userSession.userId;
                C14360o3.A0B(str, 0);
                C81543kP c81543kP = e70.A0E;
                if (c81543kP != null && (list = c81543kP.A0E) != null && list.contains(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        return AbstractC166987dD.A1J(new C35246Fgf(2131959049));
    }
}
