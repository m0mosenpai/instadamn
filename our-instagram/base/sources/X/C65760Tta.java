package X;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.Tta, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65760Tta implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public C65760Tta(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = coordinatorLayout;
        this.A02 = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A0V(this.A02, this.A00, ((Number) valueAnimator.getAnimatedValue()).intValue());
    }
}
