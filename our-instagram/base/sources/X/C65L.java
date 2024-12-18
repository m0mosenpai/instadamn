package X;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* renamed from: X.65L, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C65L {
    public static final int[] A00 = {R.attr.stateListAnimator};

    public static void A00(View view, float f) {
        int integer = view.getResources().getInteger(com.facebook.R.integer.abc_config_activityShortDur);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, com.facebook.R.attr.state_liftable, -2130971247}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
