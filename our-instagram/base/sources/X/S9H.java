package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public abstract class S9H {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static final void A00(Canvas canvas, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC61620Rqk.A00(canvas, z);
            return;
        }
        if (!A02) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                A01 = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                A00 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                Method method = A01;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = A00;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            A02 = true;
        }
        try {
            if (z) {
                Method method3 = A01;
                if (method3 == null) {
                    return;
                }
                method3.invoke(canvas, new Object[0]);
                return;
            }
            Method method4 = A00;
            if (method4 == null) {
                return;
            }
            method4.invoke(canvas, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }
}
