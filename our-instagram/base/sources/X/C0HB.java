package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0HB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HB {
    public static C0HC A02;
    public static C0HB A03;
    public final Context A00;
    public final Map A01 = new HashMap();

    public static C0HB A00(Context context) {
        if (A03 == null) {
            A03 = new C0HB(context);
            A02 = C0HC.A00();
        }
        return A03;
    }

    public C0HB(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public final Object A01(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Map map = this.A01;
        C0HA c0ha = (C0HA) map.get(cls);
        if (c0ha == null) {
            c0ha = new C0HA(this.A00, cls);
            map.put(cls, c0ha);
        }
        Field field = (Field) c0ha.A00.get(str);
        Object obj2 = null;
        if (field == null) {
            return null;
        }
        try {
            obj2 = field.get(obj);
            return obj2;
        } catch (Throwable unused) {
            return obj2;
        }
    }
}
