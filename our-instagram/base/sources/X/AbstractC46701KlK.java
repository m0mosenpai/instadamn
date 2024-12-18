package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.KlK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46701KlK {
    public static final ObjectAnimator A00(View view, boolean z) {
        String str;
        if (z) {
            str = "translationY";
        } else {
            str = "translationX";
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, 0.0f, -10.0f, 0.0f, 10.0f, 0.0f, -5.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        return ofFloat;
    }
}
