package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Wcf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70549Wcf implements XCF {
    public float A00 = 1.0f;

    @Override // X.XCF
    public final Animator ALf(View view, ViewGroup viewGroup) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = this.A00;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new LM5(view, 0.0f, alpha, f, 0));
        ofFloat.addListener(new C66299U7x(view, alpha, 0));
        return ofFloat;
    }

    @Override // X.XCF
    public final Animator AM4(View view, ViewGroup viewGroup) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new LM5(view, alpha, 0.0f, 1.0f, 0));
        ofFloat.addListener(new C66299U7x(view, alpha, 0));
        return ofFloat;
    }
}
