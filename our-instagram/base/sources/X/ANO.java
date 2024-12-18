package X;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class ANO implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final int A01;
    public final Object A02;

    public ANO(C214759fD c214759fD, float f, int i) {
        this.A01 = i;
        this.A02 = c214759fD;
        this.A00 = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String str;
        TextView textView;
        float f;
        int i = this.A01;
        C14360o3.A0B(valueAnimator, 0);
        if (i != 0) {
            float A00 = AbstractC167017dG.A00(valueAnimator);
            C214759fD c214759fD = (C214759fD) this.A02;
            TextView textView2 = c214759fD.A0I;
            str = "explosionView";
            if (textView2 != null) {
                float f2 = this.A00;
                int i2 = -1;
                if (AbstractC166987dD.A0B(100.0f, A00) % 10 >= 5) {
                    i2 = 1;
                }
                textView2.setRotation(f2 + (i2 * 10));
                textView = c214759fD.A0I;
                if (textView != null) {
                    f = 1.0f - A00;
                    textView.setAlpha(f);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        float A002 = AbstractC167017dG.A00(valueAnimator);
        C214759fD c214759fD2 = (C214759fD) this.A02;
        TextView textView3 = c214759fD2.A0P;
        str = "projectileView";
        if (textView3 != null) {
            textView3.setX(textView3.getX() + (10.0f * A002 * this.A00));
            textView = c214759fD2.A0P;
            if (textView != null) {
                f = 1.0f - A002;
                textView.setAlpha(f);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
