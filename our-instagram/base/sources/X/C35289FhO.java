package X;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: X.FhO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35289FhO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView A00;

    public C35289FhO(TextView textView) {
        this.A00 = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        TextView textView = this.A00;
        AbstractC31181DnP.A0X(textView, A00);
        textView.setScaleX(A00);
        textView.setScaleY(A00);
        textView.setAlpha(A00);
    }
}
