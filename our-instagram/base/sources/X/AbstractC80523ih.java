package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80523ih {
    public static final int A00(C28091Xn c28091Xn, List list) {
        C38321qM A02;
        String id;
        String BPW;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C3XG c3xg = (C3XG) it.next();
            if (c3xg != null && (A02 = C3XH.A02(c3xg.A05)) != null) {
                if (A02.A5M() && (BPW = A02.A0C.BPW()) != null && BPW.length() != 0) {
                    id = A02.A0C.BPW();
                } else {
                    id = A02.getId();
                }
                if (A02.A66() || c28091Xn.A03(id)) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final int A01(List list) {
        C38321qM A02;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC38381qS interfaceC38381qS = ((C3XG) it.next()).A05;
            if (C3XH.A02(interfaceC38381qS) != null && (A02 = C3XH.A02(interfaceC38381qS)) != null && A02.A5l()) {
                i++;
            }
        }
        return i;
    }
}
