package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.2te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63012te {
    public static Float A02;
    public static final C63012te A03 = new Object();
    public static final C19L A04 = AnonymousClass194.A02(C12L.A00.AOT(276562401, 3));
    public static int A01 = -1;
    public static float A00 = -1.0f;

    public final float A00(Context context, int i) {
        DisplayManager displayManager;
        Display display;
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("display");
        if ((systemService instanceof DisplayManager) && (displayManager = (DisplayManager) systemService) != null && (display = displayManager.getDisplay(0)) != null) {
            float refreshRate = display.getRefreshRate();
            if (refreshRate >= 30.0f && refreshRate <= i) {
                return refreshRate;
            }
            return 60.0f;
        }
        return 60.0f;
    }

    public final float A01(Context context, int i) {
        C14360o3.A0B(context, 0);
        Float f = A02;
        if (f == null) {
            f = Float.valueOf(A00(context, Integer.MAX_VALUE));
            A02 = f;
        }
        float floatValue = f.floatValue();
        if (floatValue >= 30.0f && floatValue <= i) {
            return floatValue;
        }
        return 60.0f;
    }
}
