package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.view.View;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* loaded from: classes11.dex */
public final class WH6 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WH6(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A00 != 0) {
            C14360o3.A0B(valueAnimator, 0);
            int A02 = C2FP.A0A().A02((Context) this.A01, 21);
            UCn progressBarView = ((FBPayAnimationButton) this.A03).getProgressBarView();
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
            progressBarView.setCircleColorRaw(AbstractC56842jH.A06(A02, C1H4.A01(255.0f * valueAnimator.getAnimatedFraction())));
            if (valueAnimator.getAnimatedFraction() == 1.0f) {
                RotateDrawable rotateDrawable = progressBarView.A02;
                if (rotateDrawable == null) {
                    C14360o3.A0F("layerSpinnerRingDrawable");
                    throw C00O.createAndThrow();
                }
                rotateDrawable.setAlpha(0);
                if (interfaceC16820sZ != null) {
                    progressBarView.getRootView().postDelayed(new RunnableC71288WrI(interfaceC16820sZ), 800L);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    progressBarView.performHapticFeedback(16);
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0B(valueAnimator, 0);
        C69465Vno c69465Vno = (C69465Vno) this.A02;
        float A00 = AbstractC43593JPy.A00(valueAnimator.getAnimatedValue("x"), "null cannot be cast to non-null type kotlin.Float") * 0.1f;
        Drawable drawable = (Drawable) this.A01;
        c69465Vno.A02 = A00 * AbstractC166997dE.A0H(drawable);
        c69465Vno.A03 = AbstractC43593JPy.A00(valueAnimator.getAnimatedValue("y"), "null cannot be cast to non-null type kotlin.Float") * 0.1f * AbstractC166997dE.A0G(drawable);
        ((View) this.A03).invalidate();
    }
}
