package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kk8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46631Kk8 {
    public static final C5Hc A00(UserSession userSession, C38321qM c38321qM, boolean z, boolean z2, boolean z3) {
        if (c38321qM.A5M()) {
            List AmB = c38321qM.A0C.AmB();
            if (AmB == null) {
                return null;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                InterfaceC132185xw A00 = InterfaceC132185xw.A00.A00(userSession, (C38321qM) it.next(), null, z, false, false, false);
                if (A00 != null) {
                    A1E.add(A00);
                }
            }
            return AbstractC133095zb.A00(A1E);
        }
        InterfaceC132185xw A002 = InterfaceC132185xw.A00.A00(userSession, c38321qM, null, z, z2, z3, C18U.A06(C06090Tz.A05, userSession, 36327602189056734L));
        if (A002 == null) {
            return null;
        }
        return AbstractC133095zb.A04(A002);
    }
}
