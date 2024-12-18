package X;

import com.instagram.preferences.common.BoolNux;
import com.instagram.preferences.common.IntNux;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.SSk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62814SSk {
    public static final void A00(List list, Map map) {
        ArrayList<Field> A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((AccessibleObject) obj).isAnnotationPresent(BoolNux.class)) {
                A1E.add(obj);
            }
        }
        for (Field field : A1E) {
            Annotation annotation = field.getAnnotation(BoolNux.class);
            if (annotation != null) {
                BoolNux boolNux = (BoolNux) annotation;
                Object obj2 = field.get(null);
                if (obj2 instanceof String) {
                    AbstractC43592JPx.A1W(obj2, map, boolNux.alwaysReturn());
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
    }

    public static final void A01(List list, Map map) {
        ArrayList<Field> A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((AccessibleObject) obj).isAnnotationPresent(IntNux.class)) {
                A1E.add(obj);
            }
        }
        for (Field field : A1E) {
            Annotation annotation = field.getAnnotation(IntNux.class);
            if (annotation != null) {
                IntNux intNux = (IntNux) annotation;
                Object obj2 = field.get(null);
                if (obj2 instanceof String) {
                    AbstractC37301Gc2.A1T(obj2, map, intNux.alwaysReturn());
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
