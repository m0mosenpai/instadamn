package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73333Qj {
    public static final List A01(UserSession userSession, C3NQ c3nq) {
        C14360o3.A0B(userSession, 1);
        List CAq = c3nq.CAq();
        if (CAq == null) {
            CAq = C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(CAq, 10));
        Iterator it = CAq.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC37791pH) it.next()).F5S(C1DS.A00(userSession)));
        }
        return arrayList;
    }

    public static final List A00(UserSession userSession, C3NQ c3nq) {
        List AiP = c3nq.AiP();
        if (AiP == null) {
            AiP = C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(AiP, 10));
        Iterator it = AiP.iterator();
        while (it.hasNext()) {
            C105824pt c105824pt = new C105824pt(((InterfaceC37961pd) it.next()).ErQ(C1DS.A00(userSession)));
            c105824pt.A0N = C05F.A00;
            arrayList.add(c105824pt);
        }
        return arrayList;
    }

    public static final boolean A02(C3NQ c3nq) {
        return C14360o3.A0K(c3nq.C14(), true);
    }
}
