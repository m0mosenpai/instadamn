package X;

import com.instagram.api.schemas.CameraTool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A0N {
    public static final List A00(C183978Ee c183978Ee) {
        Long valueOf;
        List A08 = c183978Ee.A08();
        ArrayList arrayList = null;
        if (A08 != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C81X A05 = AbstractC449424y.A05((CameraTool) it.next());
                if (A05 != null && (valueOf = Long.valueOf(A05.A00)) != null) {
                    arrayList.add(valueOf);
                }
            }
        }
        return arrayList;
    }
}
