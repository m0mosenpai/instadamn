package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;

/* loaded from: classes8.dex */
public final class LM4 implements ValueAnimator.AnimatorUpdateListener {
    public Animator.AnimatorListener A00;
    public float A01;
    public final ValueAnimator A02;
    public final CircularProgressImageView A03;

    public LM4(CircularProgressImageView circularProgressImageView) {
        C14360o3.A0B(circularProgressImageView, 1);
        this.A03 = circularProgressImageView;
        float f = circularProgressImageView.A00;
        float[] A1b = AbstractC43592JPx.A1b();
        A1b[0] = f;
        A1b[1] = 360.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        this.A02 = ofFloat;
        this.A01 = f;
        AbstractC43592JPx.A1A(ofFloat);
        ofFloat.addUpdateListener(this);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Number number;
        Object A0s = AbstractC43593JPy.A0s(valueAnimator);
        if ((A0s instanceof Float) && (number = (Number) A0s) != null) {
            f = number.floatValue();
        } else {
            f = this.A01;
        }
        CircularProgressImageView circularProgressImageView = this.A03;
        circularProgressImageView.setAngle(f);
        this.A01 = f;
        circularProgressImageView.requestLayout();
    }
}
