package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.72C, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C72C {
    public static void A02(View view, C65O c65o) {
        C1343465d c1343465d = c65o.A00.A0J;
        if (c1343465d != null && c1343465d.A03) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += ((View) parent).getElevation();
            }
            C65W c65w = c65o.A00;
            if (c65w.A02 != f) {
                c65w.A02 = f;
                C65O.A03(c65o);
            }
        }
    }

    public static void A00(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C65O) {
            A02(view, (C65O) background);
        }
    }

    public static void A01(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C65O) {
            ((C65O) background).A0A(f);
        }
    }
}
