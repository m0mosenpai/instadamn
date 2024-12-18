package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.0y0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19720y0 {
    public static final InterfaceC19630xq A00(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C14360o3.A07(defaultSharedPreferences);
        C17320tT c17320tT = new C17320tT(defaultSharedPreferences, "NuxDisabledDeviceSharedPreferences");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Field[] declaredFields = C19740y2.class.getDeclaredFields();
        C14360o3.A07(declaredFields);
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(com.instagram.preferences.common.Nux.class) && C14360o3.A0K(field.getType(), String.class)) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (Field field2 : arrayList) {
            field2.setAccessible(true);
            Annotation annotation = field2.getAnnotation(com.instagram.preferences.common.Nux.class);
            C14360o3.A07(annotation);
            com.instagram.preferences.common.Nux nux = (com.instagram.preferences.common.Nux) annotation;
            Object obj = field2.get(null);
            if (obj instanceof String) {
                linkedHashMap.put(obj, Boolean.valueOf(nux.getBooleanAlwaysReturn()));
                linkedHashMap2.put(obj, Integer.valueOf(nux.getIntAlwaysReturn()));
            }
            arrayList2.add(C0eB.A00);
        }
        return new C70970Wld(c17320tT, linkedHashMap, linkedHashMap2);
    }
}
