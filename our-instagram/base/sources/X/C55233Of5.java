package X;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.Of5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55233Of5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TabLayout A00;

    public C55233Of5(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.scrollTo(AbstractC166987dD.A0H(valueAnimator.getAnimatedValue()), 0);
    }
}
