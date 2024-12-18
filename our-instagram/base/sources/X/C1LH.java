package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1LH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1LH {
    public static void A00(Object[] array, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                throw new NullPointerException(AnonymousClass001.A0O("at index ", i));
            }
        }
    }

    public static Object[] A01(Collection c, Object[] array) {
        int size = c.size();
        int length = array.length;
        if (length < size) {
            if (length != 0) {
                array = Arrays.copyOf(array, 0);
            }
            array = Arrays.copyOf(array, size);
        }
        Iterator it = c.iterator();
        int i = 0;
        while (it.hasNext()) {
            array[i] = it.next();
            i++;
        }
        if (array.length > size) {
            array[size] = null;
        }
        return array;
    }
}
