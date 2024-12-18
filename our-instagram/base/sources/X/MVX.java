package X;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes9.dex */
public final class MVX implements Animation.AnimationListener {
    public final /* synthetic */ C59952od A00;
    public final /* synthetic */ boolean A01;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public MVX(C59952od c59952od, boolean z) {
        this.A01 = z;
        this.A00 = c59952od;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C59952od c59952od;
        View view;
        if (this.A01 && (view = (c59952od = this.A00).mView) != null) {
            view.setElevation(AbstractC13880nE.A04(c59952od.requireContext(), 4));
        }
    }
}
