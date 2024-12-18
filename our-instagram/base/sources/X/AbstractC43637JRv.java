package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JRv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43637JRv {
    public static final List A00(InterfaceC50518MRv interfaceC50518MRv, C41951wl c41951wl, boolean z) {
        List unmodifiableList;
        C14360o3.A0B(interfaceC50518MRv, 0);
        if (z) {
            List Bl3 = interfaceC50518MRv.Bl3();
            if (Bl3 == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(Bl3.size());
                Iterator it = Bl3.iterator();
                while (it.hasNext()) {
                    C42321xM A02 = c41951wl.A02((String) it.next());
                    if (A02 != null) {
                        arrayList.add(A02);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            C14360o3.A0A(unmodifiableList);
            return unmodifiableList;
        }
        return C16930sl.A00;
    }
}
