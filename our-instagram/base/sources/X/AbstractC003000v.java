package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.00v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC003000v {
    public static final int A00(C012504o c012504o, Object obj, int i) {
        int i2 = c012504o.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A00 = AbstractC005301s.A00(c012504o.A01, i2, i);
            if (A00 >= 0 && !C14360o3.A0K(obj, c012504o.A02[A00])) {
                int i3 = A00 + 1;
                while (i3 < i2 && c012504o.A01[i3] == i) {
                    if (C14360o3.A0K(obj, c012504o.A02[i3])) {
                        return i3;
                    }
                    i3++;
                }
                do {
                    A00--;
                    if (A00 < 0 || c012504o.A01[A00] != i) {
                        return i3 ^ (-1);
                    }
                } while (!C14360o3.A0K(obj, c012504o.A02[A00]));
                return A00;
            }
            return A00;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
