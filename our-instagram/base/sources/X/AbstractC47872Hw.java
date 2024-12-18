package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.2Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47872Hw {
    public static final AbstractC47892Hy A00;

    public static void A03(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(AnonymousClass001.A0g("Failed making ", A00(accessibleObject), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2Hy] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r0;
        try {
            r0 = new AbstractC47892Hy() { // from class: X.2Hx
                public final Method A00;
                public final Method A01;
                public final Method A02;
                public final Method A03 = Class.class.getMethod("isRecord", new Class[0]);

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC47892Hy
                public final Constructor A00(Class cls) {
                    try {
                        Object[] objArr = (Object[]) this.A01.invoke(cls, new Object[0]);
                        int length = objArr.length;
                        Class[] clsArr = new Class[length];
                        for (int i = 0; i < length; i++) {
                            clsArr[i] = this.A02.invoke(objArr[i], new Object[0]);
                        }
                        return cls.getDeclaredConstructor(clsArr);
                    } catch (ReflectiveOperationException e) {
                        AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
                        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
                    }
                }

                @Override // X.AbstractC47892Hy
                public final boolean A02(Class cls) {
                    try {
                        return ((Boolean) this.A03.invoke(cls, new Object[0])).booleanValue();
                    } catch (ReflectiveOperationException e) {
                        AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
                        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC47892Hy
                public final String[] A03(Class cls) {
                    try {
                        Object[] objArr = (Object[]) this.A01.invoke(cls, new Object[0]);
                        int length = objArr.length;
                        String[] strArr = new String[length];
                        for (int i = 0; i < length; i++) {
                            strArr[i] = this.A00.invoke(objArr[i], new Object[0]);
                        }
                        return strArr;
                    } catch (ReflectiveOperationException e) {
                        AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
                        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
                    }
                }

                {
                    Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
                    this.A01 = method;
                    Class<?> componentType = method.getReturnType().getComponentType();
                    this.A00 = componentType.getMethod("getName", new Class[0]);
                    this.A02 = componentType.getMethod("getType", new Class[0]);
                }

                @Override // X.AbstractC47892Hy
                public final Method A01(Class cls, Field field) {
                    try {
                        return cls.getMethod(field.getName(), new Class[0]);
                    } catch (ReflectiveOperationException e) {
                        AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
                        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            r0 = new Object();
        }
        A00 = r0;
    }

    public static String A00(AccessibleObject accessibleObject) {
        StringBuilder sb;
        String A01;
        String str = "'";
        if (accessibleObject instanceof Field) {
            sb = new StringBuilder();
            sb.append("field '");
            Field field = (Field) accessibleObject;
            A01 = AnonymousClass001.A0g(field.getDeclaringClass().getName(), "#", field.getName());
        } else if (accessibleObject instanceof Method) {
            Executable executable = (Executable) accessibleObject;
            StringBuilder sb2 = new StringBuilder(executable.getName());
            A02(sb2, executable);
            A01 = sb2.toString();
            sb = new StringBuilder();
            sb.append("method '");
            sb.append(executable.getDeclaringClass().getName());
            sb.append("#");
        } else if (accessibleObject instanceof Constructor) {
            sb = new StringBuilder();
            sb.append("constructor '");
            A01 = A01((Constructor) accessibleObject);
        } else {
            sb = new StringBuilder();
            sb.append("<unknown AccessibleObject> ");
            str = accessibleObject.toString();
            sb.append(str);
            return sb.toString();
        }
        sb.append(A01);
        sb.append(str);
        return sb.toString();
    }

    public static void A02(StringBuilder sb, AccessibleObject accessibleObject) {
        sb.append('(');
        Class<?>[] parameterTypes = ((Executable) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String A01(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        A02(sb, constructor);
        return sb.toString();
    }
}
