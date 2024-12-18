package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* loaded from: classes11.dex */
public final class WH8 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final StateListDrawable A03;
    public final /* synthetic */ FBPayAnimationButton A04;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        if (Build.VERSION.SDK_INT >= 29) {
            StateListDrawable stateListDrawable = this.A03;
            int stateCount = stateListDrawable.getStateCount();
            for (int i = 0; i < stateCount; i++) {
                Drawable stateDrawable = stateListDrawable.getStateDrawable(i);
                C14360o3.A0C(stateDrawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) stateDrawable).setCornerRadius(AbstractC43593JPy.A00(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
            }
        } else {
            Drawable current = this.A03.getCurrent();
            C14360o3.A0C(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) current).setCornerRadius(AbstractC43593JPy.A00(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
        }
        FBPayAnimationButton fBPayAnimationButton = this.A04;
        fBPayAnimationButton.getButtonView().setTextColor(AbstractC56842jH.A06(this.A01, C1H4.A01(255.0f * animatedFraction)));
        fBPayAnimationButton.getButtonView().getLayoutParams().width = C1H4.A01(this.A02 * animatedFraction) + this.A00;
        AbstractC68347VNh.A00(fBPayAnimationButton.getButtonView(), 2);
        fBPayAnimationButton.setForegroundGravity(17);
        fBPayAnimationButton.requestLayout();
    }

    public WH8(FBPayAnimationButton fBPayAnimationButton) {
        this.A04 = fBPayAnimationButton;
        Drawable background = fBPayAnimationButton.getButtonView().getBackground();
        C14360o3.A0C(background, AbstractC111324zv.A00(2771));
        this.A03 = (StateListDrawable) background;
        this.A01 = fBPayAnimationButton.getButtonView().getCurrentTextColor();
        this.A00 = fBPayAnimationButton.getButtonView().getHeight();
        this.A02 = fBPayAnimationButton.getButtonView().getWidth() - fBPayAnimationButton.getButtonView().getHeight();
    }
}
