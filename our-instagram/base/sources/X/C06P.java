package X;

import java.lang.reflect.Field;

/* renamed from: X.06P, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C06P {
    @Deprecated
    public static boolean A00(AbstractC10360h2 abstractC10360h2) {
        if (!(abstractC10360h2 instanceof C12040k8)) {
            return false;
        }
        try {
            Field declaredField = AbstractC10360h2.class.getDeclaredField("mExecutingActions");
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(abstractC10360h2)).booleanValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    public static boolean A01(AbstractC10360h2 abstractC10360h2) {
        if (!(abstractC10360h2 instanceof C12040k8) || abstractC10360h2.A11() || abstractC10360h2.A0G) {
            return false;
        }
        return true;
    }
}
