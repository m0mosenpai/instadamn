package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class LWB implements XCF {
    @Override // X.XCF
    public final Animator ALf(View view, ViewGroup viewGroup) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float[] A1b = AbstractC43592JPx.A1b();
        // fill-array-data instruction
        A1b[0] = 0.0f;
        A1b[1] = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.addUpdateListener(new LM7(view, 0.0f, alpha, 0.35f, 1.0f));
        ofFloat.addListener(new C66299U7x(view, alpha, 1));
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
        float[] A1b = AbstractC43592JPx.A1b();
        // fill-array-data instruction
        A1b[0] = 0.0f;
        A1b[1] = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.addUpdateListener(new LM7(view, alpha, 0.0f, 0.0f, 0.35f));
        ofFloat.addListener(new C66299U7x(view, alpha, 1));
        return ofFloat;
    }
}
