package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class LM8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ IgTextView A03;
    public final /* synthetic */ C48624Lf0 A04;

    public LM8(IgTextView igTextView, C48624Lf0 c48624Lf0, float f, float f2, int i) {
        this.A03 = igTextView;
        this.A04 = c48624Lf0;
        this.A01 = f;
        this.A02 = i;
        this.A00 = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            float floatValue = number.floatValue();
            IgTextView igTextView = this.A03;
            InterfaceC09390do interfaceC09390do = this.A04.A0G;
            igTextView.setTextSize(0, AbstractC167027dH.A01(interfaceC09390do) + ((AbstractC167027dH.A01(r1.A0F) - AbstractC167027dH.A01(interfaceC09390do)) * floatValue));
            igTextView.setTranslationX(this.A01 * floatValue);
            int i = this.A02;
            igTextView.setTranslationY((((i * 3) * floatValue) * floatValue) - ((i * 2) * floatValue));
            igTextView.setRotation(this.A00 + (360.0f * floatValue));
        }
    }
}
