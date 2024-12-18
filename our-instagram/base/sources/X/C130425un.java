package X;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.5un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130425un implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C4ZF A00;

    public C130425un(C4ZF c4zf) {
        this.A00 = c4zf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float measuredWidth;
        boolean z;
        float f;
        Iterator it = this.A00.A07.iterator();
        while (it.hasNext()) {
            C3WC c3wc = (C3WC) ((Reference) it.next()).get();
            if (c3wc != null) {
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) c3wc;
                C43801JYo c43801JYo = slideInAndOutIconView.A01;
                if (c43801JYo != null) {
                    float f2 = 1.0f - floatValue;
                    Object evaluate = c43801JYo.A01.evaluate(f2, -1, Integer.valueOf(c43801JYo.A00));
                    C14360o3.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Number) evaluate).intValue();
                    float A03 = (float) AbstractC70163Da.A03(1.0d - f2, 0.8d, 1.0d);
                    slideInAndOutIconView.setIconColor(intValue);
                    slideInAndOutIconView.setBackgroundAlpha(1.0f - f2);
                    slideInAndOutIconView.setIconScale(A03);
                }
                C3WD c3wd = slideInAndOutIconView.A03;
                C3WD c3wd2 = C3WD.BOTH;
                TitleTextView titleTextView = slideInAndOutIconView.A0C;
                if (c3wd == c3wd2) {
                    measuredWidth = (titleTextView.getMeasuredWidth() * (1.0f - floatValue)) / 2.0f;
                    titleTextView.setAlpha(floatValue);
                    boolean z2 = slideInAndOutIconView.A05;
                    ImageView imageView = slideInAndOutIconView.A0B;
                    if (z2) {
                        float f3 = -measuredWidth;
                        imageView.setTranslationX(f3);
                        titleTextView.setTranslationX(f3);
                    } else {
                        imageView.setTranslationX(measuredWidth);
                        titleTextView.setTranslationX(measuredWidth);
                    }
                    f = slideInAndOutIconView.A00 - measuredWidth;
                } else {
                    titleTextView.setScaleX(floatValue);
                    titleTextView.setScaleY(floatValue);
                    measuredWidth = titleTextView.getMeasuredWidth() * (1.0f - floatValue);
                    C3WD c3wd3 = slideInAndOutIconView.A03;
                    if ((c3wd3 == C3WD.START && !slideInAndOutIconView.A05) || (c3wd3 == C3WD.END && slideInAndOutIconView.A05)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = slideInAndOutIconView.A05;
                    if (z) {
                        if (z3) {
                            slideInAndOutIconView.A0B.setTranslationX(-measuredWidth);
                        }
                        SlideInAndOutIconView.A00(slideInAndOutIconView, 0.0f, slideInAndOutIconView.A00 - measuredWidth, slideInAndOutIconView.A0A.height());
                        slideInAndOutIconView.invalidate();
                    } else {
                        if (!z3) {
                            slideInAndOutIconView.A0B.setTranslationX(measuredWidth);
                        }
                        f = slideInAndOutIconView.A00;
                    }
                }
                SlideInAndOutIconView.A00(slideInAndOutIconView, measuredWidth, f, slideInAndOutIconView.A0A.height());
                slideInAndOutIconView.invalidate();
            }
        }
    }
}
