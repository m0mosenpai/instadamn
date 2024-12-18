package X;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.FhQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35291FhQ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ TextView A01;

    public C35291FhQ(ImageView imageView, TextView textView) {
        this.A00 = imageView;
        this.A01 = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        this.A00.setAlpha(1.0f - A00);
        TextView textView = this.A01;
        AbstractC31181DnP.A0X(textView, A00);
        textView.setAlpha(A00);
        textView.setScaleX(A00);
        textView.setScaleY(A00);
    }
}
