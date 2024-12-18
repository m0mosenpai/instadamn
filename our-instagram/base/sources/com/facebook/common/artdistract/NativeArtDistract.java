package com.facebook.common.artdistract;

import X.C03720In;
import X.C09170dP;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public final class NativeArtDistract {
    public static final C03720In ML = C03720In.A00("NativeArtDistract");
    public static final boolean PLATFORM_SUPPORTED;

    public static Method getProxyMethodForOffset() {
        Class<?> proxyClass = Proxy.getProxyClass(IArtDistractOffsetHelper.class.getClassLoader(), IArtDistractOffsetHelper.class);
        new Object[1][0] = proxyClass;
        try {
            return proxyClass.getDeclaredMethod("test", new Class[0]);
        } catch (NoSuchMethodException e) {
            ML.A0C(e, "We were unable to get a proxy method for offset", new Object[0]);
            return null;
        }
    }

    public static native boolean nativeAllowCrossPackageAccess();

    public static native boolean nativeHookMethod(Method method, Object obj, Method method2, boolean z);

    public static native boolean nativeInit();

    static {
        boolean z = false;
        try {
            C09170dP.A0C("artdistract");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            ML.A04("Can't load ArtDistract lib", e);
        }
        PLATFORM_SUPPORTED = z;
    }

    public static final void findAccessFlagMethod1() {
        throw new UnsupportedOperationException();
    }

    private final int findAccessFlagMethod2() {
        throw new UnsupportedOperationException();
    }

    private int stubTestMethod() {
        throw new UnsupportedOperationException();
    }
}
