package X;

import java.util.Arrays;

/* renamed from: X.0Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03730Io {
    public static InterfaceC03680Ii A00(InterfaceC03680Ii interfaceC03680Ii, C03740Ip c03740Ip, Object[] objArr, boolean z) {
        Class<?> cls;
        Class<?> cls2;
        InterfaceC03680Ii interfaceC03680Ii2 = interfaceC03680Ii;
        C03740Ip c03740Ip2 = c03740Ip;
        if (!z) {
            c03740Ip2.getClass();
            interfaceC03680Ii2 = null;
        } else {
            interfaceC03680Ii2.getClass();
            c03740Ip2 = null;
        }
        int length = objArr.length;
        int i = 0;
        if (c03740Ip2 != null) {
            cls = c03740Ip2.A04;
        } else if (interfaceC03680Ii2 != null) {
            cls = interfaceC03680Ii2.getClass();
        } else {
            cls = null;
        }
        Arrays.toString(objArr);
        Object obj = null;
        Object obj2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            Object obj3 = objArr[i5];
            if (obj3 != null) {
                cls2 = obj3.getClass();
                if (cls2 != null) {
                    if (cls2.isPrimitive()) {
                        cls2.isPrimitive();
                        if (cls2 == Integer.TYPE || (cls2 != Long.TYPE && (cls2 == Character.TYPE || cls2 == Boolean.TYPE || cls2 == Byte.TYPE || cls2 == Short.TYPE || cls2 == Float.TYPE))) {
                            int i6 = i3 + 1;
                            int intValue = ((Number) obj3).intValue();
                            if (i3 != 0) {
                                if (i3 == 1) {
                                    i2 = intValue;
                                } else {
                                    String str = "<null>";
                                    if (cls != null) {
                                        str = cls.toString();
                                    }
                                    throw new IllegalStateException(AnonymousClass001.A18("Cannot construct ", str, " arg[idx:", Integer.toString(i5), "]: ", cls2.toString(), " with val ", Integer.toString(intValue), "because it has too many int type params!"));
                                }
                            } else {
                                i = intValue;
                            }
                            i3 = i6;
                        }
                    }
                    if (cls2.isPrimitive()) {
                    }
                }
                String str2 = "<null>";
                String str3 = "<null>";
                if (cls != null) {
                    str3 = cls.toString();
                }
                String num = Integer.toString(i5);
                if (cls2 != null) {
                    str2 = cls2.toString();
                }
                throw new IllegalStateException(AnonymousClass001.A15("Cannot construct ", str3, " arg[idx:", num, "]: ", str2, " because because we don't understand the class"));
            }
            cls2 = null;
            int i7 = i4 + 1;
            if (i4 != 0) {
                if (i4 == 1) {
                    obj2 = obj3;
                } else {
                    String str4 = "<null>";
                    String str5 = "<null>";
                    if (cls != null) {
                        str5 = cls.toString();
                    }
                    String num2 = Integer.toString(i5);
                    if (cls2 != null) {
                        str4 = cls2.toString();
                    }
                    throw new IllegalStateException(AnonymousClass001.A15("Cannot construct ", str5, " arg[idx:", num2, "]: ", str4, " because it has too many obj params!"));
                }
            } else {
                obj = obj3;
            }
            i4 = i7;
        }
        if (!z) {
            c03740Ip2.getClass();
            return C03740Ip.A01(c03740Ip2, obj, obj2, i, i2);
        }
        interfaceC03680Ii2.getClass();
        interfaceC03680Ii2.DVm(i, i2, obj, obj2);
        return interfaceC03680Ii2;
    }
}
