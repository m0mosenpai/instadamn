package X;

import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.3fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78713fd {
    public static final boolean A00(SparseArray sparseArray, SparseArray sparseArray2) {
        int size;
        if (sparseArray != sparseArray2) {
            if (sparseArray != null && sparseArray2 != null && (size = sparseArray.size()) == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (C14360o3.A0K(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(Object obj, Object obj2) {
        int compare;
        boolean z = true;
        if (obj != obj2) {
            int i = 0;
            if (obj != null && obj2 != null) {
                Class<?> cls = obj.getClass();
                if (C14360o3.A0K(cls, obj2.getClass())) {
                    if (obj instanceof Float) {
                        compare = Float.compare(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    } else if (obj instanceof Double) {
                        compare = Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    } else {
                        if (obj instanceof C2VB) {
                            return ((C2VB) obj).CTz(obj2);
                        }
                        if (cls.isArray()) {
                            if (obj instanceof byte[]) {
                                return Arrays.equals((byte[]) obj, (byte[]) obj2);
                            }
                            if (obj instanceof short[]) {
                                return Arrays.equals((short[]) obj, (short[]) obj2);
                            }
                            if (obj instanceof char[]) {
                                return Arrays.equals((char[]) obj, (char[]) obj2);
                            }
                            if (obj instanceof int[]) {
                                return Arrays.equals((int[]) obj, (int[]) obj2);
                            }
                            if (obj instanceof long[]) {
                                return Arrays.equals((long[]) obj, (long[]) obj2);
                            }
                            if (obj instanceof float[]) {
                                return Arrays.equals((float[]) obj, (float[]) obj2);
                            }
                            if (obj instanceof double[]) {
                                return Arrays.equals((double[]) obj, (double[]) obj2);
                            }
                            if (obj instanceof boolean[]) {
                                return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                            }
                            Object[] objArr = (Object[]) obj;
                            Object[] objArr2 = (Object[]) obj2;
                            int length = objArr.length;
                            if (length != objArr2.length) {
                                return false;
                            }
                            while (i < length) {
                                if (!A02(objArr[i], objArr2[i])) {
                                    return false;
                                }
                                i++;
                            }
                            return true;
                        }
                        if ((obj instanceof List) && (obj instanceof RandomAccess)) {
                            List list = (List) obj;
                            List list2 = (List) obj2;
                            z = false;
                            if (list.size() == list2.size()) {
                                int size = list.size();
                                while (i < size) {
                                    if (A02(list.get(i), list2.get(i))) {
                                        i++;
                                    }
                                }
                                return true;
                            }
                        } else if (obj instanceof Collection) {
                            Collection collection = (Collection) obj;
                            Collection collection2 = (Collection) obj2;
                            z = false;
                            if (collection.size() == collection2.size()) {
                                Iterator it = collection.iterator();
                                Iterator it2 = collection2.iterator();
                                while (it.hasNext()) {
                                    if (!A02(it.next(), it2.next())) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        } else {
                            return obj.equals(obj2);
                        }
                    }
                    if (compare != 0) {
                        return false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public static final boolean A03(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj2 != null) {
                Class<?> cls = obj.getClass();
                if (C14360o3.A0K(cls, obj2.getClass())) {
                    C0s6 A00 = AbstractC13190m5.A00(cls.getDeclaredFields());
                    while (A00.hasNext()) {
                        Field field = (Field) A00.next();
                        try {
                            boolean isAccessible = field.isAccessible();
                            if (!isAccessible) {
                                field.setAccessible(true);
                            }
                            Object obj3 = field.get(obj);
                            Object obj4 = field.get(obj2);
                            if (!isAccessible) {
                                field.setAccessible(false);
                            }
                            if (!A02(obj3, obj4)) {
                                return false;
                            }
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Unable to get fields by reflection.", e);
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(C2VB c2vb, C2VB c2vb2) {
        if (c2vb == c2vb2) {
            return true;
        }
        if (c2vb != null && c2vb2 != null) {
            return c2vb.CTz(c2vb2);
        }
        return false;
    }

    public static final boolean A04(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof C2VB) && (obj2 instanceof C2VB)) {
                return A01((C2VB) obj, (C2VB) obj2);
            }
            return A03(obj, obj2);
        }
        return false;
    }
}
