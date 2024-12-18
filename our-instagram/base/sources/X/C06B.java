package X;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.06B, reason: invalid class name */
/* loaded from: classes.dex */
public class C06B {
    public static final C005001p A00 = new C005001p(0);

    public static Class A00(String str, ClassLoader classLoader) {
        try {
            C005001p c005001p = A00;
            C005001p c005001p2 = (C005001p) c005001p.get(classLoader);
            if (c005001p2 == null) {
                c005001p2 = new C005001p(0);
                c005001p.put(classLoader, c005001p2);
            }
            Class cls = (Class) c005001p2.get(str);
            if (cls == null) {
                Class<?> cls2 = Class.forName(str, false, classLoader);
                c005001p2.put(str, cls2);
                return cls2;
            }
            return cls;
        } catch (ClassCastException e) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment A01(ClassLoader classLoader, String str) {
        try {
            return (Fragment) A00(str, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
