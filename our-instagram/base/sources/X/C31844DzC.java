package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DzC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31844DzC extends AbstractC52922bZ implements InterfaceC37136GXx {
    public final C54602fI A00;

    public C31844DzC(C54602fI c54602fI) {
        C14360o3.A0B(c54602fI, 1);
        this.A00 = c54602fI;
    }

    @Override // X.InterfaceC37136GXx
    public final C2GT ADF(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        List BOe = C0BQ.A00(userSession).BOe();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : BOe) {
            AbstractC25228BEl.A1Q(obj, A1E, C14360o3.A0K(obj, A0Y) ? 1 : 0);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            A0q.add(new C31199Dni(21, this.A00.A00(new C54552fC(null, A15.getId())), A15));
        }
        return AbstractC31172DnG.A0E(new M9S((InterfaceC19390xP[]) AbstractC001800i.A0a(A0q).toArray(new InterfaceC19390xP[0]), 15));
    }
}
