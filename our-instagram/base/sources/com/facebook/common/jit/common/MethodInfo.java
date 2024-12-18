package com.facebook.common.jit.common;

import X.AnonymousClass001;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class MethodInfo {
    public static final Map A05;
    public static final Map A06;
    public final Class A00;
    public final String A01;
    public final String A02;
    public final Constructor A03;
    public final Method A04;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MethodInfo)) {
            return false;
        }
        MethodInfo methodInfo = (MethodInfo) obj;
        Class cls = this.A00;
        Class cls2 = methodInfo.A00;
        if (cls == null) {
            if (cls2 != null) {
                return false;
            }
        } else if (!cls.equals(cls2)) {
            return false;
        }
        Method method = this.A04;
        Method method2 = methodInfo.A04;
        if (method == null) {
            if (method2 != null) {
                return false;
            }
        } else if (!method.equals(method2)) {
            return false;
        }
        Constructor constructor = this.A03;
        Constructor constructor2 = methodInfo.A03;
        if (constructor == null) {
            if (constructor2 != null) {
                return false;
            }
        } else if (!constructor.equals(constructor2)) {
            return false;
        }
        String str = this.A01;
        String str2 = methodInfo.A01;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.A02;
        String str4 = methodInfo.A02;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    static {
        HashMap hashMap = new HashMap(9);
        A05 = hashMap;
        hashMap.put(Byte.TYPE, "B");
        hashMap.put(Character.TYPE, "C");
        hashMap.put(Short.TYPE, "S");
        hashMap.put(Integer.TYPE, "I");
        hashMap.put(Long.TYPE, "J");
        hashMap.put(Float.TYPE, "F");
        hashMap.put(Double.TYPE, "D");
        hashMap.put(Void.TYPE, "V");
        hashMap.put(Boolean.TYPE, "Z");
        HashMap hashMap2 = new HashMap(9);
        A06 = hashMap2;
        hashMap2.put('B', Byte.TYPE);
        hashMap2.put('C', Character.TYPE);
        hashMap2.put('S', Short.TYPE);
        hashMap2.put('I', Integer.TYPE);
        hashMap2.put('J', Long.TYPE);
        hashMap2.put('F', Float.TYPE);
        hashMap2.put('D', Double.TYPE);
        hashMap2.put('V', Void.TYPE);
        hashMap2.put('Z', Boolean.TYPE);
    }

    public static String A00(Class cls) {
        StringBuilder sb;
        String str;
        String str2 = (String) A05.get(cls);
        if (str2 == null) {
            if (cls.isArray()) {
                sb = new StringBuilder();
                sb.append("[");
                str = A00(cls.getComponentType());
            } else {
                sb = new StringBuilder();
                sb.append("L");
                sb.append(cls.getName().replace('.', '/'));
                str = ";";
            }
            sb.append(str);
            return sb.toString();
        }
        return str2;
    }

    public static String A01(Class cls, Class[] clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class cls2 : clsArr) {
            sb.append(A00(cls2));
        }
        sb.append(')');
        sb.append(A00(cls));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Class, java.lang.Object] */
    public static boolean A02(Class cls, List list, int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            do {
                sb.append('[');
                i2++;
            } while (i2 < i);
            String obj = sb.toString();
            String str = (String) A05.get(cls);
            StringBuilder sb2 = new StringBuilder();
            if (str != null) {
                sb2.append(obj);
            } else {
                sb2.append(obj);
                sb2.append("L");
                sb2.append(cls.getName());
                str = ";";
            }
            sb2.append(str);
            Object obj2 = sb2.toString();
            try {
                obj2 = Class.forName(obj2);
                if (obj2 != 0) {
                    list.add(obj2);
                    return true;
                }
                return false;
            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                Log.w("JitMethodInfo", String.format("Cannot find array class: %s", obj2), e);
                return false;
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Array count ", " is not valid", i));
    }

    public static MethodInfo getMethod(String str, String str2, String str3) {
        Constructor<?> declaredConstructor;
        Class<? super Object> superclass;
        Class<?> cls;
        Object[] objArr;
        String name;
        Object[] objArr2;
        String str4;
        try {
            if (str != null && str2 != null && str3 != null) {
                try {
                    Class<?> cls2 = Class.forName(str);
                    if (str3.charAt(0) != '(') {
                        objArr2 = new Object[]{str3};
                        str4 = "Signature %s is malformed. No '(' at the front";
                    } else {
                        int indexOf = str3.indexOf(41);
                        if (indexOf < 0) {
                            objArr2 = new Object[]{str3};
                            str4 = "Signature %s is malformed. No ')'";
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i = 1;
                            while (true) {
                                if (i < indexOf) {
                                    char charAt = str3.charAt(i);
                                    int i2 = 0;
                                    while (charAt == '[') {
                                        i2++;
                                        i++;
                                        charAt = str3.charAt(i);
                                    }
                                    boolean z = false;
                                    if (i2 > 0) {
                                        z = true;
                                    }
                                    Map map = A06;
                                    Character valueOf = Character.valueOf(charAt);
                                    Class cls3 = (Class) map.get(valueOf);
                                    if (cls3 != null) {
                                        if (!z) {
                                            arrayList.add(cls3);
                                        } else if (!A02(cls3, arrayList, i2)) {
                                            objArr = new Object[2];
                                            objArr[0] = str3;
                                            name = cls3.getName();
                                            break;
                                        }
                                        i++;
                                    } else if (charAt == 'L') {
                                        int indexOf2 = str3.indexOf(59, i);
                                        if (indexOf2 < 0) {
                                            objArr2 = new Object[]{str3, Integer.valueOf(i)};
                                            str4 = "Signature %s is malformed. No end ';' at idx: %d";
                                            break;
                                        }
                                        int i3 = i + 1;
                                        if (indexOf2 > i3) {
                                            String replace = str3.substring(i3, indexOf2).replace('/', '.');
                                            try {
                                                Class<?> cls4 = Class.forName(replace);
                                                if (cls4 == null) {
                                                    break;
                                                }
                                                if (z) {
                                                    if (!A02(cls4, arrayList, i2)) {
                                                        objArr = new Object[2];
                                                        objArr[0] = str3;
                                                        name = cls4.getName();
                                                        break;
                                                    }
                                                } else {
                                                    arrayList.add(cls4);
                                                }
                                                i = indexOf2 + 1;
                                            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                                                String.format("Signature %s is malformed. Class %s not found", str3, replace);
                                            }
                                        } else {
                                            String.format("Signature %s is malformed. Idxs [%d, %d] not valid", str3, Integer.valueOf(i3), Integer.valueOf(indexOf2));
                                            break;
                                        }
                                    } else {
                                        objArr2 = new Object[]{str3, valueOf};
                                        str4 = "Signature %s is malformed. Char %s not understood.";
                                        break;
                                    }
                                } else {
                                    Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
                                    if (clsArr != null) {
                                        if (cls2 != null) {
                                            if ("<clinit>".equals(str2)) {
                                                return new MethodInfo(cls2, str2, A01(Void.TYPE, clsArr));
                                            }
                                            if (!"<init>".equals(str2)) {
                                                Class<?> cls5 = cls2;
                                                do {
                                                    try {
                                                        Method declaredMethod = cls2.getDeclaredMethod(str2, clsArr);
                                                        if (declaredMethod != null) {
                                                            return new MethodInfo(cls2, str2, A01(declaredMethod.getReturnType(), declaredMethod.getParameterTypes()), declaredMethod);
                                                        }
                                                    } catch (NoSuchMethodException unused2) {
                                                    }
                                                    superclass = cls5.getSuperclass();
                                                    cls = cls5;
                                                    cls5 = superclass;
                                                    if (superclass == null) {
                                                        break;
                                                    }
                                                } while (superclass != cls);
                                                String name2 = cls2.getName();
                                                String.format("Did NOT find method (in chain) for class %s %s with types: %s", name2, str2, Arrays.toString(clsArr));
                                                String.format("Did NOT find method (from reflect method) %s %s with types: %s", name2, str2, Arrays.toString(clsArr));
                                                return null;
                                            }
                                            try {
                                                declaredConstructor = cls2.getDeclaredConstructor(clsArr);
                                            } catch (NoSuchMethodException unused3) {
                                            }
                                            if (declaredConstructor != null) {
                                                return new MethodInfo(cls2, str2, A01(Void.TYPE, declaredConstructor.getParameterTypes()), declaredConstructor);
                                            }
                                            if (cls2.getEnclosingClass() != null) {
                                                int length = clsArr.length;
                                                int i4 = length + 1;
                                                if (i4 >= i4) {
                                                    if (length >= length) {
                                                        for (int i5 = 0; i5 < length; i5++) {
                                                        }
                                                        try {
                                                            declaredConstructor = cls2.getDeclaredConstructor(clsArr);
                                                        } catch (NoSuchMethodException unused4) {
                                                        }
                                                        if (declaredConstructor == null) {
                                                            String.format("Did NOT find constructor %s %s with types: %s", cls2.getName(), str2, Arrays.toString(clsArr));
                                                            return null;
                                                        }
                                                        return new MethodInfo(cls2, str2, A01(Void.TYPE, declaredConstructor.getParameterTypes()), declaredConstructor);
                                                    }
                                                    throw new IllegalArgumentException("Src array lacks the num of needed elements");
                                                }
                                                throw new IllegalArgumentException("Dest array is not big enough");
                                            }
                                        }
                                        return null;
                                    }
                                }
                            }
                            objArr[1] = name;
                            String.format("Signature %s is malformed. Cannot get array type for %s.", objArr);
                            Log.w("JitMethodInfo", String.format("Cannot find class: %s for method: %s sig: %s. Cannot parse sig", str, str2, str3));
                            return null;
                        }
                    }
                    String.format(str4, objArr2);
                    Log.w("JitMethodInfo", String.format("Cannot find class: %s for method: %s sig: %s. Cannot parse sig", str, str2, str3));
                    return null;
                } catch (ClassNotFoundException | NoClassDefFoundError e) {
                    Log.w("JitMethodInfo", String.format("Cannot find class: %s for method: %s sig: %s", str, str2, str3), e);
                    return null;
                }
            }
            String.format("Trying to get method but cant because some crucial information was null. class name: %s method name: %s method sig: %s", str, str2, str3);
            return null;
        } catch (Error | RuntimeException e2) {
            Log.w("JitMethodInfo", String.format("Programming Error: class: %s for method: %s sig: %s", str, str2, str3), e2);
            return null;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.A00.hashCode() * 31;
        Method method = this.A04;
        int i4 = 0;
        if (method != null) {
            i = method.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Constructor constructor = this.A03;
        if (constructor != null) {
            i2 = constructor.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.A01;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[ MethodInfo ");
        sb.append("cls: ");
        Class cls = this.A00;
        String str2 = "<null>";
        if (cls != null) {
            str2 = cls.getName();
        }
        sb.append(str2);
        sb.append(", ");
        Executable executable = this.A04;
        if (executable != null) {
            str = "method: ";
        } else {
            executable = this.A03;
            if (executable != null) {
                str = "constructor: ";
            }
            sb.append("name: ");
            sb.append(this.A01);
            sb.append(", ");
            sb.append("signature: ");
            sb.append(this.A02);
            sb.append(']');
            return sb.toString();
        }
        sb.append(str);
        sb.append(executable.getName());
        sb.append(", ");
        sb.append("name: ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append("signature: ");
        sb.append(this.A02);
        sb.append(']');
        return sb.toString();
    }

    public MethodInfo(Class cls, String str, String str2, Constructor constructor) {
        this.A00 = cls;
        this.A04 = null;
        this.A03 = constructor;
        this.A01 = str;
        this.A02 = str2;
    }

    public MethodInfo(Class cls, String str, String str2) {
        this.A00 = cls;
        this.A04 = null;
        this.A03 = null;
        this.A01 = str;
        this.A02 = str2;
    }

    public MethodInfo(Class cls, String str, String str2, Method method) {
        this.A00 = cls;
        this.A04 = method;
        this.A03 = null;
        this.A01 = str;
        this.A02 = str2;
    }

    public MethodInfo() {
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
