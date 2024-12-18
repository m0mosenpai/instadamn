package X;

import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class SUS {
    public static Object A00;
    public static final HashMap A01 = AbstractC166987dD.A1G();

    public static final Object A00(String str, Object obj) {
        Class<?> cls = obj.getClass();
        SOV sov = new SOV(str, cls);
        HashMap hashMap = A01;
        Field field = (Field) hashMap.get(sov);
        if (field == null) {
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                C14360o3.A07(declaredFields);
                int length = declaredFields.length;
                for (int i = 0; i < length; i++) {
                    field = declaredFields[i];
                    if (C14360o3.A0K(field.getName(), str)) {
                        field.setAccessible(true);
                        hashMap.put(sov, field);
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }
        return field.get(obj);
    }
}
