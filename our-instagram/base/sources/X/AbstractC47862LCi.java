package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LCi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47862LCi {
    public static final C5Hc A00(UserSession userSession, Integer num) {
        List A1Q;
        EnumC46249KdQ enumC46249KdQ;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    enumC46249KdQ = EnumC46249KdQ.A03;
                } else {
                    enumC46249KdQ = EnumC46249KdQ.A06;
                }
            } else {
                enumC46249KdQ = EnumC46249KdQ.A02;
            }
            A1Q = AbstractC166987dD.A1J(enumC46249KdQ);
        } else {
            A1Q = AbstractC16960so.A1Q(EnumC46249KdQ.A04, EnumC46249KdQ.A05);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A1Q) {
            if (((EnumC46249KdQ) obj).A01(userSession)) {
                A1E.add(obj);
            }
        }
        return AbstractC133095zb.A00(A1E);
    }

    public static final boolean A01(UserSession userSession, Integer num) {
        C5Hc A00 = A00(userSession, num);
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                if (((EnumC46249KdQ) it.next()).A01(userSession)) {
                    return true;
                }
            }
        }
        return false;
    }
}
