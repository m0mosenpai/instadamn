package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public abstract class LB3 {
    public static final ArrayList A00(UserSession userSession, C47Z c47z, List list) {
        int i;
        C14360o3.A0B(list, 0);
        C45016Jw6 c45016Jw6 = new C45016Jw6(LFK.A00.A00(userSession, c47z), C05F.A01);
        ListIterator A14 = AbstractC43592JPx.A14(list);
        while (true) {
            if (A14.hasPrevious()) {
                if (((C45016Jw6) A14.previous()).A01 == C05F.A00) {
                    i = A14.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = i + 1;
        return AbstractC001800i.A0S(list.subList(i2, list.size()), AbstractC001800i.A0S(AbstractC166987dD.A1J(c45016Jw6), list.subList(0, i2)));
    }

    public static final ArrayList A01(UserSession userSession, List list, List list2) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0q.add(new C45016Jw6(LFK.A00.A00(userSession, (C47Z) it.next()), C05F.A01));
        }
        return AbstractC001800i.A0S(A0q, list);
    }
}
