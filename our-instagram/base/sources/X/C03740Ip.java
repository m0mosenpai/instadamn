package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* renamed from: X.0Ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03740Ip {
    public static final C03730Io A0B = new Object();
    public int A00;
    public int A01;
    public final int A02;
    public final C03730Io A03;
    public final Class A04;
    public final Object A05 = new Object();
    public final String A06;
    public final Constructor A07;
    public final Constructor A08;
    public final Method A09;
    public final InterfaceC03680Ii[] A0A;

    public C03740Ip(Class cls, Class[] clsArr, int i) {
        int i2;
        Object obj;
        String str;
        Method declaredMethod;
        this.A04 = cls;
        String A0R = AnonymousClass001.A0R("ObjPool_", cls.getSimpleName());
        this.A06 = A0R;
        this.A02 = i;
        try {
            declaredMethod = cls.getDeclaredMethod("newInitWith", clsArr);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.getMessage();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i2 < clsArr.length) {
                    Class cls2 = clsArr[i2];
                    if (!cls2.isPrimitive()) {
                        i3++;
                        i2 = 2 >= i3 ? i2 + 1 : 0;
                        try {
                            Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
                            declaredConstructor.setAccessible(true);
                            obj = declaredConstructor;
                            break;
                        } catch (NoSuchMethodException e2) {
                            e2.getMessage();
                            String format = String.format("%s: Can't create an inst with the given types, \n you must either use default handled types (any combination of at most 2 objs and 2 ints) \n OR a ctor or method initer with name newInitWith which takes args (%s).\n\t Method init errmsg: %s\n\t ctor init errmsg: %s", A0R, Arrays.toString(clsArr), e.getMessage(), e2.getMessage());
                            android.util.Log.e(A0R, format);
                            throw new RuntimeException(format, e);
                        }
                    }
                    if (Integer.TYPE.equals(cls2) && 2 >= (i4 = i4 + 1)) {
                    }
                    Constructor declaredConstructor2 = cls.getDeclaredConstructor(clsArr);
                    declaredConstructor2.setAccessible(true);
                    obj = declaredConstructor2;
                    break;
                }
                obj = A0B;
                break;
            }
        }
        if (!Modifier.isStatic(declaredMethod.getModifiers())) {
            try {
                cls.getDeclaredConstructor(new Class[0]);
                obj = declaredMethod;
                try {
                    if (obj instanceof C03730Io) {
                        this.A03 = (C03730Io) obj;
                        this.A09 = null;
                        this.A07 = null;
                        str = "default initer";
                    } else if (obj instanceof Method) {
                        this.A03 = null;
                        this.A09 = (Method) obj;
                        this.A07 = null;
                        str = "method initer";
                    } else {
                        if (obj instanceof Constructor) {
                            this.A03 = null;
                            this.A09 = null;
                            this.A07 = (Constructor) obj;
                            this.A08 = null;
                            this.A0A = new InterfaceC03680Ii[i];
                            this.A00 = 0;
                            this.A01 = 0;
                        }
                        throw new IllegalStateException(obj.getClass().getName());
                    }
                    Constructor declaredConstructor3 = cls.getDeclaredConstructor(new Class[0]);
                    declaredConstructor3.setAccessible(true);
                    this.A08 = declaredConstructor3;
                    this.A0A = new InterfaceC03680Ii[i];
                    this.A00 = 0;
                    this.A01 = 0;
                } catch (NoSuchMethodException e3) {
                    android.util.Log.w(A0R, AnonymousClass001.A0u("Could not find empty ctor ", str, ": ", e3.getMessage()));
                    throw new RuntimeException(e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new NoSuchMethodException(String.format("%s: Ctor %s. newInitWith (%s) cannot be used if there is no empty ctor. Err msg: %s", A0R, cls, Arrays.toString(clsArr), e4.getMessage()));
            }
        }
    }

    private InterfaceC03680Ii A00() {
        if (this.A00 == this.A01) {
            return null;
        }
        synchronized (this.A05) {
            int i = this.A00;
            if (i == this.A01) {
                return null;
            }
            InterfaceC03680Ii[] interfaceC03680IiArr = this.A0A;
            InterfaceC03680Ii interfaceC03680Ii = interfaceC03680IiArr[i];
            interfaceC03680IiArr[i] = null;
            int i2 = i + 1;
            int i3 = this.A02;
            if (i3 <= i2) {
                i2 -= i3;
            }
            this.A00 = i2;
            return interfaceC03680Ii;
        }
    }

    public static InterfaceC03680Ii A01(C03740Ip c03740Ip, Object obj, Object obj2, int i, int i2) {
        String str;
        String str2;
        c03740Ip.A03.getClass();
        InterfaceC03680Ii A00 = c03740Ip.A00();
        if (A00 == null) {
            Constructor constructor = c03740Ip.A08;
            String str3 = c03740Ip.A06;
            C0J8.A05(constructor, "%s: Must have an empty ctor to create obj pool item", str3);
            try {
                A00 = (InterfaceC03680Ii) constructor.newInstance(new Object[0]);
                AbstractC03460Gz abstractC03460Gz = (AbstractC03460Gz) A00;
                boolean z = false;
                if (abstractC03460Gz.A00 == null) {
                    z = true;
                }
                C0J8.A07(z);
                abstractC03460Gz.A00 = c03740Ip;
            } catch (Exception e) {
                Class cls = c03740Ip.A04;
                if (obj != null) {
                    str = obj.getClass().getName();
                } else {
                    str = "<Unknown Class>";
                }
                if (obj2 != null) {
                    str2 = obj2.getClass().getName();
                } else {
                    str2 = "<Unknown Class>";
                }
                throw new RuntimeException(String.format("%s: Failed to init %s with args (obj1: %s, obj2: %s, arg1: %s, arg2: %s)", str3, cls, str, str2, Integer.valueOf(i), Integer.valueOf(i2)), e);
            }
        }
        A00.DVm(i, i2, obj, obj2);
        return A00;
    }

    public static void A03(Object obj, boolean z) {
        if (obj != null && (obj instanceof InterfaceC03680Ii)) {
            if (obj instanceof AbstractC03460Gz) {
                ((AbstractC03460Gz) obj).A01(z);
                return;
            }
            InterfaceC03680Ii interfaceC03680Ii = (InterfaceC03680Ii) obj;
            if (z && !((AbstractC03460Gz) interfaceC03680Ii).A02) {
                return;
            }
            C03740Ip c03740Ip = ((AbstractC03460Gz) interfaceC03680Ii).A00;
            c03740Ip.getClass();
            c03740Ip.A04(interfaceC03680Ii);
        }
    }

    public final void A04(InterfaceC03680Ii interfaceC03680Ii) {
        if (interfaceC03680Ii != null) {
            C03740Ip c03740Ip = ((AbstractC03460Gz) interfaceC03680Ii).A00;
            c03740Ip.getClass();
            int i = 0;
            boolean z = true;
            if (c03740Ip != this) {
                z = false;
            }
            String str = this.A06;
            if (z) {
                int i2 = this.A00;
                int i3 = this.A01;
                if (i2 == 0) {
                    i2 = this.A02;
                }
                if (i3 != i2 - 1) {
                    interfaceC03680Ii.recycle();
                    synchronized (this.A05) {
                        int i4 = this.A00;
                        int i5 = this.A01;
                        boolean z2 = false;
                        if (i4 != 0) {
                            z2 = true;
                            if (i5 == i4 - 1) {
                            }
                        }
                        boolean z3 = false;
                        if (i5 == this.A02 - 1) {
                            z3 = true;
                        }
                        if (z2 || !z3) {
                            this.A0A[i5] = interfaceC03680Ii;
                            if (!z3) {
                                i = i5 + 1;
                            }
                            this.A01 = i;
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("%s: Recycle was given an inst of another pool", str));
        }
    }

    public static InterfaceC03680Ii A02(C03740Ip c03740Ip, Object... objArr) {
        InterfaceC03680Ii interfaceC03680Ii;
        InterfaceC03680Ii A00 = c03740Ip.A00();
        if (A00 != null) {
            if (c03740Ip.A03 != null) {
                C03730Io.A00(A00, null, objArr, true);
                return A00;
            }
            Method method = c03740Ip.A09;
            if (method != null) {
                try {
                    method.invoke(A00, objArr);
                } catch (Exception e) {
                    throw new RuntimeException(String.format("%s: Cannot reuse class %s with method %s. Err %s: %s", c03740Ip.A06, c03740Ip.A04, method.getName(), e.getClass(), e.getMessage()), e);
                }
            }
            ((AbstractC03460Gz) A00).DVm(0, 0, null, null);
            return A00;
        }
        try {
            Constructor constructor = c03740Ip.A08;
            if (c03740Ip.A03 != null) {
                interfaceC03680Ii = C03730Io.A00(null, c03740Ip, objArr, false);
            } else {
                Constructor constructor2 = c03740Ip.A07;
                if (constructor2 != null) {
                    interfaceC03680Ii = (InterfaceC03680Ii) constructor2.newInstance(objArr);
                } else {
                    Method method2 = c03740Ip.A09;
                    if (method2 != null) {
                        C0J8.A05(constructor, "%s: Must have an empty ctor to use method init", c03740Ip.A06);
                        interfaceC03680Ii = (InterfaceC03680Ii) constructor.newInstance(new Object[0]);
                        method2.invoke(interfaceC03680Ii, objArr);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            AbstractC03460Gz abstractC03460Gz = (AbstractC03460Gz) interfaceC03680Ii;
            boolean z = false;
            if (abstractC03460Gz.A00 == null) {
                z = true;
            }
            C0J8.A07(z);
            abstractC03460Gz.A00 = c03740Ip;
            return interfaceC03680Ii;
        } catch (Exception e2) {
            throw new RuntimeException(String.format("Failed to init %s with %d args (%s)", c03740Ip.A04, Integer.valueOf(objArr.length), Arrays.toString(objArr)), e2);
        }
    }
}
