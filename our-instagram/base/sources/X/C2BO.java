package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.2BO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BO {
    public final List A00;

    public static final C2BO A00(String str) {
        ArrayList arrayList;
        Iterator it;
        double d;
        boolean z;
        String str2;
        try {
            List A0Q = AbstractC001900j.A0Q(str, new char[]{';'}, 0);
            arrayList = new ArrayList(AbstractC06950Ym.A1E(A0Q, 10));
            it = A0Q.iterator();
        } catch (Throwable unused) {
        }
        while (it.hasNext()) {
            List A0Q2 = AbstractC001900j.A0Q((String) it.next(), new char[]{','}, 0);
            int size = A0Q2.size();
            if (2 <= size && size < 5) {
                double parseDouble = Double.parseDouble((String) A0Q2.get(0));
                double parseDouble2 = Double.parseDouble((String) A0Q2.get(1));
                if (A0Q2.size() > 2) {
                    d = Double.parseDouble((String) A0Q2.get(2));
                } else {
                    d = 1.0d;
                }
                if (A0Q2.size() <= 3 || (str2 = (String) A0Q2.get(3)) == null) {
                    z = false;
                } else {
                    z = str2.equalsIgnoreCase("d");
                }
                arrayList.add(new C2BP(parseDouble, parseDouble2, d, z));
            }
            List singletonList = Collections.singletonList(new C2BP(0.0d, 1.0d, 1.0d, true));
            C14360o3.A07(singletonList);
            return new C2BO(singletonList);
        }
        return new C2BO(arrayList);
    }

    public final double A01() {
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            double d = ((C2BP) it.next()).A02;
            while (it.hasNext()) {
                d = Math.max(d, ((C2BP) it.next()).A02);
            }
            return d;
        }
        throw new NoSuchElementException();
    }

    public final double A02(double d) {
        List list = this.A00;
        int A1L = AbstractC16960so.A1L(list, new C206999Ee(Double.valueOf(d), 16), list.size());
        if (A1L < 0 && (-A1L) - 1 != 0) {
            if (A1L == list.size()) {
                A1L = list.size() - 1;
            } else {
                C2BP c2bp = (C2BP) list.get(A1L - 1);
                C2BP c2bp2 = (C2BP) list.get(A1L);
                double d2 = c2bp.A01;
                double d3 = (d - d2) / (c2bp2.A01 - d2);
                if (c2bp.A03) {
                    double d4 = c2bp.A02;
                    return d4 + ((c2bp2.A02 - d4) * StrictMath.pow(d3, c2bp.A00));
                }
                double d5 = c2bp2.A02;
                return d5 - ((d5 - c2bp.A02) * StrictMath.pow(1.0d - d3, c2bp.A00));
            }
        }
        return ((C2BP) list.get(A1L)).A02;
    }

    public C2BO(List list) {
        this.A00 = AbstractC001800i.A0g(list, new Comparator() { // from class: X.2BR
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2BS.A00(Double.valueOf(((C2BP) obj).A01), Double.valueOf(((C2BP) obj2).A01));
            }
        });
    }
}
