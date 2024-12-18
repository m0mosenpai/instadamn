package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ghn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37654Ghn {
    public static final int A00(C120985dq c120985dq) {
        Integer BA3;
        C40971v4 A06;
        List list;
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A0G() && AbstractC166987dD.A1b(C42159Im7.A01(c120985dq))) {
            C42159Im7 A03 = c120985dq.A03();
            if (A03 == null || (list = (List) A03.A01.A00) == null || (A06 = (C40971v4) AbstractC001800i.A0O(list, 0)) == null) {
                return -1;
            }
        } else if (AbstractC37647Ghg.A00(c120985dq)) {
            A06 = c120985dq.A06();
        } else {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM == null) {
                return -1;
            }
            BA3 = c38321qM.BA3();
            return AbstractC25227BEk.A06(BA3, -1);
        }
        BA3 = A06.A0P;
        return AbstractC25227BEk.A06(BA3, -1);
    }

    public static final C37695GiW A01(UserSession userSession) {
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36318479680149690L)) {
            return (C37695GiW) userSession.A01(C37695GiW.class, new J8Z(userSession, 8));
        }
        return null;
    }
}
