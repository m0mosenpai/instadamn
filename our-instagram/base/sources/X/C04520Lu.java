package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04520Lu extends C0HC {
    public static C04520Lu A05;
    public final Method A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;

    @Override // X.C0HC
    public final Class A01(String str) {
        Method method = this.A00;
        if (method == null) {
            return null;
        }
        try {
            return (Class) method.invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.C0HC
    public final Constructor A02(Class cls, Class... clsArr) {
        Method method = this.A01;
        if (method == null) {
            return null;
        }
        try {
            return (Constructor) method.invoke(cls, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.C0HC
    public final Field A03(Class cls, String str) {
        Method method = this.A02;
        if (method == null) {
            return null;
        }
        try {
            Field field = (Field) method.invoke(cls, str);
            if (field != null) {
                field.setAccessible(true);
            }
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.C0HC
    public final Method A04(Class cls, String str, Class... clsArr) {
        Method method = this.A04;
        if (method == null) {
            return null;
        }
        try {
            return (Method) method.invoke(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.C0HC
    public final Field[] A05(Class cls) {
        Method method = this.A03;
        if (method == null) {
            return null;
        }
        try {
            return (Field[]) method.invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C04520Lu() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5 = null;
        try {
            method = Class.class.getDeclaredMethod("forName", String.class);
            try {
                method2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                try {
                    method3 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                    try {
                        method4 = Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]);
                        try {
                            method5 = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        method4 = null;
                    }
                } catch (Throwable unused3) {
                    method3 = null;
                    method4 = null;
                    this.A00 = method;
                    this.A04 = method2;
                    this.A02 = method3;
                    this.A03 = method4;
                    this.A01 = method5;
                }
            } catch (Throwable unused4) {
                method2 = null;
                method3 = null;
                method4 = null;
                this.A00 = method;
                this.A04 = method2;
                this.A02 = method3;
                this.A03 = method4;
                this.A01 = method5;
            }
        } catch (Throwable unused5) {
            method = null;
            method2 = null;
        }
        this.A00 = method;
        this.A04 = method2;
        this.A02 = method3;
        this.A03 = method4;
        this.A01 = method5;
    }
}
