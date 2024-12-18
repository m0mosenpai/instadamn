package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Iex, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41781Iex implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C81063jb A00;

    public C41781Iex(C81063jb c81063jb) {
        this.A00 = c81063jb;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        GradientSpinner gradientSpinner;
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        C81063jb c81063jb = this.A00;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            f = number.floatValue();
        } else {
            f = c81063jb.A00;
        }
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        c81063jb.A00 = f;
        C60662pp c60662pp = c81063jb.A06;
        if (c60662pp != null && (gradientSpinner = c60662pp.A0F) != null) {
            gradientSpinner.A09(f);
        }
    }
}
