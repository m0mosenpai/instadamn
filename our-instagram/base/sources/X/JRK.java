package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class JRK implements MOI {
    public static final JRK A00 = new JRK();

    @Override // X.MOI
    public final /* bridge */ /* synthetic */ Object ABr(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        AbstractC167027dH.A12(list, list2, (Map) obj3);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj4 : list) {
            if (!r14.containsKey(JRE.A01(((JRL) obj4).A0J).A00)) {
                A1E.add(obj4);
            }
        }
        if (!list2.isEmpty()) {
            if (A1E.isEmpty()) {
                return list2;
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            int i = 0;
            int i2 = 0;
            while (i < A1E.size() && i2 < list2.size()) {
                JRL jrl = (JRL) A1E.get(i);
                JRL jrl2 = (JRL) list2.get(i2);
                if (jrl.A05 > jrl2.A05) {
                    A1E2.add(jrl);
                    i++;
                } else {
                    A1E2.add(jrl2);
                    i2++;
                }
            }
            while (i < A1E.size()) {
                A1E2.add(A1E.get(i));
                i++;
            }
            while (i2 < list2.size()) {
                A1E2.add(list2.get(i2));
                i2++;
            }
            return A1E2;
        }
        return A1E;
    }
}
