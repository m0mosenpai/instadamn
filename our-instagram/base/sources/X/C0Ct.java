package X;

import android.app.Activity;
import android.app.ActivityThread;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: X.0Ct, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Ct {
    public static Activity A00() {
        Field field = null;
        Field field2 = null;
        ActivityThread A00 = C0Cu.A00();
        if (A00 == null) {
            return null;
        }
        try {
            Field declaredField = ActivityThread.class.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(A00);
            if (map != null && !map.isEmpty()) {
                boolean z = false;
                for (Object obj : map.values()) {
                    if (!z) {
                        z = true;
                        Class<?> cls = obj.getClass();
                        field2 = cls.getDeclaredField("paused");
                        field2.setAccessible(true);
                        field = cls.getDeclaredField("activity");
                        field.setAccessible(true);
                    }
                    if (!field2.getBoolean(obj)) {
                        return (Activity) field.get(obj);
                    }
                }
            }
        } catch (Error | Exception unused) {
        }
        return null;
    }
}
