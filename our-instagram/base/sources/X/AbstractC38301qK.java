package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.1qK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38301qK {
    public static int A00(int value, int min, int max) {
        C18C.A04(min, max, "min (%s) must be less than or equal to max (%s)", min <= max);
        return Math.min(Math.max(value, min), max);
    }

    public static int A01(long value) {
        int i = (int) value;
        boolean z = false;
        if (i == value) {
            z = true;
        }
        C18C.A05(value, "Out of range: %s", z);
        return i;
    }

    public static int A02(long value) {
        if (value > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (value < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static int A03(byte[] bytes) {
        int length = bytes.length;
        boolean z = false;
        if (length >= 4) {
            z = true;
        }
        C18C.A04(length, 4, "array too small: %s < %s", z);
        return (bytes[0] << 24) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8) | (bytes[3] & 255);
    }

    public static int[] A04(Collection collection) {
        if (collection instanceof C97154Ya) {
            C97154Ya c97154Ya = (C97154Ya) collection;
            return Arrays.copyOfRange(c97154Ya.A02, c97154Ya.A01, c97154Ya.A00);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
