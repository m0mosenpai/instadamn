package X;

import java.util.Comparator;

/* renamed from: X.6ON, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ON implements Comparator {
    public static final C6ON A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C114205Dh A04 = ((C113525Ap) obj).A04();
        C114205Dh A042 = ((C113525Ap) obj2).A04();
        int compare = Float.compare(A04.A01, A042.A01);
        if (compare == 0) {
            int compare2 = Float.compare(A04.A03, A042.A03);
            if (compare2 == 0) {
                int compare3 = Float.compare(A04.A00, A042.A00);
                if (compare3 == 0) {
                    return Float.compare(A04.A02, A042.A02);
                }
                return compare3;
            }
            return compare2;
        }
        return compare;
    }
}