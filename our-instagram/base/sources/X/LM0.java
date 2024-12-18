package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* loaded from: classes8.dex */
public final class LM0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ConstrainedImageView A01;

    public LM0(ConstrainedImageView constrainedImageView, float f) {
        this.A01 = constrainedImageView;
        this.A00 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        this.A01.setTranslationY(AbstractC167017dG.A00(valueAnimator) * ((float) Math.sin(this.A00)));
    }
}
