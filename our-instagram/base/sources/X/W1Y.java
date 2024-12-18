package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes11.dex */
public final class W1Y {
    public static final ViewGroup.MarginLayoutParams A01;
    public LinearLayoutManager A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        A01 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean A00(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition == null || !layoutTransition.isChangingLayout()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (!A00(viewGroup.getChildAt(i))) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
