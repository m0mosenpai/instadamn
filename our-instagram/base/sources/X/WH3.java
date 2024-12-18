package X;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes11.dex */
public final class WH3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout A00;
    public final /* synthetic */ C65O A01;

    public WH3(AppBarLayout appBarLayout, C65O c65o) {
        this.A00 = appBarLayout;
        this.A01 = c65o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A0A(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
