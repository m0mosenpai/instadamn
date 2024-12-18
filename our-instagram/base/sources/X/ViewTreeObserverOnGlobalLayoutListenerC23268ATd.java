package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.ATd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23268ATd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ C23709Aei A01;

    public ViewTreeObserverOnGlobalLayoutListenerC23268ATd(IgSimpleImageView igSimpleImageView, C23709Aei c23709Aei) {
        this.A00 = igSimpleImageView;
        this.A01 = c23709Aei;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int i2;
        int i3;
        final IgSimpleImageView igSimpleImageView = this.A00;
        ViewTreeObserver viewTreeObserver = igSimpleImageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        Drawable drawable = igSimpleImageView.getDrawable();
        int i4 = 0;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        Drawable drawable2 = igSimpleImageView.getDrawable();
        if (drawable2 != null) {
            i4 = drawable2.getIntrinsicHeight();
        }
        C23709Aei c23709Aei = this.A01;
        if (i < i4) {
            i2 = AbstractC166987dD.A0B(c23709Aei.A0G, 0.6666667f);
            i3 = AbstractC166987dD.A0B(c23709Aei.A0F, 1.2f);
        } else {
            i2 = c23709Aei.A0G;
            i3 = c23709Aei.A0F;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(igSimpleImageView, PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.WIDTH, igSimpleImageView.getWidth(), i2), PropertyValuesHolder.ofInt(IgReactMediaPickerNativeModule.HEIGHT, igSimpleImageView.getHeight(), i3));
        C14360o3.A07(ofPropertyValuesHolder);
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0lz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                View view = igSimpleImageView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue(IgReactMediaPickerNativeModule.WIDTH);
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Number) animatedValue).intValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue(IgReactMediaPickerNativeModule.HEIGHT);
                C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Number) animatedValue2).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.start();
    }
}
