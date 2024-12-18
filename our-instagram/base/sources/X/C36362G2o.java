package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.G2o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36362G2o implements InterfaceC37156GYt {
    public final UserSession A00;
    public final C34641FNy A01;
    public final E70 A02;

    public C36362G2o(UserSession userSession, C34641FNy c34641FNy, E70 e70) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = e70;
        this.A01 = c34641FNy;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        C34641FNy c34641FNy = this.A01;
        int i = this.A02.A09;
        if (i == 28 || i == 61) {
            if (C18U.A06(C06090Tz.A05, c34641FNy.A05, 36320274974712041L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        java.util.Set set = this.A01.A07;
        if (AbstractC31171DnF.A1b(set)) {
            C31335Dq0.A03(A1E, 2131960112);
            C35246Fgf.A02(A1E, 2131960113);
            A1E.addAll(set);
        }
        return A1E;
    }
}
