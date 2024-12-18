package X;

import android.animation.LayoutTransition;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public abstract class FC5 {
    public static final void A00(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
            viewGroup.setLayoutTransition(layoutTransition);
        }
        layoutTransition.enableTransitionType(4);
        viewGroup.setClipChildren(false);
    }
}
