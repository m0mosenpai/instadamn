package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.A1o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22744A1o {
    public static final ViewGroup A00(View view) {
        View view2;
        if (view instanceof FrameLayout) {
            return (ViewGroup) view;
        }
        Object parent = view.getParent();
        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
            return null;
        }
        return A00(view2);
    }
}
