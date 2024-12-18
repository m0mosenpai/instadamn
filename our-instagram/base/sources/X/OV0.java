package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OV0 {
    public static final OV0 A00 = new Object();

    public final int countBframe(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        int i = 0;
        long j = Long.MIN_VALUE;
        while (it.hasNext()) {
            long A07 = MSY.A07(it);
            if (A07 > j) {
                j = A07;
            } else {
                i++;
            }
        }
        return i;
    }
}
