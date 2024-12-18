package X;

import android.animation.ValueAnimator;

/* loaded from: classes8.dex */
public final class LLv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C44736JrJ A00;

    public LLv(C44736JrJ c44736JrJ) {
        this.A00 = c44736JrJ;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Object A0s = AbstractC43593JPy.A0s(valueAnimator);
        if ((A0s instanceof Integer) && (number = (Number) A0s) != null) {
            this.A00.A01.setTranslationY(-number.intValue());
        }
    }
}
