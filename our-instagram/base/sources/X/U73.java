package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class U73 {
    public static final C1338462s A00(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        Map map = (Map) c6fw.A00.get(1);
        C102824kJ c102824kJ = C6AM.A01(c6fq, A0d).A00.A00.A00;
        List list = c6fq.A0D;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        AbstractC166997dE.A1W(arrayList, AbstractC102944kV.A00.incrementAndGet());
        return U72.A01(C6FQ.A02(c6fq, arrayList), c102824kJ, map, true, true);
    }
}
