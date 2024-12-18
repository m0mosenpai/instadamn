package X;

import java.util.List;

/* renamed from: X.6LY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6LY {
    public static final boolean A00(C5C8 c5c8) {
        int length = c5c8.length();
        List list = c5c8.A01;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C127015of c127015of = (C127015of) list.get(i);
            if ((c127015of.A02 instanceof AbstractC137436Ko) && AbstractC127005oe.A02(0, length, c127015of.A01, c127015of.A00)) {
                return true;
            }
        }
        return false;
    }
}
