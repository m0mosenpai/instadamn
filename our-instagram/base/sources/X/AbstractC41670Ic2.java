package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: X.Ic2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41670Ic2 {
    public static final void A01(UserSession userSession, Integer num) {
        ArrayList A12 = AbstractC166997dE.A12(userSession, 1);
        HashMap A0E = AbstractC23021Ah.A00(userSession).A0E();
        A0E.put(IAT.A00(num), A12);
        AbstractC23021Ah.A00(userSession).A16(A0E);
    }

    public static final void A02(UserSession userSession, Integer num, long j) {
        LinkedList linkedList;
        ArrayList A1F;
        C14360o3.A0B(userSession, 2);
        HashMap A0E = AbstractC23021Ah.A00(userSession).A0E();
        String A00 = IAT.A00(num);
        if (A0E.containsKey(A00)) {
            ArrayList arrayList = (ArrayList) A0E.get(A00);
            if (arrayList == null) {
                A1F = AbstractC166987dD.A1E();
                A1F.add(Long.valueOf(j));
                A0E.put(A00, A1F);
                AbstractC23021Ah.A00(userSession).A16(A0E);
            }
            long A01 = C18U.A01(C06090Tz.A05, userSession, 36596376947263921L);
            linkedList = new LinkedList(arrayList);
            while (!linkedList.isEmpty() && linkedList.size() >= A01) {
                linkedList.removeFirst();
            }
        } else {
            linkedList = new LinkedList();
        }
        linkedList.addLast(Long.valueOf(j));
        A1F = AbstractC166987dD.A1F(linkedList);
        A0E.put(A00, A1F);
        AbstractC23021Ah.A00(userSession).A16(A0E);
    }

    public static final ArrayList A00(UserSession userSession, Integer num) {
        ArrayList arrayList;
        HashMap A0E = AbstractC23021Ah.A00(userSession).A0E();
        String A00 = IAT.A00(num);
        if (!A0E.containsKey(A00) || (arrayList = (ArrayList) A0E.get(A00)) == null) {
            return AbstractC166987dD.A1E();
        }
        return arrayList;
    }
}
