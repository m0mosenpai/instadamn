package X;

import java.util.List;

/* renamed from: X.I4e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40750I4e {
    public static final int A00(int i, int i2, List list) {
        int i3 = 0;
        if (!AnonymousClass483.A04(list)) {
            if (list != null) {
                i3 = AbstractC31176DnK.A01(list, 0);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (i3 + i2 >= i) {
            int i4 = i - i2;
            if (i4 < 0) {
                return 0;
            }
            return i4;
        }
        return i3;
    }
}
