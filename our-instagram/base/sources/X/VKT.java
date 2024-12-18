package X;

import android.content.res.Resources;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public abstract class VKT {
    public static void A00(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            VKS.A00(theme);
            return;
        }
        synchronized (VZN.A02) {
            if (!VZN.A01) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    VZN.A00 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                VZN.A01 = true;
            }
            Method method = VZN.A00;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    VZN.A00 = null;
                }
            }
        }
    }
}
