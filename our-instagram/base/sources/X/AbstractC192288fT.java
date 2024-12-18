package X;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.NamedCompanion;

/* renamed from: X.8fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192288fT {
    public static final C3R9 A00(Object obj, C3R9... c3r9Arr) {
        Class[] clsArr;
        try {
            int length = c3r9Arr.length;
            int i = 0;
            if (length == 0) {
                clsArr = new Class[0];
            } else {
                clsArr = new Class[length];
                do {
                    clsArr[i] = C3R9.class;
                    i++;
                } while (i < length);
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(c3r9Arr, length));
            if (invoke instanceof C3R9) {
                return (C3R9) invoke;
            }
        } catch (NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
        return null;
    }

    public static final C3R9 A01(InterfaceC16510rw interfaceC16510rw, C3R9... c3r9Arr) {
        Serializable serializable;
        Field field;
        Object obj;
        C3R9 A00;
        C3R9 c3r9;
        C3R9 A002;
        C14360o3.A0B(c3r9Arr, 1);
        Class A003 = AbstractC53012bi.A00(interfaceC16510rw);
        C3R9[] c3r9Arr2 = (C3R9[]) Arrays.copyOf(c3r9Arr, c3r9Arr.length);
        C14360o3.A0B(c3r9Arr2, 1);
        if (A003.isEnum() && A003.getAnnotation(Serializable.class) == null && A003.getAnnotation(Polymorphic.class) == null) {
            Object[] enumConstants = A003.getEnumConstants();
            String canonicalName = A003.getCanonicalName();
            C14360o3.A07(canonicalName);
            C14360o3.A0C(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C3R8(canonicalName, (Enum[]) enumConstants);
        }
        int length = c3r9Arr2.length;
        C3R9[] c3r9Arr3 = (C3R9[]) Arrays.copyOf(c3r9Arr2, length);
        Object obj2 = null;
        try {
            Field declaredField = A003.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj2 = declaredField.get(null);
        } catch (Throwable unused) {
        }
        if (obj2 != null && (A002 = A00(obj2, (C3R9[]) Arrays.copyOf(c3r9Arr3, c3r9Arr3.length))) != null) {
            return A002;
        }
        String canonicalName2 = A003.getCanonicalName();
        Method method = null;
        if (canonicalName2 != null && !AbstractC002300n.A0h(canonicalName2, "java.", false) && !AbstractC002300n.A0h(canonicalName2, AbstractC111324zv.A00(2650), false)) {
            Field[] declaredFields = A003.getDeclaredFields();
            C14360o3.A07(declaredFields);
            int length2 = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i < length2) {
                    Field field3 = declaredFields[i];
                    if (C14360o3.A0K(field3.getName(), "INSTANCE") && C14360o3.A0K(field3.getType(), A003) && Modifier.isStatic(field3.getModifiers())) {
                        if (z) {
                            break;
                        }
                        field2 = field3;
                        z = true;
                    }
                    i++;
                } else if (z && field2 != null) {
                    Object obj3 = field2.get(null);
                    Method[] methods = A003.getMethods();
                    C14360o3.A07(methods);
                    int length3 = methods.length;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i2 < length3) {
                            Method method2 = methods[i2];
                            if (C14360o3.A0K(method2.getName(), "serializer")) {
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                C14360o3.A07(parameterTypes);
                                if (parameterTypes.length == 0 && C14360o3.A0K(method2.getReturnType(), C3R9.class)) {
                                    if (z2) {
                                        break;
                                    }
                                    method = method2;
                                    z2 = true;
                                }
                            }
                            i2++;
                        } else if (z2 && method != null) {
                            Object invoke = method.invoke(obj3, new Object[0]);
                            if ((invoke instanceof C3R9) && (c3r9 = (C3R9) invoke) != null) {
                                return c3r9;
                            }
                        }
                    }
                }
            }
        }
        C3R9[] c3r9Arr4 = (C3R9[]) Arrays.copyOf(c3r9Arr2, length);
        Class<?>[] declaredClasses = A003.getDeclaredClasses();
        C14360o3.A07(declaredClasses);
        int length4 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length4) {
                break;
            }
            Class<?> cls = declaredClasses[i3];
            if (cls.getAnnotation(NamedCompanion.class) != null) {
                String simpleName = cls.getSimpleName();
                C14360o3.A07(simpleName);
                Object obj4 = null;
                try {
                    Field declaredField2 = A003.getDeclaredField(simpleName);
                    declaredField2.setAccessible(true);
                    obj4 = declaredField2.get(null);
                } catch (Throwable unused2) {
                }
                if (obj4 != null && (A00 = A00(obj4, (C3R9[]) Arrays.copyOf(c3r9Arr4, c3r9Arr4.length))) != null) {
                    return A00;
                }
            } else {
                i3++;
            }
        }
        C3R9 c3r92 = null;
        try {
            Class<?>[] declaredClasses2 = A003.getDeclaredClasses();
            C14360o3.A07(declaredClasses2);
            int length5 = declaredClasses2.length;
            int i4 = 0;
            Class<?> cls2 = null;
            boolean z3 = false;
            while (true) {
                if (i4 < length5) {
                    Class<?> cls3 = declaredClasses2[i4];
                    if (C14360o3.A0K(cls3.getSimpleName(), "$serializer")) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        cls2 = cls3;
                    }
                    i4++;
                } else if (z3 && cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                    obj = field.get(null);
                }
            }
            obj = null;
        } catch (NoSuchFieldException unused3) {
        }
        if (obj instanceof C3R9) {
            c3r92 = (C3R9) obj;
            if (c3r92 != null) {
                return c3r92;
            }
        }
        if (A003.getAnnotation(Polymorphic.class) != null || ((serializable = (Serializable) A003.getAnnotation(Serializable.class)) != null && new C0YZ(serializable.with()).equals(new C0YZ(PolymorphicSerializer.class)))) {
            return new PolymorphicSerializer(new C0YZ(A003));
        }
        return null;
    }
}
