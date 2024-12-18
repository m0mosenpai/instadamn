package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.03e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC009003e {
    public static C011504d A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C011504d A01 = C011504d.A01(null, rootWindowInsets);
        C011304b c011304b = A01.A00;
        c011304b.A0E(A01);
        c011304b.A0C(view.getRootView());
        return A01;
    }
}
