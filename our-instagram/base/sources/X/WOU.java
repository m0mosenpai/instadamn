package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes11.dex */
public final class WOU implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WOU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.A00) {
            case 0:
                View view = (View) this.A02;
                if (!(view.getParent() instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
                return;
            case 1:
            case 2:
            default:
                ((View) this.A01).startAnimation((Animation) this.A02);
                return;
            case 3:
                AbstractC55163OdR.A03((View) this.A02, new C71037Wms(this.A01, 7));
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
