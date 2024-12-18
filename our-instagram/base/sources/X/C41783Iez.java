package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Iez, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41783Iez implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C148176ln A00;

    public C41783Iez(C148176ln c148176ln) {
        this.A00 = c148176ln;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        Object obj = this.A00.A0T.get(C148176ln.A00(r0) - 1);
        C14360o3.A07(obj);
        View view = (View) obj;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setScaleX(((Number) animatedValue).floatValue());
        view.setScaleY(AbstractC37303Gc4.A00(valueAnimator));
    }
}
