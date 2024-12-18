package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0HA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HA {
    public final Map A00 = new HashMap();

    private void A00(Context context, Class cls) {
        C0HC c0hc;
        Field[] A05;
        if (cls != null && (c0hc = C0HB.A02) != null) {
            try {
                A05 = c0hc.A05(cls);
            } catch (Throwable unused) {
            }
            if (A05 != null) {
                for (Field field : A05) {
                    field.setAccessible(true);
                    this.A00.put(field.getName(), field);
                }
                A00(context, cls.getSuperclass());
            }
        }
    }

    public C0HA(Context context, Class cls) {
        A00(context, cls);
    }
}
