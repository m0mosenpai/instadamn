package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FhR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35292FhR implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C35292FhR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, AnimatorSet animatorSet, ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C35292FhR(obj, i));
        animatorSet.playTogether(animator, valueAnimator);
        animatorSet.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        Number number;
        Number number2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(valueAnimator, 0);
                Window window = ((Activity) this.A01).getWindow();
                if (window == null) {
                    return;
                }
                window.setStatusBarColor(AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
                return;
            case 1:
                C14360o3.A0B(valueAnimator, 0);
                C32350EMx c32350EMx = (C32350EMx) this.A01;
                RecyclerView recyclerView = c32350EMx.A00;
                if (recyclerView != null) {
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    layoutParams.height = AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
                    RecyclerView recyclerView2 = c32350EMx.A00;
                    if (recyclerView2 != null) {
                        recyclerView2.setLayoutParams(layoutParams);
                        return;
                    }
                }
                C14360o3.A0F("recyclerView");
                throw C00O.createAndThrow();
            case 2:
            case 3:
                C14360o3.A0B(valueAnimator, 0);
                C36472G6w c36472G6w = (C36472G6w) this.A01;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (number = (Number) animatedValue) != null) {
                    i = number.intValue();
                } else {
                    i = 0;
                }
                RecyclerView recyclerView3 = c36472G6w.A00;
                ViewGroup.LayoutParams layoutParams2 = recyclerView3.getLayoutParams();
                layoutParams2.height = i;
                recyclerView3.setLayoutParams(layoutParams2);
                return;
            case 4:
                C14360o3.A0B(valueAnimator, 0);
                float A00 = AbstractC167017dG.A00(valueAnimator);
                TextView textView = (TextView) this.A01;
                AbstractC31181DnP.A0X(textView, A00);
                textView.setScaleX(A00);
                textView.setScaleY(A00);
                textView.setAlpha(A00);
                return;
            case 5:
                C14360o3.A0B(valueAnimator, 0);
                ImageView imageView = (ImageView) this.A01;
                Drawable drawable = imageView.getDrawable();
                AbstractC166997dE.A1F(drawable, AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
                imageView.setImageDrawable(drawable);
                return;
            default:
                C14360o3.A0B(valueAnimator, 0);
                CardView cardView = (CardView) this.A01;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if ((animatedValue2 instanceof Float) && (number2 = (Number) animatedValue2) != null) {
                    cardView.setCardElevation(number2.floatValue());
                    return;
                }
                return;
        }
    }
}
