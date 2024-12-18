package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76503bu {
    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        int i;
        List<C38321qM> AmB;
        int i2;
        int A10 = c38321qM.A10();
        ArrayList A3O = c38321qM.A3O();
        if (A3O != null) {
            i = AbstractC001800i.A0a(A3O).size();
        } else {
            i = 0;
        }
        if (A10 + i <= 3) {
            C38321qM A1g = c38321qM.A1g(userSession);
            if (A1g.A5M() && (AmB = A1g.A0C.AmB()) != null) {
                if ((AmB instanceof Collection) && AmB.isEmpty()) {
                    return true;
                }
                for (C38321qM c38321qM2 : AmB) {
                    C14360o3.A0B(c38321qM2, 0);
                    int A102 = c38321qM2.A10();
                    ArrayList A3O2 = c38321qM2.A3O();
                    if (A3O2 != null) {
                        i2 = AbstractC001800i.A0a(A3O2).size();
                    } else {
                        i2 = 0;
                    }
                    if (A102 + i2 > 3) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        if (!c38321qM.A1g(userSession).CdW() && !c38321qM.A1g(userSession).A6B()) {
            return false;
        }
        return true;
    }
}
