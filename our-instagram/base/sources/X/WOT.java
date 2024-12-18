package X;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes11.dex */
public final class WOT implements Animation.AnimationListener {
    public boolean A00 = false;
    public final View A01;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.A00) {
            this.A01.setLayerType(0, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, null);
        }
    }

    public WOT(View view) {
        this.A01 = view;
    }
}
