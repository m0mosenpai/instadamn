package com.facebook.react.bridge;

import X.C0I2;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public class ReactCxxErrorHandler {
    public static Object A00;
    public static Method A01;

    public static void handleError(String str) {
        if (A01 != null) {
            try {
                A01.invoke(A00, new Exception(str));
            } catch (Exception e) {
                C0I2.A05("ReactCxxErrorHandler", "Failed to invoke error handler function", e);
            }
        }
    }

    public static void setHandleErrorFunc(Object obj, Method method) {
        A00 = obj;
        A01 = method;
    }
}
