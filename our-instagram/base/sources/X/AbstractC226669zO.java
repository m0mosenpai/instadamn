package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.9zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226669zO {
    public static final ViewGroup A00(View view) {
        Object obj;
        View view2;
        if (view instanceof FrameLayout) {
            return (ViewGroup) view;
        }
        if (view != null) {
            obj = view.getParent();
        } else {
            obj = null;
        }
        if (!(obj instanceof View) || (view2 = (View) obj) == null) {
            return null;
        }
        return A00(view2);
    }
}
