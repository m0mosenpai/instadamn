package X;

import java.util.Arrays;

/* renamed from: X.0sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16990sr extends C0eD {
    public static final boolean A0d(Object[] objArr, Object[] objArr2) {
        int length;
        boolean equals;
        if (objArr != objArr2) {
            if (objArr != null && objArr2 != null && (length = objArr.length) == objArr2.length) {
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    Object obj2 = objArr2[i];
                    if (obj != obj2) {
                        if (obj != null && obj2 != null) {
                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                                equals = A0d((Object[]) obj, (Object[]) obj2);
                            } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) obj, (byte[]) obj2);
                            } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                                equals = Arrays.equals((short[]) obj, (short[]) obj2);
                            } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                                equals = Arrays.equals((int[]) obj, (int[]) obj2);
                            } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                                equals = Arrays.equals((long[]) obj, (long[]) obj2);
                            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                                equals = Arrays.equals((float[]) obj, (float[]) obj2);
                            } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                                equals = Arrays.equals((double[]) obj, (double[]) obj2);
                            } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                                equals = Arrays.equals((char[]) obj, (char[]) obj2);
                            } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                                equals = Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                            } else if ((obj instanceof C192588g0) && (obj2 instanceof C192588g0)) {
                                equals = Arrays.equals(((C192588g0) obj).A00(), ((C192588g0) obj2).A00());
                            } else if ((obj instanceof C192518ft) && (obj2 instanceof C192518ft)) {
                                equals = Arrays.equals(((C192518ft) obj).A00(), ((C192518ft) obj2).A00());
                            } else if ((obj instanceof C192448fm) && (obj2 instanceof C192448fm)) {
                                equals = Arrays.equals(((C192448fm) obj).A00(), ((C192448fm) obj2).A00());
                            } else if ((obj instanceof C192378ff) && (obj2 instanceof C192378ff)) {
                                equals = Arrays.equals(((C192378ff) obj).A00(), ((C192378ff) obj2).A00());
                            } else {
                                equals = obj.equals(obj2);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
