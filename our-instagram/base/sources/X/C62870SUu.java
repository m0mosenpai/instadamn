package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.SUu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62870SUu {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static final void A00(Canvas canvas, boolean z) {
        Method method;
        Method method2;
        C14360o3.A0B(canvas, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!A02) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object invoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                C14360o3.A0C(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                A01 = (Method) invoke;
                Object invoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                C14360o3.A0C(invoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                method = (Method) invoke2;
                A00 = method;
                method2 = A01;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (method2 != null && method != null) {
                method2.setAccessible(true);
                Method method3 = A00;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
                A02 = true;
            }
        }
        try {
            if (z) {
                Method method4 = A01;
                if (method4 == null) {
                    return;
                }
                method4.invoke(canvas, new Object[0]);
                return;
            }
            Method method5 = A00;
            if (method5 == null) {
                return;
            }
            method5.invoke(canvas, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }
}
