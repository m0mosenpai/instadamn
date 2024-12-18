package X;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* renamed from: X.5U9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5U9 {
    public static final boolean A00() {
        Boolean bool;
        Method method;
        try {
            Object obj = null;
            if (AndroidComposeView.A1H == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                AndroidComposeView.A1H = cls;
                if (cls == null) {
                    method = null;
                } else {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                AndroidComposeView.A1I = method;
            }
            Method method2 = AndroidComposeView.A1I;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", false);
            }
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
