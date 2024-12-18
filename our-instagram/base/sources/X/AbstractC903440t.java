package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.40t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC903440t {
    public static final float A00(UserSession userSession, C38321qM c38321qM, List list, boolean z) {
        Object obj;
        Float C5C = c38321qM.A0C.C5C();
        if (!z && C5C != null && C18U.A06(C06090Tz.A05, userSession, 36325154057958189L)) {
            return C5C.floatValue();
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C38321qM c38321qM2 = (C38321qM) obj;
                if (c38321qM2.A5x() || c38321qM2.Cff()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C38321qM c38321qM3 = (C38321qM) obj;
        if (c38321qM3 != null) {
            return c38321qM3.A0m();
        }
        return -1.0f;
    }

    public static final void A01(C38321qM c38321qM, C75113Zb c75113Zb) {
        if (c38321qM.A5F()) {
            int A0p = c38321qM.A0p() - 1;
            c75113Zb.A0A(Math.min(c75113Zb.A02, A0p));
            c75113Zb.A0B(Math.min(c75113Zb.A03, A0p));
            c75113Zb.A09 = Math.min(c75113Zb.A09, A0p);
        }
    }
}
