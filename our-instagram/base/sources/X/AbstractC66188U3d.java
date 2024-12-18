package X;

import java.util.Iterator;

/* renamed from: X.U3d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66188U3d {
    public static final int A00(C66192U3h c66192U3h) {
        int i = 0;
        if (c66192U3h != null) {
            Iterator it = c66192U3h.A01.iterator();
            while (it.hasNext()) {
                String str = ((C66193U3j) it.next()).A01;
                if (str != null) {
                    i += str.length();
                }
            }
        }
        return i;
    }
}
