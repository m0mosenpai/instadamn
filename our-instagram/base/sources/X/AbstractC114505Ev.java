package X;

import android.os.Build;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.5Ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114505Ev {
    public static boolean A00(Handler handler, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC224349vL.A00(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException e) {
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw cause;
            }
            throw cause;
        }
    }
}
