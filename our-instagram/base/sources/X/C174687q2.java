package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7q2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174687q2 {
    public final int[] A00(List list) {
        int i;
        Iterator it = list.iterator();
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            if (iArr2[1] >= 30000 && (i = iArr2[0]) < i2) {
                iArr = iArr2;
                i2 = i;
            }
        }
        if (iArr == null) {
            return (int[]) list.get(list.size() - 1);
        }
        return iArr;
    }
}
