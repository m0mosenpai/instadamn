package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89343ya {
    public static final int A00(C38321qM c38321qM) {
        List list = c38321qM.A1Z().A00;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Arrays.hashCode(new Object[]{Boolean.valueOf(((C84923qg) it.next()).A0O)})));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
