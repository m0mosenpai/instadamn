package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.WrQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71296WrQ implements Runnable {
    public final /* synthetic */ AbstractC70175WEx A00;

    public RunnableC71296WrQ(AbstractC70175WEx abstractC70175WEx) {
        this.A00 = abstractC70175WEx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        AbstractC70175WEx abstractC70175WEx = this.A00;
        UBZ ubz = abstractC70175WEx.A09;
        if (ubz != null) {
            if (ubz.getParent() != null) {
                ubz.setVisibility(0);
            }
            if (ubz.A00 == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(AbstractC153306uz.A03);
                ofFloat.addUpdateListener(new C65759TtZ(abstractC70175WEx, 5));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat2.setInterpolator(AbstractC153306uz.A04);
                ofFloat2.addUpdateListener(new C65759TtZ(abstractC70175WEx, 6));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(150L);
                U5Q.A00(animatorSet, abstractC70175WEx, 14);
                valueAnimator = animatorSet;
            } else {
                int height = ubz.getHeight();
                ViewGroup.LayoutParams layoutParams = ubz.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                ubz.setTranslationY(height);
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setIntValues(height, 0);
                valueAnimator2.setInterpolator(AbstractC153306uz.A02);
                valueAnimator2.setDuration(250L);
                U5Q.A00(valueAnimator2, abstractC70175WEx, 15);
                valueAnimator2.addUpdateListener(new C65759TtZ(abstractC70175WEx, 7));
                valueAnimator = valueAnimator2;
            }
            valueAnimator.start();
        }
    }
}
