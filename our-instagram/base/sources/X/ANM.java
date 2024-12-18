package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* loaded from: classes4.dex */
public final class ANM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ConstrainedImageView A01;

    public ANM(ConstrainedImageView constrainedImageView, float f) {
        this.A01 = constrainedImageView;
        this.A00 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        this.A01.setTranslationX(AbstractC167017dG.A00(valueAnimator) * ((float) Math.cos(this.A00)));
    }
}
