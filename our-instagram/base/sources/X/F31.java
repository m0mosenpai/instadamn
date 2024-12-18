package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F31 {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, E70 e70) {
        String str;
        boolean A1a = AbstractC167017dG.A1a(userSession, e70);
        boolean z = e70.A0v;
        boolean A04 = E70.A04(e70);
        int i = e70.A09;
        boolean A1P = AbstractC167007dF.A1P(i, 1012);
        List A0n = AbstractC31171DnF.A0n(e70.A0c);
        ArrayList A0q = AbstractC167017dG.A0q(A0n);
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            C32107E9f.A02(A0q, it);
        }
        String A02 = E70.A02(e70);
        boolean A1P2 = AbstractC167007dF.A1P(i, 1014);
        User user = (User) AbstractC001800i.A0J(A0q);
        if (user != null) {
            str = user.A03.Aab();
        } else {
            str = null;
        }
        boolean A1W = AbstractC31171DnF.A1W(userSession, str);
        if (!A1P2 || A1W) {
            boolean A1P3 = AbstractC167007dF.A1P(i, 1013);
            if ((!z || A04 || A1P || A1P3 || A0q.size() != A1a || !capabilities.A00(EnumC2054697t.A0x) || !C18U.A06(C06090Tz.A05, userSession, 2342153298389237765L)) && (i != 29 || AbstractC31171DnF.A1V(userSession, A02))) {
                return false;
            }
        }
        return true;
    }
}
