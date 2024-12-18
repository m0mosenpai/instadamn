package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80233iC {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        JMF B5y;
        List BGq;
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.A1g(userSession).CdW() || c38321qM.A1H() == null || (c38321qM.A5a() && ((B5y = c38321qM.A0C.B5y()) == null || (BGq = B5y.BGq()) == null || BGq.isEmpty()))) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36318612822169952L);
    }

    public static final boolean A01(C37905Gm2 c37905Gm2, double d, double d2, double d3, double d4) {
        float f = c37905Gm2.A04;
        float f2 = c37905Gm2.A05;
        double d5 = f;
        if (d5 >= d) {
            double d6 = f2;
            if (d6 >= d2 && d5 <= d3 && d6 <= d4) {
                return true;
            }
        }
        return false;
    }
}
