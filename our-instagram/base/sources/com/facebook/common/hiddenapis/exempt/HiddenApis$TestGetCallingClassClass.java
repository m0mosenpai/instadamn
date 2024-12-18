package com.facebook.common.hiddenapis.exempt;

import X.C03720In;
import X.C0H5;
import android.os.Build;
import dalvik.system.VMStack;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import sun.reflect.Reflection;

/* loaded from: classes.dex */
public class HiddenApis$TestGetCallingClassClass {
    public static boolean testSunReflectGetCallingClass() {
        C03720In c03720In;
        C03720In c03720In2;
        C03720In unused;
        C03720In unused2;
        if (33 <= Build.VERSION.SDK_INT) {
            return false;
        }
        unused = C0H5.A0C;
        try {
            Class callerClass = Reflection.getCallerClass();
            if (!HiddenApis$TestGetCallingClassClass.class.equals(callerClass)) {
                c03720In2 = C0H5.A0C;
                c03720In2.A08("Cannot call sun.reflect.Reflection.getCallerClass on this platform. Got result: %s but expected: %s", callerClass, HiddenApis$TestGetCallingClassClass.class);
                return false;
            }
            unused2 = C0H5.A0C;
            return true;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            c03720In = C0H5.A0C;
            c03720In.A05("Cannot call sun.reflect.Reflection.getCallerClass on this platform", e);
            return false;
        }
    }

    public static boolean callAndCheckVMStackGetStackClass2(Method method) {
        C03720In c03720In;
        C03720In c03720In2;
        C03720In unused;
        C03720In unused2;
        unused = C0H5.A0C;
        Object[] objArr = {method.getDeclaringClass(), method.getName()};
        try {
            Class cls = (Class) method.invoke(null, new Object[0]);
            if (!HiddenApis$TestGetCallingClassClass.class.equals(cls)) {
                c03720In2 = C0H5.A0C;
                c03720In2.A08("Cannot call %s.%s on this platform. Got result: %s but expected: %s", method.getDeclaringClass(), method.getName(), cls, HiddenApis$TestGetCallingClassClass.class);
                return false;
            }
            unused2 = C0H5.A0C;
            Object[] objArr2 = {method.getDeclaringClass(), method.getName()};
            return true;
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            c03720In = C0H5.A0C;
            c03720In.A0D(e, "Cannot call %s.%s on this platform", method.getDeclaringClass(), method.getName());
            return false;
        }
    }

    public static boolean testJdkInternalReflectGetCallingClass() {
        C03720In c03720In;
        C03720In c03720In2;
        C03720In unused;
        C03720In unused2;
        unused = C0H5.A0C;
        try {
            Class callerClass = jdk.internal.reflect.Reflection.getCallerClass();
            if (!HiddenApis$TestGetCallingClassClass.class.equals(callerClass)) {
                c03720In2 = C0H5.A0C;
                c03720In2.A08("Cannot call jdk.internal.reflect.Reflection.getCallerClass on this platform. Got result: %s but expected: %s", callerClass, HiddenApis$TestGetCallingClassClass.class);
                return false;
            }
            unused2 = C0H5.A0C;
            return true;
        } catch (Throwable th) {
            c03720In = C0H5.A0C;
            c03720In.A05("Cannot call jdk.internal.reflect.Reflection.getCallerClass on this platform", th);
            return false;
        }
    }

    public static boolean testVMStackGetCallingClassLoader() {
        C03720In c03720In;
        C03720In c03720In2;
        C03720In unused;
        C03720In unused2;
        unused = C0H5.A0C;
        try {
            ClassLoader callingClassLoader = VMStack.getCallingClassLoader();
            ClassLoader classLoader = HiddenApis$TestGetCallingClassClass.class.getClassLoader();
            if (classLoader == null || !classLoader.equals(callingClassLoader)) {
                c03720In2 = C0H5.A0C;
                c03720In2.A08("Cannot call VMStack.getCallingClassLoader on this platform. Got result: %s but expected: %s", callingClassLoader, classLoader);
                return false;
            }
            unused2 = C0H5.A0C;
            return false;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            c03720In = C0H5.A0C;
            c03720In.A05("Cannot call VMStack.getCallingClassLoader on this platform", e);
            return false;
        }
    }
}
