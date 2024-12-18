package X;

import android.content.Context;
import android.os.Build;
import android.view.SurfaceView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class UtR extends UAB {
    public UtR(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT < 30) {
            if (!AbstractC68224VIk.A01) {
                try {
                    Method method = Class.class.getMethod("getDeclaredField", String.class);
                    AbstractC68224VIk.A01 = true;
                    Object invoke = method.invoke(SurfaceView.class, "mRtHandlingPositionUpdates");
                    C14360o3.A0C(invoke, "null cannot be cast to non-null type java.lang.reflect.Field");
                    Field field = (Field) invoke;
                    AbstractC68224VIk.A00 = field;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                } catch (Exception e) {
                    C0K8.A0F("SafeSurfaceView", "Failed to get inner field", e);
                }
            }
            try {
                Field field2 = AbstractC68224VIk.A00;
                if (field2 != null) {
                    field2.setBoolean(this, true);
                }
            } catch (IllegalAccessException e2) {
                C0K8.A0F("SafeSurfaceView", "Failed to set inner field", e2);
            }
        }
    }
}
