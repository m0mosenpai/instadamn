package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.0l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12560l0 extends C07A {
    public static final void A03(View view, C12560l0 c12560l0, Map map) {
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    A03(childAt, c12560l0, map);
                }
            }
        }
    }
}
