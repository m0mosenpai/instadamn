package X;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.5b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119465b3 {
    public final void A00(View view) {
        try {
            if (!C119455b2.A0H) {
                C119455b2.A0H = true;
                C119455b2.A0G = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                C119455b2.A0F = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = C119455b2.A0G;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = C119455b2.A0F;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = C119455b2.A0F;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = C119455b2.A0G;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            C119455b2.A0I = true;
        }
    }
}
