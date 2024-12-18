package X;

import android.os.Build;
import com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0H5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0H5 {
    public static int A01 = -2;
    public static Method A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static boolean A0A;
    public static boolean A0B;
    public static volatile C0MS A0H;
    public static volatile boolean A0I;
    public final ClassLoader A00 = A0D;
    public static final C03720In A0C = new C03720In("HiddenApis");
    public static final Object A0G = new Object();
    public static final ClassLoader A0D = C0H5.class.getClassLoader();
    public static final Object A0E = new Object();
    public static final Map A0F = new HashMap();

    public static Class A03(C0H3 c0h3, ClassLoader classLoader, String str) {
        String str2;
        String str3;
        if (A00() != null) {
            boolean z = false;
            if (C0MS.A0A != null) {
                z = true;
            }
            if (z) {
                int i = !A0E(c0h3, str) ? 1 : 0;
                ClassNotFoundException classNotFoundException = null;
                int i2 = i ^ 1;
                for (int i3 = 0; i3 < 2; i3++) {
                    int i4 = (i2 + i3) % 2;
                    if (i4 != 0) {
                        return Class.forName(str, true, classLoader);
                    }
                    try {
                        Method method = C0MS.A09;
                        if (method == null) {
                            return Class.forName(str, true, classLoader);
                        }
                        Throwable th = null;
                        try {
                            Class cls = (Class) method.invoke(null, str, true, classLoader);
                            if (cls != null) {
                                return cls;
                            }
                        } catch (Exception e) {
                            e = e;
                            th = e;
                            while (e != null) {
                                if (!(e instanceof ClassNotFoundException)) {
                                    e = e.getCause();
                                } else {
                                    throw e;
                                }
                            }
                        }
                        if (th == null) {
                            str3 = "None found";
                        } else {
                            str3 = th.getMessage();
                        }
                        throw new ClassNotFoundException(String.format("Class %s could not be found with given class loader. Error: %s", str, str3));
                    } catch (ClassNotFoundException e2) {
                        C03720In c03720In = A0C;
                        if (i4 % 2 != 0) {
                            str2 = "normal";
                        } else {
                            str2 = "internal Reflect";
                        }
                        Object[] objArr = {str, str2};
                        if (C03720In.A02) {
                            c03720In.A06("Could not load class %s from %s forName.", e2, objArr, 3, 2);
                        }
                        if (i4 == 1) {
                            classNotFoundException = e2;
                        }
                    }
                }
                C03720In c03720In2 = A0C;
                Object[] objArr2 = new Object[2];
                objArr2[0] = str;
                String str4 = "NOT ";
                if (classNotFoundException == null) {
                    if (i != 0) {
                        str4 = "";
                    }
                    objArr2[1] = str4;
                    c03720In2.A08("Internal with forName and also could not find class %s (can%s be hidden)", objArr2);
                } else {
                    if (i != 0) {
                        str4 = "";
                    }
                    objArr2[1] = str4;
                    c03720In2.A0A(classNotFoundException, "Could not find class %s (can%s be hidden)", objArr2);
                    throw classNotFoundException;
                }
            }
        }
        return Class.forName(str, true, classLoader);
    }

    public final Class A0J(String str, ClassLoader classLoader) {
        return A04(null, classLoader, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: Exception -> 0x014c, TRY_ENTER, TryCatch #2 {Exception -> 0x014c, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:8:0x0012, B:9:0x0023, B:13:0x0019, B:15:0x0026, B:17:0x002c, B:19:0x0032, B:20:0x0035, B:25:0x003f, B:31:0x005a, B:32:0x005e, B:34:0x0099, B:35:0x009c, B:37:0x00a1, B:39:0x00a5, B:41:0x00a9, B:43:0x00ad, B:47:0x00b2, B:49:0x00bf, B:50:0x00c2, B:55:0x00cc, B:60:0x00e4, B:61:0x00e8, B:65:0x00d9, B:68:0x0105, B:70:0x010f, B:72:0x011c, B:73:0x0123, B:74:0x0132, B:81:0x00f0, B:83:0x00f4, B:85:0x00f8, B:87:0x00fc, B:89:0x0100, B:100:0x0134, B:101:0x013a, B:104:0x004d, B:107:0x006f, B:109:0x0075, B:110:0x0079, B:111:0x0088, B:117:0x0066, B:119:0x006a, B:124:0x008d, B:125:0x0093, B:127:0x0140, B:129:0x0146, B:130:0x014b), top: B:2:0x0002, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: Exception -> 0x014c, TryCatch #2 {Exception -> 0x014c, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:8:0x0012, B:9:0x0023, B:13:0x0019, B:15:0x0026, B:17:0x002c, B:19:0x0032, B:20:0x0035, B:25:0x003f, B:31:0x005a, B:32:0x005e, B:34:0x0099, B:35:0x009c, B:37:0x00a1, B:39:0x00a5, B:41:0x00a9, B:43:0x00ad, B:47:0x00b2, B:49:0x00bf, B:50:0x00c2, B:55:0x00cc, B:60:0x00e4, B:61:0x00e8, B:65:0x00d9, B:68:0x0105, B:70:0x010f, B:72:0x011c, B:73:0x0123, B:74:0x0132, B:81:0x00f0, B:83:0x00f4, B:85:0x00f8, B:87:0x00fc, B:89:0x0100, B:100:0x0134, B:101:0x013a, B:104:0x004d, B:107:0x006f, B:109:0x0075, B:110:0x0079, B:111:0x0088, B:117:0x0066, B:119:0x006a, B:124:0x008d, B:125:0x0093, B:127:0x0140, B:129:0x0146, B:130:0x014b), top: B:2:0x0002, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: Exception -> 0x014c, TryCatch #2 {Exception -> 0x014c, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:8:0x0012, B:9:0x0023, B:13:0x0019, B:15:0x0026, B:17:0x002c, B:19:0x0032, B:20:0x0035, B:25:0x003f, B:31:0x005a, B:32:0x005e, B:34:0x0099, B:35:0x009c, B:37:0x00a1, B:39:0x00a5, B:41:0x00a9, B:43:0x00ad, B:47:0x00b2, B:49:0x00bf, B:50:0x00c2, B:55:0x00cc, B:60:0x00e4, B:61:0x00e8, B:65:0x00d9, B:68:0x0105, B:70:0x010f, B:72:0x011c, B:73:0x0123, B:74:0x0132, B:81:0x00f0, B:83:0x00f4, B:85:0x00f8, B:87:0x00fc, B:89:0x0100, B:100:0x0134, B:101:0x013a, B:104:0x004d, B:107:0x006f, B:109:0x0075, B:110:0x0079, B:111:0x0088, B:117:0x0066, B:119:0x006a, B:124:0x008d, B:125:0x0093, B:127:0x0140, B:129:0x0146, B:130:0x014b), top: B:2:0x0002, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0K(java.lang.Class r12, java.lang.Object... r13) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5.A0K(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    public final Field A0M(C0H3 c0h3, Class cls, String str) {
        try {
            Field A052 = A05(c0h3, cls, null, str);
            if (A052 != null) {
                A052.setAccessible(true);
            }
            return A052;
        } catch (NoSuchFieldException e) {
            e.getMessage();
            return null;
        }
    }

    public static C0MS A00() {
        if (A0I) {
            return null;
        }
        C0MS c0ms = A0H;
        if (c0ms != null) {
            return c0ms;
        }
        synchronized (A0G) {
            C0MS c0ms2 = A0H;
            if (c0ms2 == null) {
                int i = A01;
                if (i < 0) {
                    i = 0;
                }
                c0ms2 = new C0MS(i, A03);
                if (!c0ms2.A03()) {
                    A0I = true;
                    return null;
                }
                A0H = c0ms2;
            }
            return c0ms2;
        }
    }

    public static C0H5 A01(C0H5 c0h5, int i, boolean z) {
        C03720In c03720In;
        Object[] objArr;
        String str;
        if (c0h5 == null) {
            C0MS c0ms = A0H;
            if (c0ms != null) {
                c0ms.A02 = z;
            }
            A03 = z;
            int i2 = A01;
            if (i2 < 0) {
                if (i != -4) {
                    A01 = i;
                } else {
                    c03720In = A0C;
                    objArr = new Object[0];
                    str = "TargetSdkVersion is not set yet, so cannot rely on cached value";
                    c03720In.A07(str, objArr);
                }
            } else if (i != -4 && i >= 0 && i != i2) {
                c03720In = A0C;
                objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2)};
                str = "The given target sdk version %s is different than the cached sdk version %d";
                c03720In.A07(str, objArr);
            }
            return new C0H5();
        }
        return c0h5;
    }

    public static Field A05(C0H3 c0h3, Class cls, Class cls2, String str) {
        C0MS A00;
        String str2;
        if (c0h3 == null) {
            c0h3 = C0H3.A03;
        }
        cls.getClass();
        try {
            boolean z = true;
            if (A03 && !A0I && c0h3 != null) {
                z = c0h3.A01;
            }
            C0MS A002 = A00();
            Method method = C0MS.A0C;
            boolean z2 = false;
            if (method != null) {
                z2 = true;
            }
            if (z2 && A002 != null) {
                String name = cls.getName();
                if (!A0E(c0h3, name)) {
                    Exception e = null;
                    try {
                        if (str != null) {
                            if (method == null) {
                                return cls.getDeclaredField(str);
                            }
                            try {
                                Field field = (Field) method.invoke(cls, str);
                                if (field != null) {
                                    return field;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                for (Throwable th = e; th != null; th = th.getCause()) {
                                    if (th instanceof NoSuchFieldException) {
                                        throw th;
                                    }
                                }
                            }
                            if (e == null) {
                                str2 = "None found";
                            } else {
                                str2 = e.getMessage();
                            }
                            throw new NoSuchFieldException(String.format("Method %s.%s ( %s ) could not be found. Error msg: %s", name, str, str2));
                        }
                        throw null;
                    } catch (NoSuchFieldException e3) {
                        e3.getMessage();
                        if (!z) {
                            throw e3;
                        }
                    }
                }
            }
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            if (!A0D(c0h3)) {
                C0J8.A07(c0h3.A00);
                if (!A0I && (A00 = A00()) != null) {
                    StringBuilder sb = new StringBuilder(C0MS.A00(cls));
                    sb.append("->");
                    if (str != null) {
                        sb.append(str);
                        sb.append(':');
                        if (cls2 != null) {
                            sb.append(C0MS.A01(cls2));
                        }
                    }
                    String obj = sb.toString();
                    if (obj != null) {
                        A00.A04(obj);
                    }
                }
            }
            throw e4;
        }
    }

    public static Method A06() {
        boolean z = A04;
        Method method = A02;
        if (!z) {
            try {
                try {
                    C0H3 c0h3 = C0H3.A02;
                    method = A08(c0h3, A03(c0h3, A0D, "dalvik.system.VMStack"), "getStackClass2", new Class[0], false);
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    A02 = method;
                } catch (Exception e) {
                    A0C.A08("Could not get VMStack.getStackClass2. Error %s: %s", e.getClass(), e.getMessage());
                    method = null;
                }
            } finally {
                A04 = true;
            }
        }
        if (method == null) {
            return null;
        }
        boolean z2 = A08;
        boolean z3 = A0B;
        if (!z2) {
            z3 = HiddenApis$TestGetCallingClassClass.callAndCheckVMStackGetStackClass2(method);
            A0B = z3;
            A08 = true;
        }
        if (!z3) {
            return null;
        }
        return method;
    }

    public static Method A07(C0H3 c0h3, Class cls, Class cls2, String str, Class... clsArr) {
        if (c0h3 == null) {
            c0h3 = C0H3.A03;
        }
        cls.getClass();
        try {
            boolean z = true;
            if (A03 && !A0I && c0h3 != null) {
                z = c0h3.A01;
            }
            return A08(c0h3, cls, str, clsArr, z);
        } catch (NoSuchMethodException e) {
            if (!A0D(c0h3)) {
                C0J8.A07(c0h3.A00);
                A0F(cls, cls2, str, clsArr);
            }
            throw e;
        }
    }

    public static boolean A09() {
        boolean z = A05;
        boolean z2 = A09;
        if (!z) {
            boolean testJdkInternalReflectGetCallingClass = HiddenApis$TestGetCallingClassClass.testJdkInternalReflectGetCallingClass();
            A09 = testJdkInternalReflectGetCallingClass;
            A05 = true;
            return testJdkInternalReflectGetCallingClass;
        }
        return z2;
    }

    public static boolean A0A() {
        if (33 <= Build.VERSION.SDK_INT) {
            return false;
        }
        boolean z = A06;
        boolean z2 = A0A;
        if (z) {
            return z2;
        }
        boolean testSunReflectGetCallingClass = HiddenApis$TestGetCallingClassClass.testSunReflectGetCallingClass();
        A0A = testSunReflectGetCallingClass;
        A06 = true;
        return testSunReflectGetCallingClass;
    }

    public static boolean A0B() {
        if (A07) {
            return false;
        }
        boolean testVMStackGetCallingClassLoader = HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader();
        A07 = true;
        return testVMStackGetCallingClassLoader;
    }

    public static boolean A0C(C0MS c0ms, String str) {
        Map map;
        Boolean bool;
        Object obj = A0E;
        synchronized (obj) {
            map = A0F;
            bool = (Boolean) map.get(str);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {AnonymousClass001.A0E(new String[]{str}[0].replace('.', '/'), 'L', ';')};
        String.format("Exempting classes %s", Arrays.toString(strArr));
        boolean A042 = c0ms.A04(strArr);
        synchronized (obj) {
            map.put(str, Boolean.valueOf(A042));
        }
        return false;
    }

    public static boolean A0D(C0H3 c0h3) {
        if (!A03 || A0I || c0h3 == null) {
            return true;
        }
        return !c0h3.A00;
    }

    public static boolean A0E(C0H3 c0h3, String str) {
        if (str.contains("com.facebook")) {
            if (c0h3 != null && !c0h3.equals(C0H3.A02)) {
                if (!c0h3.A01 && c0h3.A00) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0F(Class cls, Class cls2, String str, Class... clsArr) {
        C0MS A00;
        if (!A0I && (A00 = A00()) != null) {
            StringBuilder sb = new StringBuilder(C0MS.A00(cls));
            sb.append("->");
            sb.append(str);
            sb.append('(');
            for (Class cls3 : clsArr) {
                sb.append(C0MS.A01(cls3));
            }
            if (cls2 != null) {
                sb.append(')');
                sb.append(C0MS.A01(cls2));
            }
            String obj = sb.toString();
            if (obj != null) {
                A00.A04(obj);
            }
            Arrays.toString(clsArr);
        }
        return false;
    }

    public static final Class A04(C0H3 c0h3, ClassLoader classLoader, String str) {
        C0MS A00;
        classLoader.getClass();
        if (c0h3 == null) {
            c0h3 = C0H3.A03;
        }
        try {
            return A03(c0h3, classLoader, str);
        } catch (ClassNotFoundException e) {
            if (!A0D(c0h3)) {
                C0J8.A07(c0h3.A00);
                boolean z = false;
                if (!A0I && (A00 = A00()) != null) {
                    z = A0C(A00, str);
                }
                if (z) {
                    return Class.forName(str, true, classLoader);
                }
            }
            throw e;
        }
    }

    public static Method A08(C0H3 c0h3, Class cls, String str, Class[] clsArr, boolean z) {
        String str2;
        Method method;
        C0MS A00 = A00();
        if (A00 == null) {
            Arrays.toString(clsArr);
        }
        Method method2 = C0MS.A0D;
        boolean z2 = false;
        if (method2 != null) {
            z2 = true;
        }
        if (z2 && A00 != null) {
            String name = cls.getName();
            if (!A0E(c0h3, name)) {
                Exception e = null;
                try {
                    if (method2 != null) {
                        try {
                            method = (Method) method2.invoke(cls, str, clsArr);
                            if (method != null) {
                            }
                        } catch (Exception e2) {
                            e = e2;
                            for (Throwable th = e; th != null; th = th.getCause()) {
                                if (th instanceof NoSuchMethodException) {
                                    throw th;
                                }
                            }
                        }
                        String arrays = Arrays.toString(clsArr);
                        if (e != null) {
                            str2 = e.getMessage();
                        } else {
                            str2 = "None found";
                        }
                        throw new NoSuchMethodException(String.format("Method %s.%s ( %s ) could not be found. Error msg: %s", name, str, arrays, str2));
                    }
                    method = cls.getDeclaredMethod(str, clsArr);
                    Arrays.toString(clsArr);
                    return method;
                } catch (NoSuchMethodException e3) {
                    Arrays.toString(clsArr);
                    if (!z) {
                        throw e3;
                    }
                }
            }
        }
        return cls.getDeclaredMethod(str, clsArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class A0G(X.C0H3 r9, java.lang.String r10) {
        /*
            r8 = this;
            A0B()
            java.lang.String r7 = "forName W/ Hint"
            r4 = 0
            r5 = 0
            r6 = r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L32
            boolean r0 = A0A()
            if (r0 == 0) goto L32
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch: java.lang.NoSuchMethodError -> L24 java.lang.NoClassDefFoundError -> L26
            if (r0 == 0) goto L32
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.NoSuchMethodError -> L22 java.lang.NoClassDefFoundError -> L28
            goto L32
        L22:
            r2 = move-exception
            goto L29
        L24:
            r2 = move-exception
            goto L29
        L26:
            r2 = move-exception
            goto L29
        L28:
            r2 = move-exception
        L29:
            X.0In r1 = X.C0H5.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0D(r2, r3, r0)
        L32:
            if (r6 != 0) goto L56
            boolean r0 = A09()
            if (r0 == 0) goto L56
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch: java.lang.NoSuchMethodError -> L47 java.lang.NoClassDefFoundError -> L49
            if (r0 == 0) goto L56
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.NoSuchMethodError -> L45 java.lang.NoClassDefFoundError -> L4b
            goto L56
        L45:
            r2 = move-exception
            goto L4c
        L47:
            r2 = move-exception
            goto L4c
        L49:
            r2 = move-exception
            goto L4c
        L4b:
            r2 = move-exception
        L4c:
            X.0In r1 = X.C0H5.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0D(r2, r3, r0)
            r6 = r4
        L56:
            if (r6 != 0) goto L86
            java.lang.reflect.Method r1 = A06()
            if (r1 == 0) goto L86
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            if (r0 == 0) goto L71
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L6d java.lang.IllegalAccessException -> L6f java.lang.IllegalArgumentException -> L79
            goto L85
        L6d:
            r3 = move-exception
            goto L7a
        L6f:
            r3 = move-exception
            goto L7a
        L71:
            r4 = r6
            goto L85
        L73:
            r3 = move-exception
            goto L7a
        L75:
            r3 = move-exception
            goto L7a
        L77:
            r3 = move-exception
            goto L7a
        L79:
            r3 = move-exception
        L7a:
            X.0In r2 = X.C0H5.A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0D(r3, r0, r1)
        L85:
            r6 = r4
        L86:
            if (r6 != 0) goto L8a
            java.lang.ClassLoader r6 = r8.A00
        L8a:
            java.lang.Class r0 = A04(r9, r6, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5.A0G(X.0H3, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class A0H(X.C0H3 r9, java.lang.String r10) {
        /*
            r8 = this;
            A0B()
            java.lang.String r7 = "getClassOrNull W/ Hint"
            r4 = 0
            r5 = 0
            r6 = r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L32
            boolean r0 = A0A()
            if (r0 == 0) goto L32
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch: java.lang.NoSuchMethodError -> L24 java.lang.NoClassDefFoundError -> L26
            if (r0 == 0) goto L32
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.NoSuchMethodError -> L22 java.lang.NoClassDefFoundError -> L28
            goto L32
        L22:
            r2 = move-exception
            goto L29
        L24:
            r2 = move-exception
            goto L29
        L26:
            r2 = move-exception
            goto L29
        L28:
            r2 = move-exception
        L29:
            X.0In r1 = X.C0H5.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0D(r2, r3, r0)
        L32:
            if (r6 != 0) goto L56
            boolean r0 = A09()
            if (r0 == 0) goto L56
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch: java.lang.NoSuchMethodError -> L47 java.lang.NoClassDefFoundError -> L49
            if (r0 == 0) goto L56
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.NoSuchMethodError -> L45 java.lang.NoClassDefFoundError -> L4b
            goto L56
        L45:
            r2 = move-exception
            goto L4c
        L47:
            r2 = move-exception
            goto L4c
        L49:
            r2 = move-exception
            goto L4c
        L4b:
            r2 = move-exception
        L4c:
            X.0In r1 = X.C0H5.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0D(r2, r3, r0)
            r6 = r4
        L56:
            if (r6 != 0) goto L86
            java.lang.reflect.Method r1 = A06()
            if (r1 == 0) goto L86
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            if (r0 == 0) goto L71
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L6d java.lang.IllegalAccessException -> L6f java.lang.IllegalArgumentException -> L79
            goto L85
        L6d:
            r3 = move-exception
            goto L7a
        L6f:
            r3 = move-exception
            goto L7a
        L71:
            r4 = r6
            goto L85
        L73:
            r3 = move-exception
            goto L7a
        L75:
            r3 = move-exception
            goto L7a
        L77:
            r3 = move-exception
            goto L7a
        L79:
            r3 = move-exception
        L7a:
            X.0In r2 = X.C0H5.A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0D(r3, r0, r1)
        L85:
            r6 = r4
        L86:
            if (r6 != 0) goto L8a
            java.lang.ClassLoader r6 = r8.A00
        L8a:
            r10.getClass()
            r6.getClass()
            java.lang.Class r0 = A04(r9, r6, r10)     // Catch: java.lang.ClassNotFoundException -> L95
            return r0
        L95:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5.A0H(X.0H3, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class A0I(java.lang.String r9) {
        /*
            r8 = this;
            A0B()
            java.lang.String r7 = "getClassOrNull"
            r4 = 0
            r5 = 0
            r3 = r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r6 = "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform"
            if (r1 >= r0) goto L32
            boolean r0 = A0A()
            if (r0 == 0) goto L32
            java.lang.Class r0 = sun.reflect.Reflection.getCallerClass()     // Catch: java.lang.NoSuchMethodError -> L24 java.lang.NoClassDefFoundError -> L26
            if (r0 == 0) goto L32
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch: java.lang.NoSuchMethodError -> L22 java.lang.NoClassDefFoundError -> L28
            goto L32
        L22:
            r2 = move-exception
            goto L29
        L24:
            r2 = move-exception
            goto L29
        L26:
            r2 = move-exception
            goto L29
        L28:
            r2 = move-exception
        L29:
            X.0In r1 = X.C0H5.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0D(r2, r6, r0)
        L32:
            if (r3 != 0) goto L56
            boolean r0 = A09()
            if (r0 == 0) goto L56
            java.lang.Class r0 = jdk.internal.reflect.Reflection.getCallerClass()     // Catch: java.lang.NoSuchMethodError -> L47 java.lang.NoClassDefFoundError -> L49
            if (r0 == 0) goto L56
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch: java.lang.NoSuchMethodError -> L45 java.lang.NoClassDefFoundError -> L4b
            goto L56
        L45:
            r2 = move-exception
            goto L4c
        L47:
            r2 = move-exception
            goto L4c
        L49:
            r2 = move-exception
            goto L4c
        L4b:
            r2 = move-exception
        L4c:
            X.0In r1 = X.C0H5.A0C
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r1.A0D(r2, r6, r0)
            r3 = r4
        L56:
            if (r3 != 0) goto L86
            java.lang.reflect.Method r1 = A06()
            if (r1 == 0) goto L86
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalArgumentException -> L75 java.lang.IllegalAccessException -> L77
            if (r0 == 0) goto L71
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L6d java.lang.IllegalAccessException -> L6f java.lang.IllegalArgumentException -> L79
            goto L85
        L6d:
            r3 = move-exception
            goto L7a
        L6f:
            r3 = move-exception
            goto L7a
        L71:
            r4 = r3
            goto L85
        L73:
            r3 = move-exception
            goto L7a
        L75:
            r3 = move-exception
            goto L7a
        L77:
            r3 = move-exception
            goto L7a
        L79:
            r3 = move-exception
        L7a:
            X.0In r2 = X.C0H5.A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "%s: Cannot call VMStack.getStackClass2 on this platform"
            r2.A0D(r3, r0, r1)
        L85:
            r3 = r4
        L86:
            if (r3 != 0) goto L8a
            java.lang.ClassLoader r3 = r8.A00
        L8a:
            r0 = 0
            r3.getClass()
            java.lang.Class r0 = A04(r0, r3, r9)     // Catch: java.lang.ClassNotFoundException -> L93
            return r0
        L93:
            r0 = move-exception
            r0.getMessage()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5.A0I(java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[Catch: Exception -> 0x00d9, TryCatch #10 {Exception -> 0x00d9, blocks: (B:55:0x0091, B:58:0x009f, B:60:0x00a8, B:63:0x00b0, B:66:0x00bc, B:69:0x00c4, B:70:0x00d3, B:73:0x00d4, B:78:0x0097), top: B:54:0x0091, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc A[Catch: Exception -> 0x00d9, TryCatch #10 {Exception -> 0x00d9, blocks: (B:55:0x0091, B:58:0x009f, B:60:0x00a8, B:63:0x00b0, B:66:0x00bc, B:69:0x00c4, B:70:0x00d3, B:73:0x00d4, B:78:0x0097), top: B:54:0x0091, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4 A[Catch: Exception -> 0x00d9, TryCatch #10 {Exception -> 0x00d9, blocks: (B:55:0x0091, B:58:0x009f, B:60:0x00a8, B:63:0x00b0, B:66:0x00bc, B:69:0x00c4, B:70:0x00d3, B:73:0x00d4, B:78:0x0097), top: B:54:0x0091, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0L(java.lang.String r10, java.lang.Object[] r11, java.lang.String... r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5.A0L(java.lang.String, java.lang.Object[], java.lang.String[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Class forName(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5.forName(java.lang.String):java.lang.Class");
    }
}
