package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.3Tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74033Tu {
    public static final void A00(Context context) {
        View view;
        try {
            Object systemService = context.getSystemService("input_method");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                C0s6 A00 = AbstractC13190m5.A00(inputMethodManager.getClass().getDeclaredFields());
                while (A00.hasNext()) {
                    Field field = (Field) A00.next();
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        Object obj = field.get(inputMethodManager);
                        if ((obj instanceof View) && (view = (View) obj) != null && view.getContext() == context) {
                            field.set(inputMethodManager, null);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
