package X;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kqw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47039Kqw {
    public static final C09530e4 A00(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        long j = 0;
        long j2 = Long.MAX_VALUE;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        while (it.hasNext()) {
            long j5 = AbstractC166987dD.A0l(it).A0D;
            if (j5 < j4) {
                j4 = j5;
            }
            if (j5 > j3) {
                j3 = j5;
            }
        }
        if (j4 == Long.MAX_VALUE || j3 == 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long j6 = AbstractC166987dD.A0l(it2).A0C * 1000;
                if (j6 < j2) {
                    j2 = j6;
                }
                if (j6 > j) {
                    j = j6;
                }
            }
            j3 = j;
            j4 = j2;
        }
        Calendar A00 = AbstractC195628l3.A00();
        return AbstractC167007dF.A0p(Long.valueOf(AbstractC195798lM.A01(A00, new Date(j4)).getTime()), AbstractC195798lM.A01(A00, new Date(j3)).getTime());
    }
}
