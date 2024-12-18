package X;

import java.util.List;

/* renamed from: X.NvL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54061NvL {
    public static final int A00(int i, int i2, List list) {
        int A00 = AbstractC40750I4e.A00(i, i2, list);
        if (list != null && list.contains(Integer.valueOf(A00))) {
            int i3 = i2 / 15;
            int i4 = 1000;
            if (1000 < i3) {
                i4 = i3;
            }
            int i5 = A00 / i4;
            int i6 = 1000;
            if (1000 < i3) {
                i6 = i3;
            }
            return i5 * i6;
        }
        return A00;
    }
}
