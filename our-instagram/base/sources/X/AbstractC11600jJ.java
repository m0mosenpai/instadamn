package X;

import java.util.Collection;

/* renamed from: X.0jJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11600jJ {
    public static final void A01(Object[] objArr, int i, int i2) {
        C14360o3.A0B(objArr, 0);
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String A00(Collection collection, Object[] objArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
