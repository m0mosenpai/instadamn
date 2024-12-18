package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class CBU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final boolean A00(List list) {
        ?? r5;
        Object A0I;
        if (list.size() >= 2) {
            if (list.size() != 0 && list.size() != 1) {
                r5 = AbstractC166987dD.A1E();
                Object obj = list.get(0);
                int A05 = AbstractC25226BEj.A05(list);
                int i = 0;
                while (i < A05) {
                    i++;
                    Object obj2 = list.get(i);
                    C113525Ap c113525Ap = (C113525Ap) obj2;
                    C113525Ap c113525Ap2 = (C113525Ap) obj;
                    r5.add(AbstractC25225BEi.A0R(AbstractC119395aw.A00(AbstractC166987dD.A01(C119365at.A01(c113525Ap2.A03().A00()), C119365at.A01(c113525Ap.A03().A00())), AbstractC166987dD.A01(C119365at.A02(c113525Ap2.A03().A00()), C119365at.A02(c113525Ap.A03().A00())))));
                    obj = obj2;
                }
            } else {
                r5 = C16930sl.A00;
            }
            if (r5.size() == 1) {
                A0I = AbstractC001800i.A0I(r5);
            } else if (!r5.isEmpty()) {
                A0I = AbstractC001800i.A0I(r5);
                int A052 = AbstractC25226BEj.A05(r5);
                if (1 <= A052) {
                    int i2 = 1;
                    while (true) {
                        A0I = AbstractC25225BEi.A0R(C119365at.A07(((C119365at) A0I).A00, ((C119365at) r5.get(i2)).A00));
                        if (i2 == A052) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                throw new UnsupportedOperationException(MSV.A00(759));
            }
            long j = ((C119365at) A0I).A00;
            if (C119365at.A02(j) >= C119365at.A01(j)) {
                return false;
            }
        }
        return true;
    }
}
