package X;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0HC, reason: invalid class name */
/* loaded from: classes.dex */
public class C0HC {
    public static C0HC A00 = new Object();
    public static C0HC A01;
    public static final boolean A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0HC, java.lang.Object] */
    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 31) {
            z = true;
        }
        A02 = z;
    }

    public static C0HC A00() {
        C0HC c0hc = A01;
        C0HC c0hc2 = c0hc;
        if (c0hc == null) {
            C0HC c0hc3 = A00;
            A01 = c0hc3;
            c0hc2 = c0hc3;
            if (A02) {
                C04520Lu c04520Lu = C04520Lu.A05;
                C04520Lu c04520Lu2 = c04520Lu;
                if (c04520Lu == null) {
                    C04520Lu c04520Lu3 = new C04520Lu();
                    C04520Lu.A05 = c04520Lu3;
                    c04520Lu2 = c04520Lu3;
                }
                A01 = c04520Lu2;
                c0hc2 = c04520Lu2;
            }
        }
        return c0hc2;
    }

    public Class A01(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Constructor A02(Class cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Field A03(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Method A04(Class cls, String str, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Field[] A05(Class cls) {
        try {
            return cls.getDeclaredFields();
        } catch (Throwable unused) {
            return null;
        }
    }
}
