package X;

import java.lang.reflect.Field;

/* renamed from: X.0iE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10980iE extends AbstractC05350Qi {
    public static Class A01;
    public static boolean A02;
    public static boolean A03;
    public static Field[] A04;
    public static Field[] A05;
    public final Object A00;

    public static Field[] A00(Class cls, Class cls2, String str, int i) {
        Field[] fieldArr;
        Field[] fieldArr2 = new Field[i];
        int i2 = 0;
        while (i2 <= i) {
            int i3 = i2 + 1;
            String A0O = AnonymousClass001.A0O(str, i3);
            try {
                fieldArr = null;
                Field A052 = C0H5.A05(null, cls, cls2, A0O);
                if (A052 != null) {
                    A052.setAccessible(true);
                }
                fieldArr2[i2] = A052;
            } catch (Exception e) {
                C03720In c03720In = C0DF.A00;
                if (i3 <= 2) {
                    c03720In.A0D(e, "Could not find %s class needed field %s (%d of %d) on this platform", cls, A0O, Integer.valueOf(i3), 2);
                    return fieldArr;
                }
                c03720In.A0A(e, "Could not find %s class field %s on this platform", cls, A0O);
            }
            i2 = i3;
        }
        return fieldArr2;
    }

    @Override // X.AbstractC05350Qi
    public final Object A03(int i) {
        Field[] fieldArr = A05;
        fieldArr.getClass();
        Field field = fieldArr[0];
        if (field != null) {
            try {
                return field.get(this.A00);
            } catch (Exception e) {
                String format = String.format("Cannot access SomeArgs obj field for %s%d.", "arg", 1);
                C0DF.A00.A03(format, e);
                throw new Exception(format, e);
            }
        }
        throw new Exception(String.format("Don't know how to access SomeArgs obj field for %s%d.", "arg", 1));
    }

    @Override // X.AbstractC05350Qi
    public final int A02(int i) {
        Field[] fieldArr = A04;
        fieldArr.getClass();
        Field field = fieldArr[i - 1];
        if (field != null) {
            try {
                return field.getInt(this.A00);
            } catch (Exception e) {
                String format = String.format("Cannot access SomeArgs int field for %s%d.", "argi", Integer.valueOf(i));
                C0DF.A00.A03(format, e);
                throw new Exception(format, e);
            }
        }
        throw new Exception(String.format("Don't know how to access SomeArgs int field for %s%d.", "argi", Integer.valueOf(i)));
    }

    public C10980iE(Object obj) {
        this.A00 = obj;
    }
}
