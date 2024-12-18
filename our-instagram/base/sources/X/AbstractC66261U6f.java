package X;

import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.U6f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66261U6f {
    public static final Object A01 = new Object();
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public static final SparseArray A00 = new SparseArray();

    public static final Object A01(Class cls, Integer num) {
        Object cast;
        if (num == null) {
            return null;
        }
        try {
            synchronized (A01) {
                SparseArray sparseArray = A00;
                int intValue = num.intValue();
                if (sparseArray.indexOfKey(intValue) < 0) {
                    cast = null;
                } else {
                    cast = cls.cast(sparseArray.get(intValue));
                }
            }
            return cast;
        } catch (ClassCastException e) {
            AbstractC25241Le.A00(null, "BloksDataStorage", "Casting error when retrieving data", e);
            return null;
        }
    }

    public static final Object A02(Class cls, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            synchronized (A01) {
                SparseArray sparseArray = A00;
                int intValue = num.intValue();
                if (sparseArray.indexOfKey(intValue) < 0) {
                    return null;
                }
                Object cast = cls.cast(sparseArray.get(intValue));
                sparseArray.delete(intValue);
                return cast;
            }
        } catch (ClassCastException e) {
            AbstractC25241Le.A00(null, "BloksDataStorage", "Casting error when retrieving data", e);
            return null;
        }
    }

    public static final int A00(Object obj) {
        int incrementAndGet = A02.incrementAndGet();
        synchronized (A01) {
            A00.append(incrementAndGet, obj);
        }
        return incrementAndGet;
    }

    public static final void A03(Integer num) {
        if (num != null) {
            synchronized (A01) {
                A00.delete(num.intValue());
            }
        }
    }
}
