package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6O5, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6O5 {
    public static final List A00(C6MF c6mf, C6O2 c6o2, C6MJ c6mj) {
        C17u c17u;
        C57S c57s = c6mf.A00;
        if (c57s.A00 == 0 && c6mj.isEmpty()) {
            return C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList();
        int i = c57s.A00;
        if (i != 0) {
            Object[] objArr = c57s.A02;
            C6MG c6mg = (C6MG) objArr[0];
            int i2 = c6mg.A01;
            if (i > 0) {
                int i3 = 0;
                do {
                    C6MG c6mg2 = (C6MG) objArr[i3];
                    if (c6mg2.A01 < i2) {
                        i2 = c6mg2.A01;
                    }
                    i3++;
                } while (i3 < i);
            }
            if (i2 >= 0) {
                int i4 = c6mg.A00;
                if (i > 0) {
                    int i5 = 0;
                    do {
                        C6MG c6mg3 = (C6MG) objArr[i5];
                        if (c6mg3.A00 > i4) {
                            i4 = c6mg3.A00;
                        }
                        i5++;
                    } while (i5 < i);
                }
                c17u = new C17u(i2, Math.min(i4, c6o2.getItemCount() - 1));
            } else {
                throw new IllegalArgumentException("negative minIndex");
            }
        } else {
            c17u = C17u.A00;
        }
        int size = c6mj.size();
        for (int i6 = 0; i6 < size; i6++) {
            C6OD c6od = (C6OD) ((C6OG) c6mj.get(i6));
            int A00 = C6O4.A00(c6o2, c6od.A04, c6od.A00.BIi());
            int i7 = c17u.A00;
            if ((A00 > c17u.A01 || i7 > A00) && A00 >= 0 && A00 < c6o2.getItemCount()) {
                arrayList.add(Integer.valueOf(A00));
            }
        }
        int i8 = c17u.A00;
        int i9 = c17u.A01;
        if (i8 > i9) {
            return arrayList;
        }
        while (true) {
            arrayList.add(Integer.valueOf(i8));
            if (i8 == i9) {
                return arrayList;
            }
            i8++;
        }
    }
}
