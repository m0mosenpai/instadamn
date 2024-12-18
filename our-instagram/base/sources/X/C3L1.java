package X;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.3L1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3L1 {
    public static final C3L1 A00;

    public Object A01(Class cls) {
        C3L2 c3l2 = (C3L2) this;
        A00(cls);
        return c3l2.A01.invoke(c3l2.A00, cls);
    }

    static {
        C3L1 c26677BqK;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c26677BqK = new C3L2(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    c26677BqK = new C26678BqL(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                c26677BqK = new C26679BqM(declaredMethod3, intValue);
            }
        } catch (Exception unused3) {
            c26677BqK = new C26677BqK();
        }
        A00 = c26677BqK;
    }

    public static void A00(Class cls) {
        String A002 = C47642Gp.A00(cls);
        if (A002 == null) {
        } else {
            throw new AssertionError(AnonymousClass001.A0R("UnsafeAllocator is used for non-instantiable type: ", A002));
        }
    }
}
