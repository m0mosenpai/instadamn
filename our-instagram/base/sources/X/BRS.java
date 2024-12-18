package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;

/* loaded from: classes5.dex */
public abstract class BRS {
    public static final void A00(View view) {
        C14360o3.A0B(view, 0);
        if (view instanceof LithoView) {
            ((BaseMountingView) view).Ctb();
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C14360o3.A0A(childAt);
            A00(childAt);
        }
    }
}
