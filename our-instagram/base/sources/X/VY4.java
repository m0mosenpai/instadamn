package X;

import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes11.dex */
public abstract class VY4 {
    public static Field A00;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            A00 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
