package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FWq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34833FWq {
    public static final List A01(UserSession userSession, C41181vS c41181vS) {
        InterfaceC37274GbR A05;
        InterfaceC37274GbR A052;
        C14360o3.A0B(userSession, 1);
        if (!c41181vS.A1I() || (A05 = c41181vS.A05()) == null) {
            return null;
        }
        Reel A0M = ReelStore.A03(userSession).A0M(c41181vS.A0k);
        if (A0M == null) {
            return C16930sl.A00;
        }
        List A0O = A0M.A0O(userSession);
        ArrayList A10 = AbstractC31174DnI.A10(A0O);
        for (Object obj : A0O) {
            C41181vS c41181vS2 = (C41181vS) obj;
            if (c41181vS2.A1I() && c41181vS2.A0b != null && (A052 = c41181vS2.A05()) != null && C14360o3.A0K(A05.BsS(), A052.BsS())) {
                A10.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A10);
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C41181vS) it.next()).A0b;
            C14360o3.A0A(c38321qM);
            A0q.add(c38321qM);
        }
        return A0q;
    }

    public static final int A00(UserSession userSession, C41181vS c41181vS) {
        InterfaceC37274GbR A05;
        Reel A0M;
        InterfaceC37274GbR A052;
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        int i = 0;
        if (!c41181vS.A1I() || (A05 = c41181vS.A05()) == null || (A0M = ReelStore.A03(userSession).A0M(c41181vS.A0k)) == null) {
            return A1Y ? 1 : 0;
        }
        List<C41181vS> A0O = A0M.A0O(userSession);
        C14360o3.A07(A0O);
        if (!(A0O instanceof Collection) || !A0O.isEmpty()) {
            for (C41181vS c41181vS2 : A0O) {
                if (c41181vS2.A1I() && (A052 = c41181vS2.A05()) != null && C14360o3.A0K(A05.BsS(), A052.BsS()) && (i = i + 1) < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
        }
        return i;
    }
}
