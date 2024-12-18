package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes11.dex */
public final class UAy extends Animation {
    public final float A00;
    public final float A01;
    public final View A02;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.A02.setAlpha(this.A01 + (this.A00 * f));
    }

    public UAy(View view, float f, float f2) {
        this.A02 = view;
        this.A01 = f;
        this.A00 = f2 - f;
        setAnimationListener(new WOT(view));
    }
}
