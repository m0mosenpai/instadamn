package X;

import java.util.Iterator;

/* renamed from: X.Kk5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46628Kk5 {
    public static final String A00(C47Z c47z) {
        C115435Kd c115435Kd;
        C115435Kd c115435Kd2 = c47z.A6I;
        if (c115435Kd2 != null && c115435Kd2.A02 != null) {
            c115435Kd = c47z.A6I;
        } else {
            Iterator it = c47z.A4m.iterator();
            while (it.hasNext()) {
                C47Z A0l = AbstractC43592JPx.A0l(it);
                C115435Kd c115435Kd3 = A0l.A6I;
                if (c115435Kd3 != null && c115435Kd3.A02 != null) {
                    c115435Kd = A0l.A6I;
                }
            }
            return null;
        }
        if (c115435Kd != null) {
            return c115435Kd.A02;
        }
        return null;
    }
}
