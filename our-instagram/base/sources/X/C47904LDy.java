package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LDy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47904LDy {
    public final UserSession A00;

    public C47904LDy(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final List A00(List list) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (obj != EnumC174177p9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) {
                    A1E.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1S(it.next(), A0q);
            }
            return A0q;
        }
        return C16930sl.A00;
    }
}
