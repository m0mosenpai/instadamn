package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.45z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C914045z {
    public static final Annotation[] A02 = new Annotation[0];
    public static final AnonymousClass460[] A01 = new AnonymousClass460[0];
    public static final Iterator A00 = Collections.emptyList().iterator();

    public static Constructor A0A(Class cls, boolean z) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                A0H(declaredConstructor, z);
                return declaredConstructor;
            }
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException(AnonymousClass001.A0g("Default constructor for ", cls.getName(), " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type"));
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            A0G(e, AnonymousClass001.A0u("Failed to find default constructor of class ", cls.getName(), ", problem: ", e.getMessage()));
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (!Modifier.isPublic(member.getModifiers()) || !Modifier.isPublic(declaringClass.getModifiers()) || (z && !A0J(declaringClass))) {
                accessibleObject.setAccessible(true);
            }
        } catch (SecurityException e) {
            if (!accessibleObject.isAccessible()) {
                Class<?> declaringClass2 = member.getDeclaringClass();
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot access ");
                sb.append(member);
                sb.append(" (from class ");
                sb.append(declaringClass2.getName());
                sb.append("; failed to set access: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RuntimeException e2) {
            Class<?> cls = e2.getClass();
            if ("InaccessibleObjectException".equals(cls.getSimpleName())) {
                throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", member.getClass().getSimpleName(), member.getName(), A06(member.getDeclaringClass()), cls.getName(), e2.getMessage()), e2);
            }
            throw e2;
        }
    }

    public static Class A02(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0g("Class ", cls.getName(), AbstractC58317Pt9.A00(411)));
    }

    public static String A04(AbstractC910944l abstractC910944l) {
        if (abstractC910944l == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(((AbstractC911744t) abstractC910944l).A0R());
        sb.append('`');
        return sb.toString();
    }

    public static String A06(Class cls) {
        String name;
        if (cls != null) {
            int i = 0;
            while (cls.isArray()) {
                i++;
                cls = cls.getComponentType();
            }
            if (cls.isPrimitive()) {
                name = cls.getSimpleName();
            } else {
                name = cls.getName();
            }
            if (i > 0) {
                StringBuilder sb = new StringBuilder(name);
                do {
                    sb.append("[]");
                    i--;
                } while (i > 0);
                name = sb.toString();
            }
            if (name != null) {
                StringBuilder sb2 = new StringBuilder(name.length() + 2);
                sb2.append('`');
                sb2.append(name);
                sb2.append('`');
                return sb2.toString();
            }
            return "[null]";
        }
        return "[null]";
    }

    public static String A07(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "[null]";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return A06(cls);
    }

    public static String A08(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static String A09(Throwable th) {
        if (th instanceof AnonymousClass401) {
            return ((AnonymousClass401) th).A06();
        }
        if ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        return th.getMessage();
    }

    public static void A0B(AnonymousClass182 anonymousClass182, Closeable closeable, Exception exc) {
        if (anonymousClass182 != null) {
            anonymousClass182.A0C(AnonymousClass160.AUTO_CLOSE_JSON_CONTENT);
            try {
                anonymousClass182.close();
            } catch (Exception e) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc, e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc, e2);
            }
        }
        if (!(exc instanceof IOException)) {
            A0F(exc);
            throw new RuntimeException(exc);
        }
        throw exc;
    }

    public static void A0C(AnonymousClass182 anonymousClass182, Exception exc) {
        anonymousClass182.A0C(AnonymousClass160.AUTO_CLOSE_JSON_CONTENT);
        try {
            anonymousClass182.close();
        } catch (Exception e) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc, e);
        }
        if (!(exc instanceof IOException)) {
            A0F(exc);
            throw new RuntimeException(exc);
        }
        throw exc;
    }

    public static void A0D(AnonymousClass469 anonymousClass469, IOException iOException) {
        if (iOException instanceof C102314j6) {
            throw iOException;
        }
        C102314j6 c102314j6 = new C102314j6(anonymousClass469.A07, iOException.getMessage());
        c102314j6.initCause(iOException);
        throw c102314j6;
    }

    public static void A0F(Throwable th) {
        if (!(th instanceof RuntimeException)) {
        } else {
            throw th;
        }
    }

    public static boolean A0I(Class cls) {
        if (cls != Void.class && cls != Void.TYPE && cls != C62197S1s.class) {
            return false;
        }
        return true;
    }

    public static boolean A0K(Object obj) {
        if (obj != null && obj.getClass().getAnnotation(JacksonStdImpl.class) == null) {
            return false;
        }
        return true;
    }

    public static Annotation[] A0L(Class cls) {
        if (cls != Object.class && !cls.isPrimitive()) {
            return cls.getDeclaredAnnotations();
        }
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001a, code lost:
    
        if (r4.getEnclosingMethod() == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class A00(java.lang.Class r4) {
        /*
            int r0 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r0)
            r0 = 0
            if (r1 != 0) goto L2c
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L1c
            boolean r1 = r4.isPrimitive()     // Catch: java.lang.SecurityException -> L2c
            if (r1 != 0) goto L1c
            java.lang.reflect.Method r2 = r4.getEnclosingMethod()     // Catch: java.lang.SecurityException -> L2c
            r1 = 1
            if (r2 != 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L2b
            if (r4 == r3) goto L2b
            boolean r1 = r4.isPrimitive()     // Catch: java.lang.SecurityException -> L2c
            if (r1 != 0) goto L2b
            java.lang.Class r0 = r4.getEnclosingClass()     // Catch: java.lang.SecurityException -> L2c
        L2b:
            return r0
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914045z.A00(java.lang.Class):java.lang.Class");
    }

    public static Class A01(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls == Integer.class) {
                return Integer.TYPE;
            }
            if (cls == Long.class) {
                return Long.TYPE;
            }
            if (cls == Boolean.class) {
                return Boolean.TYPE;
            }
            if (cls == Double.class) {
                return Double.TYPE;
            }
            if (cls == Float.class) {
                return Float.TYPE;
            }
            if (cls == Byte.class) {
                return Byte.TYPE;
            }
            if (cls == Short.class) {
                return Short.TYPE;
            }
            if (cls == Character.class) {
                return Character.TYPE;
            }
            return null;
        }
        return cls;
    }

    public static Object A03(Class cls, boolean z) {
        Constructor A0A = A0A(cls, z);
        if (A0A != null) {
            try {
                return A0A.newInstance(new Object[0]);
            } catch (Exception e) {
                A0G(e, AnonymousClass001.A0u("Failed to instantiate class ", cls.getName(), ", problem: ", e.getMessage()));
                throw C00O.createAndThrow();
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0g("Class ", cls.getName(), " has no default (no arg) constructor"));
    }

    public static String A05(Class cls) {
        if (cls.isAnnotation()) {
            return AbstractC43591JPw.A00(294);
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void A0E(Class cls, Object obj, String str) {
        Class<?> cls2 = obj.getClass();
        if (cls2 == cls) {
        } else {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", cls2.getName(), cls.getName(), str));
        }
    }

    public static void A0G(Throwable th, String str) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        A0F(th);
        if (!(th instanceof Error)) {
            throw new IllegalArgumentException(str, th);
        }
        throw th;
    }

    public static boolean A0J(Class cls) {
        String name = cls.getName();
        if (!name.startsWith("java.") && !name.startsWith("javax.")) {
            return false;
        }
        return true;
    }

    public static Method[] A0M(Class cls) {
        try {
            try {
                return cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                e = e;
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null) {
                    try {
                        return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                    } catch (ClassNotFoundException e2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), e.getClass().getName(), e.getMessage()), e);
                    }
                }
                throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), e.getClass().getName(), e.getMessage()), e);
            }
        } catch (Throwable th) {
            e = th;
            throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), e.getClass().getName(), e.getMessage()), e);
        }
    }
}
