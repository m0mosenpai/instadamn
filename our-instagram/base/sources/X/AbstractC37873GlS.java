package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.GlS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37873GlS {
    public static final ArrayList A00(UserSession userSession, C153736vi c153736vi, String str, List list, Map map) {
        String A2u;
        AbstractC167027dH.A12(userSession, list, map);
        ArrayList A12 = AbstractC166997dE.A12(c153736vi, 3);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C120985dq c120985dq = (C120985dq) list.get(i);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (A2u = c38321qM.A2u()) != null) {
                A12.add(new C154026wB(AbstractC37872GlR.A00(c120985dq, null, userSession, c153736vi, str, null, false, false), c120985dq, (C69749Vuj) map.get(A2u)));
            }
        }
        return A12;
    }
}
